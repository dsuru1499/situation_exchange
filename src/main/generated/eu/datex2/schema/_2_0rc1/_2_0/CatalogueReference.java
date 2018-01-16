
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CatalogueReference complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CatalogueReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="keyCatalogueReference" type="{http://datex2.eu/schema/2_0RC1/2_0}Reference"/>
 *         &lt;element name="catalogueReferenceExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogueReference", propOrder = {
    "keyCatalogueReference",
    "catalogueReferenceExtension"
})
public class CatalogueReference
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String keyCatalogueReference;
    protected ExtensionType catalogueReferenceExtension;

    /**
     * Obtient la valeur de la propriété keyCatalogueReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyCatalogueReference() {
        return keyCatalogueReference;
    }

    /**
     * Définit la valeur de la propriété keyCatalogueReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyCatalogueReference(String value) {
        this.keyCatalogueReference = value;
    }

    public boolean isSetKeyCatalogueReference() {
        return (this.keyCatalogueReference!= null);
    }

    /**
     * Obtient la valeur de la propriété catalogueReferenceExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getCatalogueReferenceExtension() {
        return catalogueReferenceExtension;
    }

    /**
     * Définit la valeur de la propriété catalogueReferenceExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setCatalogueReferenceExtension(ExtensionType value) {
        this.catalogueReferenceExtension = value;
    }

    public boolean isSetCatalogueReferenceExtension() {
        return (this.catalogueReferenceExtension!= null);
    }

}
