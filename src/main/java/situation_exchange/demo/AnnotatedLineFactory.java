package situation_exchange.demo;

import gtfs.model.Route;
import situation_exchange.demo.Context.AnnotatedLineDestination;
import uk.org.siri.siri.AnnotatedDestinationStructure;
import uk.org.siri.siri.AnnotatedLineStructure;
import uk.org.siri.siri.AnnotatedLineStructure.Destinations;
import uk.org.siri.siri.DestinationRefStructure;
import uk.org.siri.siri.LineRefStructure;
import uk.org.siri.siri.NaturalLanguageStringStructure;
import uk.org.siri.siri.ObjectFactory;

public class AnnotatedLineFactory {

	private static ObjectFactory factory = new ObjectFactory();

	public static AnnotatedLineStructure create(Context context) {

		AnnotatedLineStructure result = factory.createAnnotatedLineStructure();

		Route route = context.getRoute();

		// set lineRef
		LineRefStructure lineRef = factory.createLineRefStructure();
		lineRef.setValue(route.getRouteId());
		result.setLineRef(lineRef);

		// set lineName
		NaturalLanguageStringStructure text = factory.createNaturalLanguageStringStructure();
		text.setValue(route.getRouteLongName());
		result.getLineName().add(text);

		// set destinations
		Destinations destinations = factory.createAnnotatedLineStructureDestinations();
		for (AnnotatedLineDestination value : context.getDestinations()) {

			AnnotatedDestinationStructure destination = factory.createAnnotatedDestinationStructure();

			DestinationRefStructure destinationRef = factory.createDestinationRefStructure();
			destinationRef.setValue(value.getDestinationRef());
			destination.setDestinationRef(destinationRef);

			NaturalLanguageStringStructure placeName = factory.createNaturalLanguageStringStructure();
			placeName.setValue(value.getPlaceName());
			destination.getPlaceName().add(placeName);

			destinations.getDestination().add(destination);
		}
		result.setDestinations(destinations);

		return result;

	}

}