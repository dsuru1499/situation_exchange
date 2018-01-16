
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Accident complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Accident">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TrafficElement">
 *       &lt;sequence>
 *         &lt;element name="accidentCause" type="{http://datex2.eu/schema/2_0RC1/2_0}AccidentCauseEnum" minOccurs="0"/>
 *         &lt;element name="accidentType" type="{http://datex2.eu/schema/2_0RC1/2_0}AccidentTypeEnum" maxOccurs="unbounded"/>
 *         &lt;element name="totalNumberOfPeopleInvolved" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="totalNumberOfVehiclesInvolved" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="vehicleInvolved" type="{http://datex2.eu/schema/2_0RC1/2_0}Vehicle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="groupOfVehiclesInvolved" type="{http://datex2.eu/schema/2_0RC1/2_0}GroupOfVehiclesInvolved" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="groupOfPeopleInvolved" type="{http://datex2.eu/schema/2_0RC1/2_0}GroupOfPeopleInvolved" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="accidentExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Accident", propOrder = {
    "accidentCause",
    "accidentType",
    "totalNumberOfPeopleInvolved",
    "totalNumberOfVehiclesInvolved",
    "vehicleInvolved",
    "groupOfVehiclesInvolved",
    "groupOfPeopleInvolved",
    "accidentExtension"
})
public class Accident
    extends TrafficElement
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected AccidentCauseEnum accidentCause;
    @XmlElement(required = true)
    protected List<AccidentTypeEnum> accidentType;
    protected BigInteger totalNumberOfPeopleInvolved;
    protected BigInteger totalNumberOfVehiclesInvolved;
    protected List<Vehicle> vehicleInvolved;
    protected List<GroupOfVehiclesInvolved> groupOfVehiclesInvolved;
    protected List<GroupOfPeopleInvolved> groupOfPeopleInvolved;
    protected ExtensionType accidentExtension;

    /**
     * Obtient la valeur de la propriété accidentCause.
     * 
     * @return
     *     possible object is
     *     {@link AccidentCauseEnum }
     *     
     */
    public AccidentCauseEnum getAccidentCause() {
        return accidentCause;
    }

    /**
     * Définit la valeur de la propriété accidentCause.
     * 
     * @param value
     *     allowed object is
     *     {@link AccidentCauseEnum }
     *     
     */
    public void setAccidentCause(AccidentCauseEnum value) {
        this.accidentCause = value;
    }

    public boolean isSetAccidentCause() {
        return (this.accidentCause!= null);
    }

    /**
     * Gets the value of the accidentType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accidentType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccidentType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccidentTypeEnum }
     * 
     * 
     */
    public List<AccidentTypeEnum> getAccidentType() {
        if (accidentType == null) {
            accidentType = new ArrayList<AccidentTypeEnum>();
        }
        return this.accidentType;
    }

    public boolean isSetAccidentType() {
        return ((this.accidentType!= null)&&(!this.accidentType.isEmpty()));
    }

    public void unsetAccidentType() {
        this.accidentType = null;
    }

    /**
     * Obtient la valeur de la propriété totalNumberOfPeopleInvolved.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalNumberOfPeopleInvolved() {
        return totalNumberOfPeopleInvolved;
    }

    /**
     * Définit la valeur de la propriété totalNumberOfPeopleInvolved.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalNumberOfPeopleInvolved(BigInteger value) {
        this.totalNumberOfPeopleInvolved = value;
    }

    public boolean isSetTotalNumberOfPeopleInvolved() {
        return (this.totalNumberOfPeopleInvolved!= null);
    }

    /**
     * Obtient la valeur de la propriété totalNumberOfVehiclesInvolved.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalNumberOfVehiclesInvolved() {
        return totalNumberOfVehiclesInvolved;
    }

    /**
     * Définit la valeur de la propriété totalNumberOfVehiclesInvolved.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalNumberOfVehiclesInvolved(BigInteger value) {
        this.totalNumberOfVehiclesInvolved = value;
    }

    public boolean isSetTotalNumberOfVehiclesInvolved() {
        return (this.totalNumberOfVehiclesInvolved!= null);
    }

    /**
     * Gets the value of the vehicleInvolved property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleInvolved property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleInvolved().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vehicle }
     * 
     * 
     */
    public List<Vehicle> getVehicleInvolved() {
        if (vehicleInvolved == null) {
            vehicleInvolved = new ArrayList<Vehicle>();
        }
        return this.vehicleInvolved;
    }

    public boolean isSetVehicleInvolved() {
        return ((this.vehicleInvolved!= null)&&(!this.vehicleInvolved.isEmpty()));
    }

    public void unsetVehicleInvolved() {
        this.vehicleInvolved = null;
    }

    /**
     * Gets the value of the groupOfVehiclesInvolved property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupOfVehiclesInvolved property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupOfVehiclesInvolved().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupOfVehiclesInvolved }
     * 
     * 
     */
    public List<GroupOfVehiclesInvolved> getGroupOfVehiclesInvolved() {
        if (groupOfVehiclesInvolved == null) {
            groupOfVehiclesInvolved = new ArrayList<GroupOfVehiclesInvolved>();
        }
        return this.groupOfVehiclesInvolved;
    }

    public boolean isSetGroupOfVehiclesInvolved() {
        return ((this.groupOfVehiclesInvolved!= null)&&(!this.groupOfVehiclesInvolved.isEmpty()));
    }

    public void unsetGroupOfVehiclesInvolved() {
        this.groupOfVehiclesInvolved = null;
    }

    /**
     * Gets the value of the groupOfPeopleInvolved property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupOfPeopleInvolved property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupOfPeopleInvolved().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupOfPeopleInvolved }
     * 
     * 
     */
    public List<GroupOfPeopleInvolved> getGroupOfPeopleInvolved() {
        if (groupOfPeopleInvolved == null) {
            groupOfPeopleInvolved = new ArrayList<GroupOfPeopleInvolved>();
        }
        return this.groupOfPeopleInvolved;
    }

    public boolean isSetGroupOfPeopleInvolved() {
        return ((this.groupOfPeopleInvolved!= null)&&(!this.groupOfPeopleInvolved.isEmpty()));
    }

    public void unsetGroupOfPeopleInvolved() {
        this.groupOfPeopleInvolved = null;
    }

    /**
     * Obtient la valeur de la propriété accidentExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAccidentExtension() {
        return accidentExtension;
    }

    /**
     * Définit la valeur de la propriété accidentExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAccidentExtension(ExtensionType value) {
        this.accidentExtension = value;
    }

    public boolean isSetAccidentExtension() {
        return (this.accidentExtension!= null);
    }

}
