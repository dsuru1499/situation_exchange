
package uk.org.siri.wsdl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import uk.org.siri.siri.ExtensionsStructure;
import uk.org.siri.siri.ResponseEndpointStructure;
import uk.org.siri.siri.SubscriptionResponseBodyStructure;


/**
 * <p>Classe Java pour WsSubscriptionAnswerStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WsSubscriptionAnswerStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriptionAnswerInfo" type="{http://www.siri.org.uk/siri}ResponseEndpointStructure"/>
 *         &lt;element name="Answer" type="{http://www.siri.org.uk/siri}SubscriptionResponseBodyStructure"/>
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
@XmlType(name = "WsSubscriptionAnswerStructure", propOrder = {
    "subscriptionAnswerInfo",
    "answer",
    "answerExtension"
})
public class WsSubscriptionAnswerStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SubscriptionAnswerInfo", required = true)
    protected ResponseEndpointStructure subscriptionAnswerInfo;
    @XmlElement(name = "Answer", required = true)
    protected SubscriptionResponseBodyStructure answer;
    @XmlElement(name = "AnswerExtension", required = true)
    protected ExtensionsStructure answerExtension;

    /**
     * Obtient la valeur de la propriété subscriptionAnswerInfo.
     * 
     * @return
     *     possible object is
     *     {@link ResponseEndpointStructure }
     *     
     */
    public ResponseEndpointStructure getSubscriptionAnswerInfo() {
        return subscriptionAnswerInfo;
    }

    /**
     * Définit la valeur de la propriété subscriptionAnswerInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseEndpointStructure }
     *     
     */
    public void setSubscriptionAnswerInfo(ResponseEndpointStructure value) {
        this.subscriptionAnswerInfo = value;
    }

    public boolean isSetSubscriptionAnswerInfo() {
        return (this.subscriptionAnswerInfo!= null);
    }

    /**
     * Obtient la valeur de la propriété answer.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionResponseBodyStructure }
     *     
     */
    public SubscriptionResponseBodyStructure getAnswer() {
        return answer;
    }

    /**
     * Définit la valeur de la propriété answer.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionResponseBodyStructure }
     *     
     */
    public void setAnswer(SubscriptionResponseBodyStructure value) {
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
