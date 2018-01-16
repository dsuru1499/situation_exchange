
package uk.org.siri.wsdl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import uk.org.siri.siri.ExtensionsStructure;
import uk.org.siri.siri.RequestStructure;
import uk.org.siri.siri.TerminateSubscriptionRequestBodyStructure;


/**
 * <p>Classe Java pour WsDeleteSubscriptionRequestStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WsDeleteSubscriptionRequestStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeleteSubscriptionInfo" type="{http://www.siri.org.uk/siri}RequestStructure"/>
 *         &lt;element name="Request" type="{http://www.siri.org.uk/siri}TerminateSubscriptionRequestBodyStructure"/>
 *         &lt;element name="RequestExtension" type="{http://www.siri.org.uk/siri}ExtensionsStructure"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsDeleteSubscriptionRequestStructure", propOrder = {
    "deleteSubscriptionInfo",
    "request",
    "requestExtension"
})
public class WsDeleteSubscriptionRequestStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DeleteSubscriptionInfo", required = true)
    protected RequestStructure deleteSubscriptionInfo;
    @XmlElement(name = "Request", required = true)
    protected TerminateSubscriptionRequestBodyStructure request;
    @XmlElement(name = "RequestExtension", required = true)
    protected ExtensionsStructure requestExtension;

    /**
     * Obtient la valeur de la propriété deleteSubscriptionInfo.
     * 
     * @return
     *     possible object is
     *     {@link RequestStructure }
     *     
     */
    public RequestStructure getDeleteSubscriptionInfo() {
        return deleteSubscriptionInfo;
    }

    /**
     * Définit la valeur de la propriété deleteSubscriptionInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestStructure }
     *     
     */
    public void setDeleteSubscriptionInfo(RequestStructure value) {
        this.deleteSubscriptionInfo = value;
    }

    public boolean isSetDeleteSubscriptionInfo() {
        return (this.deleteSubscriptionInfo!= null);
    }

    /**
     * Obtient la valeur de la propriété request.
     * 
     * @return
     *     possible object is
     *     {@link TerminateSubscriptionRequestBodyStructure }
     *     
     */
    public TerminateSubscriptionRequestBodyStructure getRequest() {
        return request;
    }

    /**
     * Définit la valeur de la propriété request.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminateSubscriptionRequestBodyStructure }
     *     
     */
    public void setRequest(TerminateSubscriptionRequestBodyStructure value) {
        this.request = value;
    }

    public boolean isSetRequest() {
        return (this.request!= null);
    }

    /**
     * Obtient la valeur de la propriété requestExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getRequestExtension() {
        return requestExtension;
    }

    /**
     * Définit la valeur de la propriété requestExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setRequestExtension(ExtensionsStructure value) {
        this.requestExtension = value;
    }

    public boolean isSetRequestExtension() {
        return (this.requestExtension!= null);
    }

}
