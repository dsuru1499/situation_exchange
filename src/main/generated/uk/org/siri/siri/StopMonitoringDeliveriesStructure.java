
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Deliveries for Stop Monitoring Service. Used in WSDL.
 * 
 * <p>Classe Java pour StopMonitoringDeliveriesStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StopMonitoringDeliveriesStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}StopMonitoringDelivery" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopMonitoringDeliveriesStructure", propOrder = {
    "stopMonitoringDelivery"
})
public class StopMonitoringDeliveriesStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "StopMonitoringDelivery", required = true)
    protected List<StopMonitoringDeliveryStructure> stopMonitoringDelivery;

    /**
     * Delivery for Stop Event service.Gets the value of the stopMonitoringDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopMonitoringDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopMonitoringDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopMonitoringDeliveryStructure }
     * 
     * 
     */
    public List<StopMonitoringDeliveryStructure> getStopMonitoringDelivery() {
        if (stopMonitoringDelivery == null) {
            stopMonitoringDelivery = new ArrayList<StopMonitoringDeliveryStructure>();
        }
        return this.stopMonitoringDelivery;
    }

    public boolean isSetStopMonitoringDelivery() {
        return ((this.stopMonitoringDelivery!= null)&&(!this.stopMonitoringDelivery.isEmpty()));
    }

    public void unsetStopMonitoringDelivery() {
        this.stopMonitoringDelivery = null;
    }

}
