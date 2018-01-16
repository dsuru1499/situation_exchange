
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour PredefinedLocationSet complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PredefinedLocationSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="predefinedLocationSetName" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="predefinedLocationSetVersion" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="predefinedLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}PredefinedLocation" maxOccurs="unbounded"/>
 *         &lt;element name="predefinedLocationSetExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PredefinedLocationSet", propOrder = {
    "predefinedLocationSetName",
    "predefinedLocationSetVersion",
    "predefinedLocation",
    "predefinedLocationSetExtension"
})
public class PredefinedLocationSet
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected MultilingualString predefinedLocationSetName;
    protected BigInteger predefinedLocationSetVersion;
    @XmlElement(required = true)
    protected List<PredefinedLocation> predefinedLocation;
    protected ExtensionType predefinedLocationSetExtension;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Obtient la valeur de la propriété predefinedLocationSetName.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getPredefinedLocationSetName() {
        return predefinedLocationSetName;
    }

    /**
     * Définit la valeur de la propriété predefinedLocationSetName.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setPredefinedLocationSetName(MultilingualString value) {
        this.predefinedLocationSetName = value;
    }

    public boolean isSetPredefinedLocationSetName() {
        return (this.predefinedLocationSetName!= null);
    }

    /**
     * Obtient la valeur de la propriété predefinedLocationSetVersion.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPredefinedLocationSetVersion() {
        return predefinedLocationSetVersion;
    }

    /**
     * Définit la valeur de la propriété predefinedLocationSetVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPredefinedLocationSetVersion(BigInteger value) {
        this.predefinedLocationSetVersion = value;
    }

    public boolean isSetPredefinedLocationSetVersion() {
        return (this.predefinedLocationSetVersion!= null);
    }

    /**
     * Gets the value of the predefinedLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the predefinedLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredefinedLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PredefinedLocation }
     * 
     * 
     */
    public List<PredefinedLocation> getPredefinedLocation() {
        if (predefinedLocation == null) {
            predefinedLocation = new ArrayList<PredefinedLocation>();
        }
        return this.predefinedLocation;
    }

    public boolean isSetPredefinedLocation() {
        return ((this.predefinedLocation!= null)&&(!this.predefinedLocation.isEmpty()));
    }

    public void unsetPredefinedLocation() {
        this.predefinedLocation = null;
    }

    /**
     * Obtient la valeur de la propriété predefinedLocationSetExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPredefinedLocationSetExtension() {
        return predefinedLocationSetExtension;
    }

    /**
     * Définit la valeur de la propriété predefinedLocationSetExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPredefinedLocationSetExtension(ExtensionType value) {
        this.predefinedLocationSetExtension = value;
    }

    public boolean isSetPredefinedLocationSetExtension() {
        return (this.predefinedLocationSetExtension!= null);
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public boolean isSetId() {
        return (this.id!= null);
    }

}
