
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
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
 * <p>Classe Java pour PredefinedLocation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PredefinedLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="predefinedLocationName" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="predefinedLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}Location"/>
 *         &lt;element name="predefinedLocationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
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
@XmlType(name = "PredefinedLocation", propOrder = {
    "predefinedLocationName",
    "predefinedLocation",
    "predefinedLocationExtension"
})
public class PredefinedLocation
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected MultilingualString predefinedLocationName;
    @XmlElement(required = true)
    protected Location predefinedLocation;
    protected ExtensionType predefinedLocationExtension;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Obtient la valeur de la propriété predefinedLocationName.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getPredefinedLocationName() {
        return predefinedLocationName;
    }

    /**
     * Définit la valeur de la propriété predefinedLocationName.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setPredefinedLocationName(MultilingualString value) {
        this.predefinedLocationName = value;
    }

    public boolean isSetPredefinedLocationName() {
        return (this.predefinedLocationName!= null);
    }

    /**
     * Obtient la valeur de la propriété predefinedLocation.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getPredefinedLocation() {
        return predefinedLocation;
    }

    /**
     * Définit la valeur de la propriété predefinedLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setPredefinedLocation(Location value) {
        this.predefinedLocation = value;
    }

    public boolean isSetPredefinedLocation() {
        return (this.predefinedLocation!= null);
    }

    /**
     * Obtient la valeur de la propriété predefinedLocationExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPredefinedLocationExtension() {
        return predefinedLocationExtension;
    }

    /**
     * Définit la valeur de la propriété predefinedLocationExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPredefinedLocationExtension(ExtensionType value) {
        this.predefinedLocationExtension = value;
    }

    public boolean isSetPredefinedLocationExtension() {
        return (this.predefinedLocationExtension!= null);
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
