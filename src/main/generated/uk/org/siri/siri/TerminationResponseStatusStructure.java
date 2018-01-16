
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for Status of termination response.
 * 
 * <p>Classe Java pour TerminationResponseStatusStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TerminationResponseStatusStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}ResponseTimestamp" minOccurs="0"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ContextualisedResponseEndpointGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}SubscriptionIdentifierResourcePropertyGroup" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Status"/>
 *         &lt;element name="ErrorCondition" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element ref="{http://www.siri.org.uk/siri}CapabilityNotSupportedError"/>
 *                     &lt;element ref="{http://www.siri.org.uk/siri}UnknownSubscriberError"/>
 *                     &lt;element ref="{http://www.siri.org.uk/siri}UnknownSubscriptionError"/>
 *                     &lt;element ref="{http://www.siri.org.uk/siri}OtherError"/>
 *                   &lt;/choice>
 *                   &lt;element name="Description" type="{http://www.siri.org.uk/siri}ErrorDescriptionStructure" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminationResponseStatusStructure", propOrder = {
    "responseTimestamp",
    "requestMessageRef",
    "subscriberRef",
    "subscriptionFilterRef",
    "subscriptionRef",
    "status",
    "errorCondition"
})
public class TerminationResponseStatusStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ResponseTimestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar responseTimestamp;
    @XmlElement(name = "RequestMessageRef")
    protected MessageQualifierStructure requestMessageRef;
    @XmlElement(name = "SubscriberRef")
    protected ParticipantRefStructure subscriberRef;
    @XmlElement(name = "SubscriptionFilterRef")
    protected SubscriptionFilterRefStructure subscriptionFilterRef;
    @XmlElement(name = "SubscriptionRef")
    protected SubscriptionQualifierStructure subscriptionRef;
    @XmlElement(name = "Status", defaultValue = "true")
    protected boolean status;
    @XmlElement(name = "ErrorCondition")
    protected TerminationResponseStatusStructure.ErrorCondition errorCondition;

    /**
     * Obtient la valeur de la propriété responseTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResponseTimestamp() {
        return responseTimestamp;
    }

    /**
     * Définit la valeur de la propriété responseTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResponseTimestamp(XMLGregorianCalendar value) {
        this.responseTimestamp = value;
    }

    public boolean isSetResponseTimestamp() {
        return (this.responseTimestamp!= null);
    }

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
     * Obtient la valeur de la propriété status.
     * 
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * Définit la valeur de la propriété status.
     * 
     */
    public void setStatus(boolean value) {
        this.status = value;
    }

    public boolean isSetStatus() {
        return true;
    }

    /**
     * Obtient la valeur de la propriété errorCondition.
     * 
     * @return
     *     possible object is
     *     {@link TerminationResponseStatusStructure.ErrorCondition }
     *     
     */
    public TerminationResponseStatusStructure.ErrorCondition getErrorCondition() {
        return errorCondition;
    }

    /**
     * Définit la valeur de la propriété errorCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationResponseStatusStructure.ErrorCondition }
     *     
     */
    public void setErrorCondition(TerminationResponseStatusStructure.ErrorCondition value) {
        this.errorCondition = value;
    }

    public boolean isSetErrorCondition() {
        return (this.errorCondition!= null);
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;choice>
     *           &lt;element ref="{http://www.siri.org.uk/siri}CapabilityNotSupportedError"/>
     *           &lt;element ref="{http://www.siri.org.uk/siri}UnknownSubscriberError"/>
     *           &lt;element ref="{http://www.siri.org.uk/siri}UnknownSubscriptionError"/>
     *           &lt;element ref="{http://www.siri.org.uk/siri}OtherError"/>
     *         &lt;/choice>
     *         &lt;element name="Description" type="{http://www.siri.org.uk/siri}ErrorDescriptionStructure" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "capabilityNotSupportedError",
        "unknownSubscriberError",
        "unknownSubscriptionError",
        "otherError",
        "description"
    })
    public static class ErrorCondition
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "CapabilityNotSupportedError")
        protected CapabilityNotSupportedErrorStructure capabilityNotSupportedError;
        @XmlElement(name = "UnknownSubscriberError")
        protected UnknownSubscriberErrorStructure unknownSubscriberError;
        @XmlElement(name = "UnknownSubscriptionError")
        protected UnknownSubscriptionErrorStructure unknownSubscriptionError;
        @XmlElement(name = "OtherError")
        protected OtherErrorStructure otherError;
        @XmlElement(name = "Description")
        protected ErrorDescriptionStructure description;

        /**
         * Obtient la valeur de la propriété capabilityNotSupportedError.
         * 
         * @return
         *     possible object is
         *     {@link CapabilityNotSupportedErrorStructure }
         *     
         */
        public CapabilityNotSupportedErrorStructure getCapabilityNotSupportedError() {
            return capabilityNotSupportedError;
        }

        /**
         * Définit la valeur de la propriété capabilityNotSupportedError.
         * 
         * @param value
         *     allowed object is
         *     {@link CapabilityNotSupportedErrorStructure }
         *     
         */
        public void setCapabilityNotSupportedError(CapabilityNotSupportedErrorStructure value) {
            this.capabilityNotSupportedError = value;
        }

        public boolean isSetCapabilityNotSupportedError() {
            return (this.capabilityNotSupportedError!= null);
        }

        /**
         * Obtient la valeur de la propriété unknownSubscriberError.
         * 
         * @return
         *     possible object is
         *     {@link UnknownSubscriberErrorStructure }
         *     
         */
        public UnknownSubscriberErrorStructure getUnknownSubscriberError() {
            return unknownSubscriberError;
        }

        /**
         * Définit la valeur de la propriété unknownSubscriberError.
         * 
         * @param value
         *     allowed object is
         *     {@link UnknownSubscriberErrorStructure }
         *     
         */
        public void setUnknownSubscriberError(UnknownSubscriberErrorStructure value) {
            this.unknownSubscriberError = value;
        }

        public boolean isSetUnknownSubscriberError() {
            return (this.unknownSubscriberError!= null);
        }

        /**
         * Obtient la valeur de la propriété unknownSubscriptionError.
         * 
         * @return
         *     possible object is
         *     {@link UnknownSubscriptionErrorStructure }
         *     
         */
        public UnknownSubscriptionErrorStructure getUnknownSubscriptionError() {
            return unknownSubscriptionError;
        }

        /**
         * Définit la valeur de la propriété unknownSubscriptionError.
         * 
         * @param value
         *     allowed object is
         *     {@link UnknownSubscriptionErrorStructure }
         *     
         */
        public void setUnknownSubscriptionError(UnknownSubscriptionErrorStructure value) {
            this.unknownSubscriptionError = value;
        }

        public boolean isSetUnknownSubscriptionError() {
            return (this.unknownSubscriptionError!= null);
        }

        /**
         * Obtient la valeur de la propriété otherError.
         * 
         * @return
         *     possible object is
         *     {@link OtherErrorStructure }
         *     
         */
        public OtherErrorStructure getOtherError() {
            return otherError;
        }

        /**
         * Définit la valeur de la propriété otherError.
         * 
         * @param value
         *     allowed object is
         *     {@link OtherErrorStructure }
         *     
         */
        public void setOtherError(OtherErrorStructure value) {
            this.otherError = value;
        }

        public boolean isSetOtherError() {
            return (this.otherError!= null);
        }

        /**
         * Obtient la valeur de la propriété description.
         * 
         * @return
         *     possible object is
         *     {@link ErrorDescriptionStructure }
         *     
         */
        public ErrorDescriptionStructure getDescription() {
            return description;
        }

        /**
         * Définit la valeur de la propriété description.
         * 
         * @param value
         *     allowed object is
         *     {@link ErrorDescriptionStructure }
         *     
         */
        public void setDescription(ErrorDescriptionStructure value) {
            this.description = value;
        }

        public boolean isSetDescription() {
            return (this.description!= null);
        }

    }

}
