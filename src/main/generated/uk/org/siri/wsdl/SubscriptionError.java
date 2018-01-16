
package uk.org.siri.wsdl;

import javax.xml.ws.WebFault;
import uk.org.siri.siri.ErrorConditionStructure;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "WSErrorConditionElement", targetNamespace = "http://wsdl.siri.org.uk")
public class SubscriptionError
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ErrorConditionStructure faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public SubscriptionError(String message, ErrorConditionStructure faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public SubscriptionError(String message, ErrorConditionStructure faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: uk.org.siri.siri.ErrorConditionStructure
     */
    public ErrorConditionStructure getFaultInfo() {
        return faultInfo;
    }

}
