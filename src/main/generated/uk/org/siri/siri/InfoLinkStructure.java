
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for a general hyperlink.
 * 
 * <p>Classe Java pour InfoLinkStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="InfoLinkStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Uri" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="Label" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Image" type="{http://www.siri.org.uk/siri}ImageStructure" minOccurs="0"/>
 *         &lt;element name="LinkContent" type="{http://www.siri.org.uk/siri}LinkContentEnumeration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoLinkStructure", propOrder = {
    "uri",
    "label",
    "image",
    "linkContent"
})
public class InfoLinkStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Uri", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String uri;
    @XmlElement(name = "Label")
    protected List<NaturalLanguageStringStructure> label;
    @XmlElement(name = "Image")
    protected ImageStructure image;
    @XmlElement(name = "LinkContent")
    protected LinkContentEnumeration linkContent;

    /**
     * Obtient la valeur de la propriété uri.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Définit la valeur de la propriété uri.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
    }

    public boolean isSetUri() {
        return (this.uri!= null);
    }

    /**
     * Gets the value of the label property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the label property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getLabel() {
        if (label == null) {
            label = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.label;
    }

    public boolean isSetLabel() {
        return ((this.label!= null)&&(!this.label.isEmpty()));
    }

    public void unsetLabel() {
        this.label = null;
    }

    /**
     * Obtient la valeur de la propriété image.
     * 
     * @return
     *     possible object is
     *     {@link ImageStructure }
     *     
     */
    public ImageStructure getImage() {
        return image;
    }

    /**
     * Définit la valeur de la propriété image.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageStructure }
     *     
     */
    public void setImage(ImageStructure value) {
        this.image = value;
    }

    public boolean isSetImage() {
        return (this.image!= null);
    }

    /**
     * Obtient la valeur de la propriété linkContent.
     * 
     * @return
     *     possible object is
     *     {@link LinkContentEnumeration }
     *     
     */
    public LinkContentEnumeration getLinkContent() {
        return linkContent;
    }

    /**
     * Définit la valeur de la propriété linkContent.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkContentEnumeration }
     *     
     */
    public void setLinkContent(LinkContentEnumeration value) {
        this.linkContent = value;
    }

    public boolean isSetLinkContent() {
        return (this.linkContent!= null);
    }

}
