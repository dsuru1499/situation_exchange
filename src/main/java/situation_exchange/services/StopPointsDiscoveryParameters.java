package situation_exchange.services;

import javax.ws.rs.QueryParam;
import javax.xml.datatype.XMLGregorianCalendar;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import situation_exchange.common.DefaultParameters;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class StopPointsDiscoveryParameters extends DefaultParameters {

	@QueryParam("RequestTimestamp")
	private XMLGregorianCalendar requestTimestamp;

	@QueryParam("RequestorRef")
	private String requestorRef;

	@QueryParam("MessageIdentifier")
	private String messageIdentifier;

	@QueryParam("OperatorRef")
	private String operatorRef;

	@QueryParam("LineRef")
	private String lineRef;

	@QueryParam("BoundingBox.UpperLeft.Longitude")
	private Float boundingBoxUpperLeftLongitude;

	@QueryParam("BoundingBox.UpperLeft.Latitude")
	private Float boundingBoxUpperLeftLatitude;

	@QueryParam("BoundingBox.LowerRight.Longitude")
	private Float boundingBoxLowerRightLongitude;

	@QueryParam("BoundingBox.LowerRight.Latitude")
	private Float boundingBoxLowerRightLatitude;

}