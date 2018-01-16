
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import uk.org.ifopt.ifopt.EquipmentRefStructure;
import uk.org.ifopt.ifopt.EquipmentStatusEnumeration;
import uk.org.ifopt.ifopt.EquipmentTypeRefStructure;


/**
 * Type for Availaibility Change of EQUIPMENT.
 * 
 * <p>Classe Java pour EquipmentAvailabilityStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EquipmentAvailabilityStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EquipmentRef" type="{http://www.ifopt.org.uk/ifopt}EquipmentRefStructure" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EquipmentTypeRef" type="{http://www.ifopt.org.uk/ifopt}EquipmentTypeRefStructure" minOccurs="0"/>
 *         &lt;element name="ValidityPeriod" type="{http://www.siri.org.uk/siri}HalfOpenTimestampOutputRangeStructure" minOccurs="0"/>
 *         &lt;element name="EquipmentStatus" type="{http://www.ifopt.org.uk/ifopt}EquipmentStatusEnumeration"/>
 *         &lt;element name="EquipmentFeatures" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FeatureRef" type="{http://www.siri.org.uk/siri}FeatureRefStructure" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "EquipmentAvailabilityStructure", propOrder = {
    "equipmentRef",
    "description",
    "equipmentTypeRef",
    "validityPeriod",
    "equipmentStatus",
    "equipmentFeatures",
    "extensions"
})
public class EquipmentAvailabilityStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "EquipmentRef")
    protected EquipmentRefStructure equipmentRef;
    @XmlElement(name = "Description")
    protected List<NaturalLanguageStringStructure> description;
    @XmlElement(name = "EquipmentTypeRef")
    protected EquipmentTypeRefStructure equipmentTypeRef;
    @XmlElement(name = "ValidityPeriod")
    protected HalfOpenTimestampOutputRangeStructure validityPeriod;
    @XmlElement(name = "EquipmentStatus", required = true, defaultValue = "notAvailable")
    protected EquipmentStatusEnumeration equipmentStatus;
    @XmlElement(name = "EquipmentFeatures")
    protected EquipmentAvailabilityStructure.EquipmentFeatures equipmentFeatures;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété equipmentRef.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentRefStructure }
     *     
     */
    public EquipmentRefStructure getEquipmentRef() {
        return equipmentRef;
    }

    /**
     * Définit la valeur de la propriété equipmentRef.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentRefStructure }
     *     
     */
    public void setEquipmentRef(EquipmentRefStructure value) {
        this.equipmentRef = value;
    }

    public boolean isSetEquipmentRef() {
        return (this.equipmentRef!= null);
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
     * Obtient la valeur de la propriété equipmentTypeRef.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentTypeRefStructure }
     *     
     */
    public EquipmentTypeRefStructure getEquipmentTypeRef() {
        return equipmentTypeRef;
    }

    /**
     * Définit la valeur de la propriété equipmentTypeRef.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentTypeRefStructure }
     *     
     */
    public void setEquipmentTypeRef(EquipmentTypeRefStructure value) {
        this.equipmentTypeRef = value;
    }

    public boolean isSetEquipmentTypeRef() {
        return (this.equipmentTypeRef!= null);
    }

    /**
     * Obtient la valeur de la propriété validityPeriod.
     * 
     * @return
     *     possible object is
     *     {@link HalfOpenTimestampOutputRangeStructure }
     *     
     */
    public HalfOpenTimestampOutputRangeStructure getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Définit la valeur de la propriété validityPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link HalfOpenTimestampOutputRangeStructure }
     *     
     */
    public void setValidityPeriod(HalfOpenTimestampOutputRangeStructure value) {
        this.validityPeriod = value;
    }

    public boolean isSetValidityPeriod() {
        return (this.validityPeriod!= null);
    }

    /**
     * Obtient la valeur de la propriété equipmentStatus.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentStatusEnumeration }
     *     
     */
    public EquipmentStatusEnumeration getEquipmentStatus() {
        return equipmentStatus;
    }

    /**
     * Définit la valeur de la propriété equipmentStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentStatusEnumeration }
     *     
     */
    public void setEquipmentStatus(EquipmentStatusEnumeration value) {
        this.equipmentStatus = value;
    }

    public boolean isSetEquipmentStatus() {
        return (this.equipmentStatus!= null);
    }

    /**
     * Obtient la valeur de la propriété equipmentFeatures.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentAvailabilityStructure.EquipmentFeatures }
     *     
     */
    public EquipmentAvailabilityStructure.EquipmentFeatures getEquipmentFeatures() {
        return equipmentFeatures;
    }

    /**
     * Définit la valeur de la propriété equipmentFeatures.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentAvailabilityStructure.EquipmentFeatures }
     *     
     */
    public void setEquipmentFeatures(EquipmentAvailabilityStructure.EquipmentFeatures value) {
        this.equipmentFeatures = value;
    }

    public boolean isSetEquipmentFeatures() {
        return (this.equipmentFeatures!= null);
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
     *         &lt;element name="FeatureRef" type="{http://www.siri.org.uk/siri}FeatureRefStructure" maxOccurs="unbounded"/>
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
        "featureRef"
    })
    public static class EquipmentFeatures
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "FeatureRef", required = true)
        protected List<FeatureRefStructure> featureRef;

        /**
         * Gets the value of the featureRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the featureRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFeatureRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FeatureRefStructure }
         * 
         * 
         */
        public List<FeatureRefStructure> getFeatureRef() {
            if (featureRef == null) {
                featureRef = new ArrayList<FeatureRefStructure>();
            }
            return this.featureRef;
        }

        public boolean isSetFeatureRef() {
            return ((this.featureRef!= null)&&(!this.featureRef.isEmpty()));
        }

        public void unsetFeatureRef() {
            this.featureRef = null;
        }

    }

}
