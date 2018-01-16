
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Subscription Request for Production Timetable Service.
 * 
 * <p>Classe Java pour ProductionTimetableSubscriptionStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ProductionTimetableSubscriptionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractSubscriptionStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}ProductionTimetableRequest"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ProductionTimetableSubscriptionPolicyGroup"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductionTimetableSubscriptionStructure", propOrder = {
    "productionTimetableRequest",
    "incrementalUpdates",
    "extensions"
})
@XmlSeeAlso({
    ProductionTimetableSubscriptionRequest.class
})
public class ProductionTimetableSubscriptionStructure
    extends AbstractSubscriptionStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ProductionTimetableRequest", required = true)
    protected ProductionTimetableRequestStructure productionTimetableRequest;
    @XmlElement(name = "IncrementalUpdates", defaultValue = "false")
    protected Boolean incrementalUpdates;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété productionTimetableRequest.
     * 
     * @return
     *     possible object is
     *     {@link ProductionTimetableRequestStructure }
     *     
     */
    public ProductionTimetableRequestStructure getProductionTimetableRequest() {
        return productionTimetableRequest;
    }

    /**
     * Définit la valeur de la propriété productionTimetableRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductionTimetableRequestStructure }
     *     
     */
    public void setProductionTimetableRequest(ProductionTimetableRequestStructure value) {
        this.productionTimetableRequest = value;
    }

    public boolean isSetProductionTimetableRequest() {
        return (this.productionTimetableRequest!= null);
    }

    /**
     * Obtient la valeur de la propriété incrementalUpdates.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncrementalUpdates() {
        return incrementalUpdates;
    }

    /**
     * Définit la valeur de la propriété incrementalUpdates.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncrementalUpdates(Boolean value) {
        this.incrementalUpdates = value;
    }

    public boolean isSetIncrementalUpdates() {
        return (this.incrementalUpdates!= null);
    }

    /**
     * Obtient la valeur de la propriété extensions.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Définit la valeur de la propriété extensions.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public boolean isSetExtensions() {
        return (this.extensions!= null);
    }

}
