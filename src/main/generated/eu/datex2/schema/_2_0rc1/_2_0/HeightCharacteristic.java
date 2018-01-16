
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour HeightCharacteristic complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="HeightCharacteristic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comparisonOperator" type="{http://datex2.eu/schema/2_0RC1/2_0}ComparisonOperatorEnum"/>
 *         &lt;element name="vehicleHeight" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat"/>
 *         &lt;element name="heightCharacteristicExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeightCharacteristic", propOrder = {
    "comparisonOperator",
    "vehicleHeight",
    "heightCharacteristicExtension"
})
public class HeightCharacteristic
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected ComparisonOperatorEnum comparisonOperator;
    protected float vehicleHeight;
    protected ExtensionType heightCharacteristicExtension;

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
     * Obtient la valeur de la propriété vehicleHeight.
     * 
     */
    public float getVehicleHeight() {
        return vehicleHeight;
    }

    /**
     * Définit la valeur de la propriété vehicleHeight.
     * 
     */
    public void setVehicleHeight(float value) {
        this.vehicleHeight = value;
    }

    public boolean isSetVehicleHeight() {
        return true;
    }

    /**
     * Obtient la valeur de la propriété heightCharacteristicExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getHeightCharacteristicExtension() {
        return heightCharacteristicExtension;
    }

    /**
     * Définit la valeur de la propriété heightCharacteristicExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setHeightCharacteristicExtension(ExtensionType value) {
        this.heightCharacteristicExtension = value;
    }

    public boolean isSetHeightCharacteristicExtension() {
        return (this.heightCharacteristicExtension!= null);
    }

}
