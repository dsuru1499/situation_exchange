
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Vehicle complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Vehicle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vehicleColour" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="vehicleCountryOfOrigin" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="vehicleIdentifier" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/>
 *         &lt;element name="vehicleManufacturer" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/>
 *         &lt;element name="vehicleModel" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/>
 *         &lt;element name="vehicleRegistrationPlateIdentifier" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/>
 *         &lt;element name="vehicleStatus" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleStatusEnum" minOccurs="0"/>
 *         &lt;element name="vehicleCharacteristics" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleCharacteristics" minOccurs="0"/>
 *         &lt;element name="axleSpacingOnVehicle" type="{http://datex2.eu/schema/2_0RC1/2_0}AxleSpacing" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="specificAxleWeight" type="{http://datex2.eu/schema/2_0RC1/2_0}AxleWeight" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hazardousGoodsAssociatedWithVehicle" type="{http://datex2.eu/schema/2_0RC1/2_0}HazardousMaterials" minOccurs="0"/>
 *         &lt;element name="vehicleExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vehicle", propOrder = {
    "vehicleColour",
    "vehicleCountryOfOrigin",
    "vehicleIdentifier",
    "vehicleManufacturer",
    "vehicleModel",
    "vehicleRegistrationPlateIdentifier",
    "vehicleStatus",
    "vehicleCharacteristics",
    "axleSpacingOnVehicle",
    "specificAxleWeight",
    "hazardousGoodsAssociatedWithVehicle",
    "vehicleExtension"
})
public class Vehicle
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected MultilingualString vehicleColour;
    protected MultilingualString vehicleCountryOfOrigin;
    protected String vehicleIdentifier;
    protected String vehicleManufacturer;
    protected String vehicleModel;
    protected String vehicleRegistrationPlateIdentifier;
    protected VehicleStatusEnum vehicleStatus;
    protected VehicleCharacteristics vehicleCharacteristics;
    protected List<AxleSpacing> axleSpacingOnVehicle;
    protected List<AxleWeight> specificAxleWeight;
    protected HazardousMaterials hazardousGoodsAssociatedWithVehicle;
    protected ExtensionType vehicleExtension;

    /**
     * Obtient la valeur de la propriété vehicleColour.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getVehicleColour() {
        return vehicleColour;
    }

    /**
     * Définit la valeur de la propriété vehicleColour.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setVehicleColour(MultilingualString value) {
        this.vehicleColour = value;
    }

    public boolean isSetVehicleColour() {
        return (this.vehicleColour!= null);
    }

    /**
     * Obtient la valeur de la propriété vehicleCountryOfOrigin.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getVehicleCountryOfOrigin() {
        return vehicleCountryOfOrigin;
    }

    /**
     * Définit la valeur de la propriété vehicleCountryOfOrigin.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setVehicleCountryOfOrigin(MultilingualString value) {
        this.vehicleCountryOfOrigin = value;
    }

    public boolean isSetVehicleCountryOfOrigin() {
        return (this.vehicleCountryOfOrigin!= null);
    }

    /**
     * Obtient la valeur de la propriété vehicleIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleIdentifier() {
        return vehicleIdentifier;
    }

    /**
     * Définit la valeur de la propriété vehicleIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleIdentifier(String value) {
        this.vehicleIdentifier = value;
    }

    public boolean isSetVehicleIdentifier() {
        return (this.vehicleIdentifier!= null);
    }

    /**
     * Obtient la valeur de la propriété vehicleManufacturer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleManufacturer() {
        return vehicleManufacturer;
    }

    /**
     * Définit la valeur de la propriété vehicleManufacturer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleManufacturer(String value) {
        this.vehicleManufacturer = value;
    }

    public boolean isSetVehicleManufacturer() {
        return (this.vehicleManufacturer!= null);
    }

    /**
     * Obtient la valeur de la propriété vehicleModel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleModel() {
        return vehicleModel;
    }

    /**
     * Définit la valeur de la propriété vehicleModel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleModel(String value) {
        this.vehicleModel = value;
    }

    public boolean isSetVehicleModel() {
        return (this.vehicleModel!= null);
    }

    /**
     * Obtient la valeur de la propriété vehicleRegistrationPlateIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleRegistrationPlateIdentifier() {
        return vehicleRegistrationPlateIdentifier;
    }

    /**
     * Définit la valeur de la propriété vehicleRegistrationPlateIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleRegistrationPlateIdentifier(String value) {
        this.vehicleRegistrationPlateIdentifier = value;
    }

    public boolean isSetVehicleRegistrationPlateIdentifier() {
        return (this.vehicleRegistrationPlateIdentifier!= null);
    }

    /**
     * Obtient la valeur de la propriété vehicleStatus.
     * 
     * @return
     *     possible object is
     *     {@link VehicleStatusEnum }
     *     
     */
    public VehicleStatusEnum getVehicleStatus() {
        return vehicleStatus;
    }

    /**
     * Définit la valeur de la propriété vehicleStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleStatusEnum }
     *     
     */
    public void setVehicleStatus(VehicleStatusEnum value) {
        this.vehicleStatus = value;
    }

    public boolean isSetVehicleStatus() {
        return (this.vehicleStatus!= null);
    }

    /**
     * Obtient la valeur de la propriété vehicleCharacteristics.
     * 
     * @return
     *     possible object is
     *     {@link VehicleCharacteristics }
     *     
     */
    public VehicleCharacteristics getVehicleCharacteristics() {
        return vehicleCharacteristics;
    }

    /**
     * Définit la valeur de la propriété vehicleCharacteristics.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleCharacteristics }
     *     
     */
    public void setVehicleCharacteristics(VehicleCharacteristics value) {
        this.vehicleCharacteristics = value;
    }

    public boolean isSetVehicleCharacteristics() {
        return (this.vehicleCharacteristics!= null);
    }

    /**
     * Gets the value of the axleSpacingOnVehicle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the axleSpacingOnVehicle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAxleSpacingOnVehicle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AxleSpacing }
     * 
     * 
     */
    public List<AxleSpacing> getAxleSpacingOnVehicle() {
        if (axleSpacingOnVehicle == null) {
            axleSpacingOnVehicle = new ArrayList<AxleSpacing>();
        }
        return this.axleSpacingOnVehicle;
    }

    public boolean isSetAxleSpacingOnVehicle() {
        return ((this.axleSpacingOnVehicle!= null)&&(!this.axleSpacingOnVehicle.isEmpty()));
    }

    public void unsetAxleSpacingOnVehicle() {
        this.axleSpacingOnVehicle = null;
    }

    /**
     * Gets the value of the specificAxleWeight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specificAxleWeight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecificAxleWeight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AxleWeight }
     * 
     * 
     */
    public List<AxleWeight> getSpecificAxleWeight() {
        if (specificAxleWeight == null) {
            specificAxleWeight = new ArrayList<AxleWeight>();
        }
        return this.specificAxleWeight;
    }

    public boolean isSetSpecificAxleWeight() {
        return ((this.specificAxleWeight!= null)&&(!this.specificAxleWeight.isEmpty()));
    }

    public void unsetSpecificAxleWeight() {
        this.specificAxleWeight = null;
    }

    /**
     * Obtient la valeur de la propriété hazardousGoodsAssociatedWithVehicle.
     * 
     * @return
     *     possible object is
     *     {@link HazardousMaterials }
     *     
     */
    public HazardousMaterials getHazardousGoodsAssociatedWithVehicle() {
        return hazardousGoodsAssociatedWithVehicle;
    }

    /**
     * Définit la valeur de la propriété hazardousGoodsAssociatedWithVehicle.
     * 
     * @param value
     *     allowed object is
     *     {@link HazardousMaterials }
     *     
     */
    public void setHazardousGoodsAssociatedWithVehicle(HazardousMaterials value) {
        this.hazardousGoodsAssociatedWithVehicle = value;
    }

    public boolean isSetHazardousGoodsAssociatedWithVehicle() {
        return (this.hazardousGoodsAssociatedWithVehicle!= null);
    }

    /**
     * Obtient la valeur de la propriété vehicleExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVehicleExtension() {
        return vehicleExtension;
    }

    /**
     * Définit la valeur de la propriété vehicleExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVehicleExtension(ExtensionType value) {
        this.vehicleExtension = value;
    }

    public boolean isSetVehicleExtension() {
        return (this.vehicleExtension!= null);
    }

}
