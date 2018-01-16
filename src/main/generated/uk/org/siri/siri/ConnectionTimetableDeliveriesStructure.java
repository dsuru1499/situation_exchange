
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Deliveries for Connection Timetable Service. Used in WSDl.
 * 
 * <p>Classe Java pour ConnectionTimetableDeliveriesStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ConnectionTimetableDeliveriesStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.siri.org.uk/siri}ConnectionTimetableDelivery"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionTimetableDeliveriesStructure", propOrder = {
    "connectionTimetableDelivery"
})
public class ConnectionTimetableDeliveriesStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ConnectionTimetableDelivery", required = true)
    protected ConnectionTimetableDeliveryStructure connectionTimetableDelivery;

    /**
     * Obtient la valeur de la propriété connectionTimetableDelivery.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionTimetableDeliveryStructure }
     *     
     */
    public ConnectionTimetableDeliveryStructure getConnectionTimetableDelivery() {
        return connectionTimetableDelivery;
    }

    /**
     * Définit la valeur de la propriété connectionTimetableDelivery.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionTimetableDeliveryStructure }
     *     
     */
    public void setConnectionTimetableDelivery(ConnectionTimetableDeliveryStructure value) {
        this.connectionTimetableDelivery = value;
    }

    public boolean isSetConnectionTimetableDelivery() {
        return (this.connectionTimetableDelivery!= null);
    }

}
