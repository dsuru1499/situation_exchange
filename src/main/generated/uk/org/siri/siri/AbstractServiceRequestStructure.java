
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Abstract Service Request for SIRI Service request.
 * 
 * <p>Classe Java pour AbstractServiceRequestStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractServiceRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractRequestStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ContextualisedRequestEndpointGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractServiceRequestStructure", propOrder = {
    "messageIdentifier"
})
@XmlSeeAlso({
    ServiceCapabilitiesRequestStructure.class,
    AbstractFunctionalServiceRequestStructure.class
})
public abstract class AbstractServiceRequestStructure
    extends AbstractRequestStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "MessageIdentifier")
    protected MessageQualifierStructure messageIdentifier;

    /**
     * Obtient la valeur de la propriété messageIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link MessageQualifierStructure }
     *     
     */
    public MessageQualifierStructure getMessageIdentifier() {
        return messageIdentifier;
    }

    /**
     * Définit la valeur de la propriété messageIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageQualifierStructure }
     *     
     */
    public void setMessageIdentifier(MessageQualifierStructure value) {
        this.messageIdentifier = value;
    }

    public boolean isSetMessageIdentifier() {
        return (this.messageIdentifier!= null);
    }

}
