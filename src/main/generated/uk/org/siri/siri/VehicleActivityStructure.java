
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
 * Type for a Vehicle Activity.
 * 
 * <p>Classe Java pour VehicleActivityStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleActivityStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractIdentifiedItemStructure">
 *       &lt;sequence>
 *         &lt;element name="ValidUntilTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="VehicleMonitoringRef" type="{http://www.siri.org.uk/siri}VehicleMonitoringRefStructure" minOccurs="0"/>
 *         &lt;element name="MonitoringName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProgressBetweenStops" type="{http://www.siri.org.uk/siri}ProgressBetweenStopsStructure" minOccurs="0"/>
 *         &lt;element name="MonitoredVehicleJourney">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.siri.org.uk/siri}MonitoredVehicleJourneyStructure">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="VehicleActivityNote" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "VehicleActivityStructure", propOrder = {
    "validUntilTime",
    "vehicleMonitoringRef",
    "monitoringName",
    "progressBetweenStops",
    "monitoredVehicleJourney",
    "vehicleActivityNote",
    "extensions"
})
public class VehicleActivityStructure
    extends AbstractIdentifiedItemStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ValidUntilTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validUntilTime;
    @XmlElement(name = "VehicleMonitoringRef")
    protected VehicleMonitoringRefStructure vehicleMonitoringRef;
    @XmlElement(name = "MonitoringName")
    protected List<NaturalLanguageStringStructure> monitoringName;
    @XmlElement(name = "ProgressBetweenStops")
    protected ProgressBetweenStopsStructure progressBetweenStops;
    @XmlElement(name = "MonitoredVehicleJourney", required = true)
    protected VehicleActivityStructure.MonitoredVehicleJourney monitoredVehicleJourney;
    @XmlElement(name = "VehicleActivityNote")
    protected List<NaturalLanguageStringStructure> vehicleActivityNote;
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
     * Obtient la valeur de la propriété vehicleMonitoringRef.
     * 
     * @return
     *     possible object is
     *     {@link VehicleMonitoringRefStructure }
     *     
     */
    public VehicleMonitoringRefStructure getVehicleMonitoringRef() {
        return vehicleMonitoringRef;
    }

    /**
     * Définit la valeur de la propriété vehicleMonitoringRef.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMonitoringRefStructure }
     *     
     */
    public void setVehicleMonitoringRef(VehicleMonitoringRefStructure value) {
        this.vehicleMonitoringRef = value;
    }

    public boolean isSetVehicleMonitoringRef() {
        return (this.vehicleMonitoringRef!= null);
    }

    /**
     * Gets the value of the monitoringName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monitoringName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonitoringName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getMonitoringName() {
        if (monitoringName == null) {
            monitoringName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.monitoringName;
    }

    public boolean isSetMonitoringName() {
        return ((this.monitoringName!= null)&&(!this.monitoringName.isEmpty()));
    }

    public void unsetMonitoringName() {
        this.monitoringName = null;
    }

    /**
     * Obtient la valeur de la propriété progressBetweenStops.
     * 
     * @return
     *     possible object is
     *     {@link ProgressBetweenStopsStructure }
     *     
     */
    public ProgressBetweenStopsStructure getProgressBetweenStops() {
        return progressBetweenStops;
    }

    /**
     * Définit la valeur de la propriété progressBetweenStops.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgressBetweenStopsStructure }
     *     
     */
    public void setProgressBetweenStops(ProgressBetweenStopsStructure value) {
        this.progressBetweenStops = value;
    }

    public boolean isSetProgressBetweenStops() {
        return (this.progressBetweenStops!= null);
    }

    /**
     * Obtient la valeur de la propriété monitoredVehicleJourney.
     * 
     * @return
     *     possible object is
     *     {@link VehicleActivityStructure.MonitoredVehicleJourney }
     *     
     */
    public VehicleActivityStructure.MonitoredVehicleJourney getMonitoredVehicleJourney() {
        return monitoredVehicleJourney;
    }

    /**
     * Définit la valeur de la propriété monitoredVehicleJourney.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleActivityStructure.MonitoredVehicleJourney }
     *     
     */
    public void setMonitoredVehicleJourney(VehicleActivityStructure.MonitoredVehicleJourney value) {
        this.monitoredVehicleJourney = value;
    }

    public boolean isSetMonitoredVehicleJourney() {
        return (this.monitoredVehicleJourney!= null);
    }

    /**
     * Gets the value of the vehicleActivityNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleActivityNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleActivityNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getVehicleActivityNote() {
        if (vehicleActivityNote == null) {
            vehicleActivityNote = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.vehicleActivityNote;
    }

    public boolean isSetVehicleActivityNote() {
        return ((this.vehicleActivityNote!= null)&&(!this.vehicleActivityNote.isEmpty()));
    }

    public void unsetVehicleActivityNote() {
        this.vehicleActivityNote = null;
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


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.siri.org.uk/siri}MonitoredVehicleJourneyStructure">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MonitoredVehicleJourney
        extends MonitoredVehicleJourneyStructure
        implements Serializable
    {

        private final static long serialVersionUID = 1L;

    }

}
