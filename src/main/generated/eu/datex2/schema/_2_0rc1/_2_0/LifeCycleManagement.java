
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour LifeCycleManagement complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="LifeCycleManagement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cancel" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/>
 *         &lt;element name="end" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/>
 *         &lt;element name="lifeCycleManagementExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LifeCycleManagement", propOrder = {
    "cancel",
    "end",
    "lifeCycleManagementExtension"
})
public class LifeCycleManagement
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected Boolean cancel;
    protected Boolean end;
    protected ExtensionType lifeCycleManagementExtension;

    /**
     * Obtient la valeur de la propriété cancel.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancel() {
        return cancel;
    }

    /**
     * Définit la valeur de la propriété cancel.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancel(Boolean value) {
        this.cancel = value;
    }

    public boolean isSetCancel() {
        return (this.cancel!= null);
    }

    /**
     * Obtient la valeur de la propriété end.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnd() {
        return end;
    }

    /**
     * Définit la valeur de la propriété end.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnd(Boolean value) {
        this.end = value;
    }

    public boolean isSetEnd() {
        return (this.end!= null);
    }

    /**
     * Obtient la valeur de la propriété lifeCycleManagementExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLifeCycleManagementExtension() {
        return lifeCycleManagementExtension;
    }

    /**
     * Définit la valeur de la propriété lifeCycleManagementExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLifeCycleManagementExtension(ExtensionType value) {
        this.lifeCycleManagementExtension = value;
    }

    public boolean isSetLifeCycleManagementExtension() {
        return (this.lifeCycleManagementExtension!= null);
    }

}
