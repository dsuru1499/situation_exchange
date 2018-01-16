
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import uk.org.ifopt.acsb.AccessibilityAssessmentStructure;


/**
 * Type for information about a VEHICLE  affected by an SITUATION.
 * 
 * <p>Classe Java pour AffectedVehicleStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AffectedVehicleStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VehicleRef" type="{http://www.siri.org.uk/siri}VehicleRefStructure"/>
 *         &lt;element name="VehicleRegistrationNumberPlate" type="{http://www.w3.org/2001/XMLSchema}normalizedString" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhoneNumber" type="{http://www.siri.org.uk/siri}PhoneType" minOccurs="0"/>
 *         &lt;element name="IPAddress" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/>
 *         &lt;element name="RadioAddress" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/>
 *         &lt;element name="FramedVehicleJourneyRef" type="{http://www.siri.org.uk/siri}FramedVehicleJourneyRefStructure" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.siri.org.uk/siri}LocationStructure" minOccurs="0"/>
 *         &lt;element name="CurrentLocation" type="{http://www.siri.org.uk/siri}LocationStructure" minOccurs="0"/>
 *         &lt;element name="AccessibilityAssessment" type="{http://www.ifopt.org.uk/acsb}AccessibilityAssessmentStructure" minOccurs="0"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ServiceInfoGroup" minOccurs="0"/>
 *         &lt;element name="TrainBlockPart" type="{http://www.siri.org.uk/siri}TrainBlockPartStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}OperationalBlockGroup"/>
 *         &lt;element name="InCongestion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InPanic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HeadwayService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "AffectedVehicleStructure", propOrder = {
    "vehicleRef",
    "vehicleRegistrationNumberPlate",
    "phoneNumber",
    "ipAddress",
    "radioAddress",
    "framedVehicleJourneyRef",
    "location",
    "currentLocation",
    "accessibilityAssessment",
    "operatorRef",
    "productCategoryRef",
    "serviceFeatureRef",
    "vehicleFeatureRef",
    "trainBlockPart",
    "blockRef",
    "courseOfJourneyRef",
    "inCongestion",
    "inPanic",
    "headwayService",
    "extensions"
})
public class AffectedVehicleStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "VehicleRef", required = true)
    protected VehicleRefStructure vehicleRef;
    @XmlElement(name = "VehicleRegistrationNumberPlate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> vehicleRegistrationNumberPlate;
    @XmlElement(name = "PhoneNumber")
    protected String phoneNumber;
    @XmlElement(name = "IPAddress")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String ipAddress;
    @XmlElement(name = "RadioAddress")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String radioAddress;
    @XmlElement(name = "FramedVehicleJourneyRef")
    protected FramedVehicleJourneyRefStructure framedVehicleJourneyRef;
    @XmlElement(name = "Location")
    protected LocationStructure location;
    @XmlElement(name = "CurrentLocation")
    protected LocationStructure currentLocation;
    @XmlElement(name = "AccessibilityAssessment")
    protected AccessibilityAssessmentStructure accessibilityAssessment;
    @XmlElement(name = "OperatorRef")
    protected OperatorRefStructure operatorRef;
    @XmlElement(name = "ProductCategoryRef")
    protected ProductCategoryRefStructure productCategoryRef;
    @XmlElement(name = "ServiceFeatureRef")
    protected List<ServiceFeatureRefStructure> serviceFeatureRef;
    @XmlElement(name = "VehicleFeatureRef")
    protected List<VehicleFeatureRefStructure> vehicleFeatureRef;
    @XmlElement(name = "TrainBlockPart")
    protected List<TrainBlockPartStructure> trainBlockPart;
    @XmlElement(name = "BlockRef")
    protected BlockRefStructure blockRef;
    @XmlElement(name = "CourseOfJourneyRef")
    protected CourseOfJourneyRefStructure courseOfJourneyRef;
    @XmlElement(name = "InCongestion")
    protected Boolean inCongestion;
    @XmlElement(name = "InPanic", defaultValue = "false")
    protected Boolean inPanic;
    @XmlElement(name = "HeadwayService", defaultValue = "false")
    protected Boolean headwayService;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

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
     * Gets the value of the vehicleRegistrationNumberPlate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleRegistrationNumberPlate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleRegistrationNumberPlate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVehicleRegistrationNumberPlate() {
        if (vehicleRegistrationNumberPlate == null) {
            vehicleRegistrationNumberPlate = new ArrayList<String>();
        }
        return this.vehicleRegistrationNumberPlate;
    }

    public boolean isSetVehicleRegistrationNumberPlate() {
        return ((this.vehicleRegistrationNumberPlate!= null)&&(!this.vehicleRegistrationNumberPlate.isEmpty()));
    }

    public void unsetVehicleRegistrationNumberPlate() {
        this.vehicleRegistrationNumberPlate = null;
    }

    /**
     * Obtient la valeur de la propriété phoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Définit la valeur de la propriété phoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    public boolean isSetPhoneNumber() {
        return (this.phoneNumber!= null);
    }

    /**
     * Obtient la valeur de la propriété ipAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddress() {
        return ipAddress;
    }

    /**
     * Définit la valeur de la propriété ipAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddress(String value) {
        this.ipAddress = value;
    }

    public boolean isSetIPAddress() {
        return (this.ipAddress!= null);
    }

    /**
     * Obtient la valeur de la propriété radioAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadioAddress() {
        return radioAddress;
    }

    /**
     * Définit la valeur de la propriété radioAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadioAddress(String value) {
        this.radioAddress = value;
    }

    public boolean isSetRadioAddress() {
        return (this.radioAddress!= null);
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
     * Obtient la valeur de la propriété location.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure }
     *     
     */
    public LocationStructure getLocation() {
        return location;
    }

    /**
     * Définit la valeur de la propriété location.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure }
     *     
     */
    public void setLocation(LocationStructure value) {
        this.location = value;
    }

    public boolean isSetLocation() {
        return (this.location!= null);
    }

    /**
     * Obtient la valeur de la propriété currentLocation.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure }
     *     
     */
    public LocationStructure getCurrentLocation() {
        return currentLocation;
    }

    /**
     * Définit la valeur de la propriété currentLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure }
     *     
     */
    public void setCurrentLocation(LocationStructure value) {
        this.currentLocation = value;
    }

    public boolean isSetCurrentLocation() {
        return (this.currentLocation!= null);
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
