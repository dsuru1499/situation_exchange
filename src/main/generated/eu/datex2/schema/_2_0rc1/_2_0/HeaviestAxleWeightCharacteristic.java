
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour HeaviestAxleWeightCharacteristic complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="HeaviestAxleWeightCharacteristic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comparisonOperator" type="{http://datex2.eu/schema/2_0RC1/2_0}ComparisonOperatorEnum"/>
 *         &lt;element name="heaviestAxleWeight" type="{http://datex2.eu/schema/2_0RC1/2_0}Tonnes"/>
 *         &lt;element name="heaviestAxleWeightCharacteristicExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaviestAxleWeightCharacteristic", propOrder = {
    "comparisonOperator",
    "heaviestAxleWeight",
    "heaviestAxleWeightCharacteristicExtension"
})
public class HeaviestAxleWeightCharacteristic
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected ComparisonOperatorEnum comparisonOperator;
    protected float heaviestAxleWeight;
    protected ExtensionType heaviestAxleWeightCharacteristicExtension;

    /**
     * Obtient la valeur de la propriété comparisonOperator.
     * 
     * @return
     *     possible object is
     *     {@link ComparisonOperatorEnum }
     *     
     */
    public ComparisonOperatorEnum getComparisonOperator() {
        return comparisonOperator;
    }

    /**
     * Définit la valeur de la propriété comparisonOperator.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparisonOperatorEnum }
     *     
     */
    public void setComparisonOperator(ComparisonOperatorEnum value) {
        this.comparisonOperator = value;
    }

    public boolean isSetComparisonOperator() {
        return (this.comparisonOperator!= null);
    }

    /**
     * Obtient la valeur de la propriété heaviestAxleWeight.
     * 
     */
    public float getHeaviestAxleWeight() {
        return heaviestAxleWeight;
    }

    /**
     * Définit la valeur de la propriété heaviestAxleWeight.
     * 
     */
    public void setHeaviestAxleWeight(float value) {
        this.heaviestAxleWeight = value;
    }

    public boolean isSetHeaviestAxleWeight() {
        return true;
    }

    /**
     * Obtient la valeur de la propriété heaviestAxleWeightCharacteristicExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getHeaviestAxleWeightCharacteristicExtension() {
        return heaviestAxleWeightCharacteristicExtension;
    }

    /**
     * Définit la valeur de la propriété heaviestAxleWeightCharacteristicExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setHeaviestAxleWeightCharacteristicExtension(ExtensionType value) {
        this.heaviestAxleWeightCharacteristicExtension = value;
    }

    public boolean isSetHeaviestAxleWeightCharacteristicExtension() {
        return (this.heaviestAxleWeightCharacteristicExtension!= null);
    }

}
