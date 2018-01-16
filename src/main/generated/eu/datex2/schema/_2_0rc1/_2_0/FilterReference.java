
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour FilterReference complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="FilterReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deleteFilter" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/>
 *         &lt;element name="filterOperationApproved" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/>
 *         &lt;element name="keyFilterReference" type="{http://datex2.eu/schema/2_0RC1/2_0}Reference"/>
 *         &lt;element name="filterReferenceExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterReference", propOrder = {
    "deleteFilter",
    "filterOperationApproved",
    "keyFilterReference",
    "filterReferenceExtension"
})
public class FilterReference
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Boolean deleteFilter;
    protected Boolean filterOperationApproved;
    @XmlElement(required = true)
    protected String keyFilterReference;
    protected ExtensionType filterReferenceExtension;

    /**
     * Obtient la valeur de la propriété deleteFilter.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeleteFilter() {
        return deleteFilter;
    }

    /**
     * Définit la valeur de la propriété deleteFilter.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleteFilter(Boolean value) {
        this.deleteFilter = value;
    }

    public boolean isSetDeleteFilter() {
        return (this.deleteFilter!= null);
    }

    /**
     * Obtient la valeur de la propriété filterOperationApproved.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFilterOperationApproved() {
        return filterOperationApproved;
    }

    /**
     * Définit la valeur de la propriété filterOperationApproved.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFilterOperationApproved(Boolean value) {
        this.filterOperationApproved = value;
    }

    public boolean isSetFilterOperationApproved() {
        return (this.filterOperationApproved!= null);
    }

    /**
     * Obtient la valeur de la propriété keyFilterReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyFilterReference() {
        return keyFilterReference;
    }

    /**
     * Définit la valeur de la propriété keyFilterReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyFilterReference(String value) {
        this.keyFilterReference = value;
    }

    public boolean isSetKeyFilterReference() {
        return (this.keyFilterReference!= null);
    }

    /**
     * Obtient la valeur de la propriété filterReferenceExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getFilterReferenceExtension() {
        return filterReferenceExtension;
    }

    /**
     * Définit la valeur de la propriété filterReferenceExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setFilterReferenceExtension(ExtensionType value) {
        this.filterReferenceExtension = value;
    }

    public boolean isSetFilterReferenceExtension() {
        return (this.filterReferenceExtension!= null);
    }

}
