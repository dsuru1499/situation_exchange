
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour UrlLink complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="UrlLink">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="urlLinkAddress" type="{http://datex2.eu/schema/2_0RC1/2_0}Url"/>
 *         &lt;element name="urlLinkDescription" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="urlLinkType" type="{http://datex2.eu/schema/2_0RC1/2_0}UrlLinkTypeEnum" minOccurs="0"/>
 *         &lt;element name="urlLinkExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UrlLink", propOrder = {
    "urlLinkAddress",
    "urlLinkDescription",
    "urlLinkType",
    "urlLinkExtension"
})
public class UrlLink
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String urlLinkAddress;
    protected MultilingualString urlLinkDescription;
    protected UrlLinkTypeEnum urlLinkType;
    protected ExtensionType urlLinkExtension;

    /**
     * Obtient la valeur de la propriété urlLinkAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlLinkAddress() {
        return urlLinkAddress;
    }

    /**
     * Définit la valeur de la propriété urlLinkAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlLinkAddress(String value) {
        this.urlLinkAddress = value;
    }

    public boolean isSetUrlLinkAddress() {
        return (this.urlLinkAddress!= null);
    }

    /**
     * Obtient la valeur de la propriété urlLinkDescription.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getUrlLinkDescription() {
        return urlLinkDescription;
    }

    /**
     * Définit la valeur de la propriété urlLinkDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setUrlLinkDescription(MultilingualString value) {
        this.urlLinkDescription = value;
    }

    public boolean isSetUrlLinkDescription() {
        return (this.urlLinkDescription!= null);
    }

    /**
     * Obtient la valeur de la propriété urlLinkType.
     * 
     * @return
     *     possible object is
     *     {@link UrlLinkTypeEnum }
     *     
     */
    public UrlLinkTypeEnum getUrlLinkType() {
        return urlLinkType;
    }

    /**
     * Définit la valeur de la propriété urlLinkType.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlLinkTypeEnum }
     *     
     */
    public void setUrlLinkType(UrlLinkTypeEnum value) {
        this.urlLinkType = value;
    }

    public boolean isSetUrlLinkType() {
        return (this.urlLinkType!= null);
    }

    /**
     * Obtient la valeur de la propriété urlLinkExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getUrlLinkExtension() {
        return urlLinkExtension;
    }

    /**
     * Définit la valeur de la propriété urlLinkExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setUrlLinkExtension(ExtensionType value) {
        this.urlLinkExtension = value;
    }

    public boolean isSetUrlLinkExtension() {
        return (this.urlLinkExtension!= null);
    }

}
