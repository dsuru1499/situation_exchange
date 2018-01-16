
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour FilterExitManagement complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="FilterExitManagement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filterEnd" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean"/>
 *         &lt;element name="filterOutOfRange" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean"/>
 *         &lt;element name="filterExitManagementExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterExitManagement", propOrder = {
    "filterEnd",
    "filterOutOfRange",
    "filterExitManagementExtension"
})
public class FilterExitManagement
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected boolean filterEnd;
    protected boolean filterOutOfRange;
    protected ExtensionType filterExitManagementExtension;

    /**
     * Obtient la valeur de la propriété filterEnd.
     * 
     */
    public boolean isFilterEnd() {
        return filterEnd;
    }

    /**
     * Définit la valeur de la propriété filterEnd.
     * 
     */
    public void setFilterEnd(boolean value) {
        this.filterEnd = value;
    }

    public boolean isSetFilterEnd() {
        return true;
    }

    /**
     * Obtient la valeur de la propriété filterOutOfRange.
     * 
     */
    public boolean isFilterOutOfRange() {
        return filterOutOfRange;
    }

    /**
     * Définit la valeur de la propriété filterOutOfRange.
     * 
     */
    public void setFilterOutOfRange(boolean value) {
        this.filterOutOfRange = value;
    }

    public boolean isSetFilterOutOfRange() {
        return true;
    }

    /**
     * Obtient la valeur de la propriété filterExitManagementExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getFilterExitManagementExtension() {
        return filterExitManagementExtension;
    }

    /**
     * Définit la valeur de la propriété filterExitManagementExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setFilterExitManagementExtension(ExtensionType value) {
        this.filterExitManagementExtension = value;
    }

    public boolean isSetFilterExitManagementExtension() {
        return (this.filterExitManagementExtension!= null);
    }

}
