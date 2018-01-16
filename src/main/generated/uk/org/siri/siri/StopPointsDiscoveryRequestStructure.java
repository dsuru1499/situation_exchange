
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Requests for stop reference data for use in service requests.
 * 
 * <p>Classe Java pour StopPointsDiscoveryRequestStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StopPointsDiscoveryRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractDiscoveryRequestStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}StopPointsDiscoveryRequestTopicGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}StopPointsDiscoveryRequestPolicyGroup"/>
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
@XmlType(name = "StopPointsDiscoveryRequestStructure", propOrder = {
    "boundingBox",
    "circle",
    "placeRef",
    "operatorRef",
    "lineRef",
    "language",
    "stopPointsDetailLevel",
    "extensions"
})
@XmlSeeAlso({
    StopPointsRequest.class
})
public class StopPointsDiscoveryRequestStructure
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
    @XmlElement(name = "OperatorRef")
    protected OperatorRefStructure operatorRef;
    @XmlElement(name = "LineRef")
    protected LineRefStructure lineRef;
    @XmlElement(name = "Language", defaultValue = "en")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;
    @XmlElement(name = "StopPointsDetailLevel", defaultValue = "normal")
    protected StopPointsDetailEnumeration stopPointsDetailLevel;
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
     * Obtient la valeur de la propriété lineRef.
     * 
     * @return
     *     possible object is
     *     {@link LineRefStructure }
     *     
     */
    public LineRefStructure getLineRef() {
        return lineRef;
    }

    /**
     * Définit la valeur de la propriété lineRef.
     * 
     * @param value
     *     allowed object is
     *     {@link LineRefStructure }
     *     
     */
    public void setLineRef(LineRefStructure value) {
        this.lineRef = value;
    }

    public boolean isSetLineRef() {
        return (this.lineRef!= null);
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
     * Obtient la valeur de la propriété stopPointsDetailLevel.
     * 
     * @return
     *     possible object is
     *     {@link StopPointsDetailEnumeration }
     *     
     */
    public StopPointsDetailEnumeration getStopPointsDetailLevel() {
        return stopPointsDetailLevel;
    }

    /**
     * Définit la valeur de la propriété stopPointsDetailLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointsDetailEnumeration }
     *     
     */
    public void setStopPointsDetailLevel(StopPointsDetailEnumeration value) {
        this.stopPointsDetailLevel = value;
    }

    public boolean isSetStopPointsDetailLevel() {
        return (this.stopPointsDetailLevel!= null);
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
