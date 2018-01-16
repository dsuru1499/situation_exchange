
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
 * Type Onwards CALLs at stop.
 * 
 * <p>Classe Java pour OnwardCallStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="OnwardCallStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractMonitoredCallStructure">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element ref="{http://www.siri.org.uk/siri}VehicleAtStop" minOccurs="0"/>
 *           &lt;element ref="{http://www.siri.org.uk/siri}TimingPoint" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}OnwardsCallGroup"/>
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
@XmlType(name = "OnwardCallStructure", propOrder = {
    "vehicleAtStop",
    "timingPoint",
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
public class OnwardCallStructure
    extends AbstractMonitoredCallStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "VehicleAtStop", defaultValue = "false")
    protected Boolean vehicleAtStop;
    @XmlElement(name = "TimingPoint", defaultValue = "true")
    protected Boolean timingPoint;
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
     * Obtient la valeur de la propriété vehicleAtStop.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVehicleAtStop() {
        return vehicleAtStop;
    }

    /**
     * Définit la valeur de la propriété vehicleAtStop.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVehicleAtStop(Boolean value) {
        this.vehicleAtStop = value;
    }

    public boolean isSetVehicleAtStop() {
        return (this.vehicleAtStop!= null);
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
