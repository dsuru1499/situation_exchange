
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
 * Type for a targeted call.
 * 
 * <p>Classe Java pour TargetedCallStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TargetedCallStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}TargetedCallGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetedCallStructure", propOrder = {
    "stopPointRef",
    "visitNumber",
    "order",
    "timingPoint",
    "operatorRef",
    "productCategoryRef",
    "serviceFeatureRef",
    "vehicleFeatureRef",
    "aimedArrivalTime",
    "arrivalPlatformName",
    "arrivalBoardingActivity",
    "arrivalStopAssignment",
    "arrivalOperatorRefs",
    "aimedDepartureTime",
    "departurePlatformName",
    "departureBoardingActivity",
    "departureStopAssignment",
    "departureOperatorRefs",
    "aimedLatestPassengerAccessTime",
    "aimedHeadwayInterval"
})
public class TargetedCallStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "StopPointRef")
    protected StopPointRefStructure stopPointRef;
    @XmlElement(name = "VisitNumber", required = true)
    protected BigInteger visitNumber;
    @XmlElement(name = "Order")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;
    @XmlElement(name = "TimingPoint", defaultValue = "true")
    protected Boolean timingPoint;
    @XmlElement(name = "OperatorRef")
    protected OperatorRefStructure operatorRef;
    @XmlElement(name = "ProductCategoryRef")
    protected ProductCategoryRefStructure productCategoryRef;
    @XmlElement(name = "ServiceFeatureRef")
    protected List<ServiceFeatureRefStructure> serviceFeatureRef;
    @XmlElement(name = "VehicleFeatureRef")
    protected List<VehicleFeatureRefStructure> vehicleFeatureRef;
    @XmlElement(name = "AimedArrivalTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar aimedArrivalTime;
    @XmlElement(name = "ArrivalPlatformName")
    protected NaturalLanguageStringStructure arrivalPlatformName;
    @XmlElement(name = "ArrivalBoardingActivity", defaultValue = "alighting")
    protected ArrivalBoardingActivityEnumeration arrivalBoardingActivity;
    @XmlElement(name = "ArrivalStopAssignment")
    protected PlannedStopAssignmentStructure arrivalStopAssignment;
    @XmlElement(name = "ArrivalOperatorRefs")
    protected List<OperatorRefStructure> arrivalOperatorRefs;
    @XmlElement(name = "AimedDepartureTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar aimedDepartureTime;
    @XmlElement(name = "DeparturePlatformName")
    protected NaturalLanguageStringStructure departurePlatformName;
    @XmlElement(name = "DepartureBoardingActivity", defaultValue = "boarding")
    protected DepartureBoardingActivityEnumeration departureBoardingActivity;
    @XmlElement(name = "DepartureStopAssignment")
    protected PlannedStopAssignmentStructure departureStopAssignment;
    @XmlElement(name = "DepartureOperatorRefs")
    protected List<OperatorRefStructure> departureOperatorRefs;
    @XmlElement(name = "AimedLatestPassengerAccessTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar aimedLatestPassengerAccessTime;
    @XmlElement(name = "AimedHeadwayInterval")
    protected Duration aimedHeadwayInterval;

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
     * Obtient la valeur de la propriété arrivalStopAssignment.
     * 
     * @return
     *     possible object is
     *     {@link PlannedStopAssignmentStructure }
     *     
     */
    public PlannedStopAssignmentStructure getArrivalStopAssignment() {
        return arrivalStopAssignment;
    }

    /**
     * Définit la valeur de la propriété arrivalStopAssignment.
     * 
     * @param value
     *     allowed object is
     *     {@link PlannedStopAssignmentStructure }
     *     
     */
    public void setArrivalStopAssignment(PlannedStopAssignmentStructure value) {
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
     * Obtient la valeur de la propriété aimedDepartureTime.
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
     * Obtient la valeur de la propriété departureStopAssignment.
     * 
     * @return
     *     possible object is
     *     {@link PlannedStopAssignmentStructure }
     *     
     */
    public PlannedStopAssignmentStructure getDepartureStopAssignment() {
        return departureStopAssignment;
    }

    /**
     * Définit la valeur de la propriété departureStopAssignment.
     * 
     * @param value
     *     allowed object is
     *     {@link PlannedStopAssignmentStructure }
     *     
     */
    public void setDepartureStopAssignment(PlannedStopAssignmentStructure value) {
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
     * Obtient la valeur de la propriété aimedLatestPassengerAccessTime.
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

}
