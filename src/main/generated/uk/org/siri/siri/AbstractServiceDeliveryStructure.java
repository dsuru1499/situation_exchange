
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for Common elementd for a SIRI service delivery of the Form xxxDelivery.
 * 
 * <p>Classe Java pour AbstractServiceDeliveryStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractServiceDeliveryStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}ResponseStructure">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;group ref="{http://www.siri.org.uk/siri}ContextualisedResponseEndpointGroup"/>
 *           &lt;group ref="{http://www.siri.org.uk/siri}SubscriptionIdentifierResourcePropertyGroup"/>
 *         &lt;/choice>
 *         &lt;group ref="{http://www.siri.org.uk/siri}DelegatorEndpointGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}DeliveryStatusGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}DeliveryDefaultGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractServiceDeliveryStructure", propOrder = {
    "requestMessageRef",
    "subscriberRef",
    "subscriptionFilterRef",
    "subscriptionRef",
    "delegatorAddress",
    "delegatorRef",
    "status",
    "errorCondition",
    "validUntil",
    "shortestPossibleCycle",
    "defaultLanguage"
})
@XmlSeeAlso({
    ConnectionMonitoringDistributorDeliveryStructure.class,
    EstimatedTimetableDeliveryStructure.class,
    FacilityMonitoringDeliveryStructure.class,
    GeneralMessageDeliveryStructure.class,
    VehicleMonitoringDeliveryStructure.class,
    SituationExchangeDeliveryStructure.class,
    ProductionTimetableDeliveryStructure.class,
    StopTimetableDeliveryStructure.class,
    StopMonitoringDeliveryStructure.class,
    ConnectionTimetableDeliveryStructure.class,
    ConnectionMonitoringFeederDeliveryStructure.class
})
public abstract class AbstractServiceDeliveryStructure
    extends ResponseStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "RequestMessageRef")
    protected MessageQualifierStructure requestMessageRef;
    @XmlElement(name = "SubscriberRef")
    protected ParticipantRefStructure subscriberRef;
    @XmlElement(name = "SubscriptionFilterRef")
    protected SubscriptionFilterRefStructure subscriptionFilterRef;
    @XmlElement(name = "SubscriptionRef")
    protected SubscriptionQualifierStructure subscriptionRef;
    @XmlElement(name = "DelegatorAddress")
    protected String delegatorAddress;
    @XmlElement(name = "DelegatorRef")
    protected ParticipantRefStructure delegatorRef;
    @XmlElement(name = "Status", defaultValue = "true")
    protected Boolean status;
    @XmlElement(name = "ErrorCondition")
    protected ServiceDeliveryErrorConditionStructure errorCondition;
    @XmlElement(name = "ValidUntil")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validUntil;
    @XmlElement(name = "ShortestPossibleCycle")
    protected Duration shortestPossibleCycle;
    @XmlElement(name = "DefaultLanguage")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String defaultLanguage;

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
     * Obtient la valeur de la propriété subscriberRef.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public ParticipantRefStructure getSubscriberRef() {
        return subscriberRef;
    }

    /**
     * Définit la valeur de la propriété subscriberRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public void setSubscriberRef(ParticipantRefStructure value) {
        this.subscriberRef = value;
    }

    public boolean isSetSubscriberRef() {
        return (this.subscriberRef!= null);
    }

    /**
     * Obtient la valeur de la propriété subscriptionFilterRef.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionFilterRefStructure }
     *     
     */
    public SubscriptionFilterRefStructure getSubscriptionFilterRef() {
        return subscriptionFilterRef;
    }

    /**
     * Définit la valeur de la propriété subscriptionFilterRef.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionFilterRefStructure }
     *     
     */
    public void setSubscriptionFilterRef(SubscriptionFilterRefStructure value) {
        this.subscriptionFilterRef = value;
    }

    public boolean isSetSubscriptionFilterRef() {
        return (this.subscriptionFilterRef!= null);
    }

    /**
     * Obtient la valeur de la propriété subscriptionRef.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionQualifierStructure }
     *     
     */
    public SubscriptionQualifierStructure getSubscriptionRef() {
        return subscriptionRef;
    }

    /**
     * Définit la valeur de la propriété subscriptionRef.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionQualifierStructure }
     *     
     */
    public void setSubscriptionRef(SubscriptionQualifierStructure value) {
        this.subscriptionRef = value;
    }

    public boolean isSetSubscriptionRef() {
        return (this.subscriptionRef!= null);
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

    /**
     * Obtient la valeur de la propriété defaultLanguage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    /**
     * Définit la valeur de la propriété defaultLanguage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultLanguage(String value) {
        this.defaultLanguage = value;
    }

    public boolean isSetDefaultLanguage() {
        return (this.defaultLanguage!= null);
    }

}
