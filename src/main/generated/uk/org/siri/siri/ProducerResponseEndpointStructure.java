
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Unique reference to reponse from producer. May be used to reference request in subsequent interactions. Used for WSDL.
 * 
 * <p>Classe Java pour ProducerResponseEndpointStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ProducerResponseEndpointStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}ResponseStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ProducerResponseEndpointGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProducerResponseEndpointStructure", propOrder = {
    "producerRef",
    "address",
    "responseMessageIdentifier",
    "requestMessageRef"
})
public class ProducerResponseEndpointStructure
    extends ResponseStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ProducerRef")
    protected ParticipantRefStructure producerRef;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "ResponseMessageIdentifier")
    protected MessageQualifierStructure responseMessageIdentifier;
    @XmlElement(name = "RequestMessageRef")
    protected MessageRefStructure requestMessageRef;

    /**
     * Obtient la valeur de la propriété producerRef.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public ParticipantRefStructure getProducerRef() {
        return producerRef;
    }

    /**
     * Définit la valeur de la propriété producerRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public void setProducerRef(ParticipantRefStructure value) {
        this.producerRef = value;
    }

    public boolean isSetProducerRef() {
        return (this.producerRef!= null);
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
     * Obtient la valeur de la propriété responseMessageIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link MessageQualifierStructure }
     *     
     */
    public MessageQualifierStructure getResponseMessageIdentifier() {
        return responseMessageIdentifier;
    }

    /**
     * Définit la valeur de la propriété responseMessageIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageQualifierStructure }
     *     
     */
    public void setResponseMessageIdentifier(MessageQualifierStructure value) {
        this.responseMessageIdentifier = value;
    }

    public boolean isSetResponseMessageIdentifier() {
        return (this.responseMessageIdentifier!= null);
    }

    /**
     * Obtient la valeur de la propriété requestMessageRef.
     * 
     * @return
     *     possible object is
     *     {@link MessageRefStructure }
     *     
     */
    public MessageRefStructure getRequestMessageRef() {
        return requestMessageRef;
    }

    /**
     * Définit la valeur de la propriété requestMessageRef.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageRefStructure }
     *     
     */
    public void setRequestMessageRef(MessageRefStructure value) {
        this.requestMessageRef = value;
    }

    public boolean isSetRequestMessageRef() {
        return (this.requestMessageRef!= null);
    }

}
