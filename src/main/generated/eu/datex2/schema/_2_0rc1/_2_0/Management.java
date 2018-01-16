
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Management complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Management">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lifeCycleManagement" type="{http://datex2.eu/schema/2_0RC1/2_0}LifeCycleManagement" minOccurs="0"/>
 *         &lt;element name="filterExitManagement" type="{http://datex2.eu/schema/2_0RC1/2_0}FilterExitManagement" minOccurs="0"/>
 *         &lt;element name="managementExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Management", propOrder = {
    "lifeCycleManagement",
    "filterExitManagement",
    "managementExtension"
})
public class Management
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected LifeCycleManagement lifeCycleManagement;
    protected FilterExitManagement filterExitManagement;
    protected ExtensionType managementExtension;

    /**
     * Obtient la valeur de la propriété lifeCycleManagement.
     * 
     * @return
     *     possible object is
     *     {@link LifeCycleManagement }
     *     
     */
    public LifeCycleManagement getLifeCycleManagement() {
        return lifeCycleManagement;
    }

    /**
     * Définit la valeur de la propriété lifeCycleManagement.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeCycleManagement }
     *     
     */
    public void setLifeCycleManagement(LifeCycleManagement value) {
        this.lifeCycleManagement = value;
    }

    public boolean isSetLifeCycleManagement() {
        return (this.lifeCycleManagement!= null);
    }

    /**
     * Obtient la valeur de la propriété filterExitManagement.
     * 
     * @return
     *     possible object is
     *     {@link FilterExitManagement }
     *     
     */
    public FilterExitManagement getFilterExitManagement() {
        return filterExitManagement;
    }

    /**
     * Définit la valeur de la propriété filterExitManagement.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterExitManagement }
     *     
     */
    public void setFilterExitManagement(FilterExitManagement value) {
        this.filterExitManagement = value;
    }

    public boolean isSetFilterExitManagement() {
        return (this.filterExitManagement!= null);
    }

    /**
     * Obtient la valeur de la propriété managementExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getManagementExtension() {
        return managementExtension;
    }

    /**
     * Définit la valeur de la propriété managementExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setManagementExtension(ExtensionType value) {
        this.managementExtension = value;
    }

    public boolean isSetManagementExtension() {
        return (this.managementExtension!= null);
    }

}
