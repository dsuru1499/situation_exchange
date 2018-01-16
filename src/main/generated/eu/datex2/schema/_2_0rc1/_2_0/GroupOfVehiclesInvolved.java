
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour GroupOfVehiclesInvolved complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GroupOfVehiclesInvolved">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numberOfVehicles" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="vehicleStatus" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleStatusEnum" minOccurs="0"/>
 *         &lt;element name="vehicleCharacteristics" type="{http://datex2.eu/schema/2_0RC1/2_0}VehicleCharacteristics" minOccurs="0"/>
 *         &lt;element name="groupOfVehiclesInvolvedExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupOfVehiclesInvolved", propOrder = {
    "numberOfVehicles",
    "vehicleStatus",
    "vehicleCharacteristics",
    "groupOfVehiclesInvolvedExtension"
})
public class GroupOfVehiclesInvolved
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected BigInteger numberOfVehicles;
    protected VehicleStatusEnum vehicleStatus;
    protected VehicleCharacteristics vehicleCharacteristics;
    protected ExtensionType groupOfVehiclesInvolvedExtension;

    /**
     * Obtient la valeur de la propriété numberOfVehicles.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfVehicles() {
        return numberOfVehicles;
    }

    /**
     * Définit la valeur de la propriété numberOfVehicles.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfVehicles(BigInteger value) {
        this.numberOfVehicles = value;
    }

    public boolean isSetNumberOfVehicles() {
        return (this.numberOfVehicles!= null);
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
     * Obtient la valeur de la propriété groupOfVehiclesInvolvedExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGroupOfVehiclesInvolvedExtension() {
        return groupOfVehiclesInvolvedExtension;
    }

    /**
     * Définit la valeur de la propriété groupOfVehiclesInvolvedExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGroupOfVehiclesInvolvedExtension(ExtensionType value) {
        this.groupOfVehiclesInvolvedExtension = value;
    }

    public boolean isSetGroupOfVehiclesInvolvedExtension() {
        return (this.groupOfVehiclesInvolvedExtension!= null);
    }

}
