
package uk.org.ifopt.ifopt;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;


/**
 * Type for a CHECK CONSTRAINT Hazard that can be associated with.
 * 
 * <p>Classe Java pour CheckPointStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CheckPointStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CheckPointId" type="{http://www.ifopt.org.uk/ifopt}CheckPointIdType" minOccurs="0"/>
 *         &lt;group ref="{http://www.ifopt.org.uk/ifopt}CheckPointGroup"/>
 *         &lt;group ref="{http://www.ifopt.org.uk/ifopt}DelayGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckPointStructure", propOrder = {
    "checkPointId",
    "validityCondition",
    "checkPointProcess",
    "checkPointService",
    "accessFeatureType",
    "congestion",
    "facilityRef",
    "minimumLikelyDelay",
    "averageDelay",
    "maximumLikelyDelay"
})
public class CheckPointStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CheckPointId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String checkPointId;
    @XmlElement(name = "ValidityCondition")
    protected ValidityConditionStructure validityCondition;
    @XmlElement(name = "CheckPointProcess")
    protected CheckPointProcessEnumeration checkPointProcess;
    @XmlElement(name = "CheckPointService")
    protected CheckPointServiceEnumeration checkPointService;
    @XmlElement(name = "AccessFeatureType")
    protected AccessibilityFeatureEnumeration accessFeatureType;
    @XmlElement(name = "Congestion")
    protected CongestionEnumeration congestion;
    @XmlElement(name = "FacilityRef")
    protected String facilityRef;
    @XmlElement(name = "MinimumLikelyDelay")
    protected Duration minimumLikelyDelay;
    @XmlElement(name = "AverageDelay")
    protected Duration averageDelay;
    @XmlElement(name = "MaximumLikelyDelay")
    protected Duration maximumLikelyDelay;

    /**
     * Obtient la valeur de la propriété checkPointId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckPointId() {
        return checkPointId;
    }

    /**
     * Définit la valeur de la propriété checkPointId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckPointId(String value) {
        this.checkPointId = value;
    }

    public boolean isSetCheckPointId() {
        return (this.checkPointId!= null);
    }

    /**
     * Obtient la valeur de la propriété validityCondition.
     * 
     * @return
     *     possible object is
     *     {@link ValidityConditionStructure }
     *     
     */
    public ValidityConditionStructure getValidityCondition() {
        return validityCondition;
    }

    /**
     * Définit la valeur de la propriété validityCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityConditionStructure }
     *     
     */
    public void setValidityCondition(ValidityConditionStructure value) {
        this.validityCondition = value;
    }

    public boolean isSetValidityCondition() {
        return (this.validityCondition!= null);
    }

    /**
     * Obtient la valeur de la propriété checkPointProcess.
     * 
     * @return
     *     possible object is
     *     {@link CheckPointProcessEnumeration }
     *     
     */
    public CheckPointProcessEnumeration getCheckPointProcess() {
        return checkPointProcess;
    }

    /**
     * Définit la valeur de la propriété checkPointProcess.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckPointProcessEnumeration }
     *     
     */
    public void setCheckPointProcess(CheckPointProcessEnumeration value) {
        this.checkPointProcess = value;
    }

    public boolean isSetCheckPointProcess() {
        return (this.checkPointProcess!= null);
    }

    /**
     * Obtient la valeur de la propriété checkPointService.
     * 
     * @return
     *     possible object is
     *     {@link CheckPointServiceEnumeration }
     *     
     */
    public CheckPointServiceEnumeration getCheckPointService() {
        return checkPointService;
    }

    /**
     * Définit la valeur de la propriété checkPointService.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckPointServiceEnumeration }
     *     
     */
    public void setCheckPointService(CheckPointServiceEnumeration value) {
        this.checkPointService = value;
    }

    public boolean isSetCheckPointService() {
        return (this.checkPointService!= null);
    }

    /**
     * Obtient la valeur de la propriété accessFeatureType.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityFeatureEnumeration }
     *     
     */
    public AccessibilityFeatureEnumeration getAccessFeatureType() {
        return accessFeatureType;
    }

    /**
     * Définit la valeur de la propriété accessFeatureType.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityFeatureEnumeration }
     *     
     */
    public void setAccessFeatureType(AccessibilityFeatureEnumeration value) {
        this.accessFeatureType = value;
    }

    public boolean isSetAccessFeatureType() {
        return (this.accessFeatureType!= null);
    }

    /**
     * Obtient la valeur de la propriété congestion.
     * 
     * @return
     *     possible object is
     *     {@link CongestionEnumeration }
     *     
     */
    public CongestionEnumeration getCongestion() {
        return congestion;
    }

    /**
     * Définit la valeur de la propriété congestion.
     * 
     * @param value
     *     allowed object is
     *     {@link CongestionEnumeration }
     *     
     */
    public void setCongestion(CongestionEnumeration value) {
        this.congestion = value;
    }

    public boolean isSetCongestion() {
        return (this.congestion!= null);
    }

    /**
     * Obtient la valeur de la propriété facilityRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityRef() {
        return facilityRef;
    }

    /**
     * Définit la valeur de la propriété facilityRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityRef(String value) {
        this.facilityRef = value;
    }

    public boolean isSetFacilityRef() {
        return (this.facilityRef!= null);
    }

    /**
     * Obtient la valeur de la propriété minimumLikelyDelay.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumLikelyDelay() {
        return minimumLikelyDelay;
    }

    /**
     * Définit la valeur de la propriété minimumLikelyDelay.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumLikelyDelay(Duration value) {
        this.minimumLikelyDelay = value;
    }

    public boolean isSetMinimumLikelyDelay() {
        return (this.minimumLikelyDelay!= null);
    }

    /**
     * Obtient la valeur de la propriété averageDelay.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAverageDelay() {
        return averageDelay;
    }

    /**
     * Définit la valeur de la propriété averageDelay.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAverageDelay(Duration value) {
        this.averageDelay = value;
    }

    public boolean isSetAverageDelay() {
        return (this.averageDelay!= null);
    }

    /**
     * Obtient la valeur de la propriété maximumLikelyDelay.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumLikelyDelay() {
        return maximumLikelyDelay;
    }

    /**
     * Définit la valeur de la propriété maximumLikelyDelay.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumLikelyDelay(Duration value) {
        this.maximumLikelyDelay = value;
    }

    public boolean isSetMaximumLikelyDelay() {
        return (this.maximumLikelyDelay!= null);
    }

}
