
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Common Access control capabilities.
 * 
 * <p>Classe Java pour CapabilityAccessControlStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CapabilityAccessControlStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestChecking" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilityAccessControlStructure", propOrder = {
    "requestChecking"
})
@XmlSeeAlso({
    uk.org.siri.siri.SituationExchangeServiceCapabilitiesStructure.AccessControl.class,
    uk.org.siri.siri.VehicleMonitoringServiceCapabilitiesStructure.AccessControl.class,
    uk.org.siri.siri.StopTimetableServiceCapabilitiesStructure.AccessControl.class,
    uk.org.siri.siri.FacilityMonitoringServiceCapabilitiesStructure.AccessControl.class,
    ConnectionCapabilityAccessControlStructure.class,
    GeneralMessageCapabilityAccessControlStructure.class,
    MonitoringCapabilityAccessControlStructure.class
})
public class CapabilityAccessControlStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "RequestChecking", defaultValue = "false")
    protected boolean requestChecking;

    /**
     * Obtient la valeur de la propriété requestChecking.
     * 
     */
    public boolean isRequestChecking() {
        return requestChecking;
    }

    /**
     * Définit la valeur de la propriété requestChecking.
     * 
     */
    public void setRequestChecking(boolean value) {
        this.requestChecking = value;
    }

    public boolean isSetRequestChecking() {
        return true;
    }

}
