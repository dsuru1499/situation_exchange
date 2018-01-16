
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour NetworkManagement complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="NetworkManagement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}OperatorAction">
 *       &lt;sequence>
 *         &lt;element name="complianceOption" type="{http://datex2.eu/schema/2_0RC1/2_0}ComplianceOptionEnum"/>
 *         &lt;element name="applicableForTrafficDirection" type="{http://datex2.eu/schema/2_0RC1/2_0}DirectionEnum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="applicableForTrafficType" type="{http://datex2.eu/schema/2_0RC1/2_0}TrafficTypeEnum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="placesAtWhichApplicable" type="{http://datex2.eu/schema/2_0RC1/2_0}PlacesEnum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="automaticallyInitiated" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/>
 *         &lt;element name="forVehiclesWithCharacteristicsOf" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleCharacteristics" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="networkManagementExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkManagement", propOrder = {
    "complianceOption",
    "applicableForTrafficDirection",
    "applicableForTrafficType",
    "placesAtWhichApplicable",
    "automaticallyInitiated",
    "forVehiclesWithCharacteristicsOf",
    "networkManagementExtension"
})
@XmlSeeAlso({
    ReroutingManagement.class,
    GeneralNetworkManagement.class,
    SpeedManagement.class,
    GeneralInstructionToRoadUsers.class,
    WinterDrivingManagement.class,
    RoadOrCarriagewayOrLaneManagement.class
})
public abstract class NetworkManagement
    extends OperatorAction
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected ComplianceOptionEnum complianceOption;
    protected List<DirectionEnum> applicableForTrafficDirection;
    protected List<TrafficTypeEnum> applicableForTrafficType;
    protected List<PlacesEnum> placesAtWhichApplicable;
    protected Boolean automaticallyInitiated;
    protected List<VehicleCharacteristics> forVehiclesWithCharacteristicsOf;
    protected ExtensionType networkManagementExtension;

    /**
     * Obtient la valeur de la propriété complianceOption.
     * 
     * @return
     *     possible object is
     *     {@link ComplianceOptionEnum }
     *     
     */
    public ComplianceOptionEnum getComplianceOption() {
        return complianceOption;
    }

    /**
     * Définit la valeur de la propriété complianceOption.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplianceOptionEnum }
     *     
     */
    public void setComplianceOption(ComplianceOptionEnum value) {
        this.complianceOption = value;
    }

    public boolean isSetComplianceOption() {
        return (this.complianceOption!= null);
    }

    /**
     * Gets the value of the applicableForTrafficDirection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableForTrafficDirection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableForTrafficDirection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectionEnum }
     * 
     * 
     */
    public List<DirectionEnum> getApplicableForTrafficDirection() {
        if (applicableForTrafficDirection == null) {
            applicableForTrafficDirection = new ArrayList<DirectionEnum>();
        }
        return this.applicableForTrafficDirection;
    }

    public boolean isSetApplicableForTrafficDirection() {
        return ((this.applicableForTrafficDirection!= null)&&(!this.applicableForTrafficDirection.isEmpty()));
    }

    public void unsetApplicableForTrafficDirection() {
        this.applicableForTrafficDirection = null;
    }

    /**
     * Gets the value of the applicableForTrafficType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableForTrafficType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableForTrafficType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrafficTypeEnum }
     * 
     * 
     */
    public List<TrafficTypeEnum> getApplicableForTrafficType() {
        if (applicableForTrafficType == null) {
            applicableForTrafficType = new ArrayList<TrafficTypeEnum>();
        }
        return this.applicableForTrafficType;
    }

    public boolean isSetApplicableForTrafficType() {
        return ((this.applicableForTrafficType!= null)&&(!this.applicableForTrafficType.isEmpty()));
    }

    public void unsetApplicableForTrafficType() {
        this.applicableForTrafficType = null;
    }

    /**
     * Gets the value of the placesAtWhichApplicable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the placesAtWhichApplicable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlacesAtWhichApplicable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlacesEnum }
     * 
     * 
     */
    public List<PlacesEnum> getPlacesAtWhichApplicable() {
        if (placesAtWhichApplicable == null) {
            placesAtWhichApplicable = new ArrayList<PlacesEnum>();
        }
        return this.placesAtWhichApplicable;
    }

    public boolean isSetPlacesAtWhichApplicable() {
        return ((this.placesAtWhichApplicable!= null)&&(!this.placesAtWhichApplicable.isEmpty()));
    }

    public void unsetPlacesAtWhichApplicable() {
        this.placesAtWhichApplicable = null;
    }

    /**
     * Obtient la valeur de la propriété automaticallyInitiated.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutomaticallyInitiated() {
        return automaticallyInitiated;
    }

    /**
     * Définit la valeur de la propriété automaticallyInitiated.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomaticallyInitiated(Boolean value) {
        this.automaticallyInitiated = value;
    }

    public boolean isSetAutomaticallyInitiated() {
        return (this.automaticallyInitiated!= null);
    }

    /**
     * Gets the value of the forVehiclesWithCharacteristicsOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forVehiclesWithCharacteristicsOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForVehiclesWithCharacteristicsOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleCharacteristics }
     * 
     * 
     */
    public List<VehicleCharacteristics> getForVehiclesWithCharacteristicsOf() {
        if (forVehiclesWithCharacteristicsOf == null) {
            forVehiclesWithCharacteristicsOf = new ArrayList<VehicleCharacteristics>();
        }
        return this.forVehiclesWithCharacteristicsOf;
    }

    public boolean isSetForVehiclesWithCharacteristicsOf() {
        return ((this.forVehiclesWithCharacteristicsOf!= null)&&(!this.forVehiclesWithCharacteristicsOf.isEmpty()));
    }

    public void unsetForVehiclesWithCharacteristicsOf() {
        this.forVehiclesWithCharacteristicsOf = null;
    }

    /**
     * Obtient la valeur de la propriété networkManagementExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getNetworkManagementExtension() {
        return networkManagementExtension;
    }

    /**
     * Définit la valeur de la propriété networkManagementExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setNetworkManagementExtension(ExtensionType value) {
        this.networkManagementExtension = value;
    }

    public boolean isSetNetworkManagementExtension() {
        return (this.networkManagementExtension!= null);
    }

}
