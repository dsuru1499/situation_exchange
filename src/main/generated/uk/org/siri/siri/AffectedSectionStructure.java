
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import uk.org.ifopt.ifopt.LinkProjectionStructure;


/**
 * Type for information about the sectons affected by a SITUATION.
 * 
 * <p>Classe Java pour AffectedSectionStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AffectedSectionStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SectionRef" type="{http://www.siri.org.uk/siri}SectionRefStructure" minOccurs="0"/>
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
@XmlType(name = "AffectedSectionStructure", propOrder = {
    "sectionRef",
    "linkProjection",
    "offset",
    "extensions"
})
public class AffectedSectionStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SectionRef")
    protected SectionRefStructure sectionRef;
    @XmlElement(name = "LinkProjection")
    protected LinkProjectionStructure linkProjection;
    @XmlElement(name = "Offset")
    protected OffsetStructure offset;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété sectionRef.
     * 
     * @return
     *     possible object is
     *     {@link SectionRefStructure }
     *     
     */
    public SectionRefStructure getSectionRef() {
        return sectionRef;
    }

    /**
     * Définit la valeur de la propriété sectionRef.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionRefStructure }
     *     
     */
    public void setSectionRef(SectionRefStructure value) {
        this.sectionRef = value;
    }

    public boolean isSetSectionRef() {
        return (this.sectionRef!= null);
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
