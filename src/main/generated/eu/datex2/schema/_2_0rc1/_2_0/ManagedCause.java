
package eu.datex2.schema._2_0rc1._2_0;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ManagedCause complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ManagedCause">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Cause">
 *       &lt;sequence>
 *         &lt;element name="managedCause" type="{http://datex2.eu/schema/2_0RC1/2_0}Reference" minOccurs="0"/>
 *         &lt;element name="managedCauseExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagedCause", propOrder = {
    "managedCause",
    "managedCauseExtension"
})
public class ManagedCause
    extends Cause
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String managedCause;
    protected ExtensionType managedCauseExtension;

    /**
     * Obtient la valeur de la propriété managedCause.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagedCause() {
        return managedCause;
    }

    /**
     * Définit la valeur de la propriété managedCause.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagedCause(String value) {
        this.managedCause = value;
    }

    public boolean isSetManagedCause() {
        return (this.managedCause!= null);
    }

    /**
     * Obtient la valeur de la propriété managedCauseExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getManagedCauseExtension() {
        return managedCauseExtension;
    }

    /**
     * Définit la valeur de la propriété managedCauseExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setManagedCauseExtension(ExtensionType value) {
        this.managedCauseExtension = value;
    }

    public boolean isSetManagedCauseExtension() {
        return (this.managedCauseExtension!= null);
    }

}
