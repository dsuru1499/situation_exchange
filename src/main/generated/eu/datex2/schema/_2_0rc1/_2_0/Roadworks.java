
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Roadworks complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Roadworks">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}OperatorAction">
 *       &lt;sequence>
 *         &lt;element name="roadworksDuration" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadworksDurationEnum" minOccurs="0"/>
 *         &lt;element name="roadworksScale" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadworksScaleEnum" minOccurs="0"/>
 *         &lt;element name="underTraffic" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/>
 *         &lt;element name="urgentRoadworks" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/>
 *         &lt;element name="mobility" type="{http://datex2.eu/schema/2_0RC1/2_0}Mobility" minOccurs="0"/>
 *         &lt;element name="subjects" type="{http://datex2.eu/schema/2_0RC1/2_0}Subjects" minOccurs="0"/>
 *         &lt;element name="maintenanceVehicles" type="{http://datex2.eu/schema/2_0RC1/2_0}MaintenanceVehicles" minOccurs="0"/>
 *         &lt;element name="roadworksExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Roadworks", propOrder = {
    "roadworksDuration",
    "roadworksScale",
    "underTraffic",
    "urgentRoadworks",
    "mobility",
    "subjects",
    "maintenanceVehicles",
    "roadworksExtension"
})
@XmlSeeAlso({
    MaintenanceWorks.class,
    ConstructionWorks.class
})
public abstract class Roadworks
    extends OperatorAction
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected RoadworksDurationEnum roadworksDuration;
    protected RoadworksScaleEnum roadworksScale;
    protected Boolean underTraffic;
    protected Boolean urgentRoadworks;
    protected Mobility mobility;
    protected Subjects subjects;
    protected MaintenanceVehicles maintenanceVehicles;
    protected ExtensionType roadworksExtension;

    /**
     * Obtient la valeur de la propriété roadworksDuration.
     * 
     * @return
     *     possible object is
     *     {@link RoadworksDurationEnum }
     *     
     */
    public RoadworksDurationEnum getRoadworksDuration() {
        return roadworksDuration;
    }

    /**
     * Définit la valeur de la propriété roadworksDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadworksDurationEnum }
     *     
     */
    public void setRoadworksDuration(RoadworksDurationEnum value) {
        this.roadworksDuration = value;
    }

    public boolean isSetRoadworksDuration() {
        return (this.roadworksDuration!= null);
    }

    /**
     * Obtient la valeur de la propriété roadworksScale.
     * 
     * @return
     *     possible object is
     *     {@link RoadworksScaleEnum }
     *     
     */
    public RoadworksScaleEnum getRoadworksScale() {
        return roadworksScale;
    }

    /**
     * Définit la valeur de la propriété roadworksScale.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadworksScaleEnum }
     *     
     */
    public void setRoadworksScale(RoadworksScaleEnum value) {
        this.roadworksScale = value;
    }

    public boolean isSetRoadworksScale() {
        return (this.roadworksScale!= null);
    }

    /**
     * Obtient la valeur de la propriété underTraffic.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnderTraffic() {
        return underTraffic;
    }

    /**
     * Définit la valeur de la propriété underTraffic.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnderTraffic(Boolean value) {
        this.underTraffic = value;
    }

    public boolean isSetUnderTraffic() {
        return (this.underTraffic!= null);
    }

    /**
     * Obtient la valeur de la propriété urgentRoadworks.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrgentRoadworks() {
        return urgentRoadworks;
    }

    /**
     * Définit la valeur de la propriété urgentRoadworks.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrgentRoadworks(Boolean value) {
        this.urgentRoadworks = value;
    }

    public boolean isSetUrgentRoadworks() {
        return (this.urgentRoadworks!= null);
    }

    /**
     * Obtient la valeur de la propriété mobility.
     * 
     * @return
     *     possible object is
     *     {@link Mobility }
     *     
     */
    public Mobility getMobility() {
        return mobility;
    }

    /**
     * Définit la valeur de la propriété mobility.
     * 
     * @param value
     *     allowed object is
     *     {@link Mobility }
     *     
     */
    public void setMobility(Mobility value) {
        this.mobility = value;
    }

    public boolean isSetMobility() {
        return (this.mobility!= null);
    }

    /**
     * Obtient la valeur de la propriété subjects.
     * 
     * @return
     *     possible object is
     *     {@link Subjects }
     *     
     */
    public Subjects getSubjects() {
        return subjects;
    }

    /**
     * Définit la valeur de la propriété subjects.
     * 
     * @param value
     *     allowed object is
     *     {@link Subjects }
     *     
     */
    public void setSubjects(Subjects value) {
        this.subjects = value;
    }

    public boolean isSetSubjects() {
        return (this.subjects!= null);
    }

    /**
     * Obtient la valeur de la propriété maintenanceVehicles.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceVehicles }
     *     
     */
    public MaintenanceVehicles getMaintenanceVehicles() {
        return maintenanceVehicles;
    }

    /**
     * Définit la valeur de la propriété maintenanceVehicles.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceVehicles }
     *     
     */
    public void setMaintenanceVehicles(MaintenanceVehicles value) {
        this.maintenanceVehicles = value;
    }

    public boolean isSetMaintenanceVehicles() {
        return (this.maintenanceVehicles!= null);
    }

    /**
     * Obtient la valeur de la propriété roadworksExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRoadworksExtension() {
        return roadworksExtension;
    }

    /**
     * Définit la valeur de la propriété roadworksExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRoadworksExtension(ExtensionType value) {
        this.roadworksExtension = value;
    }

    public boolean isSetRoadworksExtension() {
        return (this.roadworksExtension!= null);
    }

}
