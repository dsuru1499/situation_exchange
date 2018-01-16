
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EnvironmentalObstruction complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EnvironmentalObstruction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Obstruction">
 *       &lt;sequence>
 *         &lt;element name="depth" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/>
 *         &lt;element name="environmentalObstructionType" type="{http://datex2.eu/schema/2_0RC1/2_0}EnvironmentalObstructionTypeEnum"/>
 *         &lt;element name="environmentalObstructionExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvironmentalObstruction", propOrder = {
    "depth",
    "environmentalObstructionType",
    "environmentalObstructionExtension"
})
public class EnvironmentalObstruction
    extends Obstruction
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Float depth;
    @XmlElement(required = true)
    protected EnvironmentalObstructionTypeEnum environmentalObstructionType;
    protected ExtensionType environmentalObstructionExtension;

    /**
     * Obtient la valeur de la propriété depth.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDepth() {
        return depth;
    }

    /**
     * Définit la valeur de la propriété depth.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDepth(Float value) {
        this.depth = value;
    }

    public boolean isSetDepth() {
        return (this.depth!= null);
    }

    /**
     * Obtient la valeur de la propriété environmentalObstructionType.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentalObstructionTypeEnum }
     *     
     */
    public EnvironmentalObstructionTypeEnum getEnvironmentalObstructionType() {
        return environmentalObstructionType;
    }

    /**
     * Définit la valeur de la propriété environmentalObstructionType.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentalObstructionTypeEnum }
     *     
     */
    public void setEnvironmentalObstructionType(EnvironmentalObstructionTypeEnum value) {
        this.environmentalObstructionType = value;
    }

    public boolean isSetEnvironmentalObstructionType() {
        return (this.environmentalObstructionType!= null);
    }

    /**
     * Obtient la valeur de la propriété environmentalObstructionExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getEnvironmentalObstructionExtension() {
        return environmentalObstructionExtension;
    }

    /**
     * Définit la valeur de la propriété environmentalObstructionExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setEnvironmentalObstructionExtension(ExtensionType value) {
        this.environmentalObstructionExtension = value;
    }

    public boolean isSetEnvironmentalObstructionExtension() {
        return (this.environmentalObstructionExtension!= null);
    }

}
