
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour BasicDataValue complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="BasicDataValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accuracy" type="{http://datex2.eu/schema/2_0RC1/2_0}Percentage" minOccurs="0"/>
 *         &lt;element name="computationalMethod" type="{http://datex2.eu/schema/2_0RC1/2_0}ComputationMethodEnum" minOccurs="0"/>
 *         &lt;element name="fault" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/>
 *         &lt;element name="faultReason" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="numberOfIncompleteInputs" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="numberOfInputValuesUsed" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="period" type="{http://datex2.eu/schema/2_0RC1/2_0}Seconds" minOccurs="0"/>
 *         &lt;element name="smoothingFactor" type="{http://datex2.eu/schema/2_0RC1/2_0}Float" minOccurs="0"/>
 *         &lt;element name="standardDeviation" type="{http://datex2.eu/schema/2_0RC1/2_0}Float" minOccurs="0"/>
 *         &lt;element name="supplierCalculatedDataQuality" type="{http://datex2.eu/schema/2_0RC1/2_0}Percentage" minOccurs="0"/>
 *         &lt;element name="time" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/>
 *         &lt;element name="pertinentLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}GroupOfLocations" minOccurs="0"/>
 *         &lt;element name="basicDataValueExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicDataValue", propOrder = {
    "accuracy",
    "computationalMethod",
    "fault",
    "faultReason",
    "numberOfIncompleteInputs",
    "numberOfInputValuesUsed",
    "period",
    "smoothingFactor",
    "standardDeviation",
    "supplierCalculatedDataQuality",
    "time",
    "pertinentLocation",
    "basicDataValueExtension"
})
@XmlSeeAlso({
    TravelTimeValue.class,
    TrafficStatusValue.class,
    TrafficValue.class,
    WeatherValue.class
})
public abstract class BasicDataValue
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Float accuracy;
    protected ComputationMethodEnum computationalMethod;
    protected Boolean fault;
    protected MultilingualString faultReason;
    protected BigInteger numberOfIncompleteInputs;
    protected BigInteger numberOfInputValuesUsed;
    protected Float period;
    protected Float smoothingFactor;
    protected Float standardDeviation;
    protected Float supplierCalculatedDataQuality;
    protected XMLGregorianCalendar time;
    protected GroupOfLocations pertinentLocation;
    protected ExtensionType basicDataValueExtension;

    /**
     * Obtient la valeur de la propriété accuracy.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAccuracy() {
        return accuracy;
    }

    /**
     * Définit la valeur de la propriété accuracy.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAccuracy(Float value) {
        this.accuracy = value;
    }

    public boolean isSetAccuracy() {
        return (this.accuracy!= null);
    }

    /**
     * Obtient la valeur de la propriété computationalMethod.
     * 
     * @return
     *     possible object is
     *     {@link ComputationMethodEnum }
     *     
     */
    public ComputationMethodEnum getComputationalMethod() {
        return computationalMethod;
    }

    /**
     * Définit la valeur de la propriété computationalMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link ComputationMethodEnum }
     *     
     */
    public void setComputationalMethod(ComputationMethodEnum value) {
        this.computationalMethod = value;
    }

    public boolean isSetComputationalMethod() {
        return (this.computationalMethod!= null);
    }

    /**
     * Obtient la valeur de la propriété fault.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFault() {
        return fault;
    }

    /**
     * Définit la valeur de la propriété fault.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFault(Boolean value) {
        this.fault = value;
    }

    public boolean isSetFault() {
        return (this.fault!= null);
    }

    /**
     * Obtient la valeur de la propriété faultReason.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getFaultReason() {
        return faultReason;
    }

    /**
     * Définit la valeur de la propriété faultReason.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setFaultReason(MultilingualString value) {
        this.faultReason = value;
    }

    public boolean isSetFaultReason() {
        return (this.faultReason!= null);
    }

    /**
     * Obtient la valeur de la propriété numberOfIncompleteInputs.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfIncompleteInputs() {
        return numberOfIncompleteInputs;
    }

    /**
     * Définit la valeur de la propriété numberOfIncompleteInputs.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfIncompleteInputs(BigInteger value) {
        this.numberOfIncompleteInputs = value;
    }

    public boolean isSetNumberOfIncompleteInputs() {
        return (this.numberOfIncompleteInputs!= null);
    }

    /**
     * Obtient la valeur de la propriété numberOfInputValuesUsed.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfInputValuesUsed() {
        return numberOfInputValuesUsed;
    }

    /**
     * Définit la valeur de la propriété numberOfInputValuesUsed.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfInputValuesUsed(BigInteger value) {
        this.numberOfInputValuesUsed = value;
    }

    public boolean isSetNumberOfInputValuesUsed() {
        return (this.numberOfInputValuesUsed!= null);
    }

    /**
     * Obtient la valeur de la propriété period.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPeriod() {
        return period;
    }

    /**
     * Définit la valeur de la propriété period.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPeriod(Float value) {
        this.period = value;
    }

    public boolean isSetPeriod() {
        return (this.period!= null);
    }

    /**
     * Obtient la valeur de la propriété smoothingFactor.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSmoothingFactor() {
        return smoothingFactor;
    }

    /**
     * Définit la valeur de la propriété smoothingFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSmoothingFactor(Float value) {
        this.smoothingFactor = value;
    }

    public boolean isSetSmoothingFactor() {
        return (this.smoothingFactor!= null);
    }

    /**
     * Obtient la valeur de la propriété standardDeviation.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getStandardDeviation() {
        return standardDeviation;
    }

    /**
     * Définit la valeur de la propriété standardDeviation.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setStandardDeviation(Float value) {
        this.standardDeviation = value;
    }

    public boolean isSetStandardDeviation() {
        return (this.standardDeviation!= null);
    }

    /**
     * Obtient la valeur de la propriété supplierCalculatedDataQuality.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSupplierCalculatedDataQuality() {
        return supplierCalculatedDataQuality;
    }

    /**
     * Définit la valeur de la propriété supplierCalculatedDataQuality.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSupplierCalculatedDataQuality(Float value) {
        this.supplierCalculatedDataQuality = value;
    }

    public boolean isSetSupplierCalculatedDataQuality() {
        return (this.supplierCalculatedDataQuality!= null);
    }

    /**
     * Obtient la valeur de la propriété time.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Définit la valeur de la propriété time.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    public boolean isSetTime() {
        return (this.time!= null);
    }

    /**
     * Obtient la valeur de la propriété pertinentLocation.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfLocations }
     *     
     */
    public GroupOfLocations getPertinentLocation() {
        return pertinentLocation;
    }

    /**
     * Définit la valeur de la propriété pertinentLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfLocations }
     *     
     */
    public void setPertinentLocation(GroupOfLocations value) {
        this.pertinentLocation = value;
    }

    public boolean isSetPertinentLocation() {
        return (this.pertinentLocation!= null);
    }

    /**
     * Obtient la valeur de la propriété basicDataValueExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getBasicDataValueExtension() {
        return basicDataValueExtension;
    }

    /**
     * Définit la valeur de la propriété basicDataValueExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setBasicDataValueExtension(ExtensionType value) {
        this.basicDataValueExtension = value;
    }

    public boolean isSetBasicDataValueExtension() {
        return (this.basicDataValueExtension!= null);
    }

}
