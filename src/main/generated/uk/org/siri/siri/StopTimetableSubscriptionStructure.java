
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Subscription Request for Stop Timetables.
 * 
 * <p>Classe Java pour StopTimetableSubscriptionStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StopTimetableSubscriptionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractSubscriptionStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}StopTimetableRequest"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}StopTimetableSubscriptionPolicyGroup"/>
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
@XmlType(name = "StopTimetableSubscriptionStructure", propOrder = {
    "stopTimetableRequest",
    "incrementalUpdates",
    "changeBeforeUpdates",
    "extensions"
})
public class StopTimetableSubscriptionStructure
    extends AbstractSubscriptionStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "StopTimetableRequest", required = true)
    protected StopTimetableRequestStructure stopTimetableRequest;
    @XmlElement(name = "IncrementalUpdates", defaultValue = "false")
    protected Boolean incrementalUpdates;
    @XmlElement(name = "ChangeBeforeUpdates")
    protected Duration changeBeforeUpdates;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété stopTimetableRequest.
     * 
     * @return
     *     possible object is
     *     {@link StopTimetableRequestStructure }
     *     
     */
    public StopTimetableRequestStructure getStopTimetableRequest() {
        return stopTimetableRequest;
    }

    /**
     * Définit la valeur de la propriété stopTimetableRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopTimetableRequestStructure }
     *     
     */
    public void setStopTimetableRequest(StopTimetableRequestStructure value) {
        this.stopTimetableRequest = value;
    }

    public boolean isSetStopTimetableRequest() {
        return (this.stopTimetableRequest!= null);
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
