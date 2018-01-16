
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour OffsetDistance complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="OffsetDistance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="offsetDistance" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsNonNegativeInteger"/>
 *         &lt;element name="offsetDistanceExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffsetDistance", propOrder = {
    "offsetDistance",
    "offsetDistanceExtension"
})
public class OffsetDistance
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected BigInteger offsetDistance;
    protected ExtensionType offsetDistanceExtension;

    /**
     * Obtient la valeur de la propriété offsetDistance.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOffsetDistance() {
        return offsetDistance;
    }

    /**
     * Définit la valeur de la propriété offsetDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOffsetDistance(BigInteger value) {
        this.offsetDistance = value;
    }

    public boolean isSetOffsetDistance() {
        return (this.offsetDistance!= null);
    }

    /**
     * Obtient la valeur de la propriété offsetDistanceExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOffsetDistanceExtension() {
        return offsetDistanceExtension;
    }

    /**
     * Définit la valeur de la propriété offsetDistanceExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOffsetDistanceExtension(ExtensionType value) {
        this.offsetDistanceExtension = value;
    }

    public boolean isSetOffsetDistanceExtension() {
        return (this.offsetDistanceExtension!= null);
    }

}
