
package uk.org.siri.wsdl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import uk.org.siri.siri.ConnectionLinksDeliveryStructure;
import uk.org.siri.siri.ExtensionsStructure;


/**
 * <p>Classe Java pour WsConnectionLinksDiscoveryAnswerStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WsConnectionLinksDiscoveryAnswerStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Answer" type="{http://www.siri.org.uk/siri}ConnectionLinksDeliveryStructure"/>
 *         &lt;element name="AnswerExtension" type="{http://www.siri.org.uk/siri}ExtensionsStructure"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsConnectionLinksDiscoveryAnswerStructure", propOrder = {
    "answer",
    "answerExtension"
})
public class WsConnectionLinksDiscoveryAnswerStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Answer", required = true)
    protected ConnectionLinksDeliveryStructure answer;
    @XmlElement(name = "AnswerExtension", required = true)
    protected ExtensionsStructure answerExtension;

    /**
     * Obtient la valeur de la propriété answer.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionLinksDeliveryStructure }
     *     
     */
    public ConnectionLinksDeliveryStructure getAnswer() {
        return answer;
    }

    /**
     * Définit la valeur de la propriété answer.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionLinksDeliveryStructure }
     *     
     */
    public void setAnswer(ConnectionLinksDeliveryStructure value) {
        this.answer = value;
    }

    public boolean isSetAnswer() {
        return (this.answer!= null);
    }

    /**
     * Obtient la valeur de la propriété answerExtension.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getAnswerExtension() {
        return answerExtension;
    }

    /**
     * Définit la valeur de la propriété answerExtension.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setAnswerExtension(ExtensionsStructure value) {
        this.answerExtension = value;
    }

    public boolean isSetAnswerExtension() {
        return (this.answerExtension!= null);
    }

}
