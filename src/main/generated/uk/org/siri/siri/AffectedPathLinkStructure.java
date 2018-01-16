
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
import uk.org.ifopt.ifopt.AccessibilityFeatureEnumeration;
import uk.org.ifopt.ifopt.LinkProjectionStructure;


/**
 * Information about a CONNECTION link from a given stop affected by a SITUATION.
 * 
 * <p>Classe Java pour AffectedPathLinkStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AffectedPathLinkStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LinkRef" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LinkName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AccessibilityFeature" type="{http://www.ifopt.org.uk/ifopt}AccessibilityFeatureEnumeration" minOccurs="0"/>
 *         &lt;element name="LinkDirection" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ProjectionGroup"/>
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
@XmlType(name = "AffectedPathLinkStructure", propOrder = {
    "linkRef",
    "linkName",
    "accessibilityFeature",
    "linkDirection",
    "linkProjection",
    "offset",
    "extensions"
})
public class AffectedPathLinkStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "LinkRef")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected List<String> linkRef;
    @XmlElement(name = "LinkName")
    protected List<NaturalLanguageStringStructure> linkName;
    @XmlElement(name = "AccessibilityFeature")
    protected AccessibilityFeatureEnumeration accessibilityFeature;
    @XmlElement(name = "LinkDirection")
    protected List<String> linkDirection;
    @XmlElement(name = "LinkProjection")
    protected LinkProjectionStructure linkProjection;
    @XmlElement(name = "Offset")
    protected OffsetStructure offset;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the linkRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLinkRef() {
        if (linkRef == null) {
            linkRef = new ArrayList<String>();
        }
        return this.linkRef;
    }

    public boolean isSetLinkRef() {
        return ((this.linkRef!= null)&&(!this.linkRef.isEmpty()));
    }

    public void unsetLinkRef() {
        this.linkRef = null;
    }

    /**
     * Gets the value of the linkName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getLinkName() {
        if (linkName == null) {
            linkName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.linkName;
    }

    public boolean isSetLinkName() {
        return ((this.linkName!= null)&&(!this.linkName.isEmpty()));
    }

    public void unsetLinkName() {
        this.linkName = null;
    }

    /**
     * Obtient la valeur de la propriété accessibilityFeature.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityFeatureEnumeration }
     *     
     */
    public AccessibilityFeatureEnumeration getAccessibilityFeature() {
        return accessibilityFeature;
    }

    /**
     * Définit la valeur de la propriété accessibilityFeature.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityFeatureEnumeration }
     *     
     */
    public void setAccessibilityFeature(AccessibilityFeatureEnumeration value) {
        this.accessibilityFeature = value;
    }

    public boolean isSetAccessibilityFeature() {
        return (this.accessibilityFeature!= null);
    }

    /**
     * Gets the value of the linkDirection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkDirection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkDirection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLinkDirection() {
        if (linkDirection == null) {
            linkDirection = new ArrayList<String>();
        }
        return this.linkDirection;
    }

    public boolean isSetLinkDirection() {
        return ((this.linkDirection!= null)&&(!this.linkDirection.isEmpty()));
    }

    public void unsetLinkDirection() {
        this.linkDirection = null;
    }

    /**
     * Obtient la valeur de la propriété linkProjection.
     * 
     * @return
     *     possible object is
     *     {@link LinkProjectionStructure }
     *     
     */
    public LinkProjectionStructure getLinkProjection() {
        return linkProjection;
    }

    /**
     * Définit la valeur de la propriété linkProjection.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkProjectionStructure }
     *     
     */
    public void setLinkProjection(LinkProjectionStructure value) {
        this.linkProjection = value;
    }

    public boolean isSetLinkProjection() {
        return (this.linkProjection!= null);
    }

    /**
     * Obtient la valeur de la propriété offset.
     * 
     * @return
     *     possible object is
     *     {@link OffsetStructure }
     *     
     */
    public OffsetStructure getOffset() {
        return offset;
    }

    /**
     * Définit la valeur de la propriété offset.
     * 
     * @param value
     *     allowed object is
     *     {@link OffsetStructure }
     *     
     */
    public void setOffset(OffsetStructure value) {
        this.offset = value;
    }

    public boolean isSetOffset() {
        return (this.offset!= null);
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
