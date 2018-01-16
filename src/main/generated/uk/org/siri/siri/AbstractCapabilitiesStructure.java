
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for Capabilities of StopMonitopring Service.
 * 
 * <p>Classe Java pour AbstractCapabilitiesStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractCapabilitiesStructure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GeneralInteraction" type="{http://www.siri.org.uk/siri}CapabilityGeneralInteractionStructure" minOccurs="0"/>
 *         &lt;element name="TransportDescription" type="{http://www.siri.org.uk/siri}TransportDescriptionStructure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractCapabilitiesStructure", propOrder = {
    "generalInteraction",
    "transportDescription"
})
@XmlSeeAlso({
    StopMonitoringServiceCapabilitiesStructure.class,
    SituationExchangeServiceCapabilitiesStructure.class,
    ProductionTimetableServiceCapabilitiesStructure.class,
    VehicleMonitoringServiceCapabilitiesStructure.class,
    StopTimetableServiceCapabilitiesStructure.class,
    ConnectionMonitoringServiceCapabilitiesStructure.class,
    FacilityMonitoringServiceCapabilitiesStructure.class,
    ConnectionTimetableServiceCapabilitiesStructure.class,
    GeneralMessageServiceCapabilitiesStructure.class,
    EstimatedTimetableServiceCapabilitiesStructure.class
})
public class AbstractCapabilitiesStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "GeneralInteraction")
    protected CapabilityGeneralInteractionStructure generalInteraction;
    @XmlElement(name = "TransportDescription")
    protected TransportDescriptionStructure transportDescription;

    /**
     * Obtient la valeur de la propriété generalInteraction.
     * 
     * @return
     *     possible object is
     *     {@link CapabilityGeneralInteractionStructure }
     *     
     */
    public CapabilityGeneralInteractionStructure getGeneralInteraction() {
        return generalInteraction;
    }

    /**
     * Définit la valeur de la propriété generalInteraction.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityGeneralInteractionStructure }
     *     
     */
    public void setGeneralInteraction(CapabilityGeneralInteractionStructure value) {
        this.generalInteraction = value;
    }

    public boolean isSetGeneralInteraction() {
        return (this.generalInteraction!= null);
    }

    /**
     * Obtient la valeur de la propriété transportDescription.
     * 
     * @return
     *     possible object is
     *     {@link TransportDescriptionStructure }
     *     
     */
    public TransportDescriptionStructure getTransportDescription() {
        return transportDescription;
    }

    /**
     * Définit la valeur de la propriété transportDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportDescriptionStructure }
     *     
     */
    public void setTransportDescription(TransportDescriptionStructure value) {
        this.transportDescription = value;
    }

    public boolean isSetTransportDescription() {
        return (this.transportDescription!= null);
    }

}
