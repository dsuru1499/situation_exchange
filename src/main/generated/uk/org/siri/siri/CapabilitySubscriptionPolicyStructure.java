
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Common Subscription capabilities.
 * 
 * <p>Classe Java pour CapabilitySubscriptionPolicyStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CapabilitySubscriptionPolicyStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HasIncrementalUpdates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasChangeSensitivity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitySubscriptionPolicyStructure", propOrder = {
    "hasIncrementalUpdates",
    "hasChangeSensitivity"
})
public class CapabilitySubscriptionPolicyStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "HasIncrementalUpdates", defaultValue = "true")
    protected Boolean hasIncrementalUpdates;
    @XmlElement(name = "HasChangeSensitivity", defaultValue = "true")
    protected Boolean hasChangeSensitivity;

    /**
     * Obtient la valeur de la propriété hasIncrementalUpdates.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasIncrementalUpdates() {
        return hasIncrementalUpdates;
    }

    /**
     * Définit la valeur de la propriété hasIncrementalUpdates.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasIncrementalUpdates(Boolean value) {
        this.hasIncrementalUpdates = value;
    }

    public boolean isSetHasIncrementalUpdates() {
        return (this.hasIncrementalUpdates!= null);
    }

    /**
     * Obtient la valeur de la propriété hasChangeSensitivity.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasChangeSensitivity() {
        return hasChangeSensitivity;
    }

    /**
     * Définit la valeur de la propriété hasChangeSensitivity.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasChangeSensitivity(Boolean value) {
        this.hasChangeSensitivity = value;
    }

    public boolean isSetHasChangeSensitivity() {
        return (this.hasChangeSensitivity!= null);
    }

}
