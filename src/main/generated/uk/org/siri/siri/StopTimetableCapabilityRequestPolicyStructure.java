
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Monitoring Service Capability Request Policy.
 * 
 * <p>Classe Java pour StopTimetableCapabilityRequestPolicyStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StopTimetableCapabilityRequestPolicyStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}CapabilityRequestPolicyStructure">
 *       &lt;sequence>
 *         &lt;element name="UseReferences" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UseNames" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopTimetableCapabilityRequestPolicyStructure", propOrder = {
    "useReferences",
    "useNames"
})
public class StopTimetableCapabilityRequestPolicyStructure
    extends CapabilityRequestPolicyStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "UseReferences", defaultValue = "true")
    protected Boolean useReferences;
    @XmlElement(name = "UseNames", defaultValue = "false")
    protected Boolean useNames;

    /**
     * Obtient la valeur de la propriété useReferences.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseReferences() {
        return useReferences;
    }

    /**
     * Définit la valeur de la propriété useReferences.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseReferences(Boolean value) {
        this.useReferences = value;
    }

    public boolean isSetUseReferences() {
        return (this.useReferences!= null);
    }

    /**
     * Obtient la valeur de la propriété useNames.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseNames() {
        return useNames;
    }

    /**
     * Définit la valeur de la propriété useNames.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseNames(Boolean value) {
        this.useNames = value;
    }

    public boolean isSetUseNames() {
        return (this.useNames!= null);
    }

}
