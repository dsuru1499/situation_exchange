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
public class LinesDiscoveryParameters extends DefaultParameters {

	@QueryParam("RequestTimestamp")
	private XMLGregorianCalendar requestTimestamp;

	@QueryParam("RequestorRef")
	private String requestorRef;

	@QueryParam("MessageIdentifier")
	private String messageIdentifier;

	@QueryParam("OperatorRef")
	private String operatorRef;

}