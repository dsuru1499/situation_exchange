
package uk.org.siri.wsdl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import uk.org.siri.siri.ExtensionsStructure;
import uk.org.siri.siri.SiriSubscriptionRequestStructure;


/**
 * <p>Classe Java pour WsSubscriptionRequestStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WsSubscriptionRequestStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriptionRequestInfo" type="{http://wsdl.siri.org.uk}WsSubscriptionRequestInfoStructure"/>
 *         &lt;element name="Request" type="{http://www.siri.org.uk/siri}SiriSubscriptionRequestStructure"/>
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
@XmlType(name = "WsSubscriptionRequestStructure", propOrder = {
    "subscriptionRequestInfo",
    "request",
    "requestExtension"
})
public class WsSubscriptionRequestStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SubscriptionRequestInfo", required = true)
    protected WsSubscriptionRequestInfoStructure subscriptionRequestInfo;
    @XmlElement(name = "Request", required = true)
    protected SiriSubscriptionRequestStructure request;
    @XmlElement(name = "RequestExtension", required = true)
    protected ExtensionsStructure requestExtension;

    /**
     * Obtient la valeur de la propriété subscriptionRequestInfo.
     * 
     * @return
     *     possible object is
     *     {@link WsSubscriptionRequestInfoStructure }
     *     
     */
    public WsSubscriptionRequestInfoStructure getSubscriptionRequestInfo() {
        return subscriptionRequestInfo;
    }

    /**
     * Définit la valeur de la propriété subscriptionRequestInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link WsSubscriptionRequestInfoStructure }
     *     
     */
    public void setSubscriptionRequestInfo(WsSubscriptionRequestInfoStructure value) {
        this.subscriptionRequestInfo = value;
    }

    public boolean isSetSubscriptionRequestInfo() {
        return (this.subscriptionRequestInfo!= null);
    }

    /**
     * Obtient la valeur de la propriété request.
     * 
     * @return
     *     possible object is
     *     {@link SiriSubscriptionRequestStructure }
     *     
     */
    public SiriSubscriptionRequestStructure getRequest() {
        return request;
    }

    /**
     * Définit la valeur de la propriété request.
     * 
     * @param value
     *     allowed object is
     *     {@link SiriSubscriptionRequestStructure }
     *     
     */
    public void setRequest(SiriSubscriptionRequestStructure value) {
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
