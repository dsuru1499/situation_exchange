
package uk.org.siri.wsdl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import uk.org.siri.siri.ExtensionsStructure;


/**
 * <p>Classe Java pour ProductionTimetableRequestStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ProductionTimetableRequestStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceRequestInfo" type="{http://wsdl.siri.org.uk}WsServiceRequestInfoStructure"/>
 *         &lt;element name="Request" type="{http://www.siri.org.uk/siri}ProductionTimetableRequestStructure"/>
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
@XmlType(name = "ProductionTimetableRequestStructure", propOrder = {
    "serviceRequestInfo",
    "request",
    "requestExtension"
})
public class ProductionTimetableRequestStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ServiceRequestInfo", required = true)
    protected WsServiceRequestInfoStructure serviceRequestInfo;
    @XmlElement(name = "Request", required = true)
    protected uk.org.siri.siri.ProductionTimetableRequestStructure request;
    @XmlElement(name = "RequestExtension", required = true)
    protected ExtensionsStructure requestExtension;

    /**
     * Obtient la valeur de la propriété serviceRequestInfo.
     * 
     * @return
     *     possible object is
     *     {@link WsServiceRequestInfoStructure }
     *     
     */
    public WsServiceRequestInfoStructure getServiceRequestInfo() {
        return serviceRequestInfo;
    }

    /**
     * Définit la valeur de la propriété serviceRequestInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link WsServiceRequestInfoStructure }
     *     
     */
    public void setServiceRequestInfo(WsServiceRequestInfoStructure value) {
        this.serviceRequestInfo = value;
    }

    public boolean isSetServiceRequestInfo() {
        return (this.serviceRequestInfo!= null);
    }

    /**
     * Obtient la valeur de la propriété request.
     * 
     * @return
     *     possible object is
     *     {@link uk.org.siri.siri.ProductionTimetableRequestStructure }
     *     
     */
    public uk.org.siri.siri.ProductionTimetableRequestStructure getRequest() {
        return request;
    }

    /**
     * Définit la valeur de la propriété request.
     * 
     * @param value
     *     allowed object is
     *     {@link uk.org.siri.siri.ProductionTimetableRequestStructure }
     *     
     */
    public void setRequest(uk.org.siri.siri.ProductionTimetableRequestStructure value) {
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
