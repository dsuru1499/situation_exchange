
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Requests for LINE data for use in service requests.
 * 
 * <p>Classe Java pour LinesDiscoveryRequestStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LinesDiscoveryRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractDiscoveryRequestStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}LinesDiscoveryRequestTopicGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}LinesDiscoveryRequestPolicyGroup"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.siri.org.uk/siri}VersionString" default="2.0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinesDiscoveryRequestStructure", propOrder = {
    "boundingBox",
    "circle",
    "placeRef",
    "lineDirectionRef",
    "operatorRef",
    "language",
    "linesDetailLevel",
    "extensions"
})
public class LinesDiscoveryRequestStructure
    extends AbstractDiscoveryRequestStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "BoundingBox")
    protected BoundingBoxStructure boundingBox;
    @XmlElement(name = "Circle")
    protected LocationStructure circle;
    @XmlElement(name = "PlaceRef")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String placeRef;
    @XmlElement(name = "LineDirectionRef")
    protected LineDirectionStructure lineDirectionRef;
    @XmlElement(name = "OperatorRef")
    protected OperatorRefStructure operatorRef;
    @XmlElement(name = "Language", defaultValue = "en")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;
    @XmlElement(name = "LinesDetailLevel", defaultValue = "normal")
    protected LinesDetailEnumeration linesDetailLevel;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Obtient la valeur de la propriété boundingBox.
     * 
     * @return
     *     possible object is
     *     {@link BoundingBoxStructure }
     *     
     */
    public BoundingBoxStructure getBoundingBox() {
        return boundingBox;
    }

    /**
     * Définit la valeur de la propriété boundingBox.
     * 
     * @param value
     *     allowed object is
     *     {@link BoundingBoxStructure }
     *     
     */
    public void setBoundingBox(BoundingBoxStructure value) {
        this.boundingBox = value;
    }

    public boolean isSetBoundingBox() {
        return (this.boundingBox!= null);
    }

    /**
     * Obtient la valeur de la propriété circle.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure }
     *     
     */
    public LocationStructure getCircle() {
        return circle;
    }

    /**
     * Définit la valeur de la propriété circle.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure }
     *     
     */
    public void setCircle(LocationStructure value) {
        this.circle = value;
    }

    public boolean isSetCircle() {
        return (this.circle!= null);
    }

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
     * Obtient la valeur de la propriété lineDirectionRef.
     * 
     * @return
     *     possible object is
     *     {@link LineDirectionStructure }
     *     
     */
    public LineDirectionStructure getLineDirectionRef() {
        return lineDirectionRef;
    }

    /**
     * Définit la valeur de la propriété lineDirectionRef.
     * 
     * @param value
     *     allowed object is
     *     {@link LineDirectionStructure }
     *     
     */
    public void setLineDirectionRef(LineDirectionStructure value) {
        this.lineDirectionRef = value;
    }

    public boolean isSetLineDirectionRef() {
        return (this.lineDirectionRef!= null);
    }

    /**
     * Obtient la valeur de la propriété operatorRef.
     * 
     * @return
     *     possible object is
     *     {@link OperatorRefStructure }
     *     
     */
    public OperatorRefStructure getOperatorRef() {
        return operatorRef;
    }

    /**
     * Définit la valeur de la propriété operatorRef.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorRefStructure }
     *     
     */
    public void setOperatorRef(OperatorRefStructure value) {
        this.operatorRef = value;
    }

    public boolean isSetOperatorRef() {
        return (this.operatorRef!= null);
    }

    /**
     * Obtient la valeur de la propriété language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Définit la valeur de la propriété language.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    public boolean isSetLanguage() {
        return (this.language!= null);
    }

    /**
     * Obtient la valeur de la propriété linesDetailLevel.
     * 
     * @return
     *     possible object is
     *     {@link LinesDetailEnumeration }
     *     
     */
    public LinesDetailEnumeration getLinesDetailLevel() {
        return linesDetailLevel;
    }

    /**
     * Définit la valeur de la propriété linesDetailLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link LinesDetailEnumeration }
     *     
     */
    public void setLinesDetailLevel(LinesDetailEnumeration value) {
        this.linesDetailLevel = value;
    }

    public boolean isSetLinesDetailLevel() {
        return (this.linesDetailLevel!= null);
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
     * Obtient la valeur de la propriété version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "2.0";
        } else {
            return version;
        }
    }

    /**
     * Définit la valeur de la propriété version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    public boolean isSetVersion() {
        return (this.version!= null);
    }

}
