
package uk.org.siri.wsdl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import uk.org.siri.siri.ExtensionsStructure;
import uk.org.siri.siri.ProducerResponseEndpointStructure;
import uk.org.siri.siri.ServiceDeliveryBodyStructure;


/**
 * <p>Classe Java pour WsDataSupplyAnswerStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WsDataSupplyAnswerStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataSupplyAnswerInfo" type="{http://www.siri.org.uk/siri}ProducerResponseEndpointStructure"/>
 *         &lt;element name="Answer" type="{http://www.siri.org.uk/siri}ServiceDeliveryBodyStructure"/>
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
@XmlType(name = "WsDataSupplyAnswerStructure", propOrder = {
    "dataSupplyAnswerInfo",
    "answer",
    "answerExtension"
})
public class WsDataSupplyAnswerStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "DataSupplyAnswerInfo", required = true)
    protected ProducerResponseEndpointStructure dataSupplyAnswerInfo;
    @XmlElement(name = "Answer", required = true)
    protected ServiceDeliveryBodyStructure answer;
    @XmlElement(name = "AnswerExtension", required = true)
    protected ExtensionsStructure answerExtension;

    /**
     * Obtient la valeur de la propriété dataSupplyAnswerInfo.
     * 
     * @return
     *     possible object is
     *     {@link ProducerResponseEndpointStructure }
     *     
     */
    public ProducerResponseEndpointStructure getDataSupplyAnswerInfo() {
        return dataSupplyAnswerInfo;
    }

    /**
     * Définit la valeur de la propriété dataSupplyAnswerInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link ProducerResponseEndpointStructure }
     *     
     */
    public void setDataSupplyAnswerInfo(ProducerResponseEndpointStructure value) {
        this.dataSupplyAnswerInfo = value;
    }

    public boolean isSetDataSupplyAnswerInfo() {
        return (this.dataSupplyAnswerInfo!= null);
    }

    /**
     * Obtient la valeur de la propriété answer.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDeliveryBodyStructure }
     *     
     */
    public ServiceDeliveryBodyStructure getAnswer() {
        return answer;
    }

    /**
     * Définit la valeur de la propriété answer.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDeliveryBodyStructure }
     *     
     */
    public void setAnswer(ServiceDeliveryBodyStructure value) {
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
