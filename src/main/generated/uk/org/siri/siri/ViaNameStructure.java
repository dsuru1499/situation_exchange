
package uk.org.siri.siri;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for VIA NAMes structure.
 * 
 * <p>Classe Java pour ViaNameStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ViaNameStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}PlaceNameStructure">
 *       &lt;sequence>
 *         &lt;element name="ViaPriority" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViaNameStructure", propOrder = {
    "viaPriority"
})
public class ViaNameStructure
    extends PlaceNameStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ViaPriority", defaultValue = "2")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger viaPriority;

    /**
     * Obtient la valeur de la propriété viaPriority.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getViaPriority() {
        return viaPriority;
    }

    /**
     * Définit la valeur de la propriété viaPriority.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setViaPriority(BigInteger value) {
        this.viaPriority = value;
    }

    public boolean isSetViaPriority() {
        return (this.viaPriority!= null);
    }

}
