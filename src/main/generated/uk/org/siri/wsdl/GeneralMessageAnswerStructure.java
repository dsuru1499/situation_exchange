
package uk.org.siri.wsdl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import uk.org.siri.siri.ExtensionsStructure;
import uk.org.siri.siri.GeneralMessageDeliveriesStructure;
import uk.org.siri.siri.ProducerResponseEndpointStructure;


/**
 * <p>Classe Java pour GeneralMessageAnswerStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GeneralMessageAnswerStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceDeliveryInfo" type="{http://www.siri.org.uk/siri}ProducerResponseEndpointStructure"/>
 *         &lt;element name="Answer" type="{http://www.siri.org.uk/siri}GeneralMessageDeliveriesStructure"/>
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
@XmlType(name = "GeneralMessageAnswerStructure", propOrder = {
    "serviceDeliveryInfo",
    "answer",
    "answerExtension"
})
public class GeneralMessageAnswerStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ServiceDeliveryInfo", required = true)
    protected ProducerResponseEndpointStructure serviceDeliveryInfo;
    @XmlElement(name = "Answer", required = true)
    protected GeneralMessageDeliveriesStructure answer;
    @XmlElement(name = "AnswerExtension", required = true)
    protected ExtensionsStructure answerExtension;

    /**
     * Obtient la valeur de la propriété serviceDeliveryInfo.
     * 
     * @return
     *     possible object is
     *     {@link ProducerResponseEndpointStructure }
     *     
     */
    public ProducerResponseEndpointStructure getServiceDeliveryInfo() {
        return serviceDeliveryInfo;
    }

    /**
     * Définit la valeur de la propriété serviceDeliveryInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ProducerResponseEndpointStructure }
     *     
     */
    public void setServiceDeliveryInfo(ProducerResponseEndpointStructure value) {
        this.serviceDeliveryInfo = value;
    }

    public boolean isSetServiceDeliveryInfo() {
        return (this.serviceDeliveryInfo!= null);
    }

    /**
     * Obtient la valeur de la propriété answer.
     * 
     * @return
     *     possible object is
     *     {@link GeneralMessageDeliveriesStructure }
     *     
     */
    public GeneralMessageDeliveriesStructure getAnswer() {
        return answer;
    }

    /**
     * Définit la valeur de la propriété answer.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralMessageDeliveriesStructure }
     *     
     */
    public void setAnswer(GeneralMessageDeliveriesStructure value) {
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
