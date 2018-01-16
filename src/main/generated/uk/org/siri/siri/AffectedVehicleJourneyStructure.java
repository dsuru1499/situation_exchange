
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
import uk.org.ifopt.acsb.AccessibilityAssessmentStructure;


/**
 * Type for information about a VEHICLE JOURNEY affected by a SITUATION.
 * 
 * <p>Classe Java pour AffectedVehicleJourneyStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AffectedVehicleJourneyStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="FramedVehicleJourneyRef" type="{http://www.siri.org.uk/siri}FramedVehicleJourneyRefStructure"/>
 *           &lt;element name="VehicleJourneyRef" type="{http://www.siri.org.uk/siri}VehicleJourneyRefStructure" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;element name="DatedVehicleJourneyRef" type="{http://www.siri.org.uk/siri}DatedVehicleJourneyRefStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="JourneyName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Operator" type="{http://www.siri.org.uk/siri}AffectedOperatorStructure" minOccurs="0"/>
 *         &lt;element name="LineRef" type="{http://www.siri.org.uk/siri}LineRefStructure" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}PublishedLineName" minOccurs="0"/>
 *         &lt;element name="DirectionRef" type="{http://www.siri.org.uk/siri}DirectionRefStructure" minOccurs="0"/>
 *         &lt;element name="BlockRef" type="{http://www.siri.org.uk/siri}BlockRefStructure" minOccurs="0"/>
 *         &lt;element name="TrainNumbers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TrainNumberRef" type="{http://www.siri.org.uk/siri}TrainNumberRefStructure" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="JourneyParts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="JourneyPartInfo" type="{http://www.siri.org.uk/siri}JourneyPartInfoStructure" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Origins" type="{http://www.siri.org.uk/siri}AffectedStopPointStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Destinations" type="{http://www.siri.org.uk/siri}AffectedStopPointStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Route" type="{http://www.siri.org.uk/siri}AffectedRouteStructure" maxOccurs="unbounded"/>
 *         &lt;element name="OriginAimedDepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DestinationAimedArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OriginDisplayAtDestination" type="{http://www.siri.org.uk/siri}NaturalLanguagePlaceNameStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DestinationDisplayAtOrigin" type="{http://www.siri.org.uk/siri}NaturalLanguagePlaceNameStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AccessibilityAssessment" type="{http://www.ifopt.org.uk/acsb}AccessibilityAssessmentStructure" minOccurs="0"/>
 *         &lt;element name="JourneyCondition" type="{http://www.siri.org.uk/siri}ServiceConditionEnumeration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Calls" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Call" type="{http://www.siri.org.uk/siri}AffectedCallStructure" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Facilities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AffectedFacility" type="{http://www.siri.org.uk/siri}AffectedFacilityStructure" maxOccurs="unbounded"/>
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
@XmlType(name = "AffectedVehicleJourneyStructure", propOrder = {
    "framedVehicleJourneyRef",
    "vehicleJourneyRef",
    "datedVehicleJourneyRef",
    "journeyName",
    "operator",
    "lineRef",
    "publishedLineName",
    "directionRef",
    "blockRef",
    "trainNumbers",
    "journeyParts",
    "origins",
    "destinations",
    "route",
    "originAimedDepartureTime",
    "destinationAimedArrivalTime",
    "originDisplayAtDestination",
    "destinationDisplayAtOrigin",
    "accessibilityAssessment",
    "journeyCondition",
    "calls",
    "facilities",
    "extensions"
})
public class AffectedVehicleJourneyStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "FramedVehicleJourneyRef")
    protected FramedVehicleJourneyRefStructure framedVehicleJourneyRef;
    @XmlElement(name = "VehicleJourneyRef")
    protected List<VehicleJourneyRefStructure> vehicleJourneyRef;
    @XmlElement(name = "DatedVehicleJourneyRef")
    protected List<DatedVehicleJourneyRefStructure> datedVehicleJourneyRef;
    @XmlElement(name = "JourneyName")
    protected List<NaturalLanguageStringStructure> journeyName;
    @XmlElement(name = "Operator")
    protected AffectedOperatorStructure operator;
    @XmlElement(name = "LineRef")
    protected LineRefStructure lineRef;
    @XmlElement(name = "PublishedLineName")
    protected NaturalLanguageStringStructure publishedLineName;
    @XmlElement(name = "DirectionRef")
    protected DirectionRefStructure directionRef;
    @XmlElement(name = "BlockRef")
    protected BlockRefStructure blockRef;
    @XmlElement(name = "TrainNumbers")
    protected AffectedVehicleJourneyStructure.TrainNumbers trainNumbers;
    @XmlElement(name = "JourneyParts")
    protected AffectedVehicleJourneyStructure.JourneyParts journeyParts;
    @XmlElement(name = "Origins")
    protected List<AffectedStopPointStructure> origins;
    @XmlElement(name = "Destinations")
    protected List<AffectedStopPointStructure> destinations;
    @XmlElement(name = "Route", required = true)
    protected List<AffectedRouteStructure> route;
    @XmlElement(name = "OriginAimedDepartureTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar originAimedDepartureTime;
    @XmlElement(name = "DestinationAimedArrivalTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar destinationAimedArrivalTime;
    @XmlElement(name = "OriginDisplayAtDestination")
    protected List<NaturalLanguagePlaceNameStructure> originDisplayAtDestination;
    @XmlElement(name = "DestinationDisplayAtOrigin")
    protected List<NaturalLanguagePlaceNameStructure> destinationDisplayAtOrigin;
    @XmlElement(name = "AccessibilityAssessment")
    protected AccessibilityAssessmentStructure accessibilityAssessment;
    @XmlElement(name = "JourneyCondition")
    protected List<ServiceConditionEnumeration> journeyCondition;
    @XmlElement(name = "Calls")
    protected AffectedVehicleJourneyStructure.Calls calls;
    @XmlElement(name = "Facilities")
    protected AffectedVehicleJourneyStructure.Facilities facilities;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

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
     * Gets the value of the vehicleJourneyRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleJourneyRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleJourneyRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleJourneyRefStructure }
     * 
     * 
     */
    public List<VehicleJourneyRefStructure> getVehicleJourneyRef() {
        if (vehicleJourneyRef == null) {
            vehicleJourneyRef = new ArrayList<VehicleJourneyRefStructure>();
        }
        return this.vehicleJourneyRef;
    }

    public boolean isSetVehicleJourneyRef() {
        return ((this.vehicleJourneyRef!= null)&&(!this.vehicleJourneyRef.isEmpty()));
    }

    public void unsetVehicleJourneyRef() {
        this.vehicleJourneyRef = null;
    }

    /**
     * Gets the value of the datedVehicleJourneyRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datedVehicleJourneyRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatedVehicleJourneyRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatedVehicleJourneyRefStructure }
     * 
     * 
     */
    public List<DatedVehicleJourneyRefStructure> getDatedVehicleJourneyRef() {
        if (datedVehicleJourneyRef == null) {
            datedVehicleJourneyRef = new ArrayList<DatedVehicleJourneyRefStructure>();
        }
        return this.datedVehicleJourneyRef;
    }

    public boolean isSetDatedVehicleJourneyRef() {
        return ((this.datedVehicleJourneyRef!= null)&&(!this.datedVehicleJourneyRef.isEmpty()));
    }

    public void unsetDatedVehicleJourneyRef() {
        this.datedVehicleJourneyRef = null;
    }

    /**
     * Gets the value of the journeyName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journeyName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJourneyName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getJourneyName() {
        if (journeyName == null) {
            journeyName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.journeyName;
    }

    public boolean isSetJourneyName() {
        return ((this.journeyName!= null)&&(!this.journeyName.isEmpty()));
    }

    public void unsetJourneyName() {
        this.journeyName = null;
    }

    /**
     * Obtient la valeur de la propriété operator.
     * 
     * @return
     *     possible object is
     *     {@link AffectedOperatorStructure }
     *     
     */
    public AffectedOperatorStructure getOperator() {
        return operator;
    }

    /**
     * Définit la valeur de la propriété operator.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedOperatorStructure }
     *     
     */
    public void setOperator(AffectedOperatorStructure value) {
        this.operator = value;
    }

    public boolean isSetOperator() {
        return (this.operator!= null);
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
     * Obtient la valeur de la propriété publishedLineName.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getPublishedLineName() {
        return publishedLineName;
    }

    /**
     * Définit la valeur de la propriété publishedLineName.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setPublishedLineName(NaturalLanguageStringStructure value) {
        this.publishedLineName = value;
    }

    public boolean isSetPublishedLineName() {
        return (this.publishedLineName!= null);
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
     * Obtient la valeur de la propriété trainNumbers.
     * 
     * @return
     *     possible object is
     *     {@link AffectedVehicleJourneyStructure.TrainNumbers }
     *     
     */
    public AffectedVehicleJourneyStructure.TrainNumbers getTrainNumbers() {
        return trainNumbers;
    }

    /**
     * Définit la valeur de la propriété trainNumbers.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedVehicleJourneyStructure.TrainNumbers }
     *     
     */
    public void setTrainNumbers(AffectedVehicleJourneyStructure.TrainNumbers value) {
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
     *     {@link AffectedVehicleJourneyStructure.JourneyParts }
     *     
     */
    public AffectedVehicleJourneyStructure.JourneyParts getJourneyParts() {
        return journeyParts;
    }

    /**
     * Définit la valeur de la propriété journeyParts.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedVehicleJourneyStructure.JourneyParts }
     *     
     */
    public void setJourneyParts(AffectedVehicleJourneyStructure.JourneyParts value) {
        this.journeyParts = value;
    }

    public boolean isSetJourneyParts() {
        return (this.journeyParts!= null);
    }

    /**
     * Gets the value of the origins property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the origins property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrigins().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedStopPointStructure }
     * 
     * 
     */
    public List<AffectedStopPointStructure> getOrigins() {
        if (origins == null) {
            origins = new ArrayList<AffectedStopPointStructure>();
        }
        return this.origins;
    }

    public boolean isSetOrigins() {
        return ((this.origins!= null)&&(!this.origins.isEmpty()));
    }

    public void unsetOrigins() {
        this.origins = null;
    }

    /**
     * Gets the value of the destinations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedStopPointStructure }
     * 
     * 
     */
    public List<AffectedStopPointStructure> getDestinations() {
        if (destinations == null) {
            destinations = new ArrayList<AffectedStopPointStructure>();
        }
        return this.destinations;
    }

    public boolean isSetDestinations() {
        return ((this.destinations!= null)&&(!this.destinations.isEmpty()));
    }

    public void unsetDestinations() {
        this.destinations = null;
    }

    /**
     * Gets the value of the route property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the route property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedRouteStructure }
     * 
     * 
     */
    public List<AffectedRouteStructure> getRoute() {
        if (route == null) {
            route = new ArrayList<AffectedRouteStructure>();
        }
        return this.route;
    }

    public boolean isSetRoute() {
        return ((this.route!= null)&&(!this.route.isEmpty()));
    }

    public void unsetRoute() {
        this.route = null;
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
     * Obtient la valeur de la propriété accessibilityAssessment.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityAssessmentStructure }
     *     
     */
    public AccessibilityAssessmentStructure getAccessibilityAssessment() {
        return accessibilityAssessment;
    }

    /**
     * Définit la valeur de la propriété accessibilityAssessment.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityAssessmentStructure }
     *     
     */
    public void setAccessibilityAssessment(AccessibilityAssessmentStructure value) {
        this.accessibilityAssessment = value;
    }

    public boolean isSetAccessibilityAssessment() {
        return (this.accessibilityAssessment!= null);
    }

    /**
     * Gets the value of the journeyCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journeyCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJourneyCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceConditionEnumeration }
     * 
     * 
     */
    public List<ServiceConditionEnumeration> getJourneyCondition() {
        if (journeyCondition == null) {
            journeyCondition = new ArrayList<ServiceConditionEnumeration>();
        }
        return this.journeyCondition;
    }

    public boolean isSetJourneyCondition() {
        return ((this.journeyCondition!= null)&&(!this.journeyCondition.isEmpty()));
    }

    public void unsetJourneyCondition() {
        this.journeyCondition = null;
    }

    /**
     * Obtient la valeur de la propriété calls.
     * 
     * @return
     *     possible object is
     *     {@link AffectedVehicleJourneyStructure.Calls }
     *     
     */
    public AffectedVehicleJourneyStructure.Calls getCalls() {
        return calls;
    }

    /**
     * Définit la valeur de la propriété calls.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedVehicleJourneyStructure.Calls }
     *     
     */
    public void setCalls(AffectedVehicleJourneyStructure.Calls value) {
        this.calls = value;
    }

    public boolean isSetCalls() {
        return (this.calls!= null);
    }

    /**
     * Obtient la valeur de la propriété facilities.
     * 
     * @return
     *     possible object is
     *     {@link AffectedVehicleJourneyStructure.Facilities }
     *     
     */
    public AffectedVehicleJourneyStructure.Facilities getFacilities() {
        return facilities;
    }

    /**
     * Définit la valeur de la propriété facilities.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedVehicleJourneyStructure.Facilities }
     *     
     */
    public void setFacilities(AffectedVehicleJourneyStructure.Facilities value) {
        this.facilities = value;
    }

    public boolean isSetFacilities() {
        return (this.facilities!= null);
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
     *         &lt;element name="Call" type="{http://www.siri.org.uk/siri}AffectedCallStructure" maxOccurs="unbounded"/>
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
        "call"
    })
    public static class Calls
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "Call", required = true)
        protected List<AffectedCallStructure> call;

        /**
         * Gets the value of the call property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the call property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCall().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedCallStructure }
         * 
         * 
         */
        public List<AffectedCallStructure> getCall() {
            if (call == null) {
                call = new ArrayList<AffectedCallStructure>();
            }
            return this.call;
        }

        public boolean isSetCall() {
            return ((this.call!= null)&&(!this.call.isEmpty()));
        }

        public void unsetCall() {
            this.call = null;
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
     *         &lt;element name="AffectedFacility" type="{http://www.siri.org.uk/siri}AffectedFacilityStructure" maxOccurs="unbounded"/>
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
        "affectedFacility"
    })
    public static class Facilities
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "AffectedFacility", required = true)
        protected List<AffectedFacilityStructure> affectedFacility;

        /**
         * Gets the value of the affectedFacility property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the affectedFacility property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedFacility().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedFacilityStructure }
         * 
         * 
         */
        public List<AffectedFacilityStructure> getAffectedFacility() {
            if (affectedFacility == null) {
                affectedFacility = new ArrayList<AffectedFacilityStructure>();
            }
            return this.affectedFacility;
        }

        public boolean isSetAffectedFacility() {
            return ((this.affectedFacility!= null)&&(!this.affectedFacility.isEmpty()));
        }

        public void unsetAffectedFacility() {
            this.affectedFacility = null;
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
