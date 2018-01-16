
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour VehicleSpeed complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleSpeed">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="individualVehicleSpeed" type="{http://datex2.eu/schema/2_0RC1/2_0}KilometresPerHour"/>
 *         &lt;element name="vehicleSpeedExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleSpeed", propOrder = {
    "individualVehicleSpeed",
    "vehicleSpeedExtension"
})
public class VehicleSpeed
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected float individualVehicleSpeed;
    protected ExtensionType vehicleSpeedExtension;

    /**
     * Obtient la valeur de la propriété individualVehicleSpeed.
     * 
     */
    public float getIndividualVehicleSpeed() {
        return individualVehicleSpeed;
    }

    /**
     * Définit la valeur de la propriété individualVehicleSpeed.
     * 
     */
    public void setIndividualVehicleSpeed(float value) {
        this.individualVehicleSpeed = value;
    }

    public boolean isSetIndividualVehicleSpeed() {
        return true;
    }

    /**
     * Obtient la valeur de la propriété vehicleSpeedExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVehicleSpeedExtension() {
        return vehicleSpeedExtension;
    }

    /**
     * Définit la valeur de la propriété vehicleSpeedExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVehicleSpeedExtension(ExtensionType value) {
        this.vehicleSpeedExtension = value;
    }

    public boolean isSetVehicleSpeedExtension() {
        return (this.vehicleSpeedExtension!= null);
    }

}
