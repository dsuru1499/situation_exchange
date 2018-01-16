
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TemperatureInformation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TemperatureInformation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}WeatherValue">
 *       &lt;sequence>
 *         &lt;element name="temperature" type="{http://datex2.eu/schema/2_0RC1/2_0}Temperature"/>
 *         &lt;element name="temperatureInformationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemperatureInformation", propOrder = {
    "temperature",
    "temperatureInformationExtension"
})
public class TemperatureInformation
    extends WeatherValue
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected Temperature temperature;
    protected ExtensionType temperatureInformationExtension;

    /**
     * Obtient la valeur de la propriété temperature.
     * 
     * @return
     *     possible object is
     *     {@link Temperature }
     *     
     */
    public Temperature getTemperature() {
        return temperature;
    }

    /**
     * Définit la valeur de la propriété temperature.
     * 
     * @param value
     *     allowed object is
     *     {@link Temperature }
     *     
     */
    public void setTemperature(Temperature value) {
        this.temperature = value;
    }

    public boolean isSetTemperature() {
        return (this.temperature!= null);
    }

    /**
     * Obtient la valeur de la propriété temperatureInformationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTemperatureInformationExtension() {
        return temperatureInformationExtension;
    }

    /**
     * Définit la valeur de la propriété temperatureInformationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTemperatureInformationExtension(ExtensionType value) {
        this.temperatureInformationExtension = value;
    }

    public boolean isSetTemperatureInformationExtension() {
        return (this.temperatureInformationExtension!= null);
    }

}
