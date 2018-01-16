
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour MeasurementSpecificCharacteristics complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MeasurementSpecificCharacteristics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accuracy" type="{http://datex2.eu/schema/2_0RC1/2_0}Percentage" minOccurs="0"/>
 *         &lt;element name="period" type="{http://datex2.eu/schema/2_0RC1/2_0}Seconds" minOccurs="0"/>
 *         &lt;element name="smoothingFactor" type="{http://datex2.eu/schema/2_0RC1/2_0}Float" minOccurs="0"/>
 *         &lt;element name="specificLane" type="{http://datex2.eu/schema/2_0RC1/2_0}LaneEnum" minOccurs="0"/>
 *         &lt;element name="specificMeasurementValueType" type="{http://datex2.eu/schema/2_0RC1/2_0}MeasuredOrDerivedDataTypeEnum"/>
 *         &lt;element name="specificVehicleCharacteristics" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleCharacteristics" minOccurs="0"/>
 *         &lt;element name="measurementSpecificCharacteristicsExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementSpecificCharacteristics", propOrder = {
    "accuracy",
    "period",
    "smoothingFactor",
    "specificLane",
    "specificMeasurementValueType",
    "specificVehicleCharacteristics",
    "measurementSpecificCharacteristicsExtension"
})
@XmlSeeAlso({
    eu.datex2.schema._2_0rc1._2_0.MeasurementSiteRecord.MeasurementSpecificCharacteristics.class
})
public class MeasurementSpecificCharacteristics
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Float accuracy;
    protected Float period;
    protected Float smoothingFactor;
    protected LaneEnum specificLane;
    @XmlElement(required = true)
    protected MeasuredOrDerivedDataTypeEnum specificMeasurementValueType;
    protected VehicleCharacteristics specificVehicleCharacteristics;
    protected ExtensionType measurementSpecificCharacteristicsExtension;

    /**
     * Obtient la valeur de la propriété accuracy.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAccuracy() {
        return accuracy;
    }

    /**
     * Définit la valeur de la propriété accuracy.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAccuracy(Float value) {
        this.accuracy = value;
    }

    public boolean isSetAccuracy() {
        return (this.accuracy!= null);
    }

    /**
     * Obtient la valeur de la propriété period.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPeriod() {
        return period;
    }

    /**
     * Définit la valeur de la propriété period.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPeriod(Float value) {
        this.period = value;
    }

    public boolean isSetPeriod() {
        return (this.period!= null);
    }

    /**
     * Obtient la valeur de la propriété smoothingFactor.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSmoothingFactor() {
        return smoothingFactor;
    }

    /**
     * Définit la valeur de la propriété smoothingFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSmoothingFactor(Float value) {
        this.smoothingFactor = value;
    }

    public boolean isSetSmoothingFactor() {
        return (this.smoothingFactor!= null);
    }

    /**
     * Obtient la valeur de la propriété specificLane.
     * 
     * @return
     *     possible object is
     *     {@link LaneEnum }
     *     
     */
    public LaneEnum getSpecificLane() {
        return specificLane;
    }

    /**
     * Définit la valeur de la propriété specificLane.
     * 
     * @param value
     *     allowed object is
     *     {@link LaneEnum }
     *     
     */
    public void setSpecificLane(LaneEnum value) {
        this.specificLane = value;
    }

    public boolean isSetSpecificLane() {
        return (this.specificLane!= null);
    }

    /**
     * Obtient la valeur de la propriété specificMeasurementValueType.
     * 
     * @return
     *     possible object is
     *     {@link MeasuredOrDerivedDataTypeEnum }
     *     
     */
    public MeasuredOrDerivedDataTypeEnum getSpecificMeasurementValueType() {
        return specificMeasurementValueType;
    }

    /**
     * Définit la valeur de la propriété specificMeasurementValueType.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasuredOrDerivedDataTypeEnum }
     *     
     */
    public void setSpecificMeasurementValueType(MeasuredOrDerivedDataTypeEnum value) {
        this.specificMeasurementValueType = value;
    }

    public boolean isSetSpecificMeasurementValueType() {
        return (this.specificMeasurementValueType!= null);
    }

    /**
     * Obtient la valeur de la propriété specificVehicleCharacteristics.
     * 
     * @return
     *     possible object is
     *     {@link VehicleCharacteristics }
     *     
     */
    public VehicleCharacteristics getSpecificVehicleCharacteristics() {
        return specificVehicleCharacteristics;
    }

    /**
     * Définit la valeur de la propriété specificVehicleCharacteristics.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleCharacteristics }
     *     
     */
    public void setSpecificVehicleCharacteristics(VehicleCharacteristics value) {
        this.specificVehicleCharacteristics = value;
    }

    public boolean isSetSpecificVehicleCharacteristics() {
        return (this.specificVehicleCharacteristics!= null);
    }

    /**
     * Obtient la valeur de la propriété measurementSpecificCharacteristicsExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMeasurementSpecificCharacteristicsExtension() {
        return measurementSpecificCharacteristicsExtension;
    }

    /**
     * Définit la valeur de la propriété measurementSpecificCharacteristicsExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMeasurementSpecificCharacteristicsExtension(ExtensionType value) {
        this.measurementSpecificCharacteristicsExtension = value;
    }

    public boolean isSetMeasurementSpecificCharacteristicsExtension() {
        return (this.measurementSpecificCharacteristicsExtension!= null);
    }

}
