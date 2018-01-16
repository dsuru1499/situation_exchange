
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Subscription Request for the Estimated Timetable Service.
 * 
 * <p>Classe Java pour EstimatedTimetableSubscriptionStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EstimatedTimetableSubscriptionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractSubscriptionStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}EstimatedTimetableRequest"/>
 *         &lt;sequence>
 *           &lt;group ref="{http://www.siri.org.uk/siri}EstimatedTimetableSubscriptionPolicyGroup"/>
 *         &lt;/sequence>
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
@XmlType(name = "EstimatedTimetableSubscriptionStructure", propOrder = {
    "estimatedTimetableRequest",
    "incrementalUpdates",
    "changeBeforeUpdates",
    "extensions"
})
public class EstimatedTimetableSubscriptionStructure
    extends AbstractSubscriptionStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "EstimatedTimetableRequest", required = true)
    protected EstimatedTimetableRequestStructure estimatedTimetableRequest;
    @XmlElement(name = "IncrementalUpdates", defaultValue = "true")
    protected Boolean incrementalUpdates;
    @XmlElement(name = "ChangeBeforeUpdates")
    protected Duration changeBeforeUpdates;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété estimatedTimetableRequest.
     * 
     * @return
     *     possible object is
     *     {@link EstimatedTimetableRequestStructure }
     *     
     */
    public EstimatedTimetableRequestStructure getEstimatedTimetableRequest() {
        return estimatedTimetableRequest;
    }

    /**
     * Définit la valeur de la propriété estimatedTimetableRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link EstimatedTimetableRequestStructure }
     *     
     */
    public void setEstimatedTimetableRequest(EstimatedTimetableRequestStructure value) {
        this.estimatedTimetableRequest = value;
    }

    public boolean isSetEstimatedTimetableRequest() {
        return (this.estimatedTimetableRequest!= null);
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
     * Obtient la valeur de la propriété changeBeforeUpdates.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getChangeBeforeUpdates() {
        return changeBeforeUpdates;
    }

    /**
     * Définit la valeur de la propriété changeBeforeUpdates.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setChangeBeforeUpdates(Duration value) {
        this.changeBeforeUpdates = value;
    }

    public boolean isSetChangeBeforeUpdates() {
        return (this.changeBeforeUpdates!= null);
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
