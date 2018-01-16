
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SpeedPercentile complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SpeedPercentile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vehiclePercentage" type="{http://datex2.eu/schema/2_0RC1/2_0}Percentage"/>
 *         &lt;element name="speedPercentile" type="{http://datex2.eu/schema/2_0RC1/2_0}KilometresPerHour"/>
 *         &lt;element name="speedPercentileExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpeedPercentile", propOrder = {
    "vehiclePercentage",
    "speedPercentile",
    "speedPercentileExtension"
})
public class SpeedPercentile
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected float vehiclePercentage;
    protected float speedPercentile;
    protected ExtensionType speedPercentileExtension;

    /**
     * Obtient la valeur de la propriété vehiclePercentage.
     * 
     */
    public float getVehiclePercentage() {
        return vehiclePercentage;
    }

    /**
     * Définit la valeur de la propriété vehiclePercentage.
     * 
     */
    public void setVehiclePercentage(float value) {
        this.vehiclePercentage = value;
    }

    public boolean isSetVehiclePercentage() {
        return true;
    }

    /**
     * Obtient la valeur de la propriété speedPercentile.
     * 
     */
    public float getSpeedPercentile() {
        return speedPercentile;
    }

    /**
     * Définit la valeur de la propriété speedPercentile.
     * 
     */
    public void setSpeedPercentile(float value) {
        this.speedPercentile = value;
    }

    public boolean isSetSpeedPercentile() {
        return true;
    }

    /**
     * Obtient la valeur de la propriété speedPercentileExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSpeedPercentileExtension() {
        return speedPercentileExtension;
    }

    /**
     * Définit la valeur de la propriété speedPercentileExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSpeedPercentileExtension(ExtensionType value) {
        this.speedPercentileExtension = value;
    }

    public boolean isSetSpeedPercentileExtension() {
        return (this.speedPercentileExtension!= null);
    }

}
