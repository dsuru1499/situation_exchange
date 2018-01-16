
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import uk.org.ifopt.acsb.AccessibilityAssessmentStructure;
import uk.org.ifopt.acsb.AccessibilityStructure;
import uk.org.ifopt.acsb.SuitabilityStructure;


/**
 * Type for sescription the MONITORED FACILITY itself.
 * 
 * <p>Classe Java pour FacilityStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="FacilityStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FacilityCode" type="{http://www.siri.org.uk/siri}FacilityCodeType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FacilityClass" type="{http://www.siri.org.uk/siri}FacilityCategoryEnumeration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Features" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Feature" type="{http://www.siri.org.uk/siri}AllFacilitiesFeatureStructure" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OwnerRef" type="{http://www.siri.org.uk/siri}OrganisationRefStructure" minOccurs="0"/>
 *         &lt;element name="OwnerName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/>
 *         &lt;element name="ValidityCondition" type="{http://www.siri.org.uk/siri}MonitoringValidityConditionStructure" minOccurs="0"/>
 *         &lt;element name="FacilityLocation" type="{http://www.siri.org.uk/siri}FacilityLocationStructure" minOccurs="0"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}FacilityAccessibilityGroup"/>
 *         &lt;element name="AccessibilityAssessment" type="{http://www.ifopt.org.uk/acsb}AccessibilityAssessmentStructure" minOccurs="0"/>
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
@XmlType(name = "FacilityStructure", propOrder = {
    "facilityCode",
    "description",
    "facilityClass",
    "features",
    "ownerRef",
    "ownerName",
    "validityCondition",
    "facilityLocation",
    "limitations",
    "suitabilities",
    "accessibilityAssessment",
    "extensions"
})
public class FacilityStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "FacilityCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String facilityCode;
    @XmlElement(name = "Description")
    protected List<NaturalLanguageStringStructure> description;
    @XmlElement(name = "FacilityClass")
    protected List<FacilityCategoryEnumeration> facilityClass;
    @XmlElement(name = "Features")
    protected FacilityStructure.Features features;
    @XmlElement(name = "OwnerRef")
    protected OrganisationRefStructure ownerRef;
    @XmlElement(name = "OwnerName")
    protected NaturalLanguageStringStructure ownerName;
    @XmlElement(name = "ValidityCondition")
    protected MonitoringValidityConditionStructure validityCondition;
    @XmlElement(name = "FacilityLocation")
    protected FacilityLocationStructure facilityLocation;
    @XmlElement(name = "Limitations")
    protected FacilityStructure.Limitations limitations;
    @XmlElement(name = "Suitabilities")
    protected FacilityStructure.Suitabilities suitabilities;
    @XmlElement(name = "AccessibilityAssessment")
    protected AccessibilityAssessmentStructure accessibilityAssessment;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété facilityCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityCode() {
        return facilityCode;
    }

    /**
     * Définit la valeur de la propriété facilityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityCode(String value) {
        this.facilityCode = value;
    }

    public boolean isSetFacilityCode() {
        return (this.facilityCode!= null);
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getDescription() {
        if (description == null) {
            description = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.description;
    }

    public boolean isSetDescription() {
        return ((this.description!= null)&&(!this.description.isEmpty()));
    }

    public void unsetDescription() {
        this.description = null;
    }

    /**
     * Gets the value of the facilityClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityCategoryEnumeration }
     * 
     * 
     */
    public List<FacilityCategoryEnumeration> getFacilityClass() {
        if (facilityClass == null) {
            facilityClass = new ArrayList<FacilityCategoryEnumeration>();
        }
        return this.facilityClass;
    }

    public boolean isSetFacilityClass() {
        return ((this.facilityClass!= null)&&(!this.facilityClass.isEmpty()));
    }

    public void unsetFacilityClass() {
        this.facilityClass = null;
    }

    /**
     * Obtient la valeur de la propriété features.
     * 
     * @return
     *     possible object is
     *     {@link FacilityStructure.Features }
     *     
     */
    public FacilityStructure.Features getFeatures() {
        return features;
    }

    /**
     * Définit la valeur de la propriété features.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityStructure.Features }
     *     
     */
    public void setFeatures(FacilityStructure.Features value) {
        this.features = value;
    }

    public boolean isSetFeatures() {
        return (this.features!= null);
    }

    /**
     * Obtient la valeur de la propriété ownerRef.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationRefStructure }
     *     
     */
    public OrganisationRefStructure getOwnerRef() {
        return ownerRef;
    }

    /**
     * Définit la valeur de la propriété ownerRef.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationRefStructure }
     *     
     */
    public void setOwnerRef(OrganisationRefStructure value) {
        this.ownerRef = value;
    }

    public boolean isSetOwnerRef() {
        return (this.ownerRef!= null);
    }

    /**
     * Obtient la valeur de la propriété ownerName.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getOwnerName() {
        return ownerName;
    }

    /**
     * Définit la valeur de la propriété ownerName.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setOwnerName(NaturalLanguageStringStructure value) {
        this.ownerName = value;
    }

    public boolean isSetOwnerName() {
        return (this.ownerName!= null);
    }

    /**
     * Obtient la valeur de la propriété validityCondition.
     * 
     * @return
     *     possible object is
     *     {@link MonitoringValidityConditionStructure }
     *     
     */
    public MonitoringValidityConditionStructure getValidityCondition() {
        return validityCondition;
    }

    /**
     * Définit la valeur de la propriété validityCondition.
     * 
     * @param value
     *     allowed object is
     *     {@link MonitoringValidityConditionStructure }
     *     
     */
    public void setValidityCondition(MonitoringValidityConditionStructure value) {
        this.validityCondition = value;
    }

    public boolean isSetValidityCondition() {
        return (this.validityCondition!= null);
    }

    /**
     * Obtient la valeur de la propriété facilityLocation.
     * 
     * @return
     *     possible object is
     *     {@link FacilityLocationStructure }
     *     
     */
    public FacilityLocationStructure getFacilityLocation() {
        return facilityLocation;
    }

    /**
     * Définit la valeur de la propriété facilityLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityLocationStructure }
     *     
     */
    public void setFacilityLocation(FacilityLocationStructure value) {
        this.facilityLocation = value;
    }

    public boolean isSetFacilityLocation() {
        return (this.facilityLocation!= null);
    }

    /**
     * Obtient la valeur de la propriété limitations.
     * 
     * @return
     *     possible object is
     *     {@link FacilityStructure.Limitations }
     *     
     */
    public FacilityStructure.Limitations getLimitations() {
        return limitations;
    }

    /**
     * Définit la valeur de la propriété limitations.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityStructure.Limitations }
     *     
     */
    public void setLimitations(FacilityStructure.Limitations value) {
        this.limitations = value;
    }

    public boolean isSetLimitations() {
        return (this.limitations!= null);
    }

    /**
     * Obtient la valeur de la propriété suitabilities.
     * 
     * @return
     *     possible object is
     *     {@link FacilityStructure.Suitabilities }
     *     
     */
    public FacilityStructure.Suitabilities getSuitabilities() {
        return suitabilities;
    }

    /**
     * Définit la valeur de la propriété suitabilities.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityStructure.Suitabilities }
     *     
     */
    public void setSuitabilities(FacilityStructure.Suitabilities value) {
        this.suitabilities = value;
    }

    public boolean isSetSuitabilities() {
        return (this.suitabilities!= null);
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
     *         &lt;element name="Feature" type="{http://www.siri.org.uk/siri}AllFacilitiesFeatureStructure" maxOccurs="unbounded"/>
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
        "feature"
    })
    public static class Features
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "Feature", required = true)
        protected List<AllFacilitiesFeatureStructure> feature;

        /**
         * Gets the value of the feature property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the feature property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFeature().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AllFacilitiesFeatureStructure }
         * 
         * 
         */
        public List<AllFacilitiesFeatureStructure> getFeature() {
            if (feature == null) {
                feature = new ArrayList<AllFacilitiesFeatureStructure>();
            }
            return this.feature;
        }

        public boolean isSetFeature() {
            return ((this.feature!= null)&&(!this.feature.isEmpty()));
        }

        public void unsetFeature() {
            this.feature = null;
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
     *         &lt;group ref="{http://www.ifopt.org.uk/acsb}MobilityLimitationGroup"/>
     *         &lt;group ref="{http://www.ifopt.org.uk/acsb}SensoryLimitationGroup"/>
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
        "wheelchairAccess",
        "stepFreeAccess",
        "escalatorFreeAccess",
        "liftFreeAccess",
        "audibleSignalsAvailable",
        "visualSignsAvailable"
    })
    public static class Limitations
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "WheelchairAccess", namespace = "http://www.ifopt.org.uk/acsb", required = true, defaultValue = "false")
        protected AccessibilityStructure wheelchairAccess;
        @XmlElement(name = "StepFreeAccess", namespace = "http://www.ifopt.org.uk/acsb", defaultValue = "unknown")
        protected AccessibilityStructure stepFreeAccess;
        @XmlElement(name = "EscalatorFreeAccess", namespace = "http://www.ifopt.org.uk/acsb", defaultValue = "unknown")
        protected AccessibilityStructure escalatorFreeAccess;
        @XmlElement(name = "LiftFreeAccess", namespace = "http://www.ifopt.org.uk/acsb", defaultValue = "unknown")
        protected AccessibilityStructure liftFreeAccess;
        @XmlElement(name = "AudibleSignalsAvailable", namespace = "http://www.ifopt.org.uk/acsb", defaultValue = "false")
        protected AccessibilityStructure audibleSignalsAvailable;
        @XmlElement(name = "VisualSignsAvailable", namespace = "http://www.ifopt.org.uk/acsb", defaultValue = "unknown")
        protected AccessibilityStructure visualSignsAvailable;

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
     *         &lt;element name="Suitability" type="{http://www.ifopt.org.uk/acsb}SuitabilityStructure" maxOccurs="unbounded"/>
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
        "suitability"
    })
    public static class Suitabilities
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "Suitability", required = true)
        protected List<SuitabilityStructure> suitability;

        /**
         * Gets the value of the suitability property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the suitability property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSuitability().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SuitabilityStructure }
         * 
         * 
         */
        public List<SuitabilityStructure> getSuitability() {
            if (suitability == null) {
                suitability = new ArrayList<SuitabilityStructure>();
            }
            return this.suitability;
        }

        public boolean isSetSuitability() {
            return ((this.suitability!= null)&&(!this.suitability.isEmpty()));
        }

        public void unsetSuitability() {
            this.suitability = null;
        }

    }

}
