
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Requests for stop reference data for use in service requests.
 * 
 * <p>Classe Java pour AbstractDiscoveryRequestStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractDiscoveryRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AuthenticatedRequestStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}RequestorEndpointGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractDiscoveryRequestStructure", propOrder = {
    "address",
    "requestorRef",
    "messageIdentifier"
})
@XmlSeeAlso({
    ProductCategoriesDiscoveryRequestStructure.class,
    VehicleFeaturesRequestStructure.class,
    LinesDiscoveryRequestStructure.class,
    InfoChannelDiscoveryRequestStructure.class,
    FacilityRequestStructure.class,
    ConnectionLinksDiscoveryRequestStructure.class,
    StopPointsDiscoveryRequestStructure.class,
    ServiceFeaturesDiscoveryRequestStructure.class
})
public abstract class AbstractDiscoveryRequestStructure
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

}
