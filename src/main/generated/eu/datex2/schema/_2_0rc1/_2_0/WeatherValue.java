
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour WeatherValue complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WeatherValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}BasicDataValue">
 *       &lt;sequence>
 *         &lt;element name="weatherValueExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherValue", propOrder = {
    "weatherValueExtension"
})
@XmlSeeAlso({
    WindInformation.class,
    HumidityInformation.class,
    VisibilityInformation.class,
    PrecipitationInformation.class,
    TemperatureInformation.class,
    RoadSurfaceConditionInformation.class,
    PollutionInformation.class
})
public abstract class WeatherValue
    extends BasicDataValue
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected ExtensionType weatherValueExtension;

    /**
     * Obtient la valeur de la propriété weatherValueExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getWeatherValueExtension() {
        return weatherValueExtension;
    }

    /**
     * Définit la valeur de la propriété weatherValueExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setWeatherValueExtension(ExtensionType value) {
        this.weatherValueExtension = value;
    }

    public boolean isSetWeatherValueExtension() {
        return (this.weatherValueExtension!= null);
    }

}
