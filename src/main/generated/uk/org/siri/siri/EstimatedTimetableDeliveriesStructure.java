
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Deliveries for Real-time Timetable Service. Used in WSDL. 
 * 
 * <p>Classe Java pour EstimatedTimetableDeliveriesStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EstimatedTimetableDeliveriesStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}EstimatedTimetableDelivery" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstimatedTimetableDeliveriesStructure", propOrder = {
    "estimatedTimetableDelivery"
})
public class EstimatedTimetableDeliveriesStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "EstimatedTimetableDelivery", required = true)
    protected List<EstimatedTimetableDeliveryStructure> estimatedTimetableDelivery;

    /**
     * Gets the value of the estimatedTimetableDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estimatedTimetableDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstimatedTimetableDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstimatedTimetableDeliveryStructure }
     * 
     * 
     */
    public List<EstimatedTimetableDeliveryStructure> getEstimatedTimetableDelivery() {
        if (estimatedTimetableDelivery == null) {
            estimatedTimetableDelivery = new ArrayList<EstimatedTimetableDeliveryStructure>();
        }
        return this.estimatedTimetableDelivery;
    }

    public boolean isSetEstimatedTimetableDelivery() {
        return ((this.estimatedTimetableDelivery!= null)&&(!this.estimatedTimetableDelivery.isEmpty()));
    }

    public void unsetEstimatedTimetableDelivery() {
        this.estimatedTimetableDelivery = null;
    }

}
