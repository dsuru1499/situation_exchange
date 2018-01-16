
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
 * Type for information about a CALL affected by an SITUATION.
 * 
 * <p>Classe Java pour AffectedCallStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AffectedCallStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AffectedStopPointStructure">
 *       &lt;sequence>
 *         &lt;element name="Order" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="CallCondition" type="{http://www.siri.org.uk/siri}RoutePointTypeEnumeration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}CallRealtimeGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}CallPropertyGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}AffectedStopArrivalGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}AffectedStopDepartureGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}HeadwayIntervalGroup"/>
 *         &lt;element name="AffectedInterchange" type="{http://www.siri.org.uk/siri}AffectedInterchangeStructure" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedCallStructure", propOrder = {
    "order",
    "callCondition",
    "vehicleAtStop",
    "vehicleLocationAtStop",
    "timingPoint",
    "boardingStretch",
    "requestStop",
    "originDisplay",
    "destinationDisplay",
    "aimedArrivalTime",
    "actualArrivalTime",
    "expectedArrivalTime",
    "arrivalStatus",
    "arrivalPlatformName",
    "arrivalBoardingActivity",
    "aimedDepartureTime",
    "actualDepartureTime",
    "expectedDepartureTime",
    "departureStatus",
    "departurePlatformName",
    "departureBoardingActivity",
    "aimedHeadwayInterval",
    "expectedHeadwayInterval",
    "affectedInterchange"
})
public class AffectedCallStructure
    extends AffectedStopPointStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Order")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;
    @XmlElement(name = "CallCondition")
    protected List<RoutePointTypeEnumeration> callCondition;
    @XmlElement(name = "VehicleAtStop", defaultValue = "false")
    protected Boolean vehicleAtStop;
    @XmlElement(name = "VehicleLocationAtStop")
    protected LocationStructure vehicleLocationAtStop;
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
    @XmlElement(name = "AimedArrivalTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar aimedArrivalTime;
    @XmlElement(name = "ActualArrivalTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualArrivalTime;
    @XmlElement(name = "ExpectedArrivalTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedArrivalTime;
    @XmlElement(name = "ArrivalStatus")
    protected CallStatusEnumeration arrivalStatus;
    @XmlElement(name = "ArrivalPlatformName")
    protected NaturalLanguageStringStructure arrivalPlatformName;
    @XmlElement(name = "ArrivalBoardingActivity", defaultValue = "alighting")
    protected ArrivalBoardingActivityEnumeration arrivalBoardingActivity;
    @XmlElement(name = "AimedDepartureTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar aimedDepartureTime;
    @XmlElement(name = "ActualDepartureTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualDepartureTime;
    @XmlElement(name = "ExpectedDepartureTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedDepartureTime;
    @XmlElement(name = "DepartureStatus")
    protected CallStatusEnumeration departureStatus;
    @XmlElement(name = "DeparturePlatformName")
    protected NaturalLanguageStringStructure departurePlatformName;
    @XmlElement(name = "DepartureBoardingActivity", defaultValue = "boarding")
    protected DepartureBoardingActivityEnumeration departureBoardingActivity;
    @XmlElement(name = "AimedHeadwayInterval")
    protected Duration aimedHeadwayInterval;
    @XmlElement(name = "ExpectedHeadwayInterval")
    protected Duration expectedHeadwayInterval;
    @XmlElement(name = "AffectedInterchange")
    protected List<AffectedInterchangeStructure> affectedInterchange;

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
     * Gets the value of the callCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoutePointTypeEnumeration }
     * 
     * 
     */
    public List<RoutePointTypeEnumeration> getCallCondition() {
        if (callCondition == null) {
            callCondition = new ArrayList<RoutePointTypeEnumeration>();
        }
        return this.callCondition;
    }

    public boolean isSetCallCondition() {
        return ((this.callCondition!= null)&&(!this.callCondition.isEmpty()));
    }

    public void unsetCallCondition() {
        this.callCondition = null;
    }

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
     * Obtient la valeur de la propriété vehicleLocationAtStop.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure }
     *     
     */
    public LocationStructure getVehicleLocationAtStop() {
        return vehicleLocationAtStop;
    }

    /**
     * Définit la valeur de la propriété vehicleLocationAtStop.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure }
     *     
     */
    public void setVehicleLocationAtStop(LocationStructure value) {
        this.vehicleLocationAtStop = value;
    }

    public boolean isSetVehicleLocationAtStop() {
        return (this.vehicleLocationAtStop!= null);
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
     * Target arrival time of VEHICLE according to latest working timetable.
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
     * Observed time of arrival of VEHICLE.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualArrivalTime() {
        return actualArrivalTime;
    }

    /**
     * Définit la valeur de la propriété actualArrivalTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualArrivalTime(XMLGregorianCalendar value) {
        this.actualArrivalTime = value;
    }

    public boolean isSetActualArrivalTime() {
        return (this.actualArrivalTime!= null);
    }

    /**
     * Estimated time of arriival of VEHICLE.
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
     * Obtient la valeur de la propriété arrivalPlatformName.
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
     * Obtient la valeur de la propriété arrivalBoardingActivity.
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
     * Observed time of departure of VEHICLE from stop.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualDepartureTime() {
        return actualDepartureTime;
    }

    /**
     * Définit la valeur de la propriété actualDepartureTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualDepartureTime(XMLGregorianCalendar value) {
        this.actualDepartureTime = value;
    }

    public boolean isSetActualDepartureTime() {
        return (this.actualDepartureTime!= null);
    }

    /**
     * Estimated time of departure of VEHICLE from stop. May include waiting time. For people on a VEHICLE this is the time that would normally be shown.
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
     * Obtient la valeur de la propriété departurePlatformName.
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
     * Gets the value of the affectedInterchange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affectedInterchange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffectedInterchange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedInterchangeStructure }
     * 
     * 
     */
    public List<AffectedInterchangeStructure> getAffectedInterchange() {
        if (affectedInterchange == null) {
            affectedInterchange = new ArrayList<AffectedInterchangeStructure>();
        }
        return this.affectedInterchange;
    }

    public boolean isSetAffectedInterchange() {
        return ((this.affectedInterchange!= null)&&(!this.affectedInterchange.isEmpty()));
    }

    public void unsetAffectedInterchange() {
        this.affectedInterchange = null;
    }

}
