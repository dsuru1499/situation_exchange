
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for Delviery Variant +SIRI v2.0
 * 
 * <p>Classe Java pour DeliveryVariantStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DeliveryVariantStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VariantType" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="Content" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryVariantStructure", propOrder = {
    "variantType",
    "content"
})
public class DeliveryVariantStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "VariantType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String variantType;
    @XmlElement(name = "Content", required = true)
    protected NaturalLanguageStringStructure content;

    /**
     * Obtient la valeur de la propriété variantType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariantType() {
        return variantType;
    }

    /**
     * Définit la valeur de la propriété variantType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariantType(String value) {
        this.variantType = value;
    }

    public boolean isSetVariantType() {
        return (this.variantType!= null);
    }

    /**
     * Obtient la valeur de la propriété content.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getContent() {
        return content;
    }

    /**
     * Définit la valeur de la propriété content.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setContent(NaturalLanguageStringStructure value) {
        this.content = value;
    }

    public boolean isSetContent() {
        return (this.content!= null);
    }

}
