
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour MaintenanceVehicles complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MaintenanceVehicles">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberOfMaintenanceVehicles" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="maintenanceVehicleActions" type="{http://datex2.eu/schema/2_0RC1/2_0}MaintenanceVehicleActionsEnum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="maintenanceVehiclesExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceVehicles", propOrder = {
    "numberOfMaintenanceVehicles",
    "maintenanceVehicleActions",
    "maintenanceVehiclesExtension"
})
public class MaintenanceVehicles
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected BigInteger numberOfMaintenanceVehicles;
    protected List<MaintenanceVehicleActionsEnum> maintenanceVehicleActions;
    protected ExtensionType maintenanceVehiclesExtension;

    /**
     * Obtient la valeur de la propriété numberOfMaintenanceVehicles.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfMaintenanceVehicles() {
        return numberOfMaintenanceVehicles;
    }

    /**
     * Définit la valeur de la propriété numberOfMaintenanceVehicles.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfMaintenanceVehicles(BigInteger value) {
        this.numberOfMaintenanceVehicles = value;
    }

    public boolean isSetNumberOfMaintenanceVehicles() {
        return (this.numberOfMaintenanceVehicles!= null);
    }

    /**
     * Gets the value of the maintenanceVehicleActions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maintenanceVehicleActions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaintenanceVehicleActions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaintenanceVehicleActionsEnum }
     * 
     * 
     */
    public List<MaintenanceVehicleActionsEnum> getMaintenanceVehicleActions() {
        if (maintenanceVehicleActions == null) {
            maintenanceVehicleActions = new ArrayList<MaintenanceVehicleActionsEnum>();
        }
        return this.maintenanceVehicleActions;
    }

    public boolean isSetMaintenanceVehicleActions() {
        return ((this.maintenanceVehicleActions!= null)&&(!this.maintenanceVehicleActions.isEmpty()));
    }

    public void unsetMaintenanceVehicleActions() {
        this.maintenanceVehicleActions = null;
    }

    /**
     * Obtient la valeur de la propriété maintenanceVehiclesExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMaintenanceVehiclesExtension() {
        return maintenanceVehiclesExtension;
    }

    /**
     * Définit la valeur de la propriété maintenanceVehiclesExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMaintenanceVehiclesExtension(ExtensionType value) {
        this.maintenanceVehiclesExtension = value;
    }

    public boolean isSetMaintenanceVehiclesExtension() {
        return (this.maintenanceVehiclesExtension!= null);
    }

}
