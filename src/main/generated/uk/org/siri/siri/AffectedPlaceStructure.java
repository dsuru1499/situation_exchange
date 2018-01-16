
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import uk.org.ifopt.acsb.AccessibilityAssessmentStructure;


/**
 * Type for annotated references to a TOPOGRAPHIC PLACE.
 * 
 * <p>Classe Java pour AffectedPlaceStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AffectedPlaceStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PlaceRef" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/>
 *         &lt;element name="PrivateCode" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/>
 *         &lt;element name="PlaceName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.siri.org.uk/siri}LocationStructure" minOccurs="0"/>
 *         &lt;element name="PlaceCategory" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/>
 *         &lt;element name="EquipmentRef" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AffectedPlaceStructure", propOrder = {
    "placeRef",
    "privateCode",
    "placeName",
    "location",
    "placeCategory",
    "equipmentRef",
    "accessibilityAssessment",
    "extensions"
})
public class AffectedPlaceStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PlaceRef")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String placeRef;
    @XmlElement(name = "PrivateCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String privateCode;
    @XmlElement(name = "PlaceName")
    protected List<NaturalLanguageStringStructure> placeName;
    @XmlElement(name = "Location")
    protected LocationStructure location;
    @XmlElement(name = "PlaceCategory")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String placeCategory;
    @XmlElement(name = "EquipmentRef")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected List<String> equipmentRef;
    @XmlElement(name = "AccessibilityAssessment")
    protected AccessibilityAssessmentStructure accessibilityAssessment;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété placeRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceRef() {
        return placeRef;
    }

    /**
     * Définit la valeur de la propriété placeRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceRef(String value) {
        this.placeRef = value;
    }

    public boolean isSetPlaceRef() {
        return (this.placeRef!= null);
    }

    /**
     * Obtient la valeur de la propriété privateCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateCode() {
        return privateCode;
    }

    /**
     * Définit la valeur de la propriété privateCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateCode(String value) {
        this.privateCode = value;
    }

    public boolean isSetPrivateCode() {
        return (this.privateCode!= null);
    }

    /**
     * Gets the value of the placeName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the placeName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlaceName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getPlaceName() {
        if (placeName == null) {
            placeName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.placeName;
    }

    public boolean isSetPlaceName() {
        return ((this.placeName!= null)&&(!this.placeName.isEmpty()));
    }

    public void unsetPlaceName() {
        this.placeName = null;
    }

    /**
     * Obtient la valeur de la propriété location.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure }
     *     
     */
    public LocationStructure getLocation() {
        return location;
    }

    /**
     * Définit la valeur de la propriété location.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure }
     *     
     */
    public void setLocation(LocationStructure value) {
        this.location = value;
    }

    public boolean isSetLocation() {
        return (this.location!= null);
    }

    /**
     * Obtient la valeur de la propriété placeCategory.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceCategory() {
        return placeCategory;
    }

    /**
     * Définit la valeur de la propriété placeCategory.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceCategory(String value) {
        this.placeCategory = value;
    }

    public boolean isSetPlaceCategory() {
        return (this.placeCategory!= null);
    }

    /**
     * Gets the value of the equipmentRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipmentRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipmentRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEquipmentRef() {
        if (equipmentRef == null) {
            equipmentRef = new ArrayList<String>();
        }
        return this.equipmentRef;
    }

    public boolean isSetEquipmentRef() {
        return ((this.equipmentRef!= null)&&(!this.equipmentRef.isEmpty()));
    }

    public void unsetEquipmentRef() {
        this.equipmentRef = null;
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

}
