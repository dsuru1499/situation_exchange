
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Deliveries. Used in WSDL.
 * 
 * <p>Classe Java pour GeneralMessageDeliveriesStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GeneralMessageDeliveriesStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}GeneralMessageDelivery" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralMessageDeliveriesStructure", propOrder = {
    "generalMessageDelivery"
})
public class GeneralMessageDeliveriesStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "GeneralMessageDelivery", required = true)
    protected List<GeneralMessageDeliveryStructure> generalMessageDelivery;

    /**
     * Delivery for general Message service.Gets the value of the generalMessageDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalMessageDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralMessageDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralMessageDeliveryStructure }
     * 
     * 
     */
    public List<GeneralMessageDeliveryStructure> getGeneralMessageDelivery() {
        if (generalMessageDelivery == null) {
            generalMessageDelivery = new ArrayList<GeneralMessageDeliveryStructure>();
        }
        return this.generalMessageDelivery;
    }

    public boolean isSetGeneralMessageDelivery() {
        return ((this.generalMessageDelivery!= null)&&(!this.generalMessageDelivery.isEmpty()));
    }

    public void unsetGeneralMessageDelivery() {
        this.generalMessageDelivery = null;
    }

}
