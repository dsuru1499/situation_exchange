
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TrafficSpeed complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TrafficSpeed">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TrafficValue">
 *       &lt;sequence>
 *         &lt;element name="averageVehicleSpeed" type="{http://datex2.eu/schema/2_0RC1/2_0}KilometresPerHour" minOccurs="0"/>
 *         &lt;element name="speedPercentile" type="{http://datex2.eu/schema/2_0RC1/2_0}SpeedPercentile" minOccurs="0"/>
 *         &lt;element name="trafficSpeedExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficSpeed", propOrder = {
    "averageVehicleSpeed",
    "speedPercentile",
    "trafficSpeedExtension"
})
public class TrafficSpeed
    extends TrafficValue
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Float averageVehicleSpeed;
    protected SpeedPercentile speedPercentile;
    protected ExtensionType trafficSpeedExtension;

    /**
     * Obtient la valeur de la propriété averageVehicleSpeed.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAverageVehicleSpeed() {
        return averageVehicleSpeed;
    }

    /**
     * Définit la valeur de la propriété averageVehicleSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAverageVehicleSpeed(Float value) {
        this.averageVehicleSpeed = value;
    }

    public boolean isSetAverageVehicleSpeed() {
        return (this.averageVehicleSpeed!= null);
    }

    /**
     * Obtient la valeur de la propriété speedPercentile.
     * 
     * @return
     *     possible object is
     *     {@link SpeedPercentile }
     *     
     */
    public SpeedPercentile getSpeedPercentile() {
        return speedPercentile;
    }

    /**
     * Définit la valeur de la propriété speedPercentile.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedPercentile }
     *     
     */
    public void setSpeedPercentile(SpeedPercentile value) {
        this.speedPercentile = value;
    }

    public boolean isSetSpeedPercentile() {
        return (this.speedPercentile!= null);
    }

    /**
     * Obtient la valeur de la propriété trafficSpeedExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficSpeedExtension() {
        return trafficSpeedExtension;
    }

    /**
     * Définit la valeur de la propriété trafficSpeedExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficSpeedExtension(ExtensionType value) {
        this.trafficSpeedExtension = value;
    }

    public boolean isSetTrafficSpeedExtension() {
        return (this.trafficSpeedExtension!= null);
    }

}
