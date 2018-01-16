
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ReroutingManagement complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ReroutingManagement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}NetworkManagement">
 *       &lt;sequence>
 *         &lt;element name="reroutingManagementType" type="{http://datex2.eu/schema/2_0RC1/2_0}ReroutingManagementTypeEnum" maxOccurs="unbounded"/>
 *         &lt;element name="reroutingItineraryDescription" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="signedRerouting" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/>
 *         &lt;element name="entry" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/>
 *         &lt;element name="exit" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/>
 *         &lt;element name="roadOrJunctionNumber" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/>
 *         &lt;element name="alternativeRoute" type="{http://datex2.eu/schema/2_0RC1/2_0}Itinerary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reroutingManagementExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReroutingManagement", propOrder = {
    "reroutingManagementType",
    "reroutingItineraryDescription",
    "signedRerouting",
    "entry",
    "exit",
    "roadOrJunctionNumber",
    "alternativeRoute",
    "reroutingManagementExtension"
})
public class ReroutingManagement
    extends NetworkManagement
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected List<ReroutingManagementTypeEnum> reroutingManagementType;
    protected MultilingualString reroutingItineraryDescription;
    protected Boolean signedRerouting;
    protected String entry;
    protected String exit;
    protected String roadOrJunctionNumber;
    protected List<Itinerary> alternativeRoute;
    protected ExtensionType reroutingManagementExtension;

    /**
     * Gets the value of the reroutingManagementType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reroutingManagementType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReroutingManagementType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReroutingManagementTypeEnum }
     * 
     * 
     */
    public List<ReroutingManagementTypeEnum> getReroutingManagementType() {
        if (reroutingManagementType == null) {
            reroutingManagementType = new ArrayList<ReroutingManagementTypeEnum>();
        }
        return this.reroutingManagementType;
    }

    public boolean isSetReroutingManagementType() {
        return ((this.reroutingManagementType!= null)&&(!this.reroutingManagementType.isEmpty()));
    }

    public void unsetReroutingManagementType() {
        this.reroutingManagementType = null;
    }

    /**
     * Obtient la valeur de la propriété reroutingItineraryDescription.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getReroutingItineraryDescription() {
        return reroutingItineraryDescription;
    }

    /**
     * Définit la valeur de la propriété reroutingItineraryDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setReroutingItineraryDescription(MultilingualString value) {
        this.reroutingItineraryDescription = value;
    }

    public boolean isSetReroutingItineraryDescription() {
        return (this.reroutingItineraryDescription!= null);
    }

    /**
     * Obtient la valeur de la propriété signedRerouting.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSignedRerouting() {
        return signedRerouting;
    }

    /**
     * Définit la valeur de la propriété signedRerouting.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSignedRerouting(Boolean value) {
        this.signedRerouting = value;
    }

    public boolean isSetSignedRerouting() {
        return (this.signedRerouting!= null);
    }

    /**
     * Obtient la valeur de la propriété entry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntry() {
        return entry;
    }

    /**
     * Définit la valeur de la propriété entry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntry(String value) {
        this.entry = value;
    }

    public boolean isSetEntry() {
        return (this.entry!= null);
    }

    /**
     * Obtient la valeur de la propriété exit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExit() {
        return exit;
    }

    /**
     * Définit la valeur de la propriété exit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExit(String value) {
        this.exit = value;
    }

    public boolean isSetExit() {
        return (this.exit!= null);
    }

    /**
     * Obtient la valeur de la propriété roadOrJunctionNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadOrJunctionNumber() {
        return roadOrJunctionNumber;
    }

    /**
     * Définit la valeur de la propriété roadOrJunctionNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadOrJunctionNumber(String value) {
        this.roadOrJunctionNumber = value;
    }

    public boolean isSetRoadOrJunctionNumber() {
        return (this.roadOrJunctionNumber!= null);
    }

    /**
     * Gets the value of the alternativeRoute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeRoute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeRoute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Itinerary }
     * 
     * 
     */
    public List<Itinerary> getAlternativeRoute() {
        if (alternativeRoute == null) {
            alternativeRoute = new ArrayList<Itinerary>();
        }
        return this.alternativeRoute;
    }

    public boolean isSetAlternativeRoute() {
        return ((this.alternativeRoute!= null)&&(!this.alternativeRoute.isEmpty()));
    }

    public void unsetAlternativeRoute() {
        this.alternativeRoute = null;
    }

    /**
     * Obtient la valeur de la propriété reroutingManagementExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getReroutingManagementExtension() {
        return reroutingManagementExtension;
    }

    /**
     * Définit la valeur de la propriété reroutingManagementExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setReroutingManagementExtension(ExtensionType value) {
        this.reroutingManagementExtension = value;
    }

    public boolean isSetReroutingManagementExtension() {
        return (this.reroutingManagementExtension!= null);
    }

}
