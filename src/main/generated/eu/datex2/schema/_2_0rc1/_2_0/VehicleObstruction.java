
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour VehicleObstruction complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleObstruction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Obstruction">
 *       &lt;sequence>
 *         &lt;element name="vehicleObstructionType" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleObstructionTypeEnum"/>
 *         &lt;element name="obstructingVehicle" type="{http://datex2.eu/schema/2_0RC1/2_0}Vehicle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vehicleObstructionExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleObstruction", propOrder = {
    "vehicleObstructionType",
    "obstructingVehicle",
    "vehicleObstructionExtension"
})
public class VehicleObstruction
    extends Obstruction
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected VehicleObstructionTypeEnum vehicleObstructionType;
    protected List<Vehicle> obstructingVehicle;
    protected ExtensionType vehicleObstructionExtension;

    /**
     * Obtient la valeur de la propriété vehicleObstructionType.
     * 
     * @return
     *     possible object is
     *     {@link VehicleObstructionTypeEnum }
     *     
     */
    public VehicleObstructionTypeEnum getVehicleObstructionType() {
        return vehicleObstructionType;
    }

    /**
     * Définit la valeur de la propriété vehicleObstructionType.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleObstructionTypeEnum }
     *     
     */
    public void setVehicleObstructionType(VehicleObstructionTypeEnum value) {
        this.vehicleObstructionType = value;
    }

    public boolean isSetVehicleObstructionType() {
        return (this.vehicleObstructionType!= null);
    }

    /**
     * Gets the value of the obstructingVehicle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the obstructingVehicle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObstructingVehicle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vehicle }
     * 
     * 
     */
    public List<Vehicle> getObstructingVehicle() {
        if (obstructingVehicle == null) {
            obstructingVehicle = new ArrayList<Vehicle>();
        }
        return this.obstructingVehicle;
    }

    public boolean isSetObstructingVehicle() {
        return ((this.obstructingVehicle!= null)&&(!this.obstructingVehicle.isEmpty()));
    }

    public void unsetObstructingVehicle() {
        this.obstructingVehicle = null;
    }

    /**
     * Obtient la valeur de la propriété vehicleObstructionExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVehicleObstructionExtension() {
        return vehicleObstructionExtension;
    }

    /**
     * Définit la valeur de la propriété vehicleObstructionExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVehicleObstructionExtension(ExtensionType value) {
        this.vehicleObstructionExtension = value;
    }

    public boolean isSetVehicleObstructionExtension() {
        return (this.vehicleObstructionExtension!= null);
    }

}
