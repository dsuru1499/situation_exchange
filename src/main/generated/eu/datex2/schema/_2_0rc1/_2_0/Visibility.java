
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Visibility complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Visibility">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="minimumVisibilityDistance" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsNonNegativeInteger"/>
 *         &lt;element name="visibilityExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Visibility", propOrder = {
    "minimumVisibilityDistance",
    "visibilityExtension"
})
public class Visibility
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected BigInteger minimumVisibilityDistance;
    protected ExtensionType visibilityExtension;

    /**
     * Obtient la valeur de la propriété minimumVisibilityDistance.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumVisibilityDistance() {
        return minimumVisibilityDistance;
    }

    /**
     * Définit la valeur de la propriété minimumVisibilityDistance.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumVisibilityDistance(BigInteger value) {
        this.minimumVisibilityDistance = value;
    }

    public boolean isSetMinimumVisibilityDistance() {
        return (this.minimumVisibilityDistance!= null);
    }

    /**
     * Obtient la valeur de la propriété visibilityExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVisibilityExtension() {
        return visibilityExtension;
    }

    /**
     * Définit la valeur de la propriété visibilityExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVisibilityExtension(ExtensionType value) {
        this.visibilityExtension = value;
    }

    public boolean isSetVisibilityExtension() {
        return (this.visibilityExtension!= null);
    }

}
