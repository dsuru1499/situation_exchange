
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
 * Type for a targeted VEHICLE JOURNEY.
 * 
 * <p>Classe Java pour TargetedVehicleJourneyStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TargetedVehicleJourneyStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}JourneyIdentityGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}JourneyPatternInfoGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}VehicleJourneyInfoGroup"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}TargetedCall" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetedVehicleJourneyStructure", propOrder = {
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
    "targetedCall"
})
public class TargetedVehicleJourneyStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "LineRef", required = true)
    protected LineRefStructure lineRef;
    @XmlElement(name = "DirectionRef", required = true)
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
    @XmlElement(name = "TargetedCall")
    protected TargetedCallStructure targetedCall;

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
     * Obtient la valeur de la propriété targetedCall.
     * 
     * @return
     *     possible object is
     *     {@link TargetedCallStructure }
     *     
     */
    public TargetedCallStructure getTargetedCall() {
        return targetedCall;
    }

    /**
     * Définit la valeur de la propriété targetedCall.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetedCallStructure }
     *     
     */
    public void setTargetedCall(TargetedCallStructure value) {
        this.targetedCall = value;
    }

    public boolean isSetTargetedCall() {
        return (this.targetedCall!= null);
    }

}
