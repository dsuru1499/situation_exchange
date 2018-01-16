
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour VehicleCharacteristics complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleCharacteristics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fuelType" type="{http://datex2.eu/schema/2_0RC1/2_0}FuelTypeEnum" minOccurs="0"/>
 *         &lt;element name="loadType" type="{http://datex2.eu/schema/2_0RC1/2_0}LoadTypeEnum" minOccurs="0"/>
 *         &lt;element name="vehicleEquipment" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleEquipmentEnum" minOccurs="0"/>
 *         &lt;element name="vehicleType" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleTypeEnum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vehicleUsage" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleUsageEnum" minOccurs="0"/>
 *         &lt;element name="grossWeightCharacteristic" type="{http://datex2.eu/schema/2_0RC1/2_0}GrossWeightCharacteristic" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="heightCharacteristic" type="{http://datex2.eu/schema/2_0RC1/2_0}HeightCharacteristic" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="lengthCharacteristic" type="{http://datex2.eu/schema/2_0RC1/2_0}LengthCharacteristic" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="widthCharacteristic" type="{http://datex2.eu/schema/2_0RC1/2_0}WidthCharacteristic" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="heaviestAxleWeightCharacteristic" type="{http://datex2.eu/schema/2_0RC1/2_0}HeaviestAxleWeightCharacteristic" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="numberOfAxlesCharacteristic" type="{http://datex2.eu/schema/2_0RC1/2_0}NumberOfAxlesCharacteristic" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="vehicleCharacteristicsExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleCharacteristics", propOrder = {
    "fuelType",
    "loadType",
    "vehicleEquipment",
    "vehicleType",
    "vehicleUsage",
    "grossWeightCharacteristic",
    "heightCharacteristic",
    "lengthCharacteristic",
    "widthCharacteristic",
    "heaviestAxleWeightCharacteristic",
    "numberOfAxlesCharacteristic",
    "vehicleCharacteristicsExtension"
})
public class VehicleCharacteristics
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected FuelTypeEnum fuelType;
    protected LoadTypeEnum loadType;
    protected VehicleEquipmentEnum vehicleEquipment;
    protected List<VehicleTypeEnum> vehicleType;
    protected VehicleUsageEnum vehicleUsage;
    protected List<GrossWeightCharacteristic> grossWeightCharacteristic;
    protected List<HeightCharacteristic> heightCharacteristic;
    protected List<LengthCharacteristic> lengthCharacteristic;
    protected List<WidthCharacteristic> widthCharacteristic;
    protected List<HeaviestAxleWeightCharacteristic> heaviestAxleWeightCharacteristic;
    protected List<NumberOfAxlesCharacteristic> numberOfAxlesCharacteristic;
    protected ExtensionType vehicleCharacteristicsExtension;

    /**
     * Obtient la valeur de la propriété fuelType.
     * 
     * @return
     *     possible object is
     *     {@link FuelTypeEnum }
     *     
     */
    public FuelTypeEnum getFuelType() {
        return fuelType;
    }

    /**
     * Définit la valeur de la propriété fuelType.
     * 
     * @param value
     *     allowed object is
     *     {@link FuelTypeEnum }
     *     
     */
    public void setFuelType(FuelTypeEnum value) {
        this.fuelType = value;
    }

    public boolean isSetFuelType() {
        return (this.fuelType!= null);
    }

    /**
     * Obtient la valeur de la propriété loadType.
     * 
     * @return
     *     possible object is
     *     {@link LoadTypeEnum }
     *     
     */
    public LoadTypeEnum getLoadType() {
        return loadType;
    }

    /**
     * Définit la valeur de la propriété loadType.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadTypeEnum }
     *     
     */
    public void setLoadType(LoadTypeEnum value) {
        this.loadType = value;
    }

    public boolean isSetLoadType() {
        return (this.loadType!= null);
    }

    /**
     * Obtient la valeur de la propriété vehicleEquipment.
     * 
     * @return
     *     possible object is
     *     {@link VehicleEquipmentEnum }
     *     
     */
    public VehicleEquipmentEnum getVehicleEquipment() {
        return vehicleEquipment;
    }

    /**
     * Définit la valeur de la propriété vehicleEquipment.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleEquipmentEnum }
     *     
     */
    public void setVehicleEquipment(VehicleEquipmentEnum value) {
        this.vehicleEquipment = value;
    }

    public boolean isSetVehicleEquipment() {
        return (this.vehicleEquipment!= null);
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
     * Obtient la valeur de la propriété vehicleUsage.
     * 
     * @return
     *     possible object is
     *     {@link VehicleUsageEnum }
     *     
     */
    public VehicleUsageEnum getVehicleUsage() {
        return vehicleUsage;
    }

    /**
     * Définit la valeur de la propriété vehicleUsage.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleUsageEnum }
     *     
     */
    public void setVehicleUsage(VehicleUsageEnum value) {
        this.vehicleUsage = value;
    }

    public boolean isSetVehicleUsage() {
        return (this.vehicleUsage!= null);
    }

    /**
     * Gets the value of the grossWeightCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grossWeightCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrossWeightCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GrossWeightCharacteristic }
     * 
     * 
     */
    public List<GrossWeightCharacteristic> getGrossWeightCharacteristic() {
        if (grossWeightCharacteristic == null) {
            grossWeightCharacteristic = new ArrayList<GrossWeightCharacteristic>();
        }
        return this.grossWeightCharacteristic;
    }

    public boolean isSetGrossWeightCharacteristic() {
        return ((this.grossWeightCharacteristic!= null)&&(!this.grossWeightCharacteristic.isEmpty()));
    }

    public void unsetGrossWeightCharacteristic() {
        this.grossWeightCharacteristic = null;
    }

    /**
     * Gets the value of the heightCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the heightCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeightCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HeightCharacteristic }
     * 
     * 
     */
    public List<HeightCharacteristic> getHeightCharacteristic() {
        if (heightCharacteristic == null) {
            heightCharacteristic = new ArrayList<HeightCharacteristic>();
        }
        return this.heightCharacteristic;
    }

    public boolean isSetHeightCharacteristic() {
        return ((this.heightCharacteristic!= null)&&(!this.heightCharacteristic.isEmpty()));
    }

    public void unsetHeightCharacteristic() {
        this.heightCharacteristic = null;
    }

    /**
     * Gets the value of the lengthCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lengthCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLengthCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LengthCharacteristic }
     * 
     * 
     */
    public List<LengthCharacteristic> getLengthCharacteristic() {
        if (lengthCharacteristic == null) {
            lengthCharacteristic = new ArrayList<LengthCharacteristic>();
        }
        return this.lengthCharacteristic;
    }

    public boolean isSetLengthCharacteristic() {
        return ((this.lengthCharacteristic!= null)&&(!this.lengthCharacteristic.isEmpty()));
    }

    public void unsetLengthCharacteristic() {
        this.lengthCharacteristic = null;
    }

    /**
     * Gets the value of the widthCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the widthCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWidthCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WidthCharacteristic }
     * 
     * 
     */
    public List<WidthCharacteristic> getWidthCharacteristic() {
        if (widthCharacteristic == null) {
            widthCharacteristic = new ArrayList<WidthCharacteristic>();
        }
        return this.widthCharacteristic;
    }

    public boolean isSetWidthCharacteristic() {
        return ((this.widthCharacteristic!= null)&&(!this.widthCharacteristic.isEmpty()));
    }

    public void unsetWidthCharacteristic() {
        this.widthCharacteristic = null;
    }

    /**
     * Gets the value of the heaviestAxleWeightCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the heaviestAxleWeightCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeaviestAxleWeightCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HeaviestAxleWeightCharacteristic }
     * 
     * 
     */
    public List<HeaviestAxleWeightCharacteristic> getHeaviestAxleWeightCharacteristic() {
        if (heaviestAxleWeightCharacteristic == null) {
            heaviestAxleWeightCharacteristic = new ArrayList<HeaviestAxleWeightCharacteristic>();
        }
        return this.heaviestAxleWeightCharacteristic;
    }

    public boolean isSetHeaviestAxleWeightCharacteristic() {
        return ((this.heaviestAxleWeightCharacteristic!= null)&&(!this.heaviestAxleWeightCharacteristic.isEmpty()));
    }

    public void unsetHeaviestAxleWeightCharacteristic() {
        this.heaviestAxleWeightCharacteristic = null;
    }

    /**
     * Gets the value of the numberOfAxlesCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numberOfAxlesCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumberOfAxlesCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberOfAxlesCharacteristic }
     * 
     * 
     */
    public List<NumberOfAxlesCharacteristic> getNumberOfAxlesCharacteristic() {
        if (numberOfAxlesCharacteristic == null) {
            numberOfAxlesCharacteristic = new ArrayList<NumberOfAxlesCharacteristic>();
        }
        return this.numberOfAxlesCharacteristic;
    }

    public boolean isSetNumberOfAxlesCharacteristic() {
        return ((this.numberOfAxlesCharacteristic!= null)&&(!this.numberOfAxlesCharacteristic.isEmpty()));
    }

    public void unsetNumberOfAxlesCharacteristic() {
        this.numberOfAxlesCharacteristic = null;
    }

    /**
     * Obtient la valeur de la propriété vehicleCharacteristicsExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVehicleCharacteristicsExtension() {
        return vehicleCharacteristicsExtension;
    }

    /**
     * Définit la valeur de la propriété vehicleCharacteristicsExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVehicleCharacteristicsExtension(ExtensionType value) {
        this.vehicleCharacteristicsExtension = value;
    }

    public boolean isSetVehicleCharacteristicsExtension() {
        return (this.vehicleCharacteristicsExtension!= null);
    }

}
