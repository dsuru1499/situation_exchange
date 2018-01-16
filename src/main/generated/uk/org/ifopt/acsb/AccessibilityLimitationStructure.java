
package uk.org.ifopt.acsb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import uk.org.ifopt.ifopt.Extensions;
import uk.org.ifopt.ifopt.ValidityConditionStructure;


/**
 * Type for limitation on navigation.
 * 
 * <p>Classe Java pour AccessibilityLimitationStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AccessibilityLimitationStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LimitationId" type="{http://www.ifopt.org.uk/acsb}LimitationIdType" minOccurs="0"/>
 *         &lt;element name="ValidityCondition" type="{http://www.ifopt.org.uk/ifopt}ValidityConditionStructure" minOccurs="0"/>
 *         &lt;group ref="{http://www.ifopt.org.uk/acsb}MobilityLimitationGroup"/>
 *         &lt;group ref="{http://www.ifopt.org.uk/acsb}SensoryLimitationGroup"/>
 *         &lt;element ref="{http://www.ifopt.org.uk/ifopt}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessibilityLimitationStructure", propOrder = {
    "limitationId",
    "validityCondition",
    "wheelchairAccess",
    "stepFreeAccess",
    "escalatorFreeAccess",
    "liftFreeAccess",
    "audibleSignalsAvailable",
    "visualSignsAvailable",
    "extensions"
})
public class AccessibilityLimitationStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "LimitationId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String limitationId;
    @XmlElement(name = "ValidityCondition")
    protected ValidityConditionStructure validityCondition;
    @XmlElement(name = "WheelchairAccess", required = true, defaultValue = "false")
    protected AccessibilityStructure wheelchairAccess;
    @XmlElement(name = "StepFreeAccess", defaultValue = "unknown")
    protected AccessibilityStructure stepFreeAccess;
    @XmlElement(name = "EscalatorFreeAccess", defaultValue = "unknown")
    protected AccessibilityStructure escalatorFreeAccess;
    @XmlElement(name = "LiftFreeAccess", defaultValue = "unknown")
    protected AccessibilityStructure liftFreeAccess;
    @XmlElement(name = "AudibleSignalsAvailable", defaultValue = "false")
    protected AccessibilityStructure audibleSignalsAvailable;
    @XmlElement(name = "VisualSignsAvailable", defaultValue = "unknown")
    protected AccessibilityStructure visualSignsAvailable;
    @XmlElement(name = "Extensions", namespace = "http://www.ifopt.org.uk/ifopt")
    protected Extensions extensions;

    /**
     * Obtient la valeur de la propriété limitationId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitationId() {
        return limitationId;
    }

    /**
     * Définit la valeur de la propriété limitationId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitationId(String value) {
        this.limitationId = value;
    }

    public boolean isSetLimitationId() {
        return (this.limitationId!= null);
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
     * Obtient la valeur de la propriété wheelchairAccess.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityStructure }
     *     
     */
    public AccessibilityStructure getWheelchairAccess() {
        return wheelchairAccess;
    }

    /**
     * Définit la valeur de la propriété wheelchairAccess.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityStructure }
     *     
     */
    public void setWheelchairAccess(AccessibilityStructure value) {
        this.wheelchairAccess = value;
    }

    public boolean isSetWheelchairAccess() {
        return (this.wheelchairAccess!= null);
    }

    /**
     * Obtient la valeur de la propriété stepFreeAccess.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityStructure }
     *     
     */
    public AccessibilityStructure getStepFreeAccess() {
        return stepFreeAccess;
    }

    /**
     * Définit la valeur de la propriété stepFreeAccess.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityStructure }
     *     
     */
    public void setStepFreeAccess(AccessibilityStructure value) {
        this.stepFreeAccess = value;
    }

    public boolean isSetStepFreeAccess() {
        return (this.stepFreeAccess!= null);
    }

    /**
     * Obtient la valeur de la propriété escalatorFreeAccess.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityStructure }
     *     
     */
    public AccessibilityStructure getEscalatorFreeAccess() {
        return escalatorFreeAccess;
    }

    /**
     * Définit la valeur de la propriété escalatorFreeAccess.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityStructure }
     *     
     */
    public void setEscalatorFreeAccess(AccessibilityStructure value) {
        this.escalatorFreeAccess = value;
    }

    public boolean isSetEscalatorFreeAccess() {
        return (this.escalatorFreeAccess!= null);
    }

    /**
     * Obtient la valeur de la propriété liftFreeAccess.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityStructure }
     *     
     */
    public AccessibilityStructure getLiftFreeAccess() {
        return liftFreeAccess;
    }

    /**
     * Définit la valeur de la propriété liftFreeAccess.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityStructure }
     *     
     */
    public void setLiftFreeAccess(AccessibilityStructure value) {
        this.liftFreeAccess = value;
    }

    public boolean isSetLiftFreeAccess() {
        return (this.liftFreeAccess!= null);
    }

    /**
     * Whether a PLACE / SITE ELEMENT has Audible signals for the viusally impaired.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityStructure }
     *     
     */
    public AccessibilityStructure getAudibleSignalsAvailable() {
        return audibleSignalsAvailable;
    }

    /**
     * Définit la valeur de la propriété audibleSignalsAvailable.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityStructure }
     *     
     */
    public void setAudibleSignalsAvailable(AccessibilityStructure value) {
        this.audibleSignalsAvailable = value;
    }

    public boolean isSetAudibleSignalsAvailable() {
        return (this.audibleSignalsAvailable!= null);
    }

    /**
     * Whether a PLACE / SITE ELEMENT has Visual signals for the hearing impaired.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityStructure }
     *     
     */
    public AccessibilityStructure getVisualSignsAvailable() {
        return visualSignsAvailable;
    }

    /**
     * Définit la valeur de la propriété visualSignsAvailable.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityStructure }
     *     
     */
    public void setVisualSignsAvailable(AccessibilityStructure value) {
        this.visualSignsAvailable = value;
    }

    public boolean isSetVisualSignsAvailable() {
        return (this.visualSignsAvailable!= null);
    }

    /**
     * Obtient la valeur de la propriété extensions.
     * 
     * @return
     *     possible object is
     *     {@link Extensions }
     *     
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Définit la valeur de la propriété extensions.
     * 
     * @param value
     *     allowed object is
     *     {@link Extensions }
     *     
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

    public boolean isSetExtensions() {
        return (this.extensions!= null);
    }

}
