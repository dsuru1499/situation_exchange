
package uk.org.siri.wsdl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import uk.org.siri.siri.ConsumerRequestEndpointStructure;
import uk.org.siri.siri.DataSupplyRequestBodyStructure;
import uk.org.siri.siri.ExtensionsStructure;


/**
 * <p>Classe Java pour WsDataSupplyRequestStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WsDataSupplyRequestStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataSupplyRequestInfo" type="{http://www.siri.org.uk/siri}ConsumerRequestEndpointStructure"/>
 *         &lt;element name="Request" type="{http://www.siri.org.uk/siri}DataSupplyRequestBodyStructure"/>
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
@XmlType(name = "WsDataSupplyRequestStructure", propOrder = {
    "dataSupplyRequestInfo",
    "request",
    "requestExtension"
})
public class WsDataSupplyRequestStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DataSupplyRequestInfo", required = true)
    protected ConsumerRequestEndpointStructure dataSupplyRequestInfo;
    @XmlElement(name = "Request", required = true)
    protected DataSupplyRequestBodyStructure request;
    @XmlElement(name = "RequestExtension", required = true)
    protected ExtensionsStructure requestExtension;

    /**
     * Obtient la valeur de la propriété dataSupplyRequestInfo.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerRequestEndpointStructure }
     *     
     */
    public ConsumerRequestEndpointStructure getDataSupplyRequestInfo() {
        return dataSupplyRequestInfo;
    }

    /**
     * Définit la valeur de la propriété dataSupplyRequestInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerRequestEndpointStructure }
     *     
     */
    public void setDataSupplyRequestInfo(ConsumerRequestEndpointStructure value) {
        this.dataSupplyRequestInfo = value;
    }

    public boolean isSetDataSupplyRequestInfo() {
        return (this.dataSupplyRequestInfo!= null);
    }

    /**
     * Obtient la valeur de la propriété request.
     * 
     * @return
     *     possible object is
     *     {@link DataSupplyRequestBodyStructure }
     *     
     */
    public DataSupplyRequestBodyStructure getRequest() {
        return request;
    }

    /**
     * Définit la valeur de la propriété request.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSupplyRequestBodyStructure }
     *     
     */
    public void setRequest(DataSupplyRequestBodyStructure value) {
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
