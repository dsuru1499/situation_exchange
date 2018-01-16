
package uk.org.ifopt.acsb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import uk.org.ifopt.ifopt.Extensions;


/**
 * Type for Assesment.
 * 
 * <p>Classe Java pour AccessibilityAssessmentStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AccessibilityAssessmentStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MobilityImpairedAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Limitations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AccessibilityLimitation" type="{http://www.ifopt.org.uk/acsb}AccessibilityLimitationStructure" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Suitabilities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Suitability" type="{http://www.ifopt.org.uk/acsb}SuitabilityStructure" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "AccessibilityAssessmentStructure", propOrder = {
    "mobilityImpairedAccess",
    "limitations",
    "suitabilities",
    "extensions"
})
public class AccessibilityAssessmentStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "MobilityImpairedAccess")
    protected boolean mobilityImpairedAccess;
    @XmlElement(name = "Limitations")
    protected AccessibilityAssessmentStructure.Limitations limitations;
    @XmlElement(name = "Suitabilities")
    protected AccessibilityAssessmentStructure.Suitabilities suitabilities;
    @XmlElement(name = "Extensions", namespace = "http://www.ifopt.org.uk/ifopt")
    protected Extensions extensions;

    /**
     * Obtient la valeur de la propriété mobilityImpairedAccess.
     * 
     */
    public boolean isMobilityImpairedAccess() {
        return mobilityImpairedAccess;
    }

    /**
     * Définit la valeur de la propriété mobilityImpairedAccess.
     * 
     */
    public void setMobilityImpairedAccess(boolean value) {
        this.mobilityImpairedAccess = value;
    }

    public boolean isSetMobilityImpairedAccess() {
        return true;
    }

    /**
     * Obtient la valeur de la propriété limitations.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityAssessmentStructure.Limitations }
     *     
     */
    public AccessibilityAssessmentStructure.Limitations getLimitations() {
        return limitations;
    }

    /**
     * Définit la valeur de la propriété limitations.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityAssessmentStructure.Limitations }
     *     
     */
    public void setLimitations(AccessibilityAssessmentStructure.Limitations value) {
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
     *     {@link AccessibilityAssessmentStructure.Suitabilities }
     *     
     */
    public AccessibilityAssessmentStructure.Suitabilities getSuitabilities() {
        return suitabilities;
    }

    /**
     * Définit la valeur de la propriété suitabilities.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityAssessmentStructure.Suitabilities }
     *     
     */
    public void setSuitabilities(AccessibilityAssessmentStructure.Suitabilities value) {
        this.suitabilities = value;
    }

    public boolean isSetSuitabilities() {
        return (this.suitabilities!= null);
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
     *         &lt;element name="AccessibilityLimitation" type="{http://www.ifopt.org.uk/acsb}AccessibilityLimitationStructure" maxOccurs="unbounded"/>
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
        "accessibilityLimitation"
    })
    public static class Limitations
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "AccessibilityLimitation", required = true)
        protected List<AccessibilityLimitationStructure> accessibilityLimitation;

        /**
         * Gets the value of the accessibilityLimitation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the accessibilityLimitation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccessibilityLimitation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AccessibilityLimitationStructure }
         * 
         * 
         */
        public List<AccessibilityLimitationStructure> getAccessibilityLimitation() {
            if (accessibilityLimitation == null) {
                accessibilityLimitation = new ArrayList<AccessibilityLimitationStructure>();
            }
            return this.accessibilityLimitation;
        }

        public boolean isSetAccessibilityLimitation() {
            return ((this.accessibilityLimitation!= null)&&(!this.accessibilityLimitation.isEmpty()));
        }

        public void unsetAccessibilityLimitation() {
            this.accessibilityLimitation = null;
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
