
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for SIRI Service subscriptions.
 * 
 * <p>Classe Java pour AbstractSubscriptionStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractSubscriptionStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}SubscriptionIdentityGroup"/>
 *         &lt;element name="InitialTerminationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractSubscriptionStructure", propOrder = {
    "subscriberRef",
    "subscriptionIdentifier",
    "initialTerminationTime"
})
@XmlSeeAlso({
    ConnectionTimetableSubscriptionStructure.class,
    StopTimetableSubscriptionStructure.class,
    VehicleMonitoringSubscriptionStructure.class,
    StopMonitoringSubscriptionStructure.class,
    ConnectionMonitoringSubscriptionRequestStructure.class,
    EstimatedTimetableSubscriptionStructure.class,
    GeneralMessageSubscriptionStructure.class,
    FacilityMonitoringSubscriptionStructure.class,
    SituationExchangeSubscriptionStructure.class,
    ProductionTimetableSubscriptionStructure.class
})
public abstract class AbstractSubscriptionStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SubscriberRef")
    protected ParticipantRefStructure subscriberRef;
    @XmlElement(name = "SubscriptionIdentifier", required = true)
    protected SubscriptionQualifierStructure subscriptionIdentifier;
    @XmlElement(name = "InitialTerminationTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar initialTerminationTime;

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
     * Obtient la valeur de la propriété subscriptionIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionQualifierStructure }
     *     
     */
    public SubscriptionQualifierStructure getSubscriptionIdentifier() {
        return subscriptionIdentifier;
    }

    /**
     * Définit la valeur de la propriété subscriptionIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionQualifierStructure }
     *     
     */
    public void setSubscriptionIdentifier(SubscriptionQualifierStructure value) {
        this.subscriptionIdentifier = value;
    }

    public boolean isSetSubscriptionIdentifier() {
        return (this.subscriptionIdentifier!= null);
    }

    /**
     * Obtient la valeur de la propriété initialTerminationTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInitialTerminationTime() {
        return initialTerminationTime;
    }

    /**
     * Définit la valeur de la propriété initialTerminationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInitialTerminationTime(XMLGregorianCalendar value) {
        this.initialTerminationTime = value;
    }

    public boolean isSetInitialTerminationTime() {
        return (this.initialTerminationTime!= null);
    }

}
