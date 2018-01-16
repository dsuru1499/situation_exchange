
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RoadSurfaceConditionMeasurements complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RoadSurfaceConditionMeasurements">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deIcingApplicationRate" type="{http://datex2.eu/schema/2_0RC1/2_0}IntensityKilogrammesPerSquareMetre" minOccurs="0"/>
 *         &lt;element name="deIcingConcentration" type="{http://datex2.eu/schema/2_0RC1/2_0}ConcentrationGramsPerCubicCentimetre" minOccurs="0"/>
 *         &lt;element name="depthOfSnow" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/>
 *         &lt;element name="protectionTemperature" type="{http://datex2.eu/schema/2_0RC1/2_0}TemperatureCelsius" minOccurs="0"/>
 *         &lt;element name="roadSurfaceTemperature" type="{http://datex2.eu/schema/2_0RC1/2_0}TemperatureCelsius" minOccurs="0"/>
 *         &lt;element name="waterFilmThickness" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/>
 *         &lt;element name="roadSurfaceConditionMeasurementsExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadSurfaceConditionMeasurements", propOrder = {
    "deIcingApplicationRate",
    "deIcingConcentration",
    "depthOfSnow",
    "protectionTemperature",
    "roadSurfaceTemperature",
    "waterFilmThickness",
    "roadSurfaceConditionMeasurementsExtension"
})
public class RoadSurfaceConditionMeasurements
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Float deIcingApplicationRate;
    protected Float deIcingConcentration;
    protected Float depthOfSnow;
    protected Float protectionTemperature;
    protected Float roadSurfaceTemperature;
    protected Float waterFilmThickness;
    protected ExtensionType roadSurfaceConditionMeasurementsExtension;

    /**
     * Obtient la valeur de la propriété deIcingApplicationRate.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDeIcingApplicationRate() {
        return deIcingApplicationRate;
    }

    /**
     * Définit la valeur de la propriété deIcingApplicationRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDeIcingApplicationRate(Float value) {
        this.deIcingApplicationRate = value;
    }

    public boolean isSetDeIcingApplicationRate() {
        return (this.deIcingApplicationRate!= null);
    }

    /**
     * Obtient la valeur de la propriété deIcingConcentration.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDeIcingConcentration() {
        return deIcingConcentration;
    }

    /**
     * Définit la valeur de la propriété deIcingConcentration.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDeIcingConcentration(Float value) {
        this.deIcingConcentration = value;
    }

    public boolean isSetDeIcingConcentration() {
        return (this.deIcingConcentration!= null);
    }

    /**
     * Obtient la valeur de la propriété depthOfSnow.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDepthOfSnow() {
        return depthOfSnow;
    }

    /**
     * Définit la valeur de la propriété depthOfSnow.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDepthOfSnow(Float value) {
        this.depthOfSnow = value;
    }

    public boolean isSetDepthOfSnow() {
        return (this.depthOfSnow!= null);
    }

    /**
     * Obtient la valeur de la propriété protectionTemperature.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getProtectionTemperature() {
        return protectionTemperature;
    }

    /**
     * Définit la valeur de la propriété protectionTemperature.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setProtectionTemperature(Float value) {
        this.protectionTemperature = value;
    }

    public boolean isSetProtectionTemperature() {
        return (this.protectionTemperature!= null);
    }

    /**
     * Obtient la valeur de la propriété roadSurfaceTemperature.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRoadSurfaceTemperature() {
        return roadSurfaceTemperature;
    }

    /**
     * Définit la valeur de la propriété roadSurfaceTemperature.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRoadSurfaceTemperature(Float value) {
        this.roadSurfaceTemperature = value;
    }

    public boolean isSetRoadSurfaceTemperature() {
        return (this.roadSurfaceTemperature!= null);
    }

    /**
     * Obtient la valeur de la propriété waterFilmThickness.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWaterFilmThickness() {
        return waterFilmThickness;
    }

    /**
     * Définit la valeur de la propriété waterFilmThickness.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWaterFilmThickness(Float value) {
        this.waterFilmThickness = value;
    }

    public boolean isSetWaterFilmThickness() {
        return (this.waterFilmThickness!= null);
    }

    /**
     * Obtient la valeur de la propriété roadSurfaceConditionMeasurementsExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRoadSurfaceConditionMeasurementsExtension() {
        return roadSurfaceConditionMeasurementsExtension;
    }

    /**
     * Définit la valeur de la propriété roadSurfaceConditionMeasurementsExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRoadSurfaceConditionMeasurementsExtension(ExtensionType value) {
        this.roadSurfaceConditionMeasurementsExtension = value;
    }

    public boolean isSetRoadSurfaceConditionMeasurementsExtension() {
        return (this.roadSurfaceConditionMeasurementsExtension!= null);
    }

}
