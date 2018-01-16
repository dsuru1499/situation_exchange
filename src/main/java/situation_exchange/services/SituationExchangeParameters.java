package situation_exchange.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.QueryParam;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import situation_exchange.common.DefaultParameters;
import situation_exchange.common.XmlStructureFactory;
import uk.org.siri.siri.PredictabilityEnumeration;
import uk.org.siri.siri.SeverityEnumeration;
import uk.org.siri.siri.VehicleModesOfTransportEnumeration;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class SituationExchangeParameters extends DefaultParameters {

	@QueryParam("Version")
	private String version;

	@QueryParam("RequestTimestamp")
	private XMLGregorianCalendar requestTimestamp = XmlStructureFactory.getTimestamp();

	@QueryParam("MessageIdentifier")
	private String messageIdentifier;

	@QueryParam("PreviewInterval")
	private Duration previewInterval;

	@QueryParam("StartTime")
	private XMLGregorianCalendar startTime;

	@QueryParam("VehicleMode")
	private VehicleModesOfTransportEnumeration vehicleMode;

	@QueryParam("Severity")
	private SeverityEnumeration severity;

	@QueryParam("Predictability")
	private PredictabilityEnumeration predictability;

	@QueryParam("Keywords")
	private String keywords;

	@QueryParam("OperatorRef")
	private String operatorRef;

	@QueryParam("NetworkRef")
	private String networkRef;

	@QueryParam("LineRef")
	private List<String> lineRef = new ArrayList<String>();

	@QueryParam("StopPointRef")
	private List<String> stopPointRef = new ArrayList<String>();

	@QueryParam("Language")
	private String language;

	@QueryParam("IncludeTranslations")
	private Boolean includeTranslations;

	@QueryParam("MaximumNumberOfSituationElements")
	private Integer maximumNumberOfSituationElements;

}
