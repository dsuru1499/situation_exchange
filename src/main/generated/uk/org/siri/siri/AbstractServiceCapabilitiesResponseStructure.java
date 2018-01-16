
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for capabilities response.
 * 
 * <p>Classe Java pour AbstractServiceCapabilitiesResponseStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractServiceCapabilitiesResponseStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}ResponseStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ContextualisedResponseEndpointGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}DelegatorEndpointGroup"/>
 *         &lt;sequence>
 *           &lt;group ref="{http://www.siri.org.uk/siri}CapabilityStatusGroup"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractServiceCapabilitiesResponseStructure", propOrder = {
    "requestMessageRef",
    "delegatorAddress",
    "delegatorRef",
    "status",
    "errorCondition"
})
@XmlSeeAlso({
    ConnectionTimetableCapabilitiesResponseStructure.class,
    ConnectionMonitoringCapabilitiesResponseStructure.class,
    EstimatedTimetableCapabilitiesResponseStructure.class,
    StopMonitoringCapabilitiesResponseStructure.class,
    FacilityMonitoringCapabilitiesResponseStructure.class,
    StopTimetableCapabilitiesResponseStructure.class,
    VehicleMonitoringCapabilitiesResponseStructure.class,
    ProductionTimetableCapabilitiesResponseStructure.class,
    SituationExchangeCapabilitiesResponseStructure.class,
    GeneralMessageCapabilitiesResponseStructure.class
})
public class AbstractServiceCapabilitiesResponseStructure
    extends ResponseStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "RequestMessageRef")
    protected MessageQualifierStructure requestMessageRef;
    @XmlElement(name = "DelegatorAddress")
    protected String delegatorAddress;
    @XmlElement(name = "DelegatorRef")
    protected ParticipantRefStructure delegatorRef;
    @XmlElement(name = "Status", defaultValue = "true")
    protected Boolean status;
    @XmlElement(name = "ErrorCondition")
    protected ServiceDeliveryErrorConditionStructure errorCondition;

    /**
     * Obtient la valeur de la propriété requestMessageRef.
     * 
     * @return
     *     possible object is
     *     {@link MessageQualifierStructure }
     *     
     */
    public MessageQualifierStructure getRequestMessageRef() {
        return requestMessageRef;
    }

    /**
     * Définit la valeur de la propriété requestMessageRef.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageQualifierStructure }
     *     
     */
    public void setRequestMessageRef(MessageQualifierStructure value) {
        this.requestMessageRef = value;
    }

    public boolean isSetRequestMessageRef() {
        return (this.requestMessageRef!= null);
    }

    /**
     * Obtient la valeur de la propriété delegatorAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegatorAddress() {
        return delegatorAddress;
    }

    /**
     * Définit la valeur de la propriété delegatorAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegatorAddress(String value) {
        this.delegatorAddress = value;
    }

    public boolean isSetDelegatorAddress() {
        return (this.delegatorAddress!= null);
    }

    /**
     * Obtient la valeur de la propriété delegatorRef.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public ParticipantRefStructure getDelegatorRef() {
        return delegatorRef;
    }

    /**
     * Définit la valeur de la propriété delegatorRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public void setDelegatorRef(ParticipantRefStructure value) {
        this.delegatorRef = value;
    }

    public boolean isSetDelegatorRef() {
        return (this.delegatorRef!= null);
    }

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

}
