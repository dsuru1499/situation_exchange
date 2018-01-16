
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Subscription for General Message Service.
 * 
 * <p>Classe Java pour GeneralMessageSubscriptionStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GeneralMessageSubscriptionStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractSubscriptionStructure">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}GeneralMessageRequest"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralMessageSubscriptionStructure", propOrder = {
    "generalMessageRequest",
    "extensions"
})
public class GeneralMessageSubscriptionStructure
    extends AbstractSubscriptionStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "GeneralMessageRequest", required = true)
    protected GeneralMessageRequestStructure generalMessageRequest;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Obtient la valeur de la propriété generalMessageRequest.
     * 
     * @return
     *     possible object is
     *     {@link GeneralMessageRequestStructure }
     *     
     */
    public GeneralMessageRequestStructure getGeneralMessageRequest() {
        return generalMessageRequest;
    }

    /**
     * Définit la valeur de la propriété generalMessageRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralMessageRequestStructure }
     *     
     */
    public void setGeneralMessageRequest(GeneralMessageRequestStructure value) {
        this.generalMessageRequest = value;
    }

    public boolean isSetGeneralMessageRequest() {
        return (this.generalMessageRequest!= null);
    }

    /**
     * Obtient la valeur de la propriété extensions.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Définit la valeur de la propriété extensions.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public boolean isSetExtensions() {
        return (this.extensions!= null);
    }

}
