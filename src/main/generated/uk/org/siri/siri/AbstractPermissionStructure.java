
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Abstract Permission.
 * 
 * <p>Classe Java pour AbstractPermissionStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractPermissionStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="AllParticipants" type="{http://www.siri.org.uk/siri}EmptyType"/>
 *           &lt;element name="ParticipantRef" type="{http://www.siri.org.uk/siri}ParticipantRefStructure"/>
 *         &lt;/choice>
 *         &lt;element name="GeneralCapabilities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RequestResponse" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="PublishSubscribe" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "AbstractPermissionStructure", propOrder = {
    "allParticipants",
    "participantRef",
    "generalCapabilities"
})
@XmlSeeAlso({
    ConnectionServicePermissionStructure.class,
    StopTimetableServicePermissionStructure.class,
    FacilityMonitoringServicePermissionStructure.class,
    VehicleMonitoringServicePermissionStructure.class,
    StopMonitoringServicePermissionStructure.class,
    SituationExchangeServicePermissionStructure.class,
    GeneralMessageServicePermissionStructure.class
})
public class AbstractPermissionStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AllParticipants")
    protected String allParticipants;
    @XmlElement(name = "ParticipantRef")
    protected ParticipantRefStructure participantRef;
    @XmlElement(name = "GeneralCapabilities")
    protected AbstractPermissionStructure.GeneralCapabilities generalCapabilities;

    /**
     * Obtient la valeur de la propriété allParticipants.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllParticipants() {
        return allParticipants;
    }

    /**
     * Définit la valeur de la propriété allParticipants.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllParticipants(String value) {
        this.allParticipants = value;
    }

    public boolean isSetAllParticipants() {
        return (this.allParticipants!= null);
    }

    /**
     * Obtient la valeur de la propriété participantRef.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public ParticipantRefStructure getParticipantRef() {
        return participantRef;
    }

    /**
     * Définit la valeur de la propriété participantRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public void setParticipantRef(ParticipantRefStructure value) {
        this.participantRef = value;
    }

    public boolean isSetParticipantRef() {
        return (this.participantRef!= null);
    }

    /**
     * Obtient la valeur de la propriété generalCapabilities.
     * 
     * @return
     *     possible object is
     *     {@link AbstractPermissionStructure.GeneralCapabilities }
     *     
     */
    public AbstractPermissionStructure.GeneralCapabilities getGeneralCapabilities() {
        return generalCapabilities;
    }

    /**
     * Définit la valeur de la propriété generalCapabilities.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractPermissionStructure.GeneralCapabilities }
     *     
     */
    public void setGeneralCapabilities(AbstractPermissionStructure.GeneralCapabilities value) {
        this.generalCapabilities = value;
    }

    public boolean isSetGeneralCapabilities() {
        return (this.generalCapabilities!= null);
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
     *         &lt;element name="RequestResponse" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="PublishSubscribe" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "requestResponse",
        "publishSubscribe"
    })
    public static class GeneralCapabilities
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "RequestResponse", defaultValue = "true")
        protected boolean requestResponse;
        @XmlElement(name = "PublishSubscribe", defaultValue = "true")
        protected boolean publishSubscribe;

        /**
         * Obtient la valeur de la propriété requestResponse.
         * 
         */
        public boolean isRequestResponse() {
            return requestResponse;
        }

        /**
         * Définit la valeur de la propriété requestResponse.
         * 
         */
        public void setRequestResponse(boolean value) {
            this.requestResponse = value;
        }

        public boolean isSetRequestResponse() {
            return true;
        }

        /**
         * Obtient la valeur de la propriété publishSubscribe.
         * 
         */
        public boolean isPublishSubscribe() {
            return publishSubscribe;
        }

        /**
         * Définit la valeur de la propriété publishSubscribe.
         * 
         */
        public void setPublishSubscribe(boolean value) {
            this.publishSubscribe = value;
        }

        public boolean isSetPublishSubscribe() {
            return true;
        }

    }

}
