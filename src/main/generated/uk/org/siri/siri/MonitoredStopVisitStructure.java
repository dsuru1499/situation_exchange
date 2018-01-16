
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for Visit of a VEHICLE to a stop monitoring point. May provide information about the arrival, the departure or both.
 * 
 * <p>Classe Java pour MonitoredStopVisitStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MonitoredStopVisitStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractIdentifiedItemStructure">
 *       &lt;sequence>
 *         &lt;element name="ValidUntilTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}StopVisitReferenceGroup" minOccurs="0"/>
 *         &lt;element name="MonitoredVehicleJourney" type="{http://www.siri.org.uk/siri}MonitoredVehicleJourneyStructure"/>
 *         &lt;element name="StopVisitNote" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StopFacility" type="{http://www.siri.org.uk/siri}FacilityRefStructure" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitoredStopVisitStructure", propOrder = {
    "validUntilTime",
    "monitoringRef",
    "clearDownRef",
    "monitoredVehicleJourney",
    "stopVisitNote",
    "stopFacility",
    "extensions"
})
public class MonitoredStopVisitStructure
    extends AbstractIdentifiedItemStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ValidUntilTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validUntilTime;
    @XmlElement(name = "MonitoringRef")
    protected MonitoringRefStructure monitoringRef;
    @XmlElement(name = "ClearDownRef")
    protected ClearDownRefStructure clearDownRef;
    @XmlElement(name = "MonitoredVehicleJourney", required = true)
    protected MonitoredVehicleJourneyStructure monitoredVehicleJourney;
    @XmlElement(name = "StopVisitNote")
    protected List<NaturalLanguageStringStructure> stopVisitNote;
    @XmlElement(name = "StopFacility")
    protected FacilityRefStructure stopFacility;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété validUntilTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidUntilTime() {
        return validUntilTime;
    }

    /**
     * Définit la valeur de la propriété validUntilTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidUntilTime(XMLGregorianCalendar value) {
        this.validUntilTime = value;
    }

    public boolean isSetValidUntilTime() {
        return (this.validUntilTime!= null);
    }

    /**
     * Obtient la valeur de la propriété monitoringRef.
     * 
     * @return
     *     possible object is
     *     {@link MonitoringRefStructure }
     *     
     */
    public MonitoringRefStructure getMonitoringRef() {
        return monitoringRef;
    }

    /**
     * Définit la valeur de la propriété monitoringRef.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoringRefStructure }
     *     
     */
    public void setMonitoringRef(MonitoringRefStructure value) {
        this.monitoringRef = value;
    }

    public boolean isSetMonitoringRef() {
        return (this.monitoringRef!= null);
    }

    /**
     * Obtient la valeur de la propriété clearDownRef.
     * 
     * @return
     *     possible object is
     *     {@link ClearDownRefStructure }
     *     
     */
    public ClearDownRefStructure getClearDownRef() {
        return clearDownRef;
    }

    /**
     * Définit la valeur de la propriété clearDownRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearDownRefStructure }
     *     
     */
    public void setClearDownRef(ClearDownRefStructure value) {
        this.clearDownRef = value;
    }

    public boolean isSetClearDownRef() {
        return (this.clearDownRef!= null);
    }

    /**
     * Obtient la valeur de la propriété monitoredVehicleJourney.
     * 
     * @return
     *     possible object is
     *     {@link MonitoredVehicleJourneyStructure }
     *     
     */
    public MonitoredVehicleJourneyStructure getMonitoredVehicleJourney() {
        return monitoredVehicleJourney;
    }

    /**
     * Définit la valeur de la propriété monitoredVehicleJourney.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoredVehicleJourneyStructure }
     *     
     */
    public void setMonitoredVehicleJourney(MonitoredVehicleJourneyStructure value) {
        this.monitoredVehicleJourney = value;
    }

    public boolean isSetMonitoredVehicleJourney() {
        return (this.monitoredVehicleJourney!= null);
    }

    /**
     * Gets the value of the stopVisitNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopVisitNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopVisitNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getStopVisitNote() {
        if (stopVisitNote == null) {
            stopVisitNote = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.stopVisitNote;
    }

    public boolean isSetStopVisitNote() {
        return ((this.stopVisitNote!= null)&&(!this.stopVisitNote.isEmpty()));
    }

    public void unsetStopVisitNote() {
        this.stopVisitNote = null;
    }

    /**
     * Obtient la valeur de la propriété stopFacility.
     * 
     * @return
     *     possible object is
     *     {@link FacilityRefStructure }
     *     
     */
    public FacilityRefStructure getStopFacility() {
        return stopFacility;
    }

    /**
     * Définit la valeur de la propriété stopFacility.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityRefStructure }
     *     
     */
    public void setStopFacility(FacilityRefStructure value) {
        this.stopFacility = value;
    }

    public boolean isSetStopFacility() {
        return (this.stopFacility!= null);
    }

    /**
     * Obtient la valeur de la propriété extensions.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Définit la valeur de la propriété extensions.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public boolean isSetExtensions() {
        return (this.extensions!= null);
    }

}
