
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TravelTimeValue complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TravelTimeValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}BasicDataValue">
 *       &lt;sequence>
 *         &lt;element name="travelTime" type="{http://datex2.eu/schema/2_0RC1/2_0}Seconds" minOccurs="0"/>
 *         &lt;element name="travelTimeTrendType" type="{http://datex2.eu/schema/2_0RC1/2_0}TravelTimeTrendTypeEnum" minOccurs="0"/>
 *         &lt;element name="travelTimeType" type="{http://datex2.eu/schema/2_0RC1/2_0}TravelTimeTypeEnum" minOccurs="0"/>
 *         &lt;element name="freeFlowSpeed" type="{http://datex2.eu/schema/2_0RC1/2_0}KilometresPerHour" minOccurs="0"/>
 *         &lt;element name="freeFlowTravelTime" type="{http://datex2.eu/schema/2_0RC1/2_0}Seconds" minOccurs="0"/>
 *         &lt;element name="normallyExpectedTravelTime" type="{http://datex2.eu/schema/2_0RC1/2_0}Seconds" minOccurs="0"/>
 *         &lt;element name="vehicleType" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleTypeEnum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="travelTimeValueExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelTimeValue", propOrder = {
    "travelTime",
    "travelTimeTrendType",
    "travelTimeType",
    "freeFlowSpeed",
    "freeFlowTravelTime",
    "normallyExpectedTravelTime",
    "vehicleType",
    "travelTimeValueExtension"
})
public class TravelTimeValue
    extends BasicDataValue
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Float travelTime;
    protected TravelTimeTrendTypeEnum travelTimeTrendType;
    protected TravelTimeTypeEnum travelTimeType;
    protected Float freeFlowSpeed;
    protected Float freeFlowTravelTime;
    protected Float normallyExpectedTravelTime;
    protected List<VehicleTypeEnum> vehicleType;
    protected ExtensionType travelTimeValueExtension;

    /**
     * Obtient la valeur de la propriété travelTime.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTravelTime() {
        return travelTime;
    }

    /**
     * Définit la valeur de la propriété travelTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTravelTime(Float value) {
        this.travelTime = value;
    }

    public boolean isSetTravelTime() {
        return (this.travelTime!= null);
    }

    /**
     * Obtient la valeur de la propriété travelTimeTrendType.
     * 
     * @return
     *     possible object is
     *     {@link TravelTimeTrendTypeEnum }
     *     
     */
    public TravelTimeTrendTypeEnum getTravelTimeTrendType() {
        return travelTimeTrendType;
    }

    /**
     * Définit la valeur de la propriété travelTimeTrendType.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelTimeTrendTypeEnum }
     *     
     */
    public void setTravelTimeTrendType(TravelTimeTrendTypeEnum value) {
        this.travelTimeTrendType = value;
    }

    public boolean isSetTravelTimeTrendType() {
        return (this.travelTimeTrendType!= null);
    }

    /**
     * Obtient la valeur de la propriété travelTimeType.
     * 
     * @return
     *     possible object is
     *     {@link TravelTimeTypeEnum }
     *     
     */
    public TravelTimeTypeEnum getTravelTimeType() {
        return travelTimeType;
    }

    /**
     * Définit la valeur de la propriété travelTimeType.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelTimeTypeEnum }
     *     
     */
    public void setTravelTimeType(TravelTimeTypeEnum value) {
        this.travelTimeType = value;
    }

    public boolean isSetTravelTimeType() {
        return (this.travelTimeType!= null);
    }

    /**
     * Obtient la valeur de la propriété freeFlowSpeed.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFreeFlowSpeed() {
        return freeFlowSpeed;
    }

    /**
     * Définit la valeur de la propriété freeFlowSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFreeFlowSpeed(Float value) {
        this.freeFlowSpeed = value;
    }

    public boolean isSetFreeFlowSpeed() {
        return (this.freeFlowSpeed!= null);
    }

    /**
     * Obtient la valeur de la propriété freeFlowTravelTime.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFreeFlowTravelTime() {
        return freeFlowTravelTime;
    }

    /**
     * Définit la valeur de la propriété freeFlowTravelTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFreeFlowTravelTime(Float value) {
        this.freeFlowTravelTime = value;
    }

    public boolean isSetFreeFlowTravelTime() {
        return (this.freeFlowTravelTime!= null);
    }

    /**
     * Obtient la valeur de la propriété normallyExpectedTravelTime.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNormallyExpectedTravelTime() {
        return normallyExpectedTravelTime;
    }

    /**
     * Définit la valeur de la propriété normallyExpectedTravelTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNormallyExpectedTravelTime(Float value) {
        this.normallyExpectedTravelTime = value;
    }

    public boolean isSetNormallyExpectedTravelTime() {
        return (this.normallyExpectedTravelTime!= null);
    }

    /**
     * Gets the value of the vehicleType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleTypeEnum }
     * 
     * 
     */
    public List<VehicleTypeEnum> getVehicleType() {
        if (vehicleType == null) {
            vehicleType = new ArrayList<VehicleTypeEnum>();
        }
        return this.vehicleType;
    }

    public boolean isSetVehicleType() {
        return ((this.vehicleType!= null)&&(!this.vehicleType.isEmpty()));
    }

    public void unsetVehicleType() {
        this.vehicleType = null;
    }

    /**
     * Obtient la valeur de la propriété travelTimeValueExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTravelTimeValueExtension() {
        return travelTimeValueExtension;
    }

    /**
     * Définit la valeur de la propriété travelTimeValueExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTravelTimeValueExtension(ExtensionType value) {
        this.travelTimeValueExtension = value;
    }

    public boolean isSetTravelTimeValueExtension() {
        return (this.travelTimeValueExtension!= null);
    }

}
