
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Wind complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Wind">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maximumWindSpeed" type="{http://datex2.eu/schema/2_0RC1/2_0}KilometresPerHour" minOccurs="0"/>
 *         &lt;element name="windDirectionBearing" type="{http://datex2.eu/schema/2_0RC1/2_0}AngleInDegrees" minOccurs="0"/>
 *         &lt;element name="windDirectionCompass" type="{http://datex2.eu/schema/2_0RC1/2_0}DirectionCompassEnum" minOccurs="0"/>
 *         &lt;element name="windMeasurementHeight" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsNonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="windSpeed" type="{http://datex2.eu/schema/2_0RC1/2_0}KilometresPerHour" minOccurs="0"/>
 *         &lt;element name="windExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Wind", propOrder = {
    "maximumWindSpeed",
    "windDirectionBearing",
    "windDirectionCompass",
    "windMeasurementHeight",
    "windSpeed",
    "windExtension"
})
public class Wind
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Float maximumWindSpeed;
    protected BigInteger windDirectionBearing;
    protected DirectionCompassEnum windDirectionCompass;
    protected BigInteger windMeasurementHeight;
    protected Float windSpeed;
    protected ExtensionType windExtension;

    /**
     * Obtient la valeur de la propriété maximumWindSpeed.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaximumWindSpeed() {
        return maximumWindSpeed;
    }

    /**
     * Définit la valeur de la propriété maximumWindSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaximumWindSpeed(Float value) {
        this.maximumWindSpeed = value;
    }

    public boolean isSetMaximumWindSpeed() {
        return (this.maximumWindSpeed!= null);
    }

    /**
     * Obtient la valeur de la propriété windDirectionBearing.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWindDirectionBearing() {
        return windDirectionBearing;
    }

    /**
     * Définit la valeur de la propriété windDirectionBearing.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWindDirectionBearing(BigInteger value) {
        this.windDirectionBearing = value;
    }

    public boolean isSetWindDirectionBearing() {
        return (this.windDirectionBearing!= null);
    }

    /**
     * Obtient la valeur de la propriété windDirectionCompass.
     * 
     * @return
     *     possible object is
     *     {@link DirectionCompassEnum }
     *     
     */
    public DirectionCompassEnum getWindDirectionCompass() {
        return windDirectionCompass;
    }

    /**
     * Définit la valeur de la propriété windDirectionCompass.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionCompassEnum }
     *     
     */
    public void setWindDirectionCompass(DirectionCompassEnum value) {
        this.windDirectionCompass = value;
    }

    public boolean isSetWindDirectionCompass() {
        return (this.windDirectionCompass!= null);
    }

    /**
     * Obtient la valeur de la propriété windMeasurementHeight.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWindMeasurementHeight() {
        return windMeasurementHeight;
    }

    /**
     * Définit la valeur de la propriété windMeasurementHeight.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWindMeasurementHeight(BigInteger value) {
        this.windMeasurementHeight = value;
    }

    public boolean isSetWindMeasurementHeight() {
        return (this.windMeasurementHeight!= null);
    }

    /**
     * Obtient la valeur de la propriété windSpeed.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWindSpeed() {
        return windSpeed;
    }

    /**
     * Définit la valeur de la propriété windSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWindSpeed(Float value) {
        this.windSpeed = value;
    }

    public boolean isSetWindSpeed() {
        return (this.windSpeed!= null);
    }

    /**
     * Obtient la valeur de la propriété windExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getWindExtension() {
        return windExtension;
    }

    /**
     * Définit la valeur de la propriété windExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setWindExtension(ExtensionType value) {
        this.windExtension = value;
    }

    public boolean isSetWindExtension() {
        return (this.windExtension!= null);
    }

}
