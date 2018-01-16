
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
 * Type for  recroded Real-time info about a VEHICLE JOURNEY Stop.
 * 
 * <p>Classe Java pour RecordedCallStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RecordedCallStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}StopPointInSequenceGroup"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="ExtraCall" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           &lt;element name="Cancellation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;group ref="{http://www.siri.org.uk/siri}CallRealTimeInfoGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}RecordedCallGroup"/>
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
@XmlType(name = "RecordedCallStructure", propOrder = {
    "stopPointRef",
    "visitNumber",
    "order",
    "stopPointName",
    "extraCall",
    "cancellation",
    "predictionInaccurate",
    "occupancy",
    "aimedArrivalTime",
    "expectedArrivalTime",
    "actualArrivalTime",
    "arrivalPlatformName",
    "aimedDepartureTime",
    "expectedDepartureTime",
    "departurePlatformName",
    "actualDepartureTime",
    "aimedHeadwayInterval",
    "expectedHeadwayInterval",
    "actualHeadwayInterval",
    "extensions"
})
public class RecordedCallStructure
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
    @XmlElement(name = "AimedArrivalTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar aimedArrivalTime;
    @XmlElement(name = "ExpectedArrivalTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedArrivalTime;
    @XmlElement(name = "ActualArrivalTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualArrivalTime;
    @XmlElement(name = "ArrivalPlatformName")
    protected NaturalLanguageStringStructure arrivalPlatformName;
    @XmlElement(name = "AimedDepartureTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar aimedDepartureTime;
    @XmlElement(name = "ExpectedDepartureTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expectedDepartureTime;
    @XmlElement(name = "DeparturePlatformName")
    protected NaturalLanguageStringStructure departurePlatformName;
    @XmlElement(name = "ActualDepartureTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualDepartureTime;
    @XmlElement(name = "AimedHeadwayInterval")
    protected Duration aimedHeadwayInterval;
    @XmlElement(name = "ExpectedHeadwayInterval")
    protected Duration expectedHeadwayInterval;
    @XmlElement(name = "ActualHeadwayInterval")
    protected Duration actualHeadwayInterval;
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
     * Obtient la valeur de la propriété actualArrivalTime.
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
     * Estimated time of departure of VEHICLE.
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
     * Estimated time of departure of VEHICLE.
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
     * Obtient la valeur de la propriété actualHeadwayInterval.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getActualHeadwayInterval() {
        return actualHeadwayInterval;
    }

    /**
     * Définit la valeur de la propriété actualHeadwayInterval.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setActualHeadwayInterval(Duration value) {
        this.actualHeadwayInterval = value;
    }

    public boolean isSetActualHeadwayInterval() {
        return (this.actualHeadwayInterval!= null);
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
