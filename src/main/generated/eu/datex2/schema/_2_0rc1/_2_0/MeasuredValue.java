
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour MeasuredValue complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MeasuredValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="measurementEquipmentTypeUsed" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="locationCharacteristicsOverride" type="{http://datex2.eu/schema/2_0RC1/2_0}LocationCharacteristicsOverride" minOccurs="0"/>
 *         &lt;element name="basicDataValue" type="{http://datex2.eu/schema/2_0RC1/2_0}BasicDataValue"/>
 *         &lt;element name="measuredValueExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasuredValue", propOrder = {
    "measurementEquipmentTypeUsed",
    "locationCharacteristicsOverride",
    "basicDataValue",
    "measuredValueExtension"
})
@XmlSeeAlso({
    eu.datex2.schema._2_0rc1._2_0.SiteMeasurements.MeasuredValue.class
})
public class MeasuredValue
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected MultilingualString measurementEquipmentTypeUsed;
    protected LocationCharacteristicsOverride locationCharacteristicsOverride;
    @XmlElement(required = true)
    protected BasicDataValue basicDataValue;
    protected ExtensionType measuredValueExtension;

    /**
     * Obtient la valeur de la propriété measurementEquipmentTypeUsed.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getMeasurementEquipmentTypeUsed() {
        return measurementEquipmentTypeUsed;
    }

    /**
     * Définit la valeur de la propriété measurementEquipmentTypeUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setMeasurementEquipmentTypeUsed(MultilingualString value) {
        this.measurementEquipmentTypeUsed = value;
    }

    public boolean isSetMeasurementEquipmentTypeUsed() {
        return (this.measurementEquipmentTypeUsed!= null);
    }

    /**
     * Obtient la valeur de la propriété locationCharacteristicsOverride.
     * 
     * @return
     *     possible object is
     *     {@link LocationCharacteristicsOverride }
     *     
     */
    public LocationCharacteristicsOverride getLocationCharacteristicsOverride() {
        return locationCharacteristicsOverride;
    }

    /**
     * Définit la valeur de la propriété locationCharacteristicsOverride.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationCharacteristicsOverride }
     *     
     */
    public void setLocationCharacteristicsOverride(LocationCharacteristicsOverride value) {
        this.locationCharacteristicsOverride = value;
    }

    public boolean isSetLocationCharacteristicsOverride() {
        return (this.locationCharacteristicsOverride!= null);
    }

    /**
     * Obtient la valeur de la propriété basicDataValue.
     * 
     * @return
     *     possible object is
     *     {@link BasicDataValue }
     *     
     */
    public BasicDataValue getBasicDataValue() {
        return basicDataValue;
    }

    /**
     * Définit la valeur de la propriété basicDataValue.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicDataValue }
     *     
     */
    public void setBasicDataValue(BasicDataValue value) {
        this.basicDataValue = value;
    }

    public boolean isSetBasicDataValue() {
        return (this.basicDataValue!= null);
    }

    /**
     * Obtient la valeur de la propriété measuredValueExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMeasuredValueExtension() {
        return measuredValueExtension;
    }

    /**
     * Définit la valeur de la propriété measuredValueExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMeasuredValueExtension(ExtensionType value) {
        this.measuredValueExtension = value;
    }

    public boolean isSetMeasuredValueExtension() {
        return (this.measuredValueExtension!= null);
    }

}
