
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import uk.org.siri.wsdl.WsServiceRequestInfoStructure;


/**
 * Type for General SIRI Request.
 * 
 * <p>Classe Java pour ContextualisedRequestStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ContextualisedRequestStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceRequestContext" type="{http://www.siri.org.uk/siri}ServiceRequestContextStructure" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}RequestTimestamp"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}AuthenticatedRequestGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}RequestorEndpointGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}DelegatorEndpointGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContextualisedRequestStructure", propOrder = {
    "serviceRequestContext",
    "requestTimestamp",
    "accountId",
    "accountKey",
    "address",
    "requestorRef",
    "messageIdentifier",
    "delegatorAddress",
    "delegatorRef"
})
@XmlSeeAlso({
    WsServiceRequestInfoStructure.class,
    ServiceRequestStructure.class
})
public abstract class ContextualisedRequestStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ServiceRequestContext")
    protected ServiceRequestContextStructure serviceRequestContext;
    @XmlElement(name = "RequestTimestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestTimestamp;
    @XmlElement(name = "AccountId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String accountId;
    @XmlElement(name = "AccountKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String accountKey;
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

    /**
     * Obtient la valeur de la propriété serviceRequestContext.
     * 
     * @return
     *     possible object is
     *     {@link ServiceRequestContextStructure }
     *     
     */
    public ServiceRequestContextStructure getServiceRequestContext() {
        return serviceRequestContext;
    }

    /**
     * Définit la valeur de la propriété serviceRequestContext.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRequestContextStructure }
     *     
     */
    public void setServiceRequestContext(ServiceRequestContextStructure value) {
        this.serviceRequestContext = value;
    }

    public boolean isSetServiceRequestContext() {
        return (this.serviceRequestContext!= null);
    }

    /**
     * Obtient la valeur de la propriété requestTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestTimestamp() {
        return requestTimestamp;
    }

    /**
     * Définit la valeur de la propriété requestTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestTimestamp(XMLGregorianCalendar value) {
        this.requestTimestamp = value;
    }

    public boolean isSetRequestTimestamp() {
        return (this.requestTimestamp!= null);
    }

    /**
     * Obtient la valeur de la propriété accountId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Définit la valeur de la propriété accountId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    public boolean isSetAccountId() {
        return (this.accountId!= null);
    }

    /**
     * Obtient la valeur de la propriété accountKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountKey() {
        return accountKey;
    }

    /**
     * Définit la valeur de la propriété accountKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountKey(String value) {
        this.accountKey = value;
    }

    public boolean isSetAccountKey() {
        return (this.accountKey!= null);
    }

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

}
