
package uk.org.siri.siri;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for Rea-ltime info about a VEHICLE JOURNEY Stop.
 * 
 * <p>Classe Java pour EstimatedCallStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EstimatedCallStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}StopPointInSequenceGroup"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="ExtraCall" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           &lt;element name="Cancellation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;group ref="{http://www.siri.org.uk/siri}CallRealTimeInfoGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}CallPropertyGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}CallNoteGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}DisruptionGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}OnwardsCallGroup"/>
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
@XmlType(name = "EstimatedCallStructure", propOrder = {
    "stopPointRef",
    "visitNumber",
    "order",
    "stopPointName",
    "extraCall",
    "cancellation",
    "predictionInaccurate",
    "occupancy",
    "timingPoint",
    "boardingStretch",
    "requestStop",
    "originDisplay",
    "destinationDisplay",
    "callNote",
    "facilityConditionElement",
    "facilityChangeElement",
    "situationRef",
    "aimedArrivalTime",
    "expectedArrivalTime",
    "expectedArrivalPredictionQuality",
    "arrivalStatus",
    "arrivalProximityText",
    "arrivalPlatformName",
    "arrivalBoardingActivity",
    "arrivalStopAssignment",
    "arrivalOperatorRefs",
    "aimedDepartureTime",
    "expectedDepartureTime",
    "provisionalExpectedDepartureTime",
    "earliestExpectedDepartureTime",
    "expectedDeparturePredictionQuality",
    "aimedLatestPassengerAccessTime",
    "expectedLatestPassengerAccessTime",
    "departureStatus",
    "departureProximityText",
    "departurePlatformName",
    "departureBoardingActivity",
    "departureStopAssignment",
    "departureOperatorRefs",
    "aimedHeadwayInterval",
    "expectedHeadwayInterval",
    "distanceFromStop",
    "numberOfStopsAway",
    "extensions"
})
public class EstimatedCallStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "StopPointRef", required = true)
    protected StopPointRefStructure stopPointRef;
    @XmlElement(name = "VisitNumber")
    protected BigInteger visitNumber;
    @XmlElement(name = "Order")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;
    @XmlElement(name = "StopPointName")
    protected List<NaturalLanguageStringStructure> stopPointName;
    @XmlElement(name = "ExtraCall")
    protected Boolean extraCall;
    @XmlElement(name = "Cancellation")
    protected Boolean cancellation;
    @XmlElement(name = "PredictionInaccurate")
    protected Boolean predictionInaccurate;
    @XmlElement(name = "Occupancy")
    protected OccupancyEnumeration occupancy;
    @XmlElement(name = "TimingPoint", defaultValue = "true")
    protected Boolean timingPoint;
    @XmlElement(name = "BoardingStretch", defaultValue = "false")
    protected Boolean boardingStretch;
    @XmlElement(name = "RequestStop", defaultValue = "false")
    protected Boolean requestStop;
    @XmlElement(name = "OriginDisplay")
    protected List<NaturalLanguageStringStructure> originDisplay;
    @XmlElement(name = "DestinationDisplay")
    protected List<NaturalLanguageStringStructure> destinationDisplay;
    @XmlElement(name = "CallNote")
    protected List<NaturalLanguageStringStructure> callNote;
    @XmlElement(name = "FacilityConditionElement")
    protected List<FacilityConditionStructure> facilityConditionElement;
    @XmlElement(name = "FacilityChangeElement")
    protected FacilityChangeStructure facilityChangeElement;
    @XmlElement(name = "SituationRef")
    protected List<SituationRefStructure> situationRef;
    @XmlElement(name = "AimedArrivalTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar aimedArrivalTime;
    @XmlElement(name = "ExpectedArrivalTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedArrivalTime;
    @XmlElement(name = "ExpectedArrivalPredictionQuality")
    protected PredictionQualityStructure expectedArrivalPredictionQuality;
    @XmlElement(name = "ArrivalStatus")
    protected CallStatusEnumeration arrivalStatus;
    @XmlElement(name = "ArrivalProximityText")
    protected NaturalLanguageStringStructure arrivalProximityText;
    @XmlElement(name = "ArrivalPlatformName")
    protected NaturalLanguageStringStructure arrivalPlatformName;
    @XmlElement(name = "ArrivalBoardingActivity", defaultValue = "alighting")
    protected ArrivalBoardingActivityEnumeration arrivalBoardingActivity;
    @XmlElement(name = "ArrivalStopAssignment")
    protected StopAssignmentStructure arrivalStopAssignment;
    @XmlElement(name = "ArrivalOperatorRefs")
    protected List<OperatorRefStructure> arrivalOperatorRefs;
    @XmlElement(name = "AimedDepartureTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar aimedDepartureTime;
    @XmlElement(name = "ExpectedDepartureTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedDepartureTime;
    @XmlElement(name = "ProvisionalExpectedDepartureTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar provisionalExpectedDepartureTime;
    @XmlElement(name = "EarliestExpectedDepartureTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar earliestExpectedDepartureTime;
    @XmlElement(name = "ExpectedDeparturePredictionQuality")
    protected PredictionQualityStructure expectedDeparturePredictionQuality;
    @XmlElement(name = "AimedLatestPassengerAccessTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar aimedLatestPassengerAccessTime;
    @XmlElement(name = "ExpectedLatestPassengerAccessTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedLatestPassengerAccessTime;
    @XmlElement(name = "DepartureStatus")
    protected CallStatusEnumeration departureStatus;
    @XmlElement(name = "DepartureProximityText")
    protected NaturalLanguageStringStructure departureProximityText;
    @XmlElement(name = "DeparturePlatformName")
    protected NaturalLanguageStringStructure departurePlatformName;
    @XmlElement(name = "DepartureBoardingActivity", defaultValue = "boarding")
    protected DepartureBoardingActivityEnumeration departureBoardingActivity;
    @XmlElement(name = "DepartureStopAssignment")
    protected StopAssignmentStructure departureStopAssignment;
    @XmlElement(name = "DepartureOperatorRefs")
    protected List<OperatorRefStructure> departureOperatorRefs;
    @XmlElement(name = "AimedHeadwayInterval")
    protected Duration aimedHeadwayInterval;
    @XmlElement(name = "ExpectedHeadwayInterval")
    protected Duration expectedHeadwayInterval;
    @XmlElement(name = "DistanceFromStop")
    protected BigInteger distanceFromStop;
    @XmlElement(name = "NumberOfStopsAway")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfStopsAway;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

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
     * Obtient la valeur de la propriété visitNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVisitNumber() {
        return visitNumber;
    }

    /**
     * Définit la valeur de la propriété visitNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVisitNumber(BigInteger value) {
        this.visitNumber = value;
    }

    public boolean isSetVisitNumber() {
        return (this.visitNumber!= null);
    }

    /**
     * Obtient la valeur de la propriété order.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Définit la valeur de la propriété order.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

    public boolean isSetOrder() {
        return (this.order!= null);
    }

    /**
     * Name of SCHEDULED STOP POINT.  (Unbounded since SIRI 2.0) Gets the value of the stopPointName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopPointName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopPointName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getStopPointName() {
        if (stopPointName == null) {
            stopPointName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.stopPointName;
    }

    public boolean isSetStopPointName() {
        return ((this.stopPointName!= null)&&(!this.stopPointName.isEmpty()));
    }

    public void unsetStopPointName() {
        this.stopPointName = null;
    }

    /**
     * Obtient la valeur de la propriété extraCall.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtraCall() {
        return extraCall;
    }

    /**
     * Définit la valeur de la propriété extraCall.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtraCall(Boolean value) {
        this.extraCall = value;
    }

    public boolean isSetExtraCall() {
        return (this.extraCall!= null);
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
     * Obtient la valeur de la propriété timingPoint.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimingPoint() {
        return timingPoint;
    }

    /**
     * Définit la valeur de la propriété timingPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimingPoint(Boolean value) {
        this.timingPoint = value;
    }

    public boolean isSetTimingPoint() {
        return (this.timingPoint!= null);
    }

    /**
     * Obtient la valeur de la propriété boardingStretch.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBoardingStretch() {
        return boardingStretch;
    }

    /**
     * Définit la valeur de la propriété boardingStretch.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBoardingStretch(Boolean value) {
        this.boardingStretch = value;
    }

    public boolean isSetBoardingStretch() {
        return (this.boardingStretch!= null);
    }

    /**
     * Obtient la valeur de la propriété requestStop.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequestStop() {
        return requestStop;
    }

    /**
     * Définit la valeur de la propriété requestStop.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestStop(Boolean value) {
        this.requestStop = value;
    }

    public boolean isSetRequestStop() {
        return (this.requestStop!= null);
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
     * Gets the value of the callNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getCallNote() {
        if (callNote == null) {
            callNote = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.callNote;
    }

    public boolean isSetCallNote() {
        return ((this.callNote!= null)&&(!this.callNote.isEmpty()));
    }

    public void unsetCallNote() {
        this.callNote = null;
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
     * Obtient la valeur de la propriété aimedArrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAimedArrivalTime() {
        return aimedArrivalTime;
    }

    /**
     * Définit la valeur de la propriété aimedArrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAimedArrivalTime(XMLGregorianCalendar value) {
        this.aimedArrivalTime = value;
    }

    public boolean isSetAimedArrivalTime() {
        return (this.aimedArrivalTime!= null);
    }

    /**
     * Obtient la valeur de la propriété expectedArrivalTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedArrivalTime() {
        return expectedArrivalTime;
    }

    /**
     * Définit la valeur de la propriété expectedArrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedArrivalTime(XMLGregorianCalendar value) {
        this.expectedArrivalTime = value;
    }

    public boolean isSetExpectedArrivalTime() {
        return (this.expectedArrivalTime!= null);
    }

    /**
     * Obtient la valeur de la propriété expectedArrivalPredictionQuality.
     * 
     * @return
     *     possible object is
     *     {@link PredictionQualityStructure }
     *     
     */
    public PredictionQualityStructure getExpectedArrivalPredictionQuality() {
        return expectedArrivalPredictionQuality;
    }

    /**
     * Définit la valeur de la propriété expectedArrivalPredictionQuality.
     * 
     * @param value
     *     allowed object is
     *     {@link PredictionQualityStructure }
     *     
     */
    public void setExpectedArrivalPredictionQuality(PredictionQualityStructure value) {
        this.expectedArrivalPredictionQuality = value;
    }

    public boolean isSetExpectedArrivalPredictionQuality() {
        return (this.expectedArrivalPredictionQuality!= null);
    }

    /**
     * Obtient la valeur de la propriété arrivalStatus.
     * 
     * @return
     *     possible object is
     *     {@link CallStatusEnumeration }
     *     
     */
    public CallStatusEnumeration getArrivalStatus() {
        return arrivalStatus;
    }

    /**
     * Définit la valeur de la propriété arrivalStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link CallStatusEnumeration }
     *     
     */
    public void setArrivalStatus(CallStatusEnumeration value) {
        this.arrivalStatus = value;
    }

    public boolean isSetArrivalStatus() {
        return (this.arrivalStatus!= null);
    }

    /**
     * Obtient la valeur de la propriété arrivalProximityText.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getArrivalProximityText() {
        return arrivalProximityText;
    }

    /**
     * Définit la valeur de la propriété arrivalProximityText.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setArrivalProximityText(NaturalLanguageStringStructure value) {
        this.arrivalProximityText = value;
    }

    public boolean isSetArrivalProximityText() {
        return (this.arrivalProximityText!= null);
    }

    /**
     * Bay or platform (QUAY) name to show passenger i.e. expected platform for vehicel to arrive at.Inheritable property. Can be omitted if the same as the DeparturePlatformName If there no arrival platform name separate from the departure platform name, the precedence is
     * (i) any arrival platform on any related dated timetable element, 
     * (ii) any departure platform name on this estimated element;
     * (iii) any departure platform name on any related dated timetable CALL.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getArrivalPlatformName() {
        return arrivalPlatformName;
    }

    /**
     * Définit la valeur de la propriété arrivalPlatformName.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setArrivalPlatformName(NaturalLanguageStringStructure value) {
        this.arrivalPlatformName = value;
    }

    public boolean isSetArrivalPlatformName() {
        return (this.arrivalPlatformName!= null);
    }

    /**
     * Nature of boarding and alighting allowed at stop. Default is 'Alighting'.
     * 
     * @return
     *     possible object is
     *     {@link ArrivalBoardingActivityEnumeration }
     *     
     */
    public ArrivalBoardingActivityEnumeration getArrivalBoardingActivity() {
        return arrivalBoardingActivity;
    }

    /**
     * Définit la valeur de la propriété arrivalBoardingActivity.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalBoardingActivityEnumeration }
     *     
     */
    public void setArrivalBoardingActivity(ArrivalBoardingActivityEnumeration value) {
        this.arrivalBoardingActivity = value;
    }

    public boolean isSetArrivalBoardingActivity() {
        return (this.arrivalBoardingActivity!= null);
    }

    /**
     * Obtient la valeur de la propriété arrivalStopAssignment.
     * 
     * @return
     *     possible object is
     *     {@link StopAssignmentStructure }
     *     
     */
    public StopAssignmentStructure getArrivalStopAssignment() {
        return arrivalStopAssignment;
    }

    /**
     * Définit la valeur de la propriété arrivalStopAssignment.
     * 
     * @param value
     *     allowed object is
     *     {@link StopAssignmentStructure }
     *     
     */
    public void setArrivalStopAssignment(StopAssignmentStructure value) {
        this.arrivalStopAssignment = value;
    }

    public boolean isSetArrivalStopAssignment() {
        return (this.arrivalStopAssignment!= null);
    }

    /**
     * Gets the value of the arrivalOperatorRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrivalOperatorRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrivalOperatorRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperatorRefStructure }
     * 
     * 
     */
    public List<OperatorRefStructure> getArrivalOperatorRefs() {
        if (arrivalOperatorRefs == null) {
            arrivalOperatorRefs = new ArrayList<OperatorRefStructure>();
        }
        return this.arrivalOperatorRefs;
    }

    public boolean isSetArrivalOperatorRefs() {
        return ((this.arrivalOperatorRefs!= null)&&(!this.arrivalOperatorRefs.isEmpty()));
    }

    public void unsetArrivalOperatorRefs() {
        this.arrivalOperatorRefs = null;
    }

    /**
     * Target departure time of VEHICLE according to latest working timetable.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAimedDepartureTime() {
        return aimedDepartureTime;
    }

    /**
     * Définit la valeur de la propriété aimedDepartureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAimedDepartureTime(XMLGregorianCalendar value) {
        this.aimedDepartureTime = value;
    }

    public boolean isSetAimedDepartureTime() {
        return (this.aimedDepartureTime!= null);
    }

    /**
     * Estimated time of departure of VEHICLE, most likely taking into account all control actions such as waiting.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedDepartureTime() {
        return expectedDepartureTime;
    }

    /**
     * Définit la valeur de la propriété expectedDepartureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedDepartureTime(XMLGregorianCalendar value) {
        this.expectedDepartureTime = value;
    }

    public boolean isSetExpectedDepartureTime() {
        return (this.expectedDepartureTime!= null);
    }

    /**
     * Obtient la valeur de la propriété provisionalExpectedDepartureTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProvisionalExpectedDepartureTime() {
        return provisionalExpectedDepartureTime;
    }

    /**
     * Définit la valeur de la propriété provisionalExpectedDepartureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProvisionalExpectedDepartureTime(XMLGregorianCalendar value) {
        this.provisionalExpectedDepartureTime = value;
    }

    public boolean isSetProvisionalExpectedDepartureTime() {
        return (this.provisionalExpectedDepartureTime!= null);
    }

    /**
     * Obtient la valeur de la propriété earliestExpectedDepartureTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestExpectedDepartureTime() {
        return earliestExpectedDepartureTime;
    }

    /**
     * Définit la valeur de la propriété earliestExpectedDepartureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestExpectedDepartureTime(XMLGregorianCalendar value) {
        this.earliestExpectedDepartureTime = value;
    }

    public boolean isSetEarliestExpectedDepartureTime() {
        return (this.earliestExpectedDepartureTime!= null);
    }

    /**
     * Obtient la valeur de la propriété expectedDeparturePredictionQuality.
     * 
     * @return
     *     possible object is
     *     {@link PredictionQualityStructure }
     *     
     */
    public PredictionQualityStructure getExpectedDeparturePredictionQuality() {
        return expectedDeparturePredictionQuality;
    }

    /**
     * Définit la valeur de la propriété expectedDeparturePredictionQuality.
     * 
     * @param value
     *     allowed object is
     *     {@link PredictionQualityStructure }
     *     
     */
    public void setExpectedDeparturePredictionQuality(PredictionQualityStructure value) {
        this.expectedDeparturePredictionQuality = value;
    }

    public boolean isSetExpectedDeparturePredictionQuality() {
        return (this.expectedDeparturePredictionQuality!= null);
    }

    /**
     * Target Latest time at which a PASSENGER should aim to arrive at the STOP PLACE containing the stop. This time may be earlier than the VEHICLE departure times as itmay include time for processes such as checkin, security, etc.(As specified by CHECK CONSTRAINT DELAYs in the underlying data) If absent assume to be the same as Earliest expected departure time, +SIRI v2.0
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAimedLatestPassengerAccessTime() {
        return aimedLatestPassengerAccessTime;
    }

    /**
     * Définit la valeur de la propriété aimedLatestPassengerAccessTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAimedLatestPassengerAccessTime(XMLGregorianCalendar value) {
        this.aimedLatestPassengerAccessTime = value;
    }

    public boolean isSetAimedLatestPassengerAccessTime() {
        return (this.aimedLatestPassengerAccessTime!= null);
    }

    /**
     * Expected Latest time at which a PASSENGER should aim to arrive at the STOP PLACE containing the stop. This time may be earlier than the VEHICLE departure times as it may include time for processes such as checkin, security, etc.(As specified by CHECK CONSTRAINT DELAYs in the underlying data) If absent assume to be the same as Earliest expected departure time, +SIRI v2.0
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedLatestPassengerAccessTime() {
        return expectedLatestPassengerAccessTime;
    }

    /**
     * Définit la valeur de la propriété expectedLatestPassengerAccessTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedLatestPassengerAccessTime(XMLGregorianCalendar value) {
        this.expectedLatestPassengerAccessTime = value;
    }

    public boolean isSetExpectedLatestPassengerAccessTime() {
        return (this.expectedLatestPassengerAccessTime!= null);
    }

    /**
     * Obtient la valeur de la propriété departureStatus.
     * 
     * @return
     *     possible object is
     *     {@link CallStatusEnumeration }
     *     
     */
    public CallStatusEnumeration getDepartureStatus() {
        return departureStatus;
    }

    /**
     * Définit la valeur de la propriété departureStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link CallStatusEnumeration }
     *     
     */
    public void setDepartureStatus(CallStatusEnumeration value) {
        this.departureStatus = value;
    }

    public boolean isSetDepartureStatus() {
        return (this.departureStatus!= null);
    }

    /**
     * Obtient la valeur de la propriété departureProximityText.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getDepartureProximityText() {
        return departureProximityText;
    }

    /**
     * Définit la valeur de la propriété departureProximityText.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setDepartureProximityText(NaturalLanguageStringStructure value) {
        this.departureProximityText = value;
    }

    public boolean isSetDepartureProximityText() {
        return (this.departureProximityText!= null);
    }

    /**
     * Departure QUAY ( Bay or platform) name. Defaulted taken from  from planned timetable..
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getDeparturePlatformName() {
        return departurePlatformName;
    }

    /**
     * Définit la valeur de la propriété departurePlatformName.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setDeparturePlatformName(NaturalLanguageStringStructure value) {
        this.departurePlatformName = value;
    }

    public boolean isSetDeparturePlatformName() {
        return (this.departurePlatformName!= null);
    }

    /**
     * Obtient la valeur de la propriété departureBoardingActivity.
     * 
     * @return
     *     possible object is
     *     {@link DepartureBoardingActivityEnumeration }
     *     
     */
    public DepartureBoardingActivityEnumeration getDepartureBoardingActivity() {
        return departureBoardingActivity;
    }

    /**
     * Définit la valeur de la propriété departureBoardingActivity.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureBoardingActivityEnumeration }
     *     
     */
    public void setDepartureBoardingActivity(DepartureBoardingActivityEnumeration value) {
        this.departureBoardingActivity = value;
    }

    public boolean isSetDepartureBoardingActivity() {
        return (this.departureBoardingActivity!= null);
    }

    /**
     * Obtient la valeur de la propriété departureStopAssignment.
     * 
     * @return
     *     possible object is
     *     {@link StopAssignmentStructure }
     *     
     */
    public StopAssignmentStructure getDepartureStopAssignment() {
        return departureStopAssignment;
    }

    /**
     * Définit la valeur de la propriété departureStopAssignment.
     * 
     * @param value
     *     allowed object is
     *     {@link StopAssignmentStructure }
     *     
     */
    public void setDepartureStopAssignment(StopAssignmentStructure value) {
        this.departureStopAssignment = value;
    }

    public boolean isSetDepartureStopAssignment() {
        return (this.departureStopAssignment!= null);
    }

    /**
     * Gets the value of the departureOperatorRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the departureOperatorRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepartureOperatorRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperatorRefStructure }
     * 
     * 
     */
    public List<OperatorRefStructure> getDepartureOperatorRefs() {
        if (departureOperatorRefs == null) {
            departureOperatorRefs = new ArrayList<OperatorRefStructure>();
        }
        return this.departureOperatorRefs;
    }

    public boolean isSetDepartureOperatorRefs() {
        return ((this.departureOperatorRefs!= null)&&(!this.departureOperatorRefs.isEmpty()));
    }

    public void unsetDepartureOperatorRefs() {
        this.departureOperatorRefs = null;
    }

    /**
     * Obtient la valeur de la propriété aimedHeadwayInterval.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAimedHeadwayInterval() {
        return aimedHeadwayInterval;
    }

    /**
     * Définit la valeur de la propriété aimedHeadwayInterval.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAimedHeadwayInterval(Duration value) {
        this.aimedHeadwayInterval = value;
    }

    public boolean isSetAimedHeadwayInterval() {
        return (this.aimedHeadwayInterval!= null);
    }

    /**
     * Obtient la valeur de la propriété expectedHeadwayInterval.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getExpectedHeadwayInterval() {
        return expectedHeadwayInterval;
    }

    /**
     * Définit la valeur de la propriété expectedHeadwayInterval.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setExpectedHeadwayInterval(Duration value) {
        this.expectedHeadwayInterval = value;
    }

    public boolean isSetExpectedHeadwayInterval() {
        return (this.expectedHeadwayInterval!= null);
    }

    /**
     * Obtient la valeur de la propriété distanceFromStop.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDistanceFromStop() {
        return distanceFromStop;
    }

    /**
     * Définit la valeur de la propriété distanceFromStop.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDistanceFromStop(BigInteger value) {
        this.distanceFromStop = value;
    }

    public boolean isSetDistanceFromStop() {
        return (this.distanceFromStop!= null);
    }

    /**
     * Obtient la valeur de la propriété numberOfStopsAway.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfStopsAway() {
        return numberOfStopsAway;
    }

    /**
     * Définit la valeur de la propriété numberOfStopsAway.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfStopsAway(BigInteger value) {
        this.numberOfStopsAway = value;
    }

    public boolean isSetNumberOfStopsAway() {
        return (this.numberOfStopsAway!= null);
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
