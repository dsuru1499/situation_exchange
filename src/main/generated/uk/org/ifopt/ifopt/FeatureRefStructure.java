
package uk.org.ifopt.ifopt;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for reference to a FEATURE.
 * 
 * <p>Classe Java pour FeatureRefStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="FeatureRefStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeatureIdRef" type="{http://www.ifopt.org.uk/ifopt}FeatureIdRefStructure"/>
 *         &lt;element name="FeatureType" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureRefStructure", propOrder = {
    "featureIdRef",
    "featureType"
})
public class FeatureRefStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "FeatureIdRef", required = true)
    protected FeatureIdRefStructure featureIdRef;
    @XmlElement(name = "FeatureType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String featureType;

    /**
     * Obtient la valeur de la propriété featureIdRef.
     * 
     * @return
     *     possible object is
     *     {@link FeatureIdRefStructure }
     *     
     */
    public FeatureIdRefStructure getFeatureIdRef() {
        return featureIdRef;
    }

    /**
     * Définit la valeur de la propriété featureIdRef.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureIdRefStructure }
     *     
     */
    public void setFeatureIdRef(FeatureIdRefStructure value) {
        this.featureIdRef = value;
    }

    public boolean isSetFeatureIdRef() {
        return (this.featureIdRef!= null);
    }

    /**
     * Obtient la valeur de la propriété featureType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureType() {
        return featureType;
    }

    /**
     * Définit la valeur de la propriété featureType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureType(String value) {
        this.featureType = value;
    }

    public boolean isSetFeatureType() {
        return (this.featureType!= null);
    }

}
