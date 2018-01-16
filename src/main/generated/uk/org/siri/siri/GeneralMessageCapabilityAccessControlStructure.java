
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for access control.
 * 
 * <p>Classe Java pour GeneralMessageCapabilityAccessControlStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GeneralMessageCapabilityAccessControlStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}CapabilityAccessControlStructure">
 *       &lt;sequence>
 *         &lt;element name="CheckInfoChannelRef" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralMessageCapabilityAccessControlStructure", propOrder = {
    "checkInfoChannelRef"
})
public class GeneralMessageCapabilityAccessControlStructure
    extends CapabilityAccessControlStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CheckInfoChannelRef", defaultValue = "true")
    protected boolean checkInfoChannelRef;

    /**
     * Obtient la valeur de la propriété checkInfoChannelRef.
     * 
     */
    public boolean isCheckInfoChannelRef() {
        return checkInfoChannelRef;
    }

    /**
     * Définit la valeur de la propriété checkInfoChannelRef.
     * 
     */
    public void setCheckInfoChannelRef(boolean value) {
        this.checkInfoChannelRef = value;
    }

    public boolean isSetCheckInfoChannelRef() {
        return true;
    }

}
