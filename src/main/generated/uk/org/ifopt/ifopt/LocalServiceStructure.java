
package uk.org.ifopt.ifopt;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import uk.org.siri.siri.ServiceFeatureRefStructure;


/**
 * Type for LOCAL SERVICE.
 * 
 * <p>Classe Java pour LocalServiceStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LocalServiceStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ifopt.org.uk/ifopt}InstalledEquipmentStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.ifopt.org.uk/ifopt}LocalServiceGroup"/>
 *         &lt;element ref="{http://www.ifopt.org.uk/ifopt}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalServiceStructure", propOrder = {
    "validityConditions",
    "featureRefs",
    "extensions"
})
public class LocalServiceStructure
    extends InstalledEquipmentStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ValidityConditions")
    protected ValidityConditionsStructure validityConditions;
    @XmlElement(name = "FeatureRefs")
    protected LocalServiceStructure.FeatureRefs featureRefs;
    @XmlElement(name = "Extensions")
    protected Extensions extensions;

    /**
     * Obtient la valeur de la propriété validityConditions.
     * 
     * @return
     *     possible object is
     *     {@link ValidityConditionsStructure }
     *     
     */
    public ValidityConditionsStructure getValidityConditions() {
        return validityConditions;
    }

    /**
     * Définit la valeur de la propriété validityConditions.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityConditionsStructure }
     *     
     */
    public void setValidityConditions(ValidityConditionsStructure value) {
        this.validityConditions = value;
    }

    public boolean isSetValidityConditions() {
        return (this.validityConditions!= null);
    }

    /**
     * Obtient la valeur de la propriété featureRefs.
     * 
     * @return
     *     possible object is
     *     {@link LocalServiceStructure.FeatureRefs }
     *     
     */
    public LocalServiceStructure.FeatureRefs getFeatureRefs() {
        return featureRefs;
    }

    /**
     * Définit la valeur de la propriété featureRefs.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalServiceStructure.FeatureRefs }
     *     
     */
    public void setFeatureRefs(LocalServiceStructure.FeatureRefs value) {
        this.featureRefs = value;
    }

    public boolean isSetFeatureRefs() {
        return (this.featureRefs!= null);
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
     *         &lt;element name="FeatureRef" type="{http://www.siri.org.uk/siri}ServiceFeatureRefStructure" maxOccurs="unbounded" minOccurs="0"/>
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
    public static class FeatureRefs
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "FeatureRef")
        protected List<ServiceFeatureRefStructure> featureRef;

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
         * {@link ServiceFeatureRefStructure }
         * 
         * 
         */
        public List<ServiceFeatureRefStructure> getFeatureRef() {
            if (featureRef == null) {
                featureRef = new ArrayList<ServiceFeatureRefStructure>();
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