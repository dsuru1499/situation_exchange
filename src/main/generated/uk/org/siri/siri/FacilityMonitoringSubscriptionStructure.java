
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Subscription Request for Vehicle Monitoring Service.
 * 
 * <p>Classe Java pour FacilityMonitoringSubscriptionStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="FacilityMonitoringSubscriptionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractSubscriptionStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}FacilityMonitoringRequest"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}FacilityMonitoringSubscriptionPolicyGroup"/>
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
@XmlType(name = "FacilityMonitoringSubscriptionStructure", propOrder = {
    "facilityMonitoringRequest",
    "incrementalUpdates",
    "extensions"
})
public class FacilityMonitoringSubscriptionStructure
    extends AbstractSubscriptionStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "FacilityMonitoringRequest", required = true)
    protected FacilityMonitoringRequestStructure facilityMonitoringRequest;
    @XmlElement(name = "IncrementalUpdates", defaultValue = "false")
    protected Boolean incrementalUpdates;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété facilityMonitoringRequest.
     * 
     * @return
     *     possible object is
     *     {@link FacilityMonitoringRequestStructure }
     *     
     */
    public FacilityMonitoringRequestStructure getFacilityMonitoringRequest() {
        return facilityMonitoringRequest;
    }

    /**
     * Définit la valeur de la propriété facilityMonitoringRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityMonitoringRequestStructure }
     *     
     */
    public void setFacilityMonitoringRequest(FacilityMonitoringRequestStructure value) {
        this.facilityMonitoringRequest = value;
    }

    public boolean isSetFacilityMonitoringRequest() {
        return (this.facilityMonitoringRequest!= null);
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
