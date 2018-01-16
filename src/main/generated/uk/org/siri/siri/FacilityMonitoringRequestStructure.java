
package uk.org.siri.siri;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import uk.org.ifopt.ifopt.StopPlaceComponentRefStructure;
import uk.org.ifopt.ifopt.StopPlaceRefStructure;


/**
 * Type for Functional Service Request for Facility Monitoring Service.
 * 
 * <p>Classe Java pour FacilityMonitoringRequestStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="FacilityMonitoringRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractFunctionalServiceRequestStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}FacilityMonitoringTopicGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}FacilityMonitoringRequestPolicyGroup"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.siri.org.uk/siri}VersionString" default="2.0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityMonitoringRequestStructure", propOrder = {
    "previewInterval",
    "startTime",
    "facilityRef",
    "featureRef",
    "lineRef",
    "stopPointRef",
    "connectionLinkRef",
    "framedVehicleJourneyRef",
    "vehicleJourneyRef",
    "interchangeRef",
    "vehicleRef",
    "stopPlaceRef",
    "stopPlaceComponentRef",
    "accessibilityNeedsFilter",
    "language",
    "includeTranslations",
    "maximumNumberOfFacilityConditions",
    "extensions"
})
public class FacilityMonitoringRequestStructure
    extends AbstractFunctionalServiceRequestStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PreviewInterval")
    protected Duration previewInterval;
    @XmlElement(name = "StartTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "FacilityRef")
    protected List<FacilityRefStructure> facilityRef;
    @XmlElement(name = "FeatureRef")
    protected FeatureRefStructure featureRef;
    @XmlElement(name = "LineRef")
    protected LineRefStructure lineRef;
    @XmlElement(name = "StopPointRef")
    protected StopPointRefStructure stopPointRef;
    @XmlElement(name = "ConnectionLinkRef")
    protected ConnectionLinkRefStructure connectionLinkRef;
    @XmlElement(name = "FramedVehicleJourneyRef")
    protected FramedVehicleJourneyRefStructure framedVehicleJourneyRef;
    @XmlElement(name = "VehicleJourneyRef")
    protected VehicleJourneyRefStructure vehicleJourneyRef;
    @XmlElement(name = "InterchangeRef")
    protected InterchangeRefStructure interchangeRef;
    @XmlElement(name = "VehicleRef")
    protected VehicleRefStructure vehicleRef;
    @XmlElement(name = "StopPlaceRef")
    protected StopPlaceRefStructure stopPlaceRef;
    @XmlElement(name = "StopPlaceComponentRef")
    protected StopPlaceComponentRefStructure stopPlaceComponentRef;
    @XmlElement(name = "AccessibilityNeedsFilter")
    protected List<AccessibilityNeedsFilterStructure> accessibilityNeedsFilter;
    @XmlElement(name = "Language", defaultValue = "en")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;
    @XmlElement(name = "IncludeTranslations")
    protected Boolean includeTranslations;
    @XmlElement(name = "MaximumNumberOfFacilityConditions")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maximumNumberOfFacilityConditions;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Obtient la valeur de la propriété previewInterval.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPreviewInterval() {
        return previewInterval;
    }

    /**
     * Définit la valeur de la propriété previewInterval.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPreviewInterval(Duration value) {
        this.previewInterval = value;
    }

    public boolean isSetPreviewInterval() {
        return (this.previewInterval!= null);
    }

    /**
     * Obtient la valeur de la propriété startTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Définit la valeur de la propriété startTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    public boolean isSetStartTime() {
        return (this.startTime!= null);
    }

    /**
     * Gets the value of the facilityRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityRefStructure }
     * 
     * 
     */
    public List<FacilityRefStructure> getFacilityRef() {
        if (facilityRef == null) {
            facilityRef = new ArrayList<FacilityRefStructure>();
        }
        return this.facilityRef;
    }

    public boolean isSetFacilityRef() {
        return ((this.facilityRef!= null)&&(!this.facilityRef.isEmpty()));
    }

    public void unsetFacilityRef() {
        this.facilityRef = null;
    }

    /**
     * Obtient la valeur de la propriété featureRef.
     * 
     * @return
     *     possible object is
     *     {@link FeatureRefStructure }
     *     
     */
    public FeatureRefStructure getFeatureRef() {
        return featureRef;
    }

    /**
     * Définit la valeur de la propriété featureRef.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureRefStructure }
     *     
     */
    public void setFeatureRef(FeatureRefStructure value) {
        this.featureRef = value;
    }

    public boolean isSetFeatureRef() {
        return (this.featureRef!= null);
    }

    /**
     * Obtient la valeur de la propriété lineRef.
     * 
     * @return
     *     possible object is
     *     {@link LineRefStructure }
     *     
     */
    public LineRefStructure getLineRef() {
        return lineRef;
    }

    /**
     * Définit la valeur de la propriété lineRef.
     * 
     * @param value
     *     allowed object is
     *     {@link LineRefStructure }
     *     
     */
    public void setLineRef(LineRefStructure value) {
        this.lineRef = value;
    }

    public boolean isSetLineRef() {
        return (this.lineRef!= null);
    }

    /**
     * Obtient la valeur de la propriété stopPointRef.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getStopPointRef() {
        return stopPointRef;
    }

    /**
     * Définit la valeur de la propriété stopPointRef.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setStopPointRef(StopPointRefStructure value) {
        this.stopPointRef = value;
    }

    public boolean isSetStopPointRef() {
        return (this.stopPointRef!= null);
    }

    /**
     * Obtient la valeur de la propriété connectionLinkRef.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionLinkRefStructure }
     *     
     */
    public ConnectionLinkRefStructure getConnectionLinkRef() {
        return connectionLinkRef;
    }

    /**
     * Définit la valeur de la propriété connectionLinkRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionLinkRefStructure }
     *     
     */
    public void setConnectionLinkRef(ConnectionLinkRefStructure value) {
        this.connectionLinkRef = value;
    }

    public boolean isSetConnectionLinkRef() {
        return (this.connectionLinkRef!= null);
    }

    /**
     * Obtient la valeur de la propriété framedVehicleJourneyRef.
     * 
     * @return
     *     possible object is
     *     {@link FramedVehicleJourneyRefStructure }
     *     
     */
    public FramedVehicleJourneyRefStructure getFramedVehicleJourneyRef() {
        return framedVehicleJourneyRef;
    }

    /**
     * Définit la valeur de la propriété framedVehicleJourneyRef.
     * 
     * @param value
     *     allowed object is
     *     {@link FramedVehicleJourneyRefStructure }
     *     
     */
    public void setFramedVehicleJourneyRef(FramedVehicleJourneyRefStructure value) {
        this.framedVehicleJourneyRef = value;
    }

    public boolean isSetFramedVehicleJourneyRef() {
        return (this.framedVehicleJourneyRef!= null);
    }

    /**
     * Obtient la valeur de la propriété vehicleJourneyRef.
     * 
     * @return
     *     possible object is
     *     {@link VehicleJourneyRefStructure }
     *     
     */
    public VehicleJourneyRefStructure getVehicleJourneyRef() {
        return vehicleJourneyRef;
    }

    /**
     * Définit la valeur de la propriété vehicleJourneyRef.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleJourneyRefStructure }
     *     
     */
    public void setVehicleJourneyRef(VehicleJourneyRefStructure value) {
        this.vehicleJourneyRef = value;
    }

    public boolean isSetVehicleJourneyRef() {
        return (this.vehicleJourneyRef!= null);
    }

    /**
     * Obtient la valeur de la propriété interchangeRef.
     * 
     * @return
     *     possible object is
     *     {@link InterchangeRefStructure }
     *     
     */
    public InterchangeRefStructure getInterchangeRef() {
        return interchangeRef;
    }

    /**
     * Définit la valeur de la propriété interchangeRef.
     * 
     * @param value
     *     allowed object is
     *     {@link InterchangeRefStructure }
     *     
     */
    public void setInterchangeRef(InterchangeRefStructure value) {
        this.interchangeRef = value;
    }

    public boolean isSetInterchangeRef() {
        return (this.interchangeRef!= null);
    }

    /**
     * Obtient la valeur de la propriété vehicleRef.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRefStructure }
     *     
     */
    public VehicleRefStructure getVehicleRef() {
        return vehicleRef;
    }

    /**
     * Définit la valeur de la propriété vehicleRef.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRefStructure }
     *     
     */
    public void setVehicleRef(VehicleRefStructure value) {
        this.vehicleRef = value;
    }

    public boolean isSetVehicleRef() {
        return (this.vehicleRef!= null);
    }

    /**
     * Obtient la valeur de la propriété stopPlaceRef.
     * 
     * @return
     *     possible object is
     *     {@link StopPlaceRefStructure }
     *     
     */
    public StopPlaceRefStructure getStopPlaceRef() {
        return stopPlaceRef;
    }

    /**
     * Définit la valeur de la propriété stopPlaceRef.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPlaceRefStructure }
     *     
     */
    public void setStopPlaceRef(StopPlaceRefStructure value) {
        this.stopPlaceRef = value;
    }

    public boolean isSetStopPlaceRef() {
        return (this.stopPlaceRef!= null);
    }

    /**
     * Obtient la valeur de la propriété stopPlaceComponentRef.
     * 
     * @return
     *     possible object is
     *     {@link StopPlaceComponentRefStructure }
     *     
     */
    public StopPlaceComponentRefStructure getStopPlaceComponentRef() {
        return stopPlaceComponentRef;
    }

    /**
     * Définit la valeur de la propriété stopPlaceComponentRef.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPlaceComponentRefStructure }
     *     
     */
    public void setStopPlaceComponentRef(StopPlaceComponentRefStructure value) {
        this.stopPlaceComponentRef = value;
    }

    public boolean isSetStopPlaceComponentRef() {
        return (this.stopPlaceComponentRef!= null);
    }

    /**
     * Gets the value of the accessibilityNeedsFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessibilityNeedsFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessibilityNeedsFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessibilityNeedsFilterStructure }
     * 
     * 
     */
    public List<AccessibilityNeedsFilterStructure> getAccessibilityNeedsFilter() {
        if (accessibilityNeedsFilter == null) {
            accessibilityNeedsFilter = new ArrayList<AccessibilityNeedsFilterStructure>();
        }
        return this.accessibilityNeedsFilter;
    }

    public boolean isSetAccessibilityNeedsFilter() {
        return ((this.accessibilityNeedsFilter!= null)&&(!this.accessibilityNeedsFilter.isEmpty()));
    }

    public void unsetAccessibilityNeedsFilter() {
        this.accessibilityNeedsFilter = null;
    }

    /**
     * Obtient la valeur de la propriété language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Définit la valeur de la propriété language.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    public boolean isSetLanguage() {
        return (this.language!= null);
    }

    /**
     * Obtient la valeur de la propriété includeTranslations.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeTranslations() {
        return includeTranslations;
    }

    /**
     * Définit la valeur de la propriété includeTranslations.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeTranslations(Boolean value) {
        this.includeTranslations = value;
    }

    public boolean isSetIncludeTranslations() {
        return (this.includeTranslations!= null);
    }

    /**
     * Obtient la valeur de la propriété maximumNumberOfFacilityConditions.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfFacilityConditions() {
        return maximumNumberOfFacilityConditions;
    }

    /**
     * Définit la valeur de la propriété maximumNumberOfFacilityConditions.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberOfFacilityConditions(BigInteger value) {
        this.maximumNumberOfFacilityConditions = value;
    }

    public boolean isSetMaximumNumberOfFacilityConditions() {
        return (this.maximumNumberOfFacilityConditions!= null);
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
     * Obtient la valeur de la propriété version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "2.0";
        } else {
            return version;
        }
    }

    /**
     * Définit la valeur de la propriété version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    public boolean isSetVersion() {
        return (this.version!= null);
    }

}
