
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for Requests for capabilities of the current system.
 * 
 * <p>Classe Java pour CapabilitiesRequestStructure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesRequestStructure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.siri.org.uk/siri}AuthenticatedRequestStructure">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://www.siri.org.uk/siri}EndpointAddress" minOccurs="0"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}RequestorRef"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}DelegatorEndpointGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}SiriServiceCapabilitiesRequestGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.siri.org.uk/siri}VersionString" default="2.0" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesRequestStructure", propOrder = {
    "address",
    "requestorRef",
    "delegatorAddress",
    "delegatorRef",
    "productionTimetableCapabilitiesRequest",
    "estimatedTimetableCapabilitiesRequest",
    "stopTimetableCapabilitiesRequest",
    "stopMonitoringCapabilitiesRequest",
    "vehicleMonitoringCapabilitiesRequest",
    "connectionTimetableCapabilitiesRequest",
    "connectionMonitoringCapabilitiesRequest",
    "generalMessageCapabilitiesRequest",
    "facilityMonitoringCapabilitiesRequest",
    "situationExchangeCapabilitiesRequest"
})
public class CapabilitiesRequestStructure
    extends AuthenticatedRequestStructure
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "RequestorRef", required = true)
    protected ParticipantRefStructure requestorRef;
    @XmlElement(name = "DelegatorAddress")
    protected String delegatorAddress;
    @XmlElement(name = "DelegatorRef")
    protected ParticipantRefStructure delegatorRef;
    @XmlElement(name = "ProductionTimetableCapabilitiesRequest")
    protected ProductionTimetableCapabilitiesRequest productionTimetableCapabilitiesRequest;
    @XmlElement(name = "EstimatedTimetableCapabilitiesRequest")
    protected ServiceCapabilitiesRequestStructure estimatedTimetableCapabilitiesRequest;
    @XmlElement(name = "StopTimetableCapabilitiesRequest")
    protected ServiceCapabilitiesRequestStructure stopTimetableCapabilitiesRequest;
    @XmlElement(name = "StopMonitoringCapabilitiesRequest")
    protected ServiceCapabilitiesRequestStructure stopMonitoringCapabilitiesRequest;
    @XmlElement(name = "VehicleMonitoringCapabilitiesRequest")
    protected ServiceCapabilitiesRequestStructure vehicleMonitoringCapabilitiesRequest;
    @XmlElement(name = "ConnectionTimetableCapabilitiesRequest")
    protected ServiceCapabilitiesRequestStructure connectionTimetableCapabilitiesRequest;
    @XmlElement(name = "ConnectionMonitoringCapabilitiesRequest")
    protected ServiceCapabilitiesRequestStructure connectionMonitoringCapabilitiesRequest;
    @XmlElement(name = "GeneralMessageCapabilitiesRequest")
    protected ServiceCapabilitiesRequestStructure generalMessageCapabilitiesRequest;
    @XmlElement(name = "FacilityMonitoringCapabilitiesRequest")
    protected ServiceCapabilitiesRequestStructure facilityMonitoringCapabilitiesRequest;
    @XmlElement(name = "SituationExchangeCapabilitiesRequest")
    protected ServiceCapabilitiesRequestStructure situationExchangeCapabilitiesRequest;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Obtient la valeur de la propriété address.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Définit la valeur de la propriété address.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    public boolean isSetAddress() {
        return (this.address!= null);
    }

    /**
     * Obtient la valeur de la propriété requestorRef.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public ParticipantRefStructure getRequestorRef() {
        return requestorRef;
    }

    /**
     * Définit la valeur de la propriété requestorRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public void setRequestorRef(ParticipantRefStructure value) {
        this.requestorRef = value;
    }

    public boolean isSetRequestorRef() {
        return (this.requestorRef!= null);
    }

    /**
     * Obtient la valeur de la propriété delegatorAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegatorAddress() {
        return delegatorAddress;
    }

    /**
     * Définit la valeur de la propriété delegatorAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegatorAddress(String value) {
        this.delegatorAddress = value;
    }

    public boolean isSetDelegatorAddress() {
        return (this.delegatorAddress!= null);
    }

    /**
     * Obtient la valeur de la propriété delegatorRef.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public ParticipantRefStructure getDelegatorRef() {
        return delegatorRef;
    }

    /**
     * Définit la valeur de la propriété delegatorRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantRefStructure }
     *     
     */
    public void setDelegatorRef(ParticipantRefStructure value) {
        this.delegatorRef = value;
    }

    public boolean isSetDelegatorRef() {
        return (this.delegatorRef!= null);
    }

    /**
     * Obtient la valeur de la propriété productionTimetableCapabilitiesRequest.
     * 
     * @return
     *     possible object is
     *     {@link ProductionTimetableCapabilitiesRequest }
     *     
     */
    public ProductionTimetableCapabilitiesRequest getProductionTimetableCapabilitiesRequest() {
        return productionTimetableCapabilitiesRequest;
    }

    /**
     * Définit la valeur de la propriété productionTimetableCapabilitiesRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductionTimetableCapabilitiesRequest }
     *     
     */
    public void setProductionTimetableCapabilitiesRequest(ProductionTimetableCapabilitiesRequest value) {
        this.productionTimetableCapabilitiesRequest = value;
    }

    public boolean isSetProductionTimetableCapabilitiesRequest() {
        return (this.productionTimetableCapabilitiesRequest!= null);
    }

    /**
     * Obtient la valeur de la propriété estimatedTimetableCapabilitiesRequest.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCapabilitiesRequestStructure }
     *     
     */
    public ServiceCapabilitiesRequestStructure getEstimatedTimetableCapabilitiesRequest() {
        return estimatedTimetableCapabilitiesRequest;
    }

    /**
     * Définit la valeur de la propriété estimatedTimetableCapabilitiesRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCapabilitiesRequestStructure }
     *     
     */
    public void setEstimatedTimetableCapabilitiesRequest(ServiceCapabilitiesRequestStructure value) {
        this.estimatedTimetableCapabilitiesRequest = value;
    }

    public boolean isSetEstimatedTimetableCapabilitiesRequest() {
        return (this.estimatedTimetableCapabilitiesRequest!= null);
    }

    /**
     * Obtient la valeur de la propriété stopTimetableCapabilitiesRequest.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCapabilitiesRequestStructure }
     *     
     */
    public ServiceCapabilitiesRequestStructure getStopTimetableCapabilitiesRequest() {
        return stopTimetableCapabilitiesRequest;
    }

    /**
     * Définit la valeur de la propriété stopTimetableCapabilitiesRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCapabilitiesRequestStructure }
     *     
     */
    public void setStopTimetableCapabilitiesRequest(ServiceCapabilitiesRequestStructure value) {
        this.stopTimetableCapabilitiesRequest = value;
    }

    public boolean isSetStopTimetableCapabilitiesRequest() {
        return (this.stopTimetableCapabilitiesRequest!= null);
    }

    /**
     * Obtient la valeur de la propriété stopMonitoringCapabilitiesRequest.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCapabilitiesRequestStructure }
     *     
     */
    public ServiceCapabilitiesRequestStructure getStopMonitoringCapabilitiesRequest() {
        return stopMonitoringCapabilitiesRequest;
    }

    /**
     * Définit la valeur de la propriété stopMonitoringCapabilitiesRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCapabilitiesRequestStructure }
     *     
     */
    public void setStopMonitoringCapabilitiesRequest(ServiceCapabilitiesRequestStructure value) {
        this.stopMonitoringCapabilitiesRequest = value;
    }

    public boolean isSetStopMonitoringCapabilitiesRequest() {
        return (this.stopMonitoringCapabilitiesRequest!= null);
    }

    /**
     * Obtient la valeur de la propriété vehicleMonitoringCapabilitiesRequest.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCapabilitiesRequestStructure }
     *     
     */
    public ServiceCapabilitiesRequestStructure getVehicleMonitoringCapabilitiesRequest() {
        return vehicleMonitoringCapabilitiesRequest;
    }

    /**
     * Définit la valeur de la propriété vehicleMonitoringCapabilitiesRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCapabilitiesRequestStructure }
     *     
     */
    public void setVehicleMonitoringCapabilitiesRequest(ServiceCapabilitiesRequestStructure value) {
        this.vehicleMonitoringCapabilitiesRequest = value;
    }

    public boolean isSetVehicleMonitoringCapabilitiesRequest() {
        return (this.vehicleMonitoringCapabilitiesRequest!= null);
    }

    /**
     * Obtient la valeur de la propriété connectionTimetableCapabilitiesRequest.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCapabilitiesRequestStructure }
     *     
     */
    public ServiceCapabilitiesRequestStructure getConnectionTimetableCapabilitiesRequest() {
        return connectionTimetableCapabilitiesRequest;
    }

    /**
     * Définit la valeur de la propriété connectionTimetableCapabilitiesRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCapabilitiesRequestStructure }
     *     
     */
    public void setConnectionTimetableCapabilitiesRequest(ServiceCapabilitiesRequestStructure value) {
        this.connectionTimetableCapabilitiesRequest = value;
    }

    public boolean isSetConnectionTimetableCapabilitiesRequest() {
        return (this.connectionTimetableCapabilitiesRequest!= null);
    }

    /**
     * Obtient la valeur de la propriété connectionMonitoringCapabilitiesRequest.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCapabilitiesRequestStructure }
     *     
     */
    public ServiceCapabilitiesRequestStructure getConnectionMonitoringCapabilitiesRequest() {
        return connectionMonitoringCapabilitiesRequest;
    }

    /**
     * Définit la valeur de la propriété connectionMonitoringCapabilitiesRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCapabilitiesRequestStructure }
     *     
     */
    public void setConnectionMonitoringCapabilitiesRequest(ServiceCapabilitiesRequestStructure value) {
        this.connectionMonitoringCapabilitiesRequest = value;
    }

    public boolean isSetConnectionMonitoringCapabilitiesRequest() {
        return (this.connectionMonitoringCapabilitiesRequest!= null);
    }

    /**
     * Obtient la valeur de la propriété generalMessageCapabilitiesRequest.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCapabilitiesRequestStructure }
     *     
     */
    public ServiceCapabilitiesRequestStructure getGeneralMessageCapabilitiesRequest() {
        return generalMessageCapabilitiesRequest;
    }

    /**
     * Définit la valeur de la propriété generalMessageCapabilitiesRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCapabilitiesRequestStructure }
     *     
     */
    public void setGeneralMessageCapabilitiesRequest(ServiceCapabilitiesRequestStructure value) {
        this.generalMessageCapabilitiesRequest = value;
    }

    public boolean isSetGeneralMessageCapabilitiesRequest() {
        return (this.generalMessageCapabilitiesRequest!= null);
    }

    /**
     * Obtient la valeur de la propriété facilityMonitoringCapabilitiesRequest.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCapabilitiesRequestStructure }
     *     
     */
    public ServiceCapabilitiesRequestStructure getFacilityMonitoringCapabilitiesRequest() {
        return facilityMonitoringCapabilitiesRequest;
    }

    /**
     * Définit la valeur de la propriété facilityMonitoringCapabilitiesRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCapabilitiesRequestStructure }
     *     
     */
    public void setFacilityMonitoringCapabilitiesRequest(ServiceCapabilitiesRequestStructure value) {
        this.facilityMonitoringCapabilitiesRequest = value;
    }

    public boolean isSetFacilityMonitoringCapabilitiesRequest() {
        return (this.facilityMonitoringCapabilitiesRequest!= null);
    }

    /**
     * Obtient la valeur de la propriété situationExchangeCapabilitiesRequest.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCapabilitiesRequestStructure }
     *     
     */
    public ServiceCapabilitiesRequestStructure getSituationExchangeCapabilitiesRequest() {
        return situationExchangeCapabilitiesRequest;
    }

    /**
     * Définit la valeur de la propriété situationExchangeCapabilitiesRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCapabilitiesRequestStructure }
     *     
     */
    public void setSituationExchangeCapabilitiesRequest(ServiceCapabilitiesRequestStructure value) {
        this.situationExchangeCapabilitiesRequest = value;
    }

    public boolean isSetSituationExchangeCapabilitiesRequest() {
        return (this.situationExchangeCapabilitiesRequest!= null);
    }

    /**
     * Obtient la valeur de la propriété version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "2.0";
        } else {
            return version;
        }
    }

    /**
     * Définit la valeur de la propriété version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    public boolean isSetVersion() {
        return (this.version!= null);
    }

}
