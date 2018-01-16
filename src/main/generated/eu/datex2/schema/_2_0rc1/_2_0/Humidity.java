
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Humidity complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Humidity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="relativeHumidity" type="{http://datex2.eu/schema/2_0RC1/2_0}Percentage"/>
 *         &lt;element name="humidityExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Humidity", propOrder = {
    "relativeHumidity",
    "humidityExtension"
})
public class Humidity
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected float relativeHumidity;
    protected ExtensionType humidityExtension;

    /**
     * Obtient la valeur de la propriété relativeHumidity.
     * 
     */
    public float getRelativeHumidity() {
        return relativeHumidity;
    }

    /**
     * Définit la valeur de la propriété relativeHumidity.
     * 
     */
    public void setRelativeHumidity(float value) {
        this.relativeHumidity = value;
    }

    public boolean isSetRelativeHumidity() {
        return true;
    }

    /**
     * Obtient la valeur de la propriété humidityExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getHumidityExtension() {
        return humidityExtension;
    }

    /**
     * Définit la valeur de la propriété humidityExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setHumidityExtension(ExtensionType value) {
        this.humidityExtension = value;
    }

    public boolean isSetHumidityExtension() {
        return (this.humidityExtension!= null);
    }

}
