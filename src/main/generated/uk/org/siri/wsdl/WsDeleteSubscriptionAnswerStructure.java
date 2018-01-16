
package uk.org.siri.wsdl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import uk.org.siri.siri.ExtensionsStructure;
import uk.org.siri.siri.ResponseEndpointStructure;
import uk.org.siri.siri.TerminateSubscriptionResponseStructure;


/**
 * <p>Classe Java pour WsDeleteSubscriptionAnswerStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WsDeleteSubscriptionAnswerStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeleteSubscriptionAnswerInfo" type="{http://www.siri.org.uk/siri}ResponseEndpointStructure"/>
 *         &lt;element name="Answer" type="{http://www.siri.org.uk/siri}TerminateSubscriptionResponseStructure"/>
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
@XmlType(name = "WsDeleteSubscriptionAnswerStructure", propOrder = {
    "deleteSubscriptionAnswerInfo",
    "answer",
    "answerExtension"
})
public class WsDeleteSubscriptionAnswerStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DeleteSubscriptionAnswerInfo", required = true)
    protected ResponseEndpointStructure deleteSubscriptionAnswerInfo;
    @XmlElement(name = "Answer", required = true)
    protected TerminateSubscriptionResponseStructure answer;
    @XmlElement(name = "AnswerExtension", required = true)
    protected ExtensionsStructure answerExtension;

    /**
     * Obtient la valeur de la propriété deleteSubscriptionAnswerInfo.
     * 
     * @return
     *     possible object is
     *     {@link ResponseEndpointStructure }
     *     
     */
    public ResponseEndpointStructure getDeleteSubscriptionAnswerInfo() {
        return deleteSubscriptionAnswerInfo;
    }

    /**
     * Définit la valeur de la propriété deleteSubscriptionAnswerInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseEndpointStructure }
     *     
     */
    public void setDeleteSubscriptionAnswerInfo(ResponseEndpointStructure value) {
        this.deleteSubscriptionAnswerInfo = value;
    }

    public boolean isSetDeleteSubscriptionAnswerInfo() {
        return (this.deleteSubscriptionAnswerInfo!= null);
    }

    /**
     * Obtient la valeur de la propriété answer.
     * 
     * @return
     *     possible object is
     *     {@link TerminateSubscriptionResponseStructure }
     *     
     */
    public TerminateSubscriptionResponseStructure getAnswer() {
        return answer;
    }

    /**
     * Définit la valeur de la propriété answer.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminateSubscriptionResponseStructure }
     *     
     */
    public void setAnswer(TerminateSubscriptionResponseStructure value) {
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
