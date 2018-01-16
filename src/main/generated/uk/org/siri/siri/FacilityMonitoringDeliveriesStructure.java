
package uk.org.siri.siri;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Deliveries for VEHICLE monitoring services Used in WSDL.
 * 
 * <p>Classe Java pour FacilityMonitoringDeliveriesStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="FacilityMonitoringDeliveriesStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}FacilityMonitoringDelivery" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityMonitoringDeliveriesStructure", propOrder = {
    "facilityMonitoringDelivery"
})
public class FacilityMonitoringDeliveriesStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "FacilityMonitoringDelivery", required = true)
    protected List<FacilityMonitoringDeliveryStructure> facilityMonitoringDelivery;

    /**
     * Delivery for Vehicle Activity Service.Gets the value of the facilityMonitoringDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityMonitoringDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityMonitoringDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityMonitoringDeliveryStructure }
     * 
     * 
     */
    public List<FacilityMonitoringDeliveryStructure> getFacilityMonitoringDelivery() {
        if (facilityMonitoringDelivery == null) {
            facilityMonitoringDelivery = new ArrayList<FacilityMonitoringDeliveryStructure>();
        }
        return this.facilityMonitoringDelivery;
    }

    public boolean isSetFacilityMonitoringDelivery() {
        return ((this.facilityMonitoringDelivery!= null)&&(!this.facilityMonitoringDelivery.isEmpty()));
    }

    public void unsetFacilityMonitoringDelivery() {
        this.facilityMonitoringDelivery = null;
    }

}
