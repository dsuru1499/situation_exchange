
package uk.org.siri.wsdl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import uk.org.siri.siri.CheckStatusResponseBodyStructure;
import uk.org.siri.siri.ExtensionsStructure;
import uk.org.siri.siri.ProducerResponseEndpointStructure;


/**
 * <p>Classe Java pour WsCheckStatusResponseStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WsCheckStatusResponseStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CheckStatusAnswerInfo" type="{http://www.siri.org.uk/siri}ProducerResponseEndpointStructure"/>
 *         &lt;element name="Answer" type="{http://www.siri.org.uk/siri}CheckStatusResponseBodyStructure"/>
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
@XmlType(name = "WsCheckStatusResponseStructure", propOrder = {
    "checkStatusAnswerInfo",
    "answer",
    "answerExtension"
})
public class WsCheckStatusResponseStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CheckStatusAnswerInfo", required = true)
    protected ProducerResponseEndpointStructure checkStatusAnswerInfo;
    @XmlElement(name = "Answer", required = true)
    protected CheckStatusResponseBodyStructure answer;
    @XmlElement(name = "AnswerExtension", required = true)
    protected ExtensionsStructure answerExtension;

    /**
     * Obtient la valeur de la propriété checkStatusAnswerInfo.
     * 
     * @return
     *     possible object is
     *     {@link ProducerResponseEndpointStructure }
     *     
     */
    public ProducerResponseEndpointStructure getCheckStatusAnswerInfo() {
        return checkStatusAnswerInfo;
    }

    /**
     * Définit la valeur de la propriété checkStatusAnswerInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ProducerResponseEndpointStructure }
     *     
     */
    public void setCheckStatusAnswerInfo(ProducerResponseEndpointStructure value) {
        this.checkStatusAnswerInfo = value;
    }

    public boolean isSetCheckStatusAnswerInfo() {
        return (this.checkStatusAnswerInfo!= null);
    }

    /**
     * Obtient la valeur de la propriété answer.
     * 
     * @return
     *     possible object is
     *     {@link CheckStatusResponseBodyStructure }
     *     
     */
    public CheckStatusResponseBodyStructure getAnswer() {
        return answer;
    }

    /**
     * Définit la valeur de la propriété answer.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckStatusResponseBodyStructure }
     *     
     */
    public void setAnswer(CheckStatusResponseBodyStructure value) {
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
