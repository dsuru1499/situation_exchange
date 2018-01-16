package situation_exchange.demo;

import java.util.Set;

import gtfs.model.Stop;
import uk.org.siri.siri.AnnotatedStopPointStructure;
import uk.org.siri.siri.AnnotatedStopPointStructure.Lines;
import uk.org.siri.siri.LineRefStructure;
import uk.org.siri.siri.LocationStructure;
import uk.org.siri.siri.NaturalLanguageStringStructure;
import uk.org.siri.siri.ObjectFactory;
import uk.org.siri.siri.StopPointRefStructure;

public class AnnotatedStopPointFactory {

	private static ObjectFactory factory = new ObjectFactory();

	public static AnnotatedStopPointStructure create(Context context) {

		AnnotatedStopPointStructure result = factory.createAnnotatedStopPointStructure();

		Set<String> lineRefs = context.getLineRefs();
		Stop stop = context.getStop();

		// set lineRef
		Lines lines = factory.createAnnotatedStopPointStructureLines();
		for (String value : lineRefs) {
			LineRefStructure lineRef = factory.createLineRefStructure();
			lineRef.setValue(value);
			lines.getLineRefOrLineDirection().add(lineRef);
		}
		result.setLines(lines);

		// set stopPointRef
		StopPointRefStructure stopPointRef = factory.createStopPointRefStructure();
		stopPointRef.setValue(stop.getStopId());
		result.setStopPointRef(stopPointRef);

		// set stopName
		NaturalLanguageStringStructure text = factory.createNaturalLanguageStringStructure();
		text.setValue(stop.getStopName());
		result.getStopName().add(text);

		// set location
		LocationStructure location = factory.createLocationStructure();
		location.setLongitude(stop.getStopLon());
		location.setLatitude(stop.getStopLat());
		result.setLocation(location);

		return result;
	}
}