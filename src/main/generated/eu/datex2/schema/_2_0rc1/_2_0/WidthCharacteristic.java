
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour WidthCharacteristic complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WidthCharacteristic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comparisonOperator" type="{http://datex2.eu/schema/2_0RC1/2_0}ComparisonOperatorEnum"/>
 *         &lt;element name="vehicleWidth" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat"/>
 *         &lt;element name="widthCharacteristicExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WidthCharacteristic", propOrder = {
    "comparisonOperator",
    "vehicleWidth",
    "widthCharacteristicExtension"
})
public class WidthCharacteristic
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected ComparisonOperatorEnum comparisonOperator;
    protected float vehicleWidth;
    protected ExtensionType widthCharacteristicExtension;

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
     * Obtient la valeur de la propriété vehicleWidth.
     * 
     */
    public float getVehicleWidth() {
        return vehicleWidth;
    }

    /**
     * Définit la valeur de la propriété vehicleWidth.
     * 
     */
    public void setVehicleWidth(float value) {
        this.vehicleWidth = value;
    }

    public boolean isSetVehicleWidth() {
        return true;
    }

    /**
     * Obtient la valeur de la propriété widthCharacteristicExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getWidthCharacteristicExtension() {
        return widthCharacteristicExtension;
    }

    /**
     * Définit la valeur de la propriété widthCharacteristicExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setWidthCharacteristicExtension(ExtensionType value) {
        this.widthCharacteristicExtension = value;
    }

    public boolean isSetWidthCharacteristicExtension() {
        return (this.widthCharacteristicExtension!= null);
    }

}
