
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour IndividualVehicleMeasurements complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="IndividualVehicleMeasurements">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TrafficValue">
 *       &lt;sequence>
 *         &lt;element name="vehicleSpeed" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleSpeed" minOccurs="0"/>
 *         &lt;element name="vehicleDetectionTime" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleDetectionTime" minOccurs="0"/>
 *         &lt;element name="vehicleHeadway" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleHeadway" minOccurs="0"/>
 *         &lt;element name="individualVehicleMeasurementsExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualVehicleMeasurements", propOrder = {
    "vehicleSpeed",
    "vehicleDetectionTime",
    "vehicleHeadway",
    "individualVehicleMeasurementsExtension"
})
public class IndividualVehicleMeasurements
    extends TrafficValue
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected VehicleSpeed vehicleSpeed;
    protected VehicleDetectionTime vehicleDetectionTime;
    protected VehicleHeadway vehicleHeadway;
    protected ExtensionType individualVehicleMeasurementsExtension;

    /**
     * Obtient la valeur de la propriété vehicleSpeed.
     * 
     * @return
     *     possible object is
     *     {@link VehicleSpeed }
     *     
     */
    public VehicleSpeed getVehicleSpeed() {
        return vehicleSpeed;
    }

    /**
     * Définit la valeur de la propriété vehicleSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleSpeed }
     *     
     */
    public void setVehicleSpeed(VehicleSpeed value) {
        this.vehicleSpeed = value;
    }

    public boolean isSetVehicleSpeed() {
        return (this.vehicleSpeed!= null);
    }

    /**
     * Obtient la valeur de la propriété vehicleDetectionTime.
     * 
     * @return
     *     possible object is
     *     {@link VehicleDetectionTime }
     *     
     */
    public VehicleDetectionTime getVehicleDetectionTime() {
        return vehicleDetectionTime;
    }

    /**
     * Définit la valeur de la propriété vehicleDetectionTime.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleDetectionTime }
     *     
     */
    public void setVehicleDetectionTime(VehicleDetectionTime value) {
        this.vehicleDetectionTime = value;
    }

    public boolean isSetVehicleDetectionTime() {
        return (this.vehicleDetectionTime!= null);
    }

    /**
     * Obtient la valeur de la propriété vehicleHeadway.
     * 
     * @return
     *     possible object is
     *     {@link VehicleHeadway }
     *     
     */
    public VehicleHeadway getVehicleHeadway() {
        return vehicleHeadway;
    }

    /**
     * Définit la valeur de la propriété vehicleHeadway.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleHeadway }
     *     
     */
    public void setVehicleHeadway(VehicleHeadway value) {
        this.vehicleHeadway = value;
    }

    public boolean isSetVehicleHeadway() {
        return (this.vehicleHeadway!= null);
    }

    /**
     * Obtient la valeur de la propriété individualVehicleMeasurementsExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getIndividualVehicleMeasurementsExtension() {
        return individualVehicleMeasurementsExtension;
    }

    /**
     * Définit la valeur de la propriété individualVehicleMeasurementsExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setIndividualVehicleMeasurementsExtension(ExtensionType value) {
        this.individualVehicleMeasurementsExtension = value;
    }

    public boolean isSetIndividualVehicleMeasurementsExtension() {
        return (this.individualVehicleMeasurementsExtension!= null);
    }

}
