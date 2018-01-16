
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for request to terminate a subscription or subscriptions.
 * 
 * <p>Classe Java pour TerminateSubscriptionRequestStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TerminateSubscriptionRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AuthenticatedRequestStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}RequestorEndpointGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}DelegatorEndpointGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}TerminateSubscriptionTopicGroup"/>
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
@XmlType(name = "TerminateSubscriptionRequestStructure", propOrder = {
    "address",
    "requestorRef",
    "messageIdentifier",
    "delegatorAddress",
    "delegatorRef",
    "subscriberRef",
    "all",
    "subscriptionRef",
    "extensions"
})
public class TerminateSubscriptionRequestStructure
    extends AuthenticatedRequestStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "RequestorRef", required = true)
    protected ParticipantRefStructure requestorRef;
    @XmlElement(name = "MessageIdentifier")
    protected MessageQualifierStructure messageIdentifier;
    @XmlElement(name = "DelegatorAddress")
    protected String delegatorAddress;
    @XmlElement(name = "DelegatorRef")
    protected ParticipantRefStructure delegatorRef;
    @XmlElement(name = "SubscriberRef")
    protected ParticipantRefStructure subscriberRef;
    @XmlElement(name = "All")
    protected String all;
    @XmlElement(name = "SubscriptionRef")
    protected List<SubscriptionQualifierStructure> subscriptionRef;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété address.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Définit la valeur de la propriété address.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    public boolean isSetAddress() {
        return (this.address!= null);
    }

    /**
     * Obtient la valeur de la propriété requestorRef.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public ParticipantRefStructure getRequestorRef() {
        return requestorRef;
    }

    /**
     * Définit la valeur de la propriété requestorRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public void setRequestorRef(ParticipantRefStructure value) {
        this.requestorRef = value;
    }

    public boolean isSetRequestorRef() {
        return (this.requestorRef!= null);
    }

    /**
     * Obtient la valeur de la propriété messageIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link MessageQualifierStructure }
     *     
     */
    public MessageQualifierStructure getMessageIdentifier() {
        return messageIdentifier;
    }

    /**
     * Définit la valeur de la propriété messageIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageQualifierStructure }
     *     
     */
    public void setMessageIdentifier(MessageQualifierStructure value) {
        this.messageIdentifier = value;
    }

    public boolean isSetMessageIdentifier() {
        return (this.messageIdentifier!= null);
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
     * Obtient la valeur de la propriété all.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAll() {
        return all;
    }

    /**
     * Définit la valeur de la propriété all.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAll(String value) {
        this.all = value;
    }

    public boolean isSetAll() {
        return (this.all!= null);
    }

    /**
     * Gets the value of the subscriptionRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriptionRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriptionRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriptionQualifierStructure }
     * 
     * 
     */
    public List<SubscriptionQualifierStructure> getSubscriptionRef() {
        if (subscriptionRef == null) {
            subscriptionRef = new ArrayList<SubscriptionQualifierStructure>();
        }
        return this.subscriptionRef;
    }

    public boolean isSetSubscriptionRef() {
        return ((this.subscriptionRef!= null)&&(!this.subscriptionRef.isEmpty()));
    }

    public void unsetSubscriptionRef() {
        this.subscriptionRef = null;
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
