
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * Type for Subscription context - Configuration parameters which may be evrriden.
 * 
 * <p>Classe Java pour SubscriptionContextStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionContextStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HeartbeatInterval" type="{http://www.siri.org.uk/siri}PositiveDurationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionContextStructure", propOrder = {
    "heartbeatInterval"
})
public class SubscriptionContextStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "HeartbeatInterval")
    protected Duration heartbeatInterval;

    /**
     * Obtient la valeur de la propriété heartbeatInterval.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getHeartbeatInterval() {
        return heartbeatInterval;
    }

    /**
     * Définit la valeur de la propriété heartbeatInterval.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setHeartbeatInterval(Duration value) {
        this.heartbeatInterval = value;
    }

    public boolean isSetHeartbeatInterval() {
        return (this.heartbeatInterval!= null);
    }

}
