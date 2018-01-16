
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for implementation structure.
 * 
 * <p>Classe Java pour TransportDescriptionStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TransportDescriptionStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CommunicationsTransportMethod" type="{http://www.siri.org.uk/siri}CommunicationsTransportMethodEnumeration"/>
 *         &lt;element name="CompressionMethod" type="{http://www.siri.org.uk/siri}CompressionMethodEnumeration"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportDescriptionStructure", propOrder = {
    "communicationsTransportMethod",
    "compressionMethod"
})
public class TransportDescriptionStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CommunicationsTransportMethod", required = true, defaultValue = "httpPost")
    protected CommunicationsTransportMethodEnumeration communicationsTransportMethod;
    @XmlElement(name = "CompressionMethod", required = true, defaultValue = "none")
    protected CompressionMethodEnumeration compressionMethod;

    /**
     * Obtient la valeur de la propriété communicationsTransportMethod.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationsTransportMethodEnumeration }
     *     
     */
    public CommunicationsTransportMethodEnumeration getCommunicationsTransportMethod() {
        return communicationsTransportMethod;
    }

    /**
     * Définit la valeur de la propriété communicationsTransportMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationsTransportMethodEnumeration }
     *     
     */
    public void setCommunicationsTransportMethod(CommunicationsTransportMethodEnumeration value) {
        this.communicationsTransportMethod = value;
    }

    public boolean isSetCommunicationsTransportMethod() {
        return (this.communicationsTransportMethod!= null);
    }

    /**
     * Obtient la valeur de la propriété compressionMethod.
     * 
     * @return
     *     possible object is
     *     {@link CompressionMethodEnumeration }
     *     
     */
    public CompressionMethodEnumeration getCompressionMethod() {
        return compressionMethod;
    }

    /**
     * Définit la valeur de la propriété compressionMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link CompressionMethodEnumeration }
     *     
     */
    public void setCompressionMethod(CompressionMethodEnumeration value) {
        this.compressionMethod = value;
    }

    public boolean isSetCompressionMethod() {
        return (this.compressionMethod!= null);
    }

}
