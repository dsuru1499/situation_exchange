
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for stop timetable deliveries. Used in WSDL.
 * 
 * <p>Classe Java pour StopTimetableDeliveriesStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="StopTimetableDeliveriesStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}StopTimetableDelivery"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopTimetableDeliveriesStructure", propOrder = {
    "stopTimetableDelivery"
})
public class StopTimetableDeliveriesStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "StopTimetableDelivery", required = true)
    protected StopTimetableDeliveryStructure stopTimetableDelivery;

    /**
     * Obtient la valeur de la propriété stopTimetableDelivery.
     * 
     * @return
     *     possible object is
     *     {@link StopTimetableDeliveryStructure }
     *     
     */
    public StopTimetableDeliveryStructure getStopTimetableDelivery() {
        return stopTimetableDelivery;
    }

    /**
     * Définit la valeur de la propriété stopTimetableDelivery.
     * 
     * @param value
     *     allowed object is
     *     {@link StopTimetableDeliveryStructure }
     *     
     */
    public void setStopTimetableDelivery(StopTimetableDeliveryStructure value) {
        this.stopTimetableDelivery = value;
    }

    public boolean isSetStopTimetableDelivery() {
        return (this.stopTimetableDelivery!= null);
    }

}
