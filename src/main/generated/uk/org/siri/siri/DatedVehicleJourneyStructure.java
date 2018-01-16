
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for Planned VEHICLE JOURNEY (Production Timetable Service).
 * 
 * <p>Classe Java pour DatedVehicleJourneyStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DatedVehicleJourneyStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatedVehicleJourneyCode" type="{http://www.siri.org.uk/siri}DatedVehicleJourneyCodeType" minOccurs="0"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}TimetableAlterationGroup" minOccurs="0"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}JourneyPatternInfoGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ServiceInfoGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}JourneyInfoGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}DatedServiceInfoGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}TimetableRealtimeInfoGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}OperationalBlockGroup" minOccurs="0"/>
 *         &lt;element name="DatedCalls">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.siri.org.uk/siri}DatedCall" maxOccurs="unbounded" minOccurs="2"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatedVehicleJourneyStructure", propOrder = {
    "datedVehicleJourneyCode",
    "framedVehicleJourneyRef",
    "vehicleJourneyRef",
    "extraJourney",
    "cancellation",
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
    "vehicleJourneyName",
    "journeyNote",
    "publicContact",
    "operationsContact",
    "originDisplay",
    "destinationDisplay",
    "lineNote",
    "firstOrLastJourney",
    "headwayService",
    "monitored",
    "blockRef",
    "courseOfJourneyRef",
    "datedCalls",
    "extensions"
})
public class DatedVehicleJourneyStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DatedVehicleJourneyCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String datedVehicleJourneyCode;
    @XmlElement(name = "FramedVehicleJourneyRef")
    protected FramedVehicleJourneyRefStructure framedVehicleJourneyRef;
    @XmlElement(name = "VehicleJourneyRef")
    protected VehicleJourneyRefStructure vehicleJourneyRef;
    @XmlElement(name = "ExtraJourney", defaultValue = "false")
    protected Boolean extraJourney;
    @XmlElement(name = "Cancellation", defaultValue = "false")
    protected Boolean cancellation;
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
    @XmlElement(name = "VehicleJourneyName")
    protected List<NaturalLanguageStringStructure> vehicleJourneyName;
    @XmlElement(name = "JourneyNote")
    protected List<NaturalLanguageStringStructure> journeyNote;
    @XmlElement(name = "PublicContact")
    protected SimpleContactStructure publicContact;
    @XmlElement(name = "OperationsContact")
    protected SimpleContactStructure operationsContact;
    @XmlElement(name = "OriginDisplay")
    protected List<NaturalLanguageStringStructure> originDisplay;
    @XmlElement(name = "DestinationDisplay")
    protected List<NaturalLanguageStringStructure> destinationDisplay;
    @XmlElement(name = "LineNote")
    protected List<NaturalLanguagePlaceNameStructure> lineNote;
    @XmlElement(name = "FirstOrLastJourney", defaultValue = "unspecified")
    protected FirstOrLastJourneyEnumeration firstOrLastJourney;
    @XmlElement(name = "HeadwayService")
    protected Boolean headwayService;
    @XmlElement(name = "Monitored", defaultValue = "true")
    protected Boolean monitored;
    @XmlElement(name = "BlockRef")
    protected BlockRefStructure blockRef;
    @XmlElement(name = "CourseOfJourneyRef")
    protected CourseOfJourneyRefStructure courseOfJourneyRef;
    @XmlElement(name = "DatedCalls", required = true)
    protected DatedVehicleJourneyStructure.DatedCalls datedCalls;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété datedVehicleJourneyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatedVehicleJourneyCode() {
        return datedVehicleJourneyCode;
    }

    /**
     * Définit la valeur de la propriété datedVehicleJourneyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatedVehicleJourneyCode(String value) {
        this.datedVehicleJourneyCode = value;
    }

    public boolean isSetDatedVehicleJourneyCode() {
        return (this.datedVehicleJourneyCode!= null);
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
     * Obtient la valeur de la propriété extraJourney.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtraJourney() {
        return extraJourney;
    }

    /**
     * Définit la valeur de la propriété extraJourney.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtraJourney(Boolean value) {
        this.extraJourney = value;
    }

    public boolean isSetExtraJourney() {
        return (this.extraJourney!= null);
    }

    /**
     * Obtient la valeur de la propriété cancellation.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancellation() {
        return cancellation;
    }

    /**
     * Définit la valeur de la propriété cancellation.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancellation(Boolean value) {
        this.cancellation = value;
    }

    public boolean isSetCancellation() {
        return (this.cancellation!= null);
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
     * Gets the value of the originDisplay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDisplay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDisplay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getOriginDisplay() {
        if (originDisplay == null) {
            originDisplay = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.originDisplay;
    }

    public boolean isSetOriginDisplay() {
        return ((this.originDisplay!= null)&&(!this.originDisplay.isEmpty()));
    }

    public void unsetOriginDisplay() {
        this.originDisplay = null;
    }

    /**
     * Gets the value of the destinationDisplay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinationDisplay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationDisplay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getDestinationDisplay() {
        if (destinationDisplay == null) {
            destinationDisplay = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.destinationDisplay;
    }

    public boolean isSetDestinationDisplay() {
        return ((this.destinationDisplay!= null)&&(!this.destinationDisplay.isEmpty()));
    }

    public void unsetDestinationDisplay() {
        this.destinationDisplay = null;
    }

    /**
     * Gets the value of the lineNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguagePlaceNameStructure }
     * 
     * 
     */
    public List<NaturalLanguagePlaceNameStructure> getLineNote() {
        if (lineNote == null) {
            lineNote = new ArrayList<NaturalLanguagePlaceNameStructure>();
        }
        return this.lineNote;
    }

    public boolean isSetLineNote() {
        return ((this.lineNote!= null)&&(!this.lineNote.isEmpty()));
    }

    public void unsetLineNote() {
        this.lineNote = null;
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
     * Obtient la valeur de la propriété datedCalls.
     * 
     * @return
     *     possible object is
     *     {@link DatedVehicleJourneyStructure.DatedCalls }
     *     
     */
    public DatedVehicleJourneyStructure.DatedCalls getDatedCalls() {
        return datedCalls;
    }

    /**
     * Définit la valeur de la propriété datedCalls.
     * 
     * @param value
     *     allowed object is
     *     {@link DatedVehicleJourneyStructure.DatedCalls }
     *     
     */
    public void setDatedCalls(DatedVehicleJourneyStructure.DatedCalls value) {
        this.datedCalls = value;
    }

    public boolean isSetDatedCalls() {
        return (this.datedCalls!= null);
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.siri.org.uk/siri}DatedCall" maxOccurs="unbounded" minOccurs="2"/>
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
        "datedCall"
    })
    public static class DatedCalls
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "DatedCall", required = true)
        protected List<DatedCallStructure> datedCall;

        /**
         * Gets the value of the datedCall property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the datedCall property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDatedCall().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DatedCallStructure }
         * 
         * 
         */
        public List<DatedCallStructure> getDatedCall() {
            if (datedCall == null) {
                datedCall = new ArrayList<DatedCallStructure>();
            }
            return this.datedCall;
        }

        public boolean isSetDatedCall() {
            return ((this.datedCall!= null)&&(!this.datedCall.isEmpty()));
        }

        public void unsetDatedCall() {
            this.datedCall = null;
        }

    }

}
