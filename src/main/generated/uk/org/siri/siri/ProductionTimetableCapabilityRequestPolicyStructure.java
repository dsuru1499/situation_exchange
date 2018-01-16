
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Estimated ProductionCapability Request Policy.
 * 
 * <p>Classe Java pour ProductionTimetableCapabilityRequestPolicyStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ProductionTimetableCapabilityRequestPolicyStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}CapabilityRequestPolicyStructure">
 *       &lt;sequence>
 *         &lt;element name="ForeignJourneysOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductionTimetableCapabilityRequestPolicyStructure", propOrder = {
    "foreignJourneysOnly"
})
public class ProductionTimetableCapabilityRequestPolicyStructure
    extends CapabilityRequestPolicyStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ForeignJourneysOnly")
    protected Boolean foreignJourneysOnly;

    /**
     * Obtient la valeur de la propriété foreignJourneysOnly.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForeignJourneysOnly() {
        return foreignJourneysOnly;
    }

    /**
     * Définit la valeur de la propriété foreignJourneysOnly.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForeignJourneysOnly(Boolean value) {
        this.foreignJourneysOnly = value;
    }

    public boolean isSetForeignJourneysOnly() {
        return (this.foreignJourneysOnly!= null);
    }

}
