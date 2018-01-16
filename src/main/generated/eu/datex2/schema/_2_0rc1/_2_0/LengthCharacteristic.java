
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour LengthCharacteristic complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LengthCharacteristic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comparisonOperator" type="{http://datex2.eu/schema/2_0RC1/2_0}ComparisonOperatorEnum"/>
 *         &lt;element name="vehicleLength" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat"/>
 *         &lt;element name="lengthCharacteristicExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LengthCharacteristic", propOrder = {
    "comparisonOperator",
    "vehicleLength",
    "lengthCharacteristicExtension"
})
public class LengthCharacteristic
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected ComparisonOperatorEnum comparisonOperator;
    protected float vehicleLength;
    protected ExtensionType lengthCharacteristicExtension;

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
     * Obtient la valeur de la propriété vehicleLength.
     * 
     */
    public float getVehicleLength() {
        return vehicleLength;
    }

    /**
     * Définit la valeur de la propriété vehicleLength.
     * 
     */
    public void setVehicleLength(float value) {
        this.vehicleLength = value;
    }

    public boolean isSetVehicleLength() {
        return true;
    }

    /**
     * Obtient la valeur de la propriété lengthCharacteristicExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLengthCharacteristicExtension() {
        return lengthCharacteristicExtension;
    }

    /**
     * Définit la valeur de la propriété lengthCharacteristicExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLengthCharacteristicExtension(ExtensionType value) {
        this.lengthCharacteristicExtension = value;
    }

    public boolean isSetLengthCharacteristicExtension() {
        return (this.lengthCharacteristicExtension!= null);
    }

}
