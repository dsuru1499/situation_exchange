
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Response to a request to terminate a subscription or subscriptions.
 * 
 * <p>Classe Java pour TerminateSubscriptionResponseStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TerminateSubscriptionResponseStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}ResponseEndpointStructure">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.siri.org.uk/siri}TerminationStatusGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminateSubscriptionResponseStructure", propOrder = {
    "terminationResponseStatus"
})
public class TerminateSubscriptionResponseStructure
    extends ResponseEndpointStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TerminationResponseStatus")
    protected List<TerminationResponseStatusStructure> terminationResponseStatus;

    /**
     * Gets the value of the terminationResponseStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the terminationResponseStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerminationResponseStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TerminationResponseStatusStructure }
     * 
     * 
     */
    public List<TerminationResponseStatusStructure> getTerminationResponseStatus() {
        if (terminationResponseStatus == null) {
            terminationResponseStatus = new ArrayList<TerminationResponseStatusStructure>();
        }
        return this.terminationResponseStatus;
    }

    public boolean isSetTerminationResponseStatus() {
        return ((this.terminationResponseStatus!= null)&&(!this.terminationResponseStatus.isEmpty()));
    }

    public void unsetTerminationResponseStatus() {
        this.terminationResponseStatus = null;
    }

}
