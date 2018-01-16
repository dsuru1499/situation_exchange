
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AxleSpacing complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AxleSpacing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="axleSpacing" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat"/>
 *         &lt;element name="axleSpacingSequenceIdentifier" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger"/>
 *         &lt;element name="axleSpacingExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AxleSpacing", propOrder = {
    "axleSpacing",
    "axleSpacingSequenceIdentifier",
    "axleSpacingExtension"
})
public class AxleSpacing
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected float axleSpacing;
    @XmlElement(required = true)
    protected BigInteger axleSpacingSequenceIdentifier;
    protected ExtensionType axleSpacingExtension;

    /**
     * Obtient la valeur de la propriété axleSpacing.
     * 
     */
    public float getAxleSpacing() {
        return axleSpacing;
    }

    /**
     * Définit la valeur de la propriété axleSpacing.
     * 
     */
    public void setAxleSpacing(float value) {
        this.axleSpacing = value;
    }

    public boolean isSetAxleSpacing() {
        return true;
    }

    /**
     * Obtient la valeur de la propriété axleSpacingSequenceIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAxleSpacingSequenceIdentifier() {
        return axleSpacingSequenceIdentifier;
    }

    /**
     * Définit la valeur de la propriété axleSpacingSequenceIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAxleSpacingSequenceIdentifier(BigInteger value) {
        this.axleSpacingSequenceIdentifier = value;
    }

    public boolean isSetAxleSpacingSequenceIdentifier() {
        return (this.axleSpacingSequenceIdentifier!= null);
    }

    /**
     * Obtient la valeur de la propriété axleSpacingExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAxleSpacingExtension() {
        return axleSpacingExtension;
    }

    /**
     * Définit la valeur de la propriété axleSpacingExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAxleSpacingExtension(ExtensionType value) {
        this.axleSpacingExtension = value;
    }

    public boolean isSetAxleSpacingExtension() {
        return (this.axleSpacingExtension!= null);
    }

}
