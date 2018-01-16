
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Unique reference to this response created by Consumer. May be used to reference the request in subsequent interactions. Used by WSDL.
 * 
 * <p>Classe Java pour ConsumerResponseEndpointStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ConsumerResponseEndpointStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}ResponseStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ConsumerResponseEndpointGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}DelegatorEndpointGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumerResponseEndpointStructure", propOrder = {
    "consumerRef",
    "requestMessageRef",
    "delegatorAddress",
    "delegatorRef"
})
@XmlSeeAlso({
    DataReceivedResponseStructure.class,
    DataReadyResponseStructure.class
})
public class ConsumerResponseEndpointStructure
    extends ResponseStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ConsumerRef")
    protected ParticipantRefStructure consumerRef;
    @XmlElement(name = "RequestMessageRef")
    protected MessageRefStructure requestMessageRef;
    @XmlElement(name = "DelegatorAddress")
    protected String delegatorAddress;
    @XmlElement(name = "DelegatorRef")
    protected ParticipantRefStructure delegatorRef;

    /**
     * Obtient la valeur de la propriété consumerRef.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public ParticipantRefStructure getConsumerRef() {
        return consumerRef;
    }

    /**
     * Définit la valeur de la propriété consumerRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public void setConsumerRef(ParticipantRefStructure value) {
        this.consumerRef = value;
    }

    public boolean isSetConsumerRef() {
        return (this.consumerRef!= null);
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
