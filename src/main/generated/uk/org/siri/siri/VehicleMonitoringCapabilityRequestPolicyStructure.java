
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for capability request policy.
 * 
 * <p>Classe Java pour VehicleMonitoringCapabilityRequestPolicyStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="VehicleMonitoringCapabilityRequestPolicyStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}CapabilityRequestPolicyStructure">
 *       &lt;sequence>
 *         &lt;element name="HasReferences" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasNames" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleMonitoringCapabilityRequestPolicyStructure", propOrder = {
    "hasReferences",
    "hasNames"
})
public class VehicleMonitoringCapabilityRequestPolicyStructure
    extends CapabilityRequestPolicyStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "HasReferences")
    protected Boolean hasReferences;
    @XmlElement(name = "HasNames", defaultValue = "false")
    protected Boolean hasNames;

    /**
     * Obtient la valeur de la propriété hasReferences.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasReferences() {
        return hasReferences;
    }

    /**
     * Définit la valeur de la propriété hasReferences.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasReferences(Boolean value) {
        this.hasReferences = value;
    }

    public boolean isSetHasReferences() {
        return (this.hasReferences!= null);
    }

    /**
     * Obtient la valeur de la propriété hasNames.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasNames() {
        return hasNames;
    }

    /**
     * Définit la valeur de la propriété hasNames.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasNames(Boolean value) {
        this.hasNames = value;
    }

    public boolean isSetHasNames() {
        return (this.hasNames!= null);
    }

}
