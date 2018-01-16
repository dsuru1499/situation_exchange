
package uk.org.siri.siri;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;group ref="{http://www.siri.org.uk/siri}RequestGroup"/>
 *         &lt;group ref="{http://www.siri.org.uk/siri}ResponseGroup"/>
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="version" type="{http://www.siri.org.uk/siri}VersionString" default="2.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serviceRequest",
    "subscriptionRequest",
    "terminateSubscriptionRequest",
    "dataReadyNotification",
    "dataSupplyRequest",
    "checkStatusRequest",
    "heartbeatNotification",
    "capabilitiesRequest",
    "stopPointsRequest",
    "linesRequest",
    "serviceFeaturesRequest",
    "productCategoriesRequest",
    "vehicleFeaturesRequest",
    "infoChannelRequest",
    "facilityRequest",
    "connectionLinksRequest",
    "subscriptionResponse",
    "terminateSubscriptionResponse",
    "subscriptionTerminatedNotification",
    "dataReadyAcknowledgement",
    "serviceDelivery",
    "dataReceivedAcknowledgement",
    "checkStatusResponse",
    "capabilitiesResponse",
    "stopPointsDelivery",
    "linesDelivery",
    "productCategoriesDelivery",
    "serviceFeaturesDelivery",
    "vehicleFeaturesDelivery",
    "infoChannelDelivery",
    "facilityDelivery",
    "connectionLinksDelivery",
    "extensions"
})
@XmlRootElement(name = "Siri")
public class Siri
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ServiceRequest")
    protected ServiceRequest serviceRequest;
    @XmlElement(name = "SubscriptionRequest")
    protected SubscriptionRequest subscriptionRequest;
    @XmlElement(name = "TerminateSubscriptionRequest")
    protected TerminateSubscriptionRequestStructure terminateSubscriptionRequest;
    @XmlElement(name = "DataReadyNotification")
    protected DataReadyRequestStructure dataReadyNotification;
    @XmlElement(name = "DataSupplyRequest")
    protected DataSupplyRequestStructure dataSupplyRequest;
    @XmlElement(name = "CheckStatusRequest")
    protected CheckStatusRequestStructure checkStatusRequest;
    @XmlElement(name = "HeartbeatNotification")
    protected HeartbeatNotificationStructure heartbeatNotification;
    @XmlElement(name = "CapabilitiesRequest")
    protected CapabilitiesRequestStructure capabilitiesRequest;
    @XmlElement(name = "StopPointsRequest")
    protected StopPointsRequest stopPointsRequest;
    @XmlElement(name = "LinesRequest")
    protected LinesDiscoveryRequestStructure linesRequest;
    @XmlElement(name = "ServiceFeaturesRequest")
    protected ServiceFeaturesRequest serviceFeaturesRequest;
    @XmlElement(name = "ProductCategoriesRequest")
    protected ProductCategoriesDiscoveryRequestStructure productCategoriesRequest;
    @XmlElement(name = "VehicleFeaturesRequest")
    protected VehicleFeaturesRequestStructure vehicleFeaturesRequest;
    @XmlElement(name = "InfoChannelRequest")
    protected InfoChannelDiscoveryRequestStructure infoChannelRequest;
    @XmlElement(name = "FacilityRequest")
    protected FacilityRequestStructure facilityRequest;
    @XmlElement(name = "ConnectionLinksRequest")
    protected ConnectionLinksDiscoveryRequestStructure connectionLinksRequest;
    @XmlElement(name = "SubscriptionResponse")
    protected SubscriptionResponseStructure subscriptionResponse;
    @XmlElement(name = "TerminateSubscriptionResponse")
    protected TerminateSubscriptionResponseStructure terminateSubscriptionResponse;
    @XmlElement(name = "SubscriptionTerminatedNotification")
    protected SubscriptionTerminatedNotificationStructure subscriptionTerminatedNotification;
    @XmlElement(name = "DataReadyAcknowledgement")
    protected DataReadyResponseStructure dataReadyAcknowledgement;
    @XmlElement(name = "ServiceDelivery")
    protected ServiceDelivery serviceDelivery;
    @XmlElement(name = "DataReceivedAcknowledgement")
    protected DataReceivedResponseStructure dataReceivedAcknowledgement;
    @XmlElement(name = "CheckStatusResponse")
    protected CheckStatusResponseStructure checkStatusResponse;
    @XmlElement(name = "CapabilitiesResponse")
    protected CapabilitiesResponseStructure capabilitiesResponse;
    @XmlElement(name = "StopPointsDelivery")
    protected StopPointsDeliveryStructure stopPointsDelivery;
    @XmlElement(name = "LinesDelivery")
    protected LinesDeliveryStructure linesDelivery;
    @XmlElement(name = "ProductCategoriesDelivery")
    protected ProductCategoriesDeliveryStructure productCategoriesDelivery;
    @XmlElement(name = "ServiceFeaturesDelivery")
    protected ServiceFeaturesDeliveryStructure serviceFeaturesDelivery;
    @XmlElement(name = "VehicleFeaturesDelivery")
    protected VehicleFeaturesDeliveryStructure vehicleFeaturesDelivery;
    @XmlElement(name = "InfoChannelDelivery")
    protected InfoChannelDeliveryStructure infoChannelDelivery;
    @XmlElement(name = "FacilityDelivery")
    protected FacilityDeliveryStructure facilityDelivery;
    @XmlElement(name = "ConnectionLinksDelivery")
    protected ConnectionLinksDeliveryStructure connectionLinksDelivery;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Obtient la valeur de la propriété serviceRequest.
     * 
     * @return
     *     possible object is
     *     {@link ServiceRequest }
     *     
     */
    public ServiceRequest getServiceRequest() {
        return serviceRequest;
    }

    /**
     * Définit la valeur de la propriété serviceRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRequest }
     *     
     */
    public void setServiceRequest(ServiceRequest value) {
        this.serviceRequest = value;
    }

    public boolean isSetServiceRequest() {
        return (this.serviceRequest!= null);
    }

    /**
     * Obtient la valeur de la propriété subscriptionRequest.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionRequest }
     *     
     */
    public SubscriptionRequest getSubscriptionRequest() {
        return subscriptionRequest;
    }

    /**
     * Définit la valeur de la propriété subscriptionRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionRequest }
     *     
     */
    public void setSubscriptionRequest(SubscriptionRequest value) {
        this.subscriptionRequest = value;
    }

    public boolean isSetSubscriptionRequest() {
        return (this.subscriptionRequest!= null);
    }

    /**
     * Obtient la valeur de la propriété terminateSubscriptionRequest.
     * 
     * @return
     *     possible object is
     *     {@link TerminateSubscriptionRequestStructure }
     *     
     */
    public TerminateSubscriptionRequestStructure getTerminateSubscriptionRequest() {
        return terminateSubscriptionRequest;
    }

    /**
     * Définit la valeur de la propriété terminateSubscriptionRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminateSubscriptionRequestStructure }
     *     
     */
    public void setTerminateSubscriptionRequest(TerminateSubscriptionRequestStructure value) {
        this.terminateSubscriptionRequest = value;
    }

    public boolean isSetTerminateSubscriptionRequest() {
        return (this.terminateSubscriptionRequest!= null);
    }

    /**
     * Obtient la valeur de la propriété dataReadyNotification.
     * 
     * @return
     *     possible object is
     *     {@link DataReadyRequestStructure }
     *     
     */
    public DataReadyRequestStructure getDataReadyNotification() {
        return dataReadyNotification;
    }

    /**
     * Définit la valeur de la propriété dataReadyNotification.
     * 
     * @param value
     *     allowed object is
     *     {@link DataReadyRequestStructure }
     *     
     */
    public void setDataReadyNotification(DataReadyRequestStructure value) {
        this.dataReadyNotification = value;
    }

    public boolean isSetDataReadyNotification() {
        return (this.dataReadyNotification!= null);
    }

    /**
     * Obtient la valeur de la propriété dataSupplyRequest.
     * 
     * @return
     *     possible object is
     *     {@link DataSupplyRequestStructure }
     *     
     */
    public DataSupplyRequestStructure getDataSupplyRequest() {
        return dataSupplyRequest;
    }

    /**
     * Définit la valeur de la propriété dataSupplyRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSupplyRequestStructure }
     *     
     */
    public void setDataSupplyRequest(DataSupplyRequestStructure value) {
        this.dataSupplyRequest = value;
    }

    public boolean isSetDataSupplyRequest() {
        return (this.dataSupplyRequest!= null);
    }

    /**
     * Obtient la valeur de la propriété checkStatusRequest.
     * 
     * @return
     *     possible object is
     *     {@link CheckStatusRequestStructure }
     *     
     */
    public CheckStatusRequestStructure getCheckStatusRequest() {
        return checkStatusRequest;
    }

    /**
     * Définit la valeur de la propriété checkStatusRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckStatusRequestStructure }
     *     
     */
    public void setCheckStatusRequest(CheckStatusRequestStructure value) {
        this.checkStatusRequest = value;
    }

    public boolean isSetCheckStatusRequest() {
        return (this.checkStatusRequest!= null);
    }

    /**
     * Obtient la valeur de la propriété heartbeatNotification.
     * 
     * @return
     *     possible object is
     *     {@link HeartbeatNotificationStructure }
     *     
     */
    public HeartbeatNotificationStructure getHeartbeatNotification() {
        return heartbeatNotification;
    }

    /**
     * Définit la valeur de la propriété heartbeatNotification.
     * 
     * @param value
     *     allowed object is
     *     {@link HeartbeatNotificationStructure }
     *     
     */
    public void setHeartbeatNotification(HeartbeatNotificationStructure value) {
        this.heartbeatNotification = value;
    }

    public boolean isSetHeartbeatNotification() {
        return (this.heartbeatNotification!= null);
    }

    /**
     * Obtient la valeur de la propriété capabilitiesRequest.
     * 
     * @return
     *     possible object is
     *     {@link CapabilitiesRequestStructure }
     *     
     */
    public CapabilitiesRequestStructure getCapabilitiesRequest() {
        return capabilitiesRequest;
    }

    /**
     * Définit la valeur de la propriété capabilitiesRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilitiesRequestStructure }
     *     
     */
    public void setCapabilitiesRequest(CapabilitiesRequestStructure value) {
        this.capabilitiesRequest = value;
    }

    public boolean isSetCapabilitiesRequest() {
        return (this.capabilitiesRequest!= null);
    }

    /**
     * Obtient la valeur de la propriété stopPointsRequest.
     * 
     * @return
     *     possible object is
     *     {@link StopPointsRequest }
     *     
     */
    public StopPointsRequest getStopPointsRequest() {
        return stopPointsRequest;
    }

    /**
     * Définit la valeur de la propriété stopPointsRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointsRequest }
     *     
     */
    public void setStopPointsRequest(StopPointsRequest value) {
        this.stopPointsRequest = value;
    }

    public boolean isSetStopPointsRequest() {
        return (this.stopPointsRequest!= null);
    }

    /**
     * Obtient la valeur de la propriété linesRequest.
     * 
     * @return
     *     possible object is
     *     {@link LinesDiscoveryRequestStructure }
     *     
     */
    public LinesDiscoveryRequestStructure getLinesRequest() {
        return linesRequest;
    }

    /**
     * Définit la valeur de la propriété linesRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link LinesDiscoveryRequestStructure }
     *     
     */
    public void setLinesRequest(LinesDiscoveryRequestStructure value) {
        this.linesRequest = value;
    }

    public boolean isSetLinesRequest() {
        return (this.linesRequest!= null);
    }

    /**
     * Obtient la valeur de la propriété serviceFeaturesRequest.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFeaturesRequest }
     *     
     */
    public ServiceFeaturesRequest getServiceFeaturesRequest() {
        return serviceFeaturesRequest;
    }

    /**
     * Définit la valeur de la propriété serviceFeaturesRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFeaturesRequest }
     *     
     */
    public void setServiceFeaturesRequest(ServiceFeaturesRequest value) {
        this.serviceFeaturesRequest = value;
    }

    public boolean isSetServiceFeaturesRequest() {
        return (this.serviceFeaturesRequest!= null);
    }

    /**
     * Obtient la valeur de la propriété productCategoriesRequest.
     * 
     * @return
     *     possible object is
     *     {@link ProductCategoriesDiscoveryRequestStructure }
     *     
     */
    public ProductCategoriesDiscoveryRequestStructure getProductCategoriesRequest() {
        return productCategoriesRequest;
    }

    /**
     * Définit la valeur de la propriété productCategoriesRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCategoriesDiscoveryRequestStructure }
     *     
     */
    public void setProductCategoriesRequest(ProductCategoriesDiscoveryRequestStructure value) {
        this.productCategoriesRequest = value;
    }

    public boolean isSetProductCategoriesRequest() {
        return (this.productCategoriesRequest!= null);
    }

    /**
     * Obtient la valeur de la propriété vehicleFeaturesRequest.
     * 
     * @return
     *     possible object is
     *     {@link VehicleFeaturesRequestStructure }
     *     
     */
    public VehicleFeaturesRequestStructure getVehicleFeaturesRequest() {
        return vehicleFeaturesRequest;
    }

    /**
     * Définit la valeur de la propriété vehicleFeaturesRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleFeaturesRequestStructure }
     *     
     */
    public void setVehicleFeaturesRequest(VehicleFeaturesRequestStructure value) {
        this.vehicleFeaturesRequest = value;
    }

    public boolean isSetVehicleFeaturesRequest() {
        return (this.vehicleFeaturesRequest!= null);
    }

    /**
     * Obtient la valeur de la propriété infoChannelRequest.
     * 
     * @return
     *     possible object is
     *     {@link InfoChannelDiscoveryRequestStructure }
     *     
     */
    public InfoChannelDiscoveryRequestStructure getInfoChannelRequest() {
        return infoChannelRequest;
    }

    /**
     * Définit la valeur de la propriété infoChannelRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoChannelDiscoveryRequestStructure }
     *     
     */
    public void setInfoChannelRequest(InfoChannelDiscoveryRequestStructure value) {
        this.infoChannelRequest = value;
    }

    public boolean isSetInfoChannelRequest() {
        return (this.infoChannelRequest!= null);
    }

    /**
     * Obtient la valeur de la propriété facilityRequest.
     * 
     * @return
     *     possible object is
     *     {@link FacilityRequestStructure }
     *     
     */
    public FacilityRequestStructure getFacilityRequest() {
        return facilityRequest;
    }

    /**
     * Définit la valeur de la propriété facilityRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityRequestStructure }
     *     
     */
    public void setFacilityRequest(FacilityRequestStructure value) {
        this.facilityRequest = value;
    }

    public boolean isSetFacilityRequest() {
        return (this.facilityRequest!= null);
    }

    /**
     * Obtient la valeur de la propriété connectionLinksRequest.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionLinksDiscoveryRequestStructure }
     *     
     */
    public ConnectionLinksDiscoveryRequestStructure getConnectionLinksRequest() {
        return connectionLinksRequest;
    }

    /**
     * Définit la valeur de la propriété connectionLinksRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionLinksDiscoveryRequestStructure }
     *     
     */
    public void setConnectionLinksRequest(ConnectionLinksDiscoveryRequestStructure value) {
        this.connectionLinksRequest = value;
    }

    public boolean isSetConnectionLinksRequest() {
        return (this.connectionLinksRequest!= null);
    }

    /**
     * Obtient la valeur de la propriété subscriptionResponse.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionResponseStructure }
     *     
     */
    public SubscriptionResponseStructure getSubscriptionResponse() {
        return subscriptionResponse;
    }

    /**
     * Définit la valeur de la propriété subscriptionResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionResponseStructure }
     *     
     */
    public void setSubscriptionResponse(SubscriptionResponseStructure value) {
        this.subscriptionResponse = value;
    }

    public boolean isSetSubscriptionResponse() {
        return (this.subscriptionResponse!= null);
    }

    /**
     * Obtient la valeur de la propriété terminateSubscriptionResponse.
     * 
     * @return
     *     possible object is
     *     {@link TerminateSubscriptionResponseStructure }
     *     
     */
    public TerminateSubscriptionResponseStructure getTerminateSubscriptionResponse() {
        return terminateSubscriptionResponse;
    }

    /**
     * Définit la valeur de la propriété terminateSubscriptionResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminateSubscriptionResponseStructure }
     *     
     */
    public void setTerminateSubscriptionResponse(TerminateSubscriptionResponseStructure value) {
        this.terminateSubscriptionResponse = value;
    }

    public boolean isSetTerminateSubscriptionResponse() {
        return (this.terminateSubscriptionResponse!= null);
    }

    /**
     * Obtient la valeur de la propriété subscriptionTerminatedNotification.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionTerminatedNotificationStructure }
     *     
     */
    public SubscriptionTerminatedNotificationStructure getSubscriptionTerminatedNotification() {
        return subscriptionTerminatedNotification;
    }

    /**
     * Définit la valeur de la propriété subscriptionTerminatedNotification.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionTerminatedNotificationStructure }
     *     
     */
    public void setSubscriptionTerminatedNotification(SubscriptionTerminatedNotificationStructure value) {
        this.subscriptionTerminatedNotification = value;
    }

    public boolean isSetSubscriptionTerminatedNotification() {
        return (this.subscriptionTerminatedNotification!= null);
    }

    /**
     * Obtient la valeur de la propriété dataReadyAcknowledgement.
     * 
     * @return
     *     possible object is
     *     {@link DataReadyResponseStructure }
     *     
     */
    public DataReadyResponseStructure getDataReadyAcknowledgement() {
        return dataReadyAcknowledgement;
    }

    /**
     * Définit la valeur de la propriété dataReadyAcknowledgement.
     * 
     * @param value
     *     allowed object is
     *     {@link DataReadyResponseStructure }
     *     
     */
    public void setDataReadyAcknowledgement(DataReadyResponseStructure value) {
        this.dataReadyAcknowledgement = value;
    }

    public boolean isSetDataReadyAcknowledgement() {
        return (this.dataReadyAcknowledgement!= null);
    }

    /**
     * Obtient la valeur de la propriété serviceDelivery.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDelivery }
     *     
     */
    public ServiceDelivery getServiceDelivery() {
        return serviceDelivery;
    }

    /**
     * Définit la valeur de la propriété serviceDelivery.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDelivery }
     *     
     */
    public void setServiceDelivery(ServiceDelivery value) {
        this.serviceDelivery = value;
    }

    public boolean isSetServiceDelivery() {
        return (this.serviceDelivery!= null);
    }

    /**
     * Obtient la valeur de la propriété dataReceivedAcknowledgement.
     * 
     * @return
     *     possible object is
     *     {@link DataReceivedResponseStructure }
     *     
     */
    public DataReceivedResponseStructure getDataReceivedAcknowledgement() {
        return dataReceivedAcknowledgement;
    }

    /**
     * Définit la valeur de la propriété dataReceivedAcknowledgement.
     * 
     * @param value
     *     allowed object is
     *     {@link DataReceivedResponseStructure }
     *     
     */
    public void setDataReceivedAcknowledgement(DataReceivedResponseStructure value) {
        this.dataReceivedAcknowledgement = value;
    }

    public boolean isSetDataReceivedAcknowledgement() {
        return (this.dataReceivedAcknowledgement!= null);
    }

    /**
     * Obtient la valeur de la propriété checkStatusResponse.
     * 
     * @return
     *     possible object is
     *     {@link CheckStatusResponseStructure }
     *     
     */
    public CheckStatusResponseStructure getCheckStatusResponse() {
        return checkStatusResponse;
    }

    /**
     * Définit la valeur de la propriété checkStatusResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckStatusResponseStructure }
     *     
     */
    public void setCheckStatusResponse(CheckStatusResponseStructure value) {
        this.checkStatusResponse = value;
    }

    public boolean isSetCheckStatusResponse() {
        return (this.checkStatusResponse!= null);
    }

    /**
     * Responses with the capabilities of an implementation. Answers a CapabilityRequest.
     * 
     * @return
     *     possible object is
     *     {@link CapabilitiesResponseStructure }
     *     
     */
    public CapabilitiesResponseStructure getCapabilitiesResponse() {
        return capabilitiesResponse;
    }

    /**
     * Définit la valeur de la propriété capabilitiesResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilitiesResponseStructure }
     *     
     */
    public void setCapabilitiesResponse(CapabilitiesResponseStructure value) {
        this.capabilitiesResponse = value;
    }

    public boolean isSetCapabilitiesResponse() {
        return (this.capabilitiesResponse!= null);
    }

    /**
     * Obtient la valeur de la propriété stopPointsDelivery.
     * 
     * @return
     *     possible object is
     *     {@link StopPointsDeliveryStructure }
     *     
     */
    public StopPointsDeliveryStructure getStopPointsDelivery() {
        return stopPointsDelivery;
    }

    /**
     * Définit la valeur de la propriété stopPointsDelivery.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointsDeliveryStructure }
     *     
     */
    public void setStopPointsDelivery(StopPointsDeliveryStructure value) {
        this.stopPointsDelivery = value;
    }

    public boolean isSetStopPointsDelivery() {
        return (this.stopPointsDelivery!= null);
    }

    /**
     * Obtient la valeur de la propriété linesDelivery.
     * 
     * @return
     *     possible object is
     *     {@link LinesDeliveryStructure }
     *     
     */
    public LinesDeliveryStructure getLinesDelivery() {
        return linesDelivery;
    }

    /**
     * Définit la valeur de la propriété linesDelivery.
     * 
     * @param value
     *     allowed object is
     *     {@link LinesDeliveryStructure }
     *     
     */
    public void setLinesDelivery(LinesDeliveryStructure value) {
        this.linesDelivery = value;
    }

    public boolean isSetLinesDelivery() {
        return (this.linesDelivery!= null);
    }

    /**
     * Obtient la valeur de la propriété productCategoriesDelivery.
     * 
     * @return
     *     possible object is
     *     {@link ProductCategoriesDeliveryStructure }
     *     
     */
    public ProductCategoriesDeliveryStructure getProductCategoriesDelivery() {
        return productCategoriesDelivery;
    }

    /**
     * Définit la valeur de la propriété productCategoriesDelivery.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCategoriesDeliveryStructure }
     *     
     */
    public void setProductCategoriesDelivery(ProductCategoriesDeliveryStructure value) {
        this.productCategoriesDelivery = value;
    }

    public boolean isSetProductCategoriesDelivery() {
        return (this.productCategoriesDelivery!= null);
    }

    /**
     * Obtient la valeur de la propriété serviceFeaturesDelivery.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFeaturesDeliveryStructure }
     *     
     */
    public ServiceFeaturesDeliveryStructure getServiceFeaturesDelivery() {
        return serviceFeaturesDelivery;
    }

    /**
     * Définit la valeur de la propriété serviceFeaturesDelivery.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFeaturesDeliveryStructure }
     *     
     */
    public void setServiceFeaturesDelivery(ServiceFeaturesDeliveryStructure value) {
        this.serviceFeaturesDelivery = value;
    }

    public boolean isSetServiceFeaturesDelivery() {
        return (this.serviceFeaturesDelivery!= null);
    }

    /**
     * Obtient la valeur de la propriété vehicleFeaturesDelivery.
     * 
     * @return
     *     possible object is
     *     {@link VehicleFeaturesDeliveryStructure }
     *     
     */
    public VehicleFeaturesDeliveryStructure getVehicleFeaturesDelivery() {
        return vehicleFeaturesDelivery;
    }

    /**
     * Définit la valeur de la propriété vehicleFeaturesDelivery.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleFeaturesDeliveryStructure }
     *     
     */
    public void setVehicleFeaturesDelivery(VehicleFeaturesDeliveryStructure value) {
        this.vehicleFeaturesDelivery = value;
    }

    public boolean isSetVehicleFeaturesDelivery() {
        return (this.vehicleFeaturesDelivery!= null);
    }

    /**
     * Obtient la valeur de la propriété infoChannelDelivery.
     * 
     * @return
     *     possible object is
     *     {@link InfoChannelDeliveryStructure }
     *     
     */
    public InfoChannelDeliveryStructure getInfoChannelDelivery() {
        return infoChannelDelivery;
    }

    /**
     * Définit la valeur de la propriété infoChannelDelivery.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoChannelDeliveryStructure }
     *     
     */
    public void setInfoChannelDelivery(InfoChannelDeliveryStructure value) {
        this.infoChannelDelivery = value;
    }

    public boolean isSetInfoChannelDelivery() {
        return (this.infoChannelDelivery!= null);
    }

    /**
     * Obtient la valeur de la propriété facilityDelivery.
     * 
     * @return
     *     possible object is
     *     {@link FacilityDeliveryStructure }
     *     
     */
    public FacilityDeliveryStructure getFacilityDelivery() {
        return facilityDelivery;
    }

    /**
     * Définit la valeur de la propriété facilityDelivery.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityDeliveryStructure }
     *     
     */
    public void setFacilityDelivery(FacilityDeliveryStructure value) {
        this.facilityDelivery = value;
    }

    public boolean isSetFacilityDelivery() {
        return (this.facilityDelivery!= null);
    }

    /**
     * Obtient la valeur de la propriété connectionLinksDelivery.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionLinksDeliveryStructure }
     *     
     */
    public ConnectionLinksDeliveryStructure getConnectionLinksDelivery() {
        return connectionLinksDelivery;
    }

    /**
     * Définit la valeur de la propriété connectionLinksDelivery.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionLinksDeliveryStructure }
     *     
     */
    public void setConnectionLinksDelivery(ConnectionLinksDeliveryStructure value) {
        this.connectionLinksDelivery = value;
    }

    public boolean isSetConnectionLinksDelivery() {
        return (this.connectionLinksDelivery!= null);
    }

    /**
     * Obtient la valeur de la propriété extensions.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Définit la valeur de la propriété extensions.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public boolean isSetExtensions() {
        return (this.extensions!= null);
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
