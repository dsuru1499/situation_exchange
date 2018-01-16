
package uk.org.siri.siri;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for Monitored VEHICLE JOURNEY.
 * 
 * <p>Classe Java pour MonitoredVehicleJourneyStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="MonitoredVehicleJourneyStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}MonitoredJourneyIdentityGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}JourneyPatternInfoGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}VehicleJourneyInfoGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}DisruptionGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}JourneyProgressGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}TrainOperationalInfoGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}MonitoredCallingPatternGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitoredVehicleJourneyStructure", propOrder = {
    "lineRef",
    "directionRef",
    "framedVehicleJourneyRef",
    "journeyPatternRef",
    "journeyPatternName",
    "vehicleMode",
    "routeRef",
    "publishedLineName",
    "groupOfLinesRef",
    "directionName",
    "externalLineRef",
    "operatorRef",
    "productCategoryRef",
    "serviceFeatureRef",
    "vehicleFeatureRef",
    "originRef",
    "originName",
    "originShortName",
    "destinationDisplayAtOrigin",
    "via",
    "destinationRef",
    "destinationName",
    "destinationShortName",
    "originDisplayAtDestination",
    "vehicleJourneyName",
    "journeyNote",
    "publicContact",
    "operationsContact",
    "headwayService",
    "originAimedDepartureTime",
    "destinationAimedArrivalTime",
    "firstOrLastJourney",
    "facilityConditionElement",
    "facilityChangeElement",
    "situationRef",
    "monitored",
    "monitoringError",
    "inCongestion",
    "inPanic",
    "predictionInaccurate",
    "dataSource",
    "confidenceLevel",
    "vehicleLocation",
    "locationRecordedAtTime",
    "bearing",
    "progressRate",
    "velocity",
    "engineOn",
    "occupancy",
    "delay",
    "progressStatus",
    "vehicleStatus",
    "trainBlockPart",
    "blockRef",
    "courseOfJourneyRef",
    "vehicleJourneyRef",
    "vehicleRef",
    "additionalVehicleJourneyRef",
    "driverRef",
    "driverName",
    "trainNumbers",
    "journeyParts",
    "previousCalls",
    "monitoredCall",
    "onwardCalls",
    "isCompleteStopSequence"
})
@XmlSeeAlso({
    uk.org.siri.siri.VehicleActivityStructure.MonitoredVehicleJourney.class
})
public class MonitoredVehicleJourneyStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "LineRef")
    protected LineRefStructure lineRef;
    @XmlElement(name = "DirectionRef")
    protected DirectionRefStructure directionRef;
    @XmlElement(name = "FramedVehicleJourneyRef")
    protected FramedVehicleJourneyRefStructure framedVehicleJourneyRef;
    @XmlElement(name = "JourneyPatternRef")
    protected JourneyPatternRefStructure journeyPatternRef;
    @XmlElement(name = "JourneyPatternName")
    protected NaturalLanguageStringStructure journeyPatternName;
    @XmlElement(name = "VehicleMode")
    protected List<VehicleModesEnumeration> vehicleMode;
    @XmlElement(name = "RouteRef")
    protected RouteRefStructure routeRef;
    @XmlElement(name = "PublishedLineName")
    protected List<NaturalLanguageStringStructure> publishedLineName;
    @XmlElement(name = "GroupOfLinesRef")
    protected GroupOfLinesRefStructure groupOfLinesRef;
    @XmlElement(name = "DirectionName")
    protected List<NaturalLanguageStringStructure> directionName;
    @XmlElement(name = "ExternalLineRef")
    protected LineRefStructure externalLineRef;
    @XmlElement(name = "OperatorRef")
    protected OperatorRefStructure operatorRef;
    @XmlElement(name = "ProductCategoryRef")
    protected ProductCategoryRefStructure productCategoryRef;
    @XmlElement(name = "ServiceFeatureRef")
    protected List<ServiceFeatureRefStructure> serviceFeatureRef;
    @XmlElement(name = "VehicleFeatureRef")
    protected List<VehicleFeatureRefStructure> vehicleFeatureRef;
    @XmlElement(name = "OriginRef")
    protected JourneyPlaceRefStructure originRef;
    @XmlElement(name = "OriginName")
    protected List<NaturalLanguagePlaceNameStructure> originName;
    @XmlElement(name = "OriginShortName")
    protected List<NaturalLanguagePlaceNameStructure> originShortName;
    @XmlElement(name = "DestinationDisplayAtOrigin")
    protected List<NaturalLanguagePlaceNameStructure> destinationDisplayAtOrigin;
    @XmlElement(name = "Via")
    protected List<ViaNameStructure> via;
    @XmlElement(name = "DestinationRef")
    protected DestinationRefStructure destinationRef;
    @XmlElement(name = "DestinationName")
    protected List<NaturalLanguageStringStructure> destinationName;
    @XmlElement(name = "DestinationShortName")
    protected List<NaturalLanguagePlaceNameStructure> destinationShortName;
    @XmlElement(name = "OriginDisplayAtDestination")
    protected List<NaturalLanguagePlaceNameStructure> originDisplayAtDestination;
    @XmlElement(name = "VehicleJourneyName")
    protected List<NaturalLanguageStringStructure> vehicleJourneyName;
    @XmlElement(name = "JourneyNote")
    protected List<NaturalLanguageStringStructure> journeyNote;
    @XmlElement(name = "PublicContact")
    protected SimpleContactStructure publicContact;
    @XmlElement(name = "OperationsContact")
    protected SimpleContactStructure operationsContact;
    @XmlElement(name = "HeadwayService", defaultValue = "false")
    protected Boolean headwayService;
    @XmlElement(name = "OriginAimedDepartureTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar originAimedDepartureTime;
    @XmlElement(name = "DestinationAimedArrivalTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar destinationAimedArrivalTime;
    @XmlElement(name = "FirstOrLastJourney", defaultValue = "unspecified")
    protected FirstOrLastJourneyEnumeration firstOrLastJourney;
    @XmlElement(name = "FacilityConditionElement")
    protected List<FacilityConditionStructure> facilityConditionElement;
    @XmlElement(name = "FacilityChangeElement")
    protected FacilityChangeStructure facilityChangeElement;
    @XmlElement(name = "SituationRef")
    protected List<SituationRefStructure> situationRef;
    @XmlElement(name = "Monitored")
    protected Boolean monitored;
    @XmlElement(name = "MonitoringError")
    protected String monitoringError;
    @XmlElement(name = "InCongestion")
    protected Boolean inCongestion;
    @XmlElement(name = "InPanic", defaultValue = "false")
    protected Boolean inPanic;
    @XmlElement(name = "PredictionInaccurate")
    protected Boolean predictionInaccurate;
    @XmlElement(name = "DataSource")
    protected String dataSource;
    @XmlElement(name = "ConfidenceLevel", defaultValue = "reliable")
    protected QualityIndexEnumeration confidenceLevel;
    @XmlElement(name = "VehicleLocation")
    protected LocationStructure vehicleLocation;
    @XmlElement(name = "LocationRecordedAtTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar locationRecordedAtTime;
    @XmlElement(name = "Bearing")
    protected Float bearing;
    @XmlElement(name = "ProgressRate")
    protected ProgressRateEnumeration progressRate;
    @XmlElement(name = "Velocity")
    protected BigInteger velocity;
    @XmlElement(name = "EngineOn", defaultValue = "true")
    protected Boolean engineOn;
    @XmlElement(name = "Occupancy")
    protected OccupancyEnumeration occupancy;
    @XmlElement(name = "Delay")
    protected Duration delay;
    @XmlElement(name = "ProgressStatus")
    protected List<NaturalLanguageStringStructure> progressStatus;
    @XmlElement(name = "VehicleStatus")
    protected VehicleStatusEnumeration vehicleStatus;
    @XmlElement(name = "TrainBlockPart")
    protected List<TrainBlockPartStructure> trainBlockPart;
    @XmlElement(name = "BlockRef")
    protected BlockRefStructure blockRef;
    @XmlElement(name = "CourseOfJourneyRef")
    protected CourseOfJourneyRefStructure courseOfJourneyRef;
    @XmlElement(name = "VehicleJourneyRef")
    protected VehicleJourneyRefStructure vehicleJourneyRef;
    @XmlElement(name = "VehicleRef")
    protected VehicleRefStructure vehicleRef;
    @XmlElement(name = "AdditionalVehicleJourneyRef")
    protected List<FramedVehicleJourneyRefStructure> additionalVehicleJourneyRef;
    @XmlElement(name = "DriverRef")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String driverRef;
    @XmlElement(name = "DriverName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String driverName;
    @XmlElement(name = "TrainNumbers")
    protected MonitoredVehicleJourneyStructure.TrainNumbers trainNumbers;
    @XmlElement(name = "JourneyParts")
    protected MonitoredVehicleJourneyStructure.JourneyParts journeyParts;
    @XmlElement(name = "PreviousCalls")
    protected PreviousCallsStructure previousCalls;
    @XmlElement(name = "MonitoredCall")
    protected MonitoredCallStructure monitoredCall;
    @XmlElement(name = "OnwardCalls")
    protected OnwardCallsStructure onwardCalls;
    @XmlElement(name = "IsCompleteStopSequence", defaultValue = "false")
    protected Boolean isCompleteStopSequence;

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
     * Obtient la valeur de la propriété directionRef.
     * 
     * @return
     *     possible object is
     *     {@link DirectionRefStructure }
     *     
     */
    public DirectionRefStructure getDirectionRef() {
        return directionRef;
    }

    /**
     * Définit la valeur de la propriété directionRef.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionRefStructure }
     *     
     */
    public void setDirectionRef(DirectionRefStructure value) {
        this.directionRef = value;
    }

    public boolean isSetDirectionRef() {
        return (this.directionRef!= null);
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
     * Obtient la valeur de la propriété journeyPatternRef.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPatternRefStructure }
     *     
     */
    public JourneyPatternRefStructure getJourneyPatternRef() {
        return journeyPatternRef;
    }

    /**
     * Définit la valeur de la propriété journeyPatternRef.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPatternRefStructure }
     *     
     */
    public void setJourneyPatternRef(JourneyPatternRefStructure value) {
        this.journeyPatternRef = value;
    }

    public boolean isSetJourneyPatternRef() {
        return (this.journeyPatternRef!= null);
    }

    /**
     * Obtient la valeur de la propriété journeyPatternName.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getJourneyPatternName() {
        return journeyPatternName;
    }

    /**
     * Définit la valeur de la propriété journeyPatternName.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setJourneyPatternName(NaturalLanguageStringStructure value) {
        this.journeyPatternName = value;
    }

    public boolean isSetJourneyPatternName() {
        return (this.journeyPatternName!= null);
    }

    /**
     * Gets the value of the vehicleMode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleMode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleModesEnumeration }
     * 
     * 
     */
    public List<VehicleModesEnumeration> getVehicleMode() {
        if (vehicleMode == null) {
            vehicleMode = new ArrayList<VehicleModesEnumeration>();
        }
        return this.vehicleMode;
    }

    public boolean isSetVehicleMode() {
        return ((this.vehicleMode!= null)&&(!this.vehicleMode.isEmpty()));
    }

    public void unsetVehicleMode() {
        this.vehicleMode = null;
    }

    /**
     * Obtient la valeur de la propriété routeRef.
     * 
     * @return
     *     possible object is
     *     {@link RouteRefStructure }
     *     
     */
    public RouteRefStructure getRouteRef() {
        return routeRef;
    }

    /**
     * Définit la valeur de la propriété routeRef.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteRefStructure }
     *     
     */
    public void setRouteRef(RouteRefStructure value) {
        this.routeRef = value;
    }

    public boolean isSetRouteRef() {
        return (this.routeRef!= null);
    }

    /**
     * Name or Number by which the LINE is known to the public.  (Unbounded since SIRI 2.0) Gets the value of the publishedLineName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publishedLineName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublishedLineName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getPublishedLineName() {
        if (publishedLineName == null) {
            publishedLineName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.publishedLineName;
    }

    public boolean isSetPublishedLineName() {
        return ((this.publishedLineName!= null)&&(!this.publishedLineName.isEmpty()));
    }

    public void unsetPublishedLineName() {
        this.publishedLineName = null;
    }

    /**
     * Obtient la valeur de la propriété groupOfLinesRef.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfLinesRefStructure }
     *     
     */
    public GroupOfLinesRefStructure getGroupOfLinesRef() {
        return groupOfLinesRef;
    }

    /**
     * Définit la valeur de la propriété groupOfLinesRef.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfLinesRefStructure }
     *     
     */
    public void setGroupOfLinesRef(GroupOfLinesRefStructure value) {
        this.groupOfLinesRef = value;
    }

    public boolean isSetGroupOfLinesRef() {
        return (this.groupOfLinesRef!= null);
    }

    /**
     * Gets the value of the directionName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directionName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectionName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getDirectionName() {
        if (directionName == null) {
            directionName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.directionName;
    }

    public boolean isSetDirectionName() {
        return ((this.directionName!= null)&&(!this.directionName.isEmpty()));
    }

    public void unsetDirectionName() {
        this.directionName = null;
    }

    /**
     * Obtient la valeur de la propriété externalLineRef.
     * 
     * @return
     *     possible object is
     *     {@link LineRefStructure }
     *     
     */
    public LineRefStructure getExternalLineRef() {
        return externalLineRef;
    }

    /**
     * Définit la valeur de la propriété externalLineRef.
     * 
     * @param value
     *     allowed object is
     *     {@link LineRefStructure }
     *     
     */
    public void setExternalLineRef(LineRefStructure value) {
        this.externalLineRef = value;
    }

    public boolean isSetExternalLineRef() {
        return (this.externalLineRef!= null);
    }

    /**
     * Obtient la valeur de la propriété operatorRef.
     * 
     * @return
     *     possible object is
     *     {@link OperatorRefStructure }
     *     
     */
    public OperatorRefStructure getOperatorRef() {
        return operatorRef;
    }

    /**
     * Définit la valeur de la propriété operatorRef.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorRefStructure }
     *     
     */
    public void setOperatorRef(OperatorRefStructure value) {
        this.operatorRef = value;
    }

    public boolean isSetOperatorRef() {
        return (this.operatorRef!= null);
    }

    /**
     * Obtient la valeur de la propriété productCategoryRef.
     * 
     * @return
     *     possible object is
     *     {@link ProductCategoryRefStructure }
     *     
     */
    public ProductCategoryRefStructure getProductCategoryRef() {
        return productCategoryRef;
    }

    /**
     * Définit la valeur de la propriété productCategoryRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCategoryRefStructure }
     *     
     */
    public void setProductCategoryRef(ProductCategoryRefStructure value) {
        this.productCategoryRef = value;
    }

    public boolean isSetProductCategoryRef() {
        return (this.productCategoryRef!= null);
    }

    /**
     * Classification of service into arbitrary Service categories, e.g. school bus. Recommended SIRI values based on TPEG are given in SIRI documentation and enumerated in the siri_facilities package. 
     * Corresponds to NeTEX TYPE OF SERVICe.Gets the value of the serviceFeatureRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceFeatureRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceFeatureRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceFeatureRefStructure }
     * 
     * 
     */
    public List<ServiceFeatureRefStructure> getServiceFeatureRef() {
        if (serviceFeatureRef == null) {
            serviceFeatureRef = new ArrayList<ServiceFeatureRefStructure>();
        }
        return this.serviceFeatureRef;
    }

    public boolean isSetServiceFeatureRef() {
        return ((this.serviceFeatureRef!= null)&&(!this.serviceFeatureRef.isEmpty()));
    }

    public void unsetServiceFeatureRef() {
        this.serviceFeatureRef = null;
    }

    /**
     * Gets the value of the vehicleFeatureRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleFeatureRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleFeatureRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleFeatureRefStructure }
     * 
     * 
     */
    public List<VehicleFeatureRefStructure> getVehicleFeatureRef() {
        if (vehicleFeatureRef == null) {
            vehicleFeatureRef = new ArrayList<VehicleFeatureRefStructure>();
        }
        return this.vehicleFeatureRef;
    }

    public boolean isSetVehicleFeatureRef() {
        return ((this.vehicleFeatureRef!= null)&&(!this.vehicleFeatureRef.isEmpty()));
    }

    public void unsetVehicleFeatureRef() {
        this.vehicleFeatureRef = null;
    }

    /**
     * Obtient la valeur de la propriété originRef.
     * 
     * @return
     *     possible object is
     *     {@link JourneyPlaceRefStructure }
     *     
     */
    public JourneyPlaceRefStructure getOriginRef() {
        return originRef;
    }

    /**
     * Définit la valeur de la propriété originRef.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyPlaceRefStructure }
     *     
     */
    public void setOriginRef(JourneyPlaceRefStructure value) {
        this.originRef = value;
    }

    public boolean isSetOriginRef() {
        return (this.originRef!= null);
    }

    /**
     * Gets the value of the originName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguagePlaceNameStructure }
     * 
     * 
     */
    public List<NaturalLanguagePlaceNameStructure> getOriginName() {
        if (originName == null) {
            originName = new ArrayList<NaturalLanguagePlaceNameStructure>();
        }
        return this.originName;
    }

    public boolean isSetOriginName() {
        return ((this.originName!= null)&&(!this.originName.isEmpty()));
    }

    public void unsetOriginName() {
        this.originName = null;
    }

    /**
     * Gets the value of the originShortName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originShortName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginShortName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguagePlaceNameStructure }
     * 
     * 
     */
    public List<NaturalLanguagePlaceNameStructure> getOriginShortName() {
        if (originShortName == null) {
            originShortName = new ArrayList<NaturalLanguagePlaceNameStructure>();
        }
        return this.originShortName;
    }

    public boolean isSetOriginShortName() {
        return ((this.originShortName!= null)&&(!this.originShortName.isEmpty()));
    }

    public void unsetOriginShortName() {
        this.originShortName = null;
    }

    /**
     * Gets the value of the destinationDisplayAtOrigin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinationDisplayAtOrigin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationDisplayAtOrigin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguagePlaceNameStructure }
     * 
     * 
     */
    public List<NaturalLanguagePlaceNameStructure> getDestinationDisplayAtOrigin() {
        if (destinationDisplayAtOrigin == null) {
            destinationDisplayAtOrigin = new ArrayList<NaturalLanguagePlaceNameStructure>();
        }
        return this.destinationDisplayAtOrigin;
    }

    public boolean isSetDestinationDisplayAtOrigin() {
        return ((this.destinationDisplayAtOrigin!= null)&&(!this.destinationDisplayAtOrigin.isEmpty()));
    }

    public void unsetDestinationDisplayAtOrigin() {
        this.destinationDisplayAtOrigin = null;
    }

    /**
     * Gets the value of the via property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the via property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ViaNameStructure }
     * 
     * 
     */
    public List<ViaNameStructure> getVia() {
        if (via == null) {
            via = new ArrayList<ViaNameStructure>();
        }
        return this.via;
    }

    public boolean isSetVia() {
        return ((this.via!= null)&&(!this.via.isEmpty()));
    }

    public void unsetVia() {
        this.via = null;
    }

    /**
     * Reference to a DESTINATION.
     * 
     * @return
     *     possible object is
     *     {@link DestinationRefStructure }
     *     
     */
    public DestinationRefStructure getDestinationRef() {
        return destinationRef;
    }

    /**
     * Définit la valeur de la propriété destinationRef.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationRefStructure }
     *     
     */
    public void setDestinationRef(DestinationRefStructure value) {
        this.destinationRef = value;
    }

    public boolean isSetDestinationRef() {
        return (this.destinationRef!= null);
    }

    /**
     * Gets the value of the destinationName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinationName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getDestinationName() {
        if (destinationName == null) {
            destinationName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.destinationName;
    }

    public boolean isSetDestinationName() {
        return ((this.destinationName!= null)&&(!this.destinationName.isEmpty()));
    }

    public void unsetDestinationName() {
        this.destinationName = null;
    }

    /**
     * Gets the value of the destinationShortName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinationShortName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationShortName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguagePlaceNameStructure }
     * 
     * 
     */
    public List<NaturalLanguagePlaceNameStructure> getDestinationShortName() {
        if (destinationShortName == null) {
            destinationShortName = new ArrayList<NaturalLanguagePlaceNameStructure>();
        }
        return this.destinationShortName;
    }

    public boolean isSetDestinationShortName() {
        return ((this.destinationShortName!= null)&&(!this.destinationShortName.isEmpty()));
    }

    public void unsetDestinationShortName() {
        this.destinationShortName = null;
    }

    /**
     * Gets the value of the originDisplayAtDestination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDisplayAtDestination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDisplayAtDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguagePlaceNameStructure }
     * 
     * 
     */
    public List<NaturalLanguagePlaceNameStructure> getOriginDisplayAtDestination() {
        if (originDisplayAtDestination == null) {
            originDisplayAtDestination = new ArrayList<NaturalLanguagePlaceNameStructure>();
        }
        return this.originDisplayAtDestination;
    }

    public boolean isSetOriginDisplayAtDestination() {
        return ((this.originDisplayAtDestination!= null)&&(!this.originDisplayAtDestination.isEmpty()));
    }

    public void unsetOriginDisplayAtDestination() {
        this.originDisplayAtDestination = null;
    }

    /**
     * Gets the value of the vehicleJourneyName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleJourneyName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleJourneyName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getVehicleJourneyName() {
        if (vehicleJourneyName == null) {
            vehicleJourneyName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.vehicleJourneyName;
    }

    public boolean isSetVehicleJourneyName() {
        return ((this.vehicleJourneyName!= null)&&(!this.vehicleJourneyName.isEmpty()));
    }

    public void unsetVehicleJourneyName() {
        this.vehicleJourneyName = null;
    }

    /**
     * Gets the value of the journeyNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journeyNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJourneyNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getJourneyNote() {
        if (journeyNote == null) {
            journeyNote = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.journeyNote;
    }

    public boolean isSetJourneyNote() {
        return ((this.journeyNote!= null)&&(!this.journeyNote.isEmpty()));
    }

    public void unsetJourneyNote() {
        this.journeyNote = null;
    }

    /**
     * Obtient la valeur de la propriété publicContact.
     * 
     * @return
     *     possible object is
     *     {@link SimpleContactStructure }
     *     
     */
    public SimpleContactStructure getPublicContact() {
        return publicContact;
    }

    /**
     * Définit la valeur de la propriété publicContact.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleContactStructure }
     *     
     */
    public void setPublicContact(SimpleContactStructure value) {
        this.publicContact = value;
    }

    public boolean isSetPublicContact() {
        return (this.publicContact!= null);
    }

    /**
     * Obtient la valeur de la propriété operationsContact.
     * 
     * @return
     *     possible object is
     *     {@link SimpleContactStructure }
     *     
     */
    public SimpleContactStructure getOperationsContact() {
        return operationsContact;
    }

    /**
     * Définit la valeur de la propriété operationsContact.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleContactStructure }
     *     
     */
    public void setOperationsContact(SimpleContactStructure value) {
        this.operationsContact = value;
    }

    public boolean isSetOperationsContact() {
        return (this.operationsContact!= null);
    }

    /**
     * Obtient la valeur de la propriété headwayService.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHeadwayService() {
        return headwayService;
    }

    /**
     * Définit la valeur de la propriété headwayService.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHeadwayService(Boolean value) {
        this.headwayService = value;
    }

    public boolean isSetHeadwayService() {
        return (this.headwayService!= null);
    }

    /**
     * Obtient la valeur de la propriété originAimedDepartureTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginAimedDepartureTime() {
        return originAimedDepartureTime;
    }

    /**
     * Définit la valeur de la propriété originAimedDepartureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginAimedDepartureTime(XMLGregorianCalendar value) {
        this.originAimedDepartureTime = value;
    }

    public boolean isSetOriginAimedDepartureTime() {
        return (this.originAimedDepartureTime!= null);
    }

    /**
     * Obtient la valeur de la propriété destinationAimedArrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDestinationAimedArrivalTime() {
        return destinationAimedArrivalTime;
    }

    /**
     * Définit la valeur de la propriété destinationAimedArrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDestinationAimedArrivalTime(XMLGregorianCalendar value) {
        this.destinationAimedArrivalTime = value;
    }

    public boolean isSetDestinationAimedArrivalTime() {
        return (this.destinationAimedArrivalTime!= null);
    }

    /**
     * Obtient la valeur de la propriété firstOrLastJourney.
     * 
     * @return
     *     possible object is
     *     {@link FirstOrLastJourneyEnumeration }
     *     
     */
    public FirstOrLastJourneyEnumeration getFirstOrLastJourney() {
        return firstOrLastJourney;
    }

    /**
     * Définit la valeur de la propriété firstOrLastJourney.
     * 
     * @param value
     *     allowed object is
     *     {@link FirstOrLastJourneyEnumeration }
     *     
     */
    public void setFirstOrLastJourney(FirstOrLastJourneyEnumeration value) {
        this.firstOrLastJourney = value;
    }

    public boolean isSetFirstOrLastJourney() {
        return (this.firstOrLastJourney!= null);
    }

    /**
     * Information about a change of Equipment availabilti at stop or on vehicle that may affect access or use.Gets the value of the facilityConditionElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityConditionElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityConditionElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityConditionStructure }
     * 
     * 
     */
    public List<FacilityConditionStructure> getFacilityConditionElement() {
        if (facilityConditionElement == null) {
            facilityConditionElement = new ArrayList<FacilityConditionStructure>();
        }
        return this.facilityConditionElement;
    }

    public boolean isSetFacilityConditionElement() {
        return ((this.facilityConditionElement!= null)&&(!this.facilityConditionElement.isEmpty()));
    }

    public void unsetFacilityConditionElement() {
        this.facilityConditionElement = null;
    }

    /**
     * Obtient la valeur de la propriété facilityChangeElement.
     * 
     * @return
     *     possible object is
     *     {@link FacilityChangeStructure }
     *     
     */
    public FacilityChangeStructure getFacilityChangeElement() {
        return facilityChangeElement;
    }

    /**
     * Définit la valeur de la propriété facilityChangeElement.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityChangeStructure }
     *     
     */
    public void setFacilityChangeElement(FacilityChangeStructure value) {
        this.facilityChangeElement = value;
    }

    public boolean isSetFacilityChangeElement() {
        return (this.facilityChangeElement!= null);
    }

    /**
     * Gets the value of the situationRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the situationRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSituationRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SituationRefStructure }
     * 
     * 
     */
    public List<SituationRefStructure> getSituationRef() {
        if (situationRef == null) {
            situationRef = new ArrayList<SituationRefStructure>();
        }
        return this.situationRef;
    }

    public boolean isSetSituationRef() {
        return ((this.situationRef!= null)&&(!this.situationRef.isEmpty()));
    }

    public void unsetSituationRef() {
        this.situationRef = null;
    }

    /**
     * Obtient la valeur de la propriété monitored.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMonitored() {
        return monitored;
    }

    /**
     * Définit la valeur de la propriété monitored.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMonitored(Boolean value) {
        this.monitored = value;
    }

    public boolean isSetMonitored() {
        return (this.monitored!= null);
    }

    /**
     * Obtient la valeur de la propriété monitoringError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonitoringError() {
        return monitoringError;
    }

    /**
     * Définit la valeur de la propriété monitoringError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonitoringError(String value) {
        this.monitoringError = value;
    }

    public boolean isSetMonitoringError() {
        return (this.monitoringError!= null);
    }

    /**
     * Obtient la valeur de la propriété inCongestion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInCongestion() {
        return inCongestion;
    }

    /**
     * Définit la valeur de la propriété inCongestion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInCongestion(Boolean value) {
        this.inCongestion = value;
    }

    public boolean isSetInCongestion() {
        return (this.inCongestion!= null);
    }

    /**
     * Obtient la valeur de la propriété inPanic.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInPanic() {
        return inPanic;
    }

    /**
     * Définit la valeur de la propriété inPanic.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInPanic(Boolean value) {
        this.inPanic = value;
    }

    public boolean isSetInPanic() {
        return (this.inPanic!= null);
    }

    /**
     * Obtient la valeur de la propriété predictionInaccurate.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPredictionInaccurate() {
        return predictionInaccurate;
    }

    /**
     * Définit la valeur de la propriété predictionInaccurate.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPredictionInaccurate(Boolean value) {
        this.predictionInaccurate = value;
    }

    public boolean isSetPredictionInaccurate() {
        return (this.predictionInaccurate!= null);
    }

    /**
     * Obtient la valeur de la propriété dataSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * Définit la valeur de la propriété dataSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSource(String value) {
        this.dataSource = value;
    }

    public boolean isSetDataSource() {
        return (this.dataSource!= null);
    }

    /**
     * Obtient la valeur de la propriété confidenceLevel.
     * 
     * @return
     *     possible object is
     *     {@link QualityIndexEnumeration }
     *     
     */
    public QualityIndexEnumeration getConfidenceLevel() {
        return confidenceLevel;
    }

    /**
     * Définit la valeur de la propriété confidenceLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityIndexEnumeration }
     *     
     */
    public void setConfidenceLevel(QualityIndexEnumeration value) {
        this.confidenceLevel = value;
    }

    public boolean isSetConfidenceLevel() {
        return (this.confidenceLevel!= null);
    }

    /**
     * Obtient la valeur de la propriété vehicleLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure }
     *     
     */
    public LocationStructure getVehicleLocation() {
        return vehicleLocation;
    }

    /**
     * Définit la valeur de la propriété vehicleLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure }
     *     
     */
    public void setVehicleLocation(LocationStructure value) {
        this.vehicleLocation = value;
    }

    public boolean isSetVehicleLocation() {
        return (this.vehicleLocation!= null);
    }

    /**
     * Obtient la valeur de la propriété locationRecordedAtTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLocationRecordedAtTime() {
        return locationRecordedAtTime;
    }

    /**
     * Définit la valeur de la propriété locationRecordedAtTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLocationRecordedAtTime(XMLGregorianCalendar value) {
        this.locationRecordedAtTime = value;
    }

    public boolean isSetLocationRecordedAtTime() {
        return (this.locationRecordedAtTime!= null);
    }

    /**
     * Obtient la valeur de la propriété bearing.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBearing() {
        return bearing;
    }

    /**
     * Définit la valeur de la propriété bearing.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBearing(Float value) {
        this.bearing = value;
    }

    public boolean isSetBearing() {
        return (this.bearing!= null);
    }

    /**
     * Obtient la valeur de la propriété progressRate.
     * 
     * @return
     *     possible object is
     *     {@link ProgressRateEnumeration }
     *     
     */
    public ProgressRateEnumeration getProgressRate() {
        return progressRate;
    }

    /**
     * Définit la valeur de la propriété progressRate.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgressRateEnumeration }
     *     
     */
    public void setProgressRate(ProgressRateEnumeration value) {
        this.progressRate = value;
    }

    public boolean isSetProgressRate() {
        return (this.progressRate!= null);
    }

    /**
     * Obtient la valeur de la propriété velocity.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVelocity() {
        return velocity;
    }

    /**
     * Définit la valeur de la propriété velocity.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVelocity(BigInteger value) {
        this.velocity = value;
    }

    public boolean isSetVelocity() {
        return (this.velocity!= null);
    }

    /**
     * Obtient la valeur de la propriété engineOn.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEngineOn() {
        return engineOn;
    }

    /**
     * Définit la valeur de la propriété engineOn.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEngineOn(Boolean value) {
        this.engineOn = value;
    }

    public boolean isSetEngineOn() {
        return (this.engineOn!= null);
    }

    /**
     * Obtient la valeur de la propriété occupancy.
     * 
     * @return
     *     possible object is
     *     {@link OccupancyEnumeration }
     *     
     */
    public OccupancyEnumeration getOccupancy() {
        return occupancy;
    }

    /**
     * Définit la valeur de la propriété occupancy.
     * 
     * @param value
     *     allowed object is
     *     {@link OccupancyEnumeration }
     *     
     */
    public void setOccupancy(OccupancyEnumeration value) {
        this.occupancy = value;
    }

    public boolean isSetOccupancy() {
        return (this.occupancy!= null);
    }

    /**
     * Obtient la valeur de la propriété delay.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDelay() {
        return delay;
    }

    /**
     * Définit la valeur de la propriété delay.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDelay(Duration value) {
        this.delay = value;
    }

    public boolean isSetDelay() {
        return (this.delay!= null);
    }

    /**
     * Gets the value of the progressStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the progressStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProgressStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getProgressStatus() {
        if (progressStatus == null) {
            progressStatus = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.progressStatus;
    }

    public boolean isSetProgressStatus() {
        return ((this.progressStatus!= null)&&(!this.progressStatus.isEmpty()));
    }

    public void unsetProgressStatus() {
        this.progressStatus = null;
    }

    /**
     * Obtient la valeur de la propriété vehicleStatus.
     * 
     * @return
     *     possible object is
     *     {@link VehicleStatusEnumeration }
     *     
     */
    public VehicleStatusEnumeration getVehicleStatus() {
        return vehicleStatus;
    }

    /**
     * Définit la valeur de la propriété vehicleStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleStatusEnumeration }
     *     
     */
    public void setVehicleStatus(VehicleStatusEnumeration value) {
        this.vehicleStatus = value;
    }

    public boolean isSetVehicleStatus() {
        return (this.vehicleStatus!= null);
    }

    /**
     * Gets the value of the trainBlockPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trainBlockPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrainBlockPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrainBlockPartStructure }
     * 
     * 
     */
    public List<TrainBlockPartStructure> getTrainBlockPart() {
        if (trainBlockPart == null) {
            trainBlockPart = new ArrayList<TrainBlockPartStructure>();
        }
        return this.trainBlockPart;
    }

    public boolean isSetTrainBlockPart() {
        return ((this.trainBlockPart!= null)&&(!this.trainBlockPart.isEmpty()));
    }

    public void unsetTrainBlockPart() {
        this.trainBlockPart = null;
    }

    /**
     * Obtient la valeur de la propriété blockRef.
     * 
     * @return
     *     possible object is
     *     {@link BlockRefStructure }
     *     
     */
    public BlockRefStructure getBlockRef() {
        return blockRef;
    }

    /**
     * Définit la valeur de la propriété blockRef.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockRefStructure }
     *     
     */
    public void setBlockRef(BlockRefStructure value) {
        this.blockRef = value;
    }

    public boolean isSetBlockRef() {
        return (this.blockRef!= null);
    }

    /**
     * Obtient la valeur de la propriété courseOfJourneyRef.
     * 
     * @return
     *     possible object is
     *     {@link CourseOfJourneyRefStructure }
     *     
     */
    public CourseOfJourneyRefStructure getCourseOfJourneyRef() {
        return courseOfJourneyRef;
    }

    /**
     * Définit la valeur de la propriété courseOfJourneyRef.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseOfJourneyRefStructure }
     *     
     */
    public void setCourseOfJourneyRef(CourseOfJourneyRefStructure value) {
        this.courseOfJourneyRef = value;
    }

    public boolean isSetCourseOfJourneyRef() {
        return (this.courseOfJourneyRef!= null);
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
     * Gets the value of the additionalVehicleJourneyRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalVehicleJourneyRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalVehicleJourneyRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FramedVehicleJourneyRefStructure }
     * 
     * 
     */
    public List<FramedVehicleJourneyRefStructure> getAdditionalVehicleJourneyRef() {
        if (additionalVehicleJourneyRef == null) {
            additionalVehicleJourneyRef = new ArrayList<FramedVehicleJourneyRefStructure>();
        }
        return this.additionalVehicleJourneyRef;
    }

    public boolean isSetAdditionalVehicleJourneyRef() {
        return ((this.additionalVehicleJourneyRef!= null)&&(!this.additionalVehicleJourneyRef.isEmpty()));
    }

    public void unsetAdditionalVehicleJourneyRef() {
        this.additionalVehicleJourneyRef = null;
    }

    /**
     * Obtient la valeur de la propriété driverRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverRef() {
        return driverRef;
    }

    /**
     * Définit la valeur de la propriété driverRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverRef(String value) {
        this.driverRef = value;
    }

    public boolean isSetDriverRef() {
        return (this.driverRef!= null);
    }

    /**
     * Obtient la valeur de la propriété driverName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverName() {
        return driverName;
    }

    /**
     * Définit la valeur de la propriété driverName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverName(String value) {
        this.driverName = value;
    }

    public boolean isSetDriverName() {
        return (this.driverName!= null);
    }

    /**
     * Obtient la valeur de la propriété trainNumbers.
     * 
     * @return
     *     possible object is
     *     {@link MonitoredVehicleJourneyStructure.TrainNumbers }
     *     
     */
    public MonitoredVehicleJourneyStructure.TrainNumbers getTrainNumbers() {
        return trainNumbers;
    }

    /**
     * Définit la valeur de la propriété trainNumbers.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoredVehicleJourneyStructure.TrainNumbers }
     *     
     */
    public void setTrainNumbers(MonitoredVehicleJourneyStructure.TrainNumbers value) {
        this.trainNumbers = value;
    }

    public boolean isSetTrainNumbers() {
        return (this.trainNumbers!= null);
    }

    /**
     * Obtient la valeur de la propriété journeyParts.
     * 
     * @return
     *     possible object is
     *     {@link MonitoredVehicleJourneyStructure.JourneyParts }
     *     
     */
    public MonitoredVehicleJourneyStructure.JourneyParts getJourneyParts() {
        return journeyParts;
    }

    /**
     * Définit la valeur de la propriété journeyParts.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoredVehicleJourneyStructure.JourneyParts }
     *     
     */
    public void setJourneyParts(MonitoredVehicleJourneyStructure.JourneyParts value) {
        this.journeyParts = value;
    }

    public boolean isSetJourneyParts() {
        return (this.journeyParts!= null);
    }

    /**
     * Obtient la valeur de la propriété previousCalls.
     * 
     * @return
     *     possible object is
     *     {@link PreviousCallsStructure }
     *     
     */
    public PreviousCallsStructure getPreviousCalls() {
        return previousCalls;
    }

    /**
     * Définit la valeur de la propriété previousCalls.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousCallsStructure }
     *     
     */
    public void setPreviousCalls(PreviousCallsStructure value) {
        this.previousCalls = value;
    }

    public boolean isSetPreviousCalls() {
        return (this.previousCalls!= null);
    }

    /**
     * Obtient la valeur de la propriété monitoredCall.
     * 
     * @return
     *     possible object is
     *     {@link MonitoredCallStructure }
     *     
     */
    public MonitoredCallStructure getMonitoredCall() {
        return monitoredCall;
    }

    /**
     * Définit la valeur de la propriété monitoredCall.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoredCallStructure }
     *     
     */
    public void setMonitoredCall(MonitoredCallStructure value) {
        this.monitoredCall = value;
    }

    public boolean isSetMonitoredCall() {
        return (this.monitoredCall!= null);
    }

    /**
     * Obtient la valeur de la propriété onwardCalls.
     * 
     * @return
     *     possible object is
     *     {@link OnwardCallsStructure }
     *     
     */
    public OnwardCallsStructure getOnwardCalls() {
        return onwardCalls;
    }

    /**
     * Définit la valeur de la propriété onwardCalls.
     * 
     * @param value
     *     allowed object is
     *     {@link OnwardCallsStructure }
     *     
     */
    public void setOnwardCalls(OnwardCallsStructure value) {
        this.onwardCalls = value;
    }

    public boolean isSetOnwardCalls() {
        return (this.onwardCalls!= null);
    }

    /**
     * Obtient la valeur de la propriété isCompleteStopSequence.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCompleteStopSequence() {
        return isCompleteStopSequence;
    }

    /**
     * Définit la valeur de la propriété isCompleteStopSequence.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCompleteStopSequence(Boolean value) {
        this.isCompleteStopSequence = value;
    }

    public boolean isSetIsCompleteStopSequence() {
        return (this.isCompleteStopSequence!= null);
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="JourneyPartInfo" type="{http://www.siri.org.uk/siri}JourneyPartInfoStructure" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "journeyPartInfo"
    })
    public static class JourneyParts
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "JourneyPartInfo", required = true)
        protected List<JourneyPartInfoStructure> journeyPartInfo;

        /**
         * Gets the value of the journeyPartInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the journeyPartInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getJourneyPartInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JourneyPartInfoStructure }
         * 
         * 
         */
        public List<JourneyPartInfoStructure> getJourneyPartInfo() {
            if (journeyPartInfo == null) {
                journeyPartInfo = new ArrayList<JourneyPartInfoStructure>();
            }
            return this.journeyPartInfo;
        }

        public boolean isSetJourneyPartInfo() {
            return ((this.journeyPartInfo!= null)&&(!this.journeyPartInfo.isEmpty()));
        }

        public void unsetJourneyPartInfo() {
            this.journeyPartInfo = null;
        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="TrainNumberRef" type="{http://www.siri.org.uk/siri}TrainNumberRefStructure" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "trainNumberRef"
    })
    public static class TrainNumbers
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "TrainNumberRef", required = true)
        protected List<TrainNumberRefStructure> trainNumberRef;

        /**
         * Gets the value of the trainNumberRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the trainNumberRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTrainNumberRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TrainNumberRefStructure }
         * 
         * 
         */
        public List<TrainNumberRefStructure> getTrainNumberRef() {
            if (trainNumberRef == null) {
                trainNumberRef = new ArrayList<TrainNumberRefStructure>();
            }
            return this.trainNumberRef;
        }

        public boolean isSetTrainNumberRef() {
            return ((this.trainNumberRef!= null)&&(!this.trainNumberRef.isEmpty()));
        }

        public void unsetTrainNumberRef() {
            this.trainNumberRef = null;
        }

    }

}
