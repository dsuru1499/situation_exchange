
package uk.org.ifopt.ifopt;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AbstractProjection complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractProjection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Features" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GisFeatureRef" type="{http://www.ifopt.org.uk/ifopt}FeatureRefStructure" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractProjection", propOrder = {
    "features"
})
@XmlSeeAlso({
    ZoneProjectionStructure.class,
    PointProjectionStructure.class,
    LinkProjectionStructure.class
})
public class AbstractProjection implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Features")
    protected AbstractProjection.Features features;

    /**
     * Obtient la valeur de la propriété features.
     * 
     * @return
     *     possible object is
     *     {@link AbstractProjection.Features }
     *     
     */
    public AbstractProjection.Features getFeatures() {
        return features;
    }

    /**
     * Définit la valeur de la propriété features.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractProjection.Features }
     *     
     */
    public void setFeatures(AbstractProjection.Features value) {
        this.features = value;
    }

    public boolean isSetFeatures() {
        return (this.features!= null);
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
     *         &lt;element name="GisFeatureRef" type="{http://www.ifopt.org.uk/ifopt}FeatureRefStructure" maxOccurs="unbounded"/>
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
        "gisFeatureRef"
    })
    public static class Features
        implements Serializable
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(name = "GisFeatureRef", required = true)
        protected List<FeatureRefStructure> gisFeatureRef;

        /**
         * Gets the value of the gisFeatureRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the gisFeatureRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGisFeatureRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FeatureRefStructure }
         * 
         * 
         */
        public List<FeatureRefStructure> getGisFeatureRef() {
            if (gisFeatureRef == null) {
                gisFeatureRef = new ArrayList<FeatureRefStructure>();
            }
            return this.gisFeatureRef;
        }

        public boolean isSetGisFeatureRef() {
            return ((this.gisFeatureRef!= null)&&(!this.gisFeatureRef.isEmpty()));
        }

        public void unsetGisFeatureRef() {
            this.gisFeatureRef = null;
        }

    }

}
