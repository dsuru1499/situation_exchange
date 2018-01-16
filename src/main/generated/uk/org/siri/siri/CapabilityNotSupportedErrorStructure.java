
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for Error: Service does not support requested capability.
 * 
 * <p>Classe Java pour CapabilityNotSupportedErrorStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CapabilityNotSupportedErrorStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}ErrorCodeStructure">
 *       &lt;sequence>
 *         &lt;element name="CapabilityRef" type="{http://www.siri.org.uk/siri}CapabilityCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilityNotSupportedErrorStructure", propOrder = {
    "capabilityRef"
})
public class CapabilityNotSupportedErrorStructure
    extends ErrorCodeStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CapabilityRef")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String capabilityRef;

    /**
     * Obtient la valeur de la propriété capabilityRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCapabilityRef() {
        return capabilityRef;
    }

    /**
     * Définit la valeur de la propriété capabilityRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCapabilityRef(String value) {
        this.capabilityRef = value;
    }

    public boolean isSetCapabilityRef() {
        return (this.capabilityRef!= null);
    }

}
