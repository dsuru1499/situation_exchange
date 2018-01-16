
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour GrossWeightCharacteristic complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GrossWeightCharacteristic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comparisonOperator" type="{http://datex2.eu/schema/2_0RC1/2_0}ComparisonOperatorEnum"/>
 *         &lt;element name="grossVehicleWeight" type="{http://datex2.eu/schema/2_0RC1/2_0}Tonnes"/>
 *         &lt;element name="grossWeightCharacteristicExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrossWeightCharacteristic", propOrder = {
    "comparisonOperator",
    "grossVehicleWeight",
    "grossWeightCharacteristicExtension"
})
public class GrossWeightCharacteristic
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected ComparisonOperatorEnum comparisonOperator;
    protected float grossVehicleWeight;
    protected ExtensionType grossWeightCharacteristicExtension;

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
     * Obtient la valeur de la propriété grossVehicleWeight.
     * 
     */
    public float getGrossVehicleWeight() {
        return grossVehicleWeight;
    }

    /**
     * Définit la valeur de la propriété grossVehicleWeight.
     * 
     */
    public void setGrossVehicleWeight(float value) {
        this.grossVehicleWeight = value;
    }

    public boolean isSetGrossVehicleWeight() {
        return true;
    }

    /**
     * Obtient la valeur de la propriété grossWeightCharacteristicExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGrossWeightCharacteristicExtension() {
        return grossWeightCharacteristicExtension;
    }

    /**
     * Définit la valeur de la propriété grossWeightCharacteristicExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGrossWeightCharacteristicExtension(ExtensionType value) {
        this.grossWeightCharacteristicExtension = value;
    }

    public boolean isSetGrossWeightCharacteristicExtension() {
        return (this.grossWeightCharacteristicExtension!= null);
    }

}
