
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for CALLing pattern for JOURNEY PATTERN.
 * 
 * <p>Classe Java pour OnwardCallsStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="OnwardCallsStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OnwardCall" type="{http://www.siri.org.uk/siri}OnwardCallStructure" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnwardCallsStructure", propOrder = {
    "onwardCall"
})
public class OnwardCallsStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "OnwardCall", required = true)
    protected List<OnwardCallStructure> onwardCall;

    /**
     * Gets the value of the onwardCall property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onwardCall property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnwardCall().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OnwardCallStructure }
     * 
     * 
     */
    public List<OnwardCallStructure> getOnwardCall() {
        if (onwardCall == null) {
            onwardCall = new ArrayList<OnwardCallStructure>();
        }
        return this.onwardCall;
    }

    public boolean isSetOnwardCall() {
        return ((this.onwardCall!= null)&&(!this.onwardCall.isEmpty()));
    }

    public void unsetOnwardCall() {
        this.onwardCall = null;
    }

}
