
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TrafficValue complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TrafficValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}BasicDataValue">
 *       &lt;sequence>
 *         &lt;element name="forVehiclesWithCharacteristicsOf" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleCharacteristics" minOccurs="0"/>
 *         &lt;element name="trafficValueExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficValue", propOrder = {
    "forVehiclesWithCharacteristicsOf",
    "trafficValueExtension"
})
@XmlSeeAlso({
    TrafficHeadway.class,
    IndividualVehicleMeasurements.class,
    TrafficFlow.class,
    TrafficConcentration.class,
    TrafficSpeed.class
})
public abstract class TrafficValue
    extends BasicDataValue
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected VehicleCharacteristics forVehiclesWithCharacteristicsOf;
    protected ExtensionType trafficValueExtension;

    /**
     * Obtient la valeur de la propriété forVehiclesWithCharacteristicsOf.
     * 
     * @return
     *     possible object is
     *     {@link VehicleCharacteristics }
     *     
     */
    public VehicleCharacteristics getForVehiclesWithCharacteristicsOf() {
        return forVehiclesWithCharacteristicsOf;
    }

    /**
     * Définit la valeur de la propriété forVehiclesWithCharacteristicsOf.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleCharacteristics }
     *     
     */
    public void setForVehiclesWithCharacteristicsOf(VehicleCharacteristics value) {
        this.forVehiclesWithCharacteristicsOf = value;
    }

    public boolean isSetForVehiclesWithCharacteristicsOf() {
        return (this.forVehiclesWithCharacteristicsOf!= null);
    }

    /**
     * Obtient la valeur de la propriété trafficValueExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficValueExtension() {
        return trafficValueExtension;
    }

    /**
     * Définit la valeur de la propriété trafficValueExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficValueExtension(ExtensionType value) {
        this.trafficValueExtension = value;
    }

    public boolean isSetTrafficValueExtension() {
        return (this.trafficValueExtension!= null);
    }

}
