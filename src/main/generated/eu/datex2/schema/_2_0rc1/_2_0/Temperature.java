
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Temperature complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Temperature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="airTemperature" type="{http://datex2.eu/schema/2_0RC1/2_0}TemperatureCelsius" minOccurs="0"/>
 *         &lt;element name="dewPointTemperature" type="{http://datex2.eu/schema/2_0RC1/2_0}TemperatureCelsius" minOccurs="0"/>
 *         &lt;element name="maximumTemperature" type="{http://datex2.eu/schema/2_0RC1/2_0}TemperatureCelsius" minOccurs="0"/>
 *         &lt;element name="minimumTemperature" type="{http://datex2.eu/schema/2_0RC1/2_0}TemperatureCelsius" minOccurs="0"/>
 *         &lt;element name="temperatureExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Temperature", propOrder = {
    "airTemperature",
    "dewPointTemperature",
    "maximumTemperature",
    "minimumTemperature",
    "temperatureExtension"
})
public class Temperature
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Float airTemperature;
    protected Float dewPointTemperature;
    protected Float maximumTemperature;
    protected Float minimumTemperature;
    protected ExtensionType temperatureExtension;

    /**
     * Obtient la valeur de la propriété airTemperature.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAirTemperature() {
        return airTemperature;
    }

    /**
     * Définit la valeur de la propriété airTemperature.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAirTemperature(Float value) {
        this.airTemperature = value;
    }

    public boolean isSetAirTemperature() {
        return (this.airTemperature!= null);
    }

    /**
     * Obtient la valeur de la propriété dewPointTemperature.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDewPointTemperature() {
        return dewPointTemperature;
    }

    /**
     * Définit la valeur de la propriété dewPointTemperature.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDewPointTemperature(Float value) {
        this.dewPointTemperature = value;
    }

    public boolean isSetDewPointTemperature() {
        return (this.dewPointTemperature!= null);
    }

    /**
     * Obtient la valeur de la propriété maximumTemperature.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaximumTemperature() {
        return maximumTemperature;
    }

    /**
     * Définit la valeur de la propriété maximumTemperature.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaximumTemperature(Float value) {
        this.maximumTemperature = value;
    }

    public boolean isSetMaximumTemperature() {
        return (this.maximumTemperature!= null);
    }

    /**
     * Obtient la valeur de la propriété minimumTemperature.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinimumTemperature() {
        return minimumTemperature;
    }

    /**
     * Définit la valeur de la propriété minimumTemperature.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinimumTemperature(Float value) {
        this.minimumTemperature = value;
    }

    public boolean isSetMinimumTemperature() {
        return (this.minimumTemperature!= null);
    }

    /**
     * Obtient la valeur de la propriété temperatureExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTemperatureExtension() {
        return temperatureExtension;
    }

    /**
     * Définit la valeur de la propriété temperatureExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTemperatureExtension(ExtensionType value) {
        this.temperatureExtension = value;
    }

    public boolean isSetTemperatureExtension() {
        return (this.temperatureExtension!= null);
    }

}
