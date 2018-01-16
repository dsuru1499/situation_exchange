
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for image.
 * 
 * <p>Classe Java pour ImageStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ImageStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="ImageRef" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *           &lt;element name="ImageBinary" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;/choice>
 *         &lt;element name="ImageContent" type="{http://www.siri.org.uk/siri}ImageContentEnumeration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageStructure", propOrder = {
    "imageRef",
    "imageBinary",
    "imageContent"
})
@XmlSeeAlso({
    uk.org.siri.siri.PtSituationElementStructure.Images.Image.class
})
public class ImageStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ImageRef")
    @XmlSchemaType(name = "anyURI")
    protected String imageRef;
    @XmlElement(name = "ImageBinary")
    protected byte[] imageBinary;
    @XmlElement(name = "ImageContent")
    protected ImageContentEnumeration imageContent;

    /**
     * Obtient la valeur de la propriété imageRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageRef() {
        return imageRef;
    }

    /**
     * Définit la valeur de la propriété imageRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageRef(String value) {
        this.imageRef = value;
    }

    public boolean isSetImageRef() {
        return (this.imageRef!= null);
    }

    /**
     * Obtient la valeur de la propriété imageBinary.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImageBinary() {
        return imageBinary;
    }

    /**
     * Définit la valeur de la propriété imageBinary.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImageBinary(byte[] value) {
        this.imageBinary = value;
    }

    public boolean isSetImageBinary() {
        return (this.imageBinary!= null);
    }

    /**
     * Obtient la valeur de la propriété imageContent.
     * 
     * @return
     *     possible object is
     *     {@link ImageContentEnumeration }
     *     
     */
    public ImageContentEnumeration getImageContent() {
        return imageContent;
    }

    /**
     * Définit la valeur de la propriété imageContent.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageContentEnumeration }
     *     
     */
    public void setImageContent(ImageContentEnumeration value) {
        this.imageContent = value;
    }

    public boolean isSetImageContent() {
        return (this.imageContent!= null);
    }

}
