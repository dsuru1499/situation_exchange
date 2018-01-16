
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Abstract supertype fro discovery responses.
 * 
 * <p>Classe Java pour AbstractDiscoveryDeliveryStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractDiscoveryDeliveryStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}ResponseStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}DeliveryStatusGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractDiscoveryDeliveryStructure", propOrder = {
    "status",
    "errorCondition",
    "validUntil",
    "shortestPossibleCycle"
})
@XmlSeeAlso({
    FacilityDeliveryStructure.class,
    ProductCategoriesDeliveryStructure.class,
    LinesDeliveryStructure.class,
    ServiceFeaturesDeliveryStructure.class,
    VehicleFeaturesDeliveryStructure.class,
    InfoChannelDeliveryStructure.class,
    StopPointsDeliveryStructure.class,
    ConnectionLinksDeliveryStructure.class
})
public class AbstractDiscoveryDeliveryStructure
    extends ResponseStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Status", defaultValue = "true")
    protected Boolean status;
    @XmlElement(name = "ErrorCondition")
    protected ServiceDeliveryErrorConditionStructure errorCondition;
    @XmlElement(name = "ValidUntil")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validUntil;
    @XmlElement(name = "ShortestPossibleCycle")
    protected Duration shortestPossibleCycle;

    /**
     * Obtient la valeur de la propriété status.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatus() {
        return status;
    }

    /**
     * Définit la valeur de la propriété status.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatus(Boolean value) {
        this.status = value;
    }

    public boolean isSetStatus() {
        return (this.status!= null);
    }

    /**
     * Obtient la valeur de la propriété errorCondition.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDeliveryErrorConditionStructure }
     *     
     */
    public ServiceDeliveryErrorConditionStructure getErrorCondition() {
        return errorCondition;
    }

    /**
     * Définit la valeur de la propriété errorCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDeliveryErrorConditionStructure }
     *     
     */
    public void setErrorCondition(ServiceDeliveryErrorConditionStructure value) {
        this.errorCondition = value;
    }

    public boolean isSetErrorCondition() {
        return (this.errorCondition!= null);
    }

    /**
     * Obtient la valeur de la propriété validUntil.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidUntil() {
        return validUntil;
    }

    /**
     * Définit la valeur de la propriété validUntil.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidUntil(XMLGregorianCalendar value) {
        this.validUntil = value;
    }

    public boolean isSetValidUntil() {
        return (this.validUntil!= null);
    }

    /**
     * Obtient la valeur de la propriété shortestPossibleCycle.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getShortestPossibleCycle() {
        return shortestPossibleCycle;
    }

    /**
     * Définit la valeur de la propriété shortestPossibleCycle.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setShortestPossibleCycle(Duration value) {
        this.shortestPossibleCycle = value;
    }

    public boolean isSetShortestPossibleCycle() {
        return (this.shortestPossibleCycle!= null);
    }

}
