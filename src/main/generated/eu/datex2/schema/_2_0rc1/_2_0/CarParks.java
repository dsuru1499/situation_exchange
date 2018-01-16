
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CarParks complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CarParks">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}NonRoadEventInformation">
 *       &lt;sequence>
 *         &lt;element name="carParkConfiguration" type="{http://datex2.eu/schema/2_0RC1/2_0}CarParkConfigurationEnum" minOccurs="0"/>
 *         &lt;element name="carParkIdentity" type="{http://datex2.eu/schema/2_0RC1/2_0}String"/>
 *         &lt;element name="carParkOccupancy" type="{http://datex2.eu/schema/2_0RC1/2_0}Percentage" minOccurs="0"/>
 *         &lt;element name="carParkStatus" type="{http://datex2.eu/schema/2_0RC1/2_0}CarParkStatusEnum" minOccurs="0"/>
 *         &lt;element name="exitRate" type="{http://datex2.eu/schema/2_0RC1/2_0}VehiclesPerHour" minOccurs="0"/>
 *         &lt;element name="fillRate" type="{http://datex2.eu/schema/2_0RC1/2_0}VehiclesPerHour" minOccurs="0"/>
 *         &lt;element name="numberOfVacantParkingSpaces" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="occupiedSpaces" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="queuingTime" type="{http://datex2.eu/schema/2_0RC1/2_0}Seconds" minOccurs="0"/>
 *         &lt;element name="totalCapacity" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="carParksExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarParks", propOrder = {
    "carParkConfiguration",
    "carParkIdentity",
    "carParkOccupancy",
    "carParkStatus",
    "exitRate",
    "fillRate",
    "numberOfVacantParkingSpaces",
    "occupiedSpaces",
    "queuingTime",
    "totalCapacity",
    "carParksExtension"
})
public class CarParks
    extends NonRoadEventInformation
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected CarParkConfigurationEnum carParkConfiguration;
    @XmlElement(required = true)
    protected String carParkIdentity;
    protected Float carParkOccupancy;
    protected CarParkStatusEnum carParkStatus;
    protected BigInteger exitRate;
    protected BigInteger fillRate;
    protected BigInteger numberOfVacantParkingSpaces;
    protected BigInteger occupiedSpaces;
    protected Float queuingTime;
    protected BigInteger totalCapacity;
    protected ExtensionType carParksExtension;

    /**
     * Obtient la valeur de la propriété carParkConfiguration.
     * 
     * @return
     *     possible object is
     *     {@link CarParkConfigurationEnum }
     *     
     */
    public CarParkConfigurationEnum getCarParkConfiguration() {
        return carParkConfiguration;
    }

    /**
     * Définit la valeur de la propriété carParkConfiguration.
     * 
     * @param value
     *     allowed object is
     *     {@link CarParkConfigurationEnum }
     *     
     */
    public void setCarParkConfiguration(CarParkConfigurationEnum value) {
        this.carParkConfiguration = value;
    }

    public boolean isSetCarParkConfiguration() {
        return (this.carParkConfiguration!= null);
    }

    /**
     * Obtient la valeur de la propriété carParkIdentity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarParkIdentity() {
        return carParkIdentity;
    }

    /**
     * Définit la valeur de la propriété carParkIdentity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarParkIdentity(String value) {
        this.carParkIdentity = value;
    }

    public boolean isSetCarParkIdentity() {
        return (this.carParkIdentity!= null);
    }

    /**
     * Obtient la valeur de la propriété carParkOccupancy.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCarParkOccupancy() {
        return carParkOccupancy;
    }

    /**
     * Définit la valeur de la propriété carParkOccupancy.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCarParkOccupancy(Float value) {
        this.carParkOccupancy = value;
    }

    public boolean isSetCarParkOccupancy() {
        return (this.carParkOccupancy!= null);
    }

    /**
     * Obtient la valeur de la propriété carParkStatus.
     * 
     * @return
     *     possible object is
     *     {@link CarParkStatusEnum }
     *     
     */
    public CarParkStatusEnum getCarParkStatus() {
        return carParkStatus;
    }

    /**
     * Définit la valeur de la propriété carParkStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link CarParkStatusEnum }
     *     
     */
    public void setCarParkStatus(CarParkStatusEnum value) {
        this.carParkStatus = value;
    }

    public boolean isSetCarParkStatus() {
        return (this.carParkStatus!= null);
    }

    /**
     * Obtient la valeur de la propriété exitRate.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExitRate() {
        return exitRate;
    }

    /**
     * Définit la valeur de la propriété exitRate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExitRate(BigInteger value) {
        this.exitRate = value;
    }

    public boolean isSetExitRate() {
        return (this.exitRate!= null);
    }

    /**
     * Obtient la valeur de la propriété fillRate.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFillRate() {
        return fillRate;
    }

    /**
     * Définit la valeur de la propriété fillRate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFillRate(BigInteger value) {
        this.fillRate = value;
    }

    public boolean isSetFillRate() {
        return (this.fillRate!= null);
    }

    /**
     * Obtient la valeur de la propriété numberOfVacantParkingSpaces.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfVacantParkingSpaces() {
        return numberOfVacantParkingSpaces;
    }

    /**
     * Définit la valeur de la propriété numberOfVacantParkingSpaces.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfVacantParkingSpaces(BigInteger value) {
        this.numberOfVacantParkingSpaces = value;
    }

    public boolean isSetNumberOfVacantParkingSpaces() {
        return (this.numberOfVacantParkingSpaces!= null);
    }

    /**
     * Obtient la valeur de la propriété occupiedSpaces.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOccupiedSpaces() {
        return occupiedSpaces;
    }

    /**
     * Définit la valeur de la propriété occupiedSpaces.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOccupiedSpaces(BigInteger value) {
        this.occupiedSpaces = value;
    }

    public boolean isSetOccupiedSpaces() {
        return (this.occupiedSpaces!= null);
    }

    /**
     * Obtient la valeur de la propriété queuingTime.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getQueuingTime() {
        return queuingTime;
    }

    /**
     * Définit la valeur de la propriété queuingTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setQueuingTime(Float value) {
        this.queuingTime = value;
    }

    public boolean isSetQueuingTime() {
        return (this.queuingTime!= null);
    }

    /**
     * Obtient la valeur de la propriété totalCapacity.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalCapacity() {
        return totalCapacity;
    }

    /**
     * Définit la valeur de la propriété totalCapacity.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalCapacity(BigInteger value) {
        this.totalCapacity = value;
    }

    public boolean isSetTotalCapacity() {
        return (this.totalCapacity!= null);
    }

    /**
     * Obtient la valeur de la propriété carParksExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getCarParksExtension() {
        return carParksExtension;
    }

    /**
     * Définit la valeur de la propriété carParksExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setCarParksExtension(ExtensionType value) {
        this.carParksExtension = value;
    }

    public boolean isSetCarParksExtension() {
        return (this.carParksExtension!= null);
    }

}
