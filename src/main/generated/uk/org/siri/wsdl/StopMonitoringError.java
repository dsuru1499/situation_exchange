
package uk.org.siri.wsdl;

import javax.xml.ws.WebFault;
import uk.org.siri.siri.ServiceDeliveryErrorConditionStructure;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "WSServiceDeliveryErrorConditionElement", targetNamespace = "http://wsdl.siri.org.uk")
public class StopMonitoringError
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ServiceDeliveryErrorConditionStructure faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public StopMonitoringError(String message, ServiceDeliveryErrorConditionStructure faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public StopMonitoringError(String message, ServiceDeliveryErrorConditionStructure faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: uk.org.siri.siri.ServiceDeliveryErrorConditionStructure
     */
    public ServiceDeliveryErrorConditionStructure getFaultInfo() {
        return faultInfo;
    }

}
