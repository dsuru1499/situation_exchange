
package uk.org.siri.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import uk.org.siri.siri.ErrorConditionStructure;
import uk.org.siri.siri.ServiceDeliveryErrorConditionStructure;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uk.org.siri.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetMultipleStopMonitoringResponse_QNAME = new QName("http://wsdl.siri.org.uk", "GetMultipleStopMonitoringResponse");
    private final static QName _GetCapabilities_QNAME = new QName("http://wsdl.siri.org.uk", "GetCapabilities");
    private final static QName _GetCapabilitiesResponse_QNAME = new QName("http://wsdl.siri.org.uk", "GetCapabilitiesResponse");
    private final static QName _LinesDiscovery_QNAME = new QName("http://wsdl.siri.org.uk", "LinesDiscovery");
    private final static QName _GetSiriServiceResponse_QNAME = new QName("http://wsdl.siri.org.uk", "GetSiriServiceResponse");
    private final static QName _GetConnectionTimetable_QNAME = new QName("http://wsdl.siri.org.uk", "GetConnectionTimetable");
    private final static QName _GetSituationExchangeResponse_QNAME = new QName("http://wsdl.siri.org.uk", "GetSituationExchangeResponse");
    private final static QName _DataSupplyResponse_QNAME = new QName("http://wsdl.siri.org.uk", "DataSupplyResponse");
    private final static QName _GetEstimatedTimetable_QNAME = new QName("http://wsdl.siri.org.uk", "GetEstimatedTimetable");
    private final static QName _GetStopMonitoring_QNAME = new QName("http://wsdl.siri.org.uk", "GetStopMonitoring");
    private final static QName _GetGeneralMessageResponse_QNAME = new QName("http://wsdl.siri.org.uk", "GetGeneralMessageResponse");
    private final static QName _WSErrorConditionElement_QNAME = new QName("http://wsdl.siri.org.uk", "WSErrorConditionElement");
    private final static QName _SubscribeResponse_QNAME = new QName("http://wsdl.siri.org.uk", "SubscribeResponse");
    private final static QName _GetSituationExchange_QNAME = new QName("http://wsdl.siri.org.uk", "GetSituationExchange");
    private final static QName _GetMultipleStopMonitoring_QNAME = new QName("http://wsdl.siri.org.uk", "GetMultipleStopMonitoring");
    private final static QName _GetProductionTimetableResponse_QNAME = new QName("http://wsdl.siri.org.uk", "GetProductionTimetableResponse");
    private final static QName _GetVehicleMonitoring_QNAME = new QName("http://wsdl.siri.org.uk", "GetVehicleMonitoring");
    private final static QName _WSServiceDeliveryErrorConditionElement_QNAME = new QName("http://wsdl.siri.org.uk", "WSServiceDeliveryErrorConditionElement");
    private final static QName _StopPointsDiscovery_QNAME = new QName("http://wsdl.siri.org.uk", "StopPointsDiscovery");
    private final static QName _GetConnectionMonitoring_QNAME = new QName("http://wsdl.siri.org.uk", "GetConnectionMonitoring");
    private final static QName _GetConnectionTimetableResponse_QNAME = new QName("http://wsdl.siri.org.uk", "GetConnectionTimetableResponse");
    private final static QName _GetStopMonitoringResponse_QNAME = new QName("http://wsdl.siri.org.uk", "GetStopMonitoringResponse");
    private final static QName _CheckStatus_QNAME = new QName("http://wsdl.siri.org.uk", "CheckStatus");
    private final static QName _DeleteSubscription_QNAME = new QName("http://wsdl.siri.org.uk", "DeleteSubscription");
    private final static QName _GetFacilityMonitoringResponse_QNAME = new QName("http://wsdl.siri.org.uk", "GetFacilityMonitoringResponse");
    private final static QName _DataSupply_QNAME = new QName("http://wsdl.siri.org.uk", "DataSupply");
    private final static QName _GetSiriService_QNAME = new QName("http://wsdl.siri.org.uk", "GetSiriService");
    private final static QName _LinesDiscoveryResponse_QNAME = new QName("http://wsdl.siri.org.uk", "LinesDiscoveryResponse");
    private final static QName _GetStopTimetableResponse_QNAME = new QName("http://wsdl.siri.org.uk", "GetStopTimetableResponse");
    private final static QName _StopPointsDiscoveryResponse_QNAME = new QName("http://wsdl.siri.org.uk", "StopPointsDiscoveryResponse");
    private final static QName _GetVehicleMonitoringResponse_QNAME = new QName("http://wsdl.siri.org.uk", "GetVehicleMonitoringResponse");
    private final static QName _ConnectionLinksDiscovery_QNAME = new QName("http://wsdl.siri.org.uk", "ConnectionLinksDiscovery");
    private final static QName _GetGeneralMessage_QNAME = new QName("http://wsdl.siri.org.uk", "GetGeneralMessage");
    private final static QName _ConnectionLinksDiscoveryResponse_QNAME = new QName("http://wsdl.siri.org.uk", "ConnectionLinksDiscoveryResponse");
    private final static QName _CheckStatusResponse_QNAME = new QName("http://wsdl.siri.org.uk", "CheckStatusResponse");
    private final static QName _GetStopTimetable_QNAME = new QName("http://wsdl.siri.org.uk", "GetStopTimetable");
    private final static QName _GetEstimatedTimetableResponse_QNAME = new QName("http://wsdl.siri.org.uk", "GetEstimatedTimetableResponse");
    private final static QName _GetFacilityMonitoring_QNAME = new QName("http://wsdl.siri.org.uk", "GetFacilityMonitoring");
    private final static QName _DeleteSubscriptionResponse_QNAME = new QName("http://wsdl.siri.org.uk", "DeleteSubscriptionResponse");
    private final static QName _Subscribe_QNAME = new QName("http://wsdl.siri.org.uk", "Subscribe");
    private final static QName _GetProductionTimetable_QNAME = new QName("http://wsdl.siri.org.uk", "GetProductionTimetable");
    private final static QName _GetConnectionMonitoringResponse_QNAME = new QName("http://wsdl.siri.org.uk", "GetConnectionMonitoringResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uk.org.siri.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProductionTimetableAnswerStructure }
     * 
     */
    public ProductionTimetableAnswerStructure createProductionTimetableAnswerStructure() {
        return new ProductionTimetableAnswerStructure();
    }

    /**
     * Create an instance of {@link WsConnectionMonitoringAnswerStructure }
     * 
     */
    public WsConnectionMonitoringAnswerStructure createWsConnectionMonitoringAnswerStructure() {
        return new WsConnectionMonitoringAnswerStructure();
    }

    /**
     * Create an instance of {@link VehicleMonitoringRequestStructure }
     * 
     */
    public VehicleMonitoringRequestStructure createVehicleMonitoringRequestStructure() {
        return new VehicleMonitoringRequestStructure();
    }

    /**
     * Create an instance of {@link GetSiriServiceAnswerStructure }
     * 
     */
    public GetSiriServiceAnswerStructure createGetSiriServiceAnswerStructure() {
        return new GetSiriServiceAnswerStructure();
    }

    /**
     * Create an instance of {@link WsCheckStatusStructure }
     * 
     */
    public WsCheckStatusStructure createWsCheckStatusStructure() {
        return new WsCheckStatusStructure();
    }

    /**
     * Create an instance of {@link WsConnectionLinksDiscoveryStructure }
     * 
     */
    public WsConnectionLinksDiscoveryStructure createWsConnectionLinksDiscoveryStructure() {
        return new WsConnectionLinksDiscoveryStructure();
    }

    /**
     * Create an instance of {@link WsGetCapabilitiesAnswerStructure }
     * 
     */
    public WsGetCapabilitiesAnswerStructure createWsGetCapabilitiesAnswerStructure() {
        return new WsGetCapabilitiesAnswerStructure();
    }

    /**
     * Create an instance of {@link WsLinesDiscoveryStructure }
     * 
     */
    public WsLinesDiscoveryStructure createWsLinesDiscoveryStructure() {
        return new WsLinesDiscoveryStructure();
    }

    /**
     * Create an instance of {@link WsSubscriptionRequestStructure }
     * 
     */
    public WsSubscriptionRequestStructure createWsSubscriptionRequestStructure() {
        return new WsSubscriptionRequestStructure();
    }

    /**
     * Create an instance of {@link GeneralMessageRequestStructure }
     * 
     */
    public GeneralMessageRequestStructure createGeneralMessageRequestStructure() {
        return new GeneralMessageRequestStructure();
    }

    /**
     * Create an instance of {@link WsConnectionLinksDiscoveryAnswerStructure }
     * 
     */
    public WsConnectionLinksDiscoveryAnswerStructure createWsConnectionLinksDiscoveryAnswerStructure() {
        return new WsConnectionLinksDiscoveryAnswerStructure();
    }

    /**
     * Create an instance of {@link GeneralMessageAnswerStructure }
     * 
     */
    public GeneralMessageAnswerStructure createGeneralMessageAnswerStructure() {
        return new GeneralMessageAnswerStructure();
    }

    /**
     * Create an instance of {@link WsCheckStatusResponseStructure }
     * 
     */
    public WsCheckStatusResponseStructure createWsCheckStatusResponseStructure() {
        return new WsCheckStatusResponseStructure();
    }

    /**
     * Create an instance of {@link ProductionTimetableRequestStructure }
     * 
     */
    public ProductionTimetableRequestStructure createProductionTimetableRequestStructure() {
        return new ProductionTimetableRequestStructure();
    }

    /**
     * Create an instance of {@link WsDeleteSubscriptionAnswerStructure }
     * 
     */
    public WsDeleteSubscriptionAnswerStructure createWsDeleteSubscriptionAnswerStructure() {
        return new WsDeleteSubscriptionAnswerStructure();
    }

    /**
     * Create an instance of {@link StopMonitoringAnswerStructure }
     * 
     */
    public StopMonitoringAnswerStructure createStopMonitoringAnswerStructure() {
        return new StopMonitoringAnswerStructure();
    }

    /**
     * Create an instance of {@link SituationExchangeAnswerStructure }
     * 
     */
    public SituationExchangeAnswerStructure createSituationExchangeAnswerStructure() {
        return new SituationExchangeAnswerStructure();
    }

    /**
     * Create an instance of {@link WsGetCapabilitiesRequestStructure }
     * 
     */
    public WsGetCapabilitiesRequestStructure createWsGetCapabilitiesRequestStructure() {
        return new WsGetCapabilitiesRequestStructure();
    }

    /**
     * Create an instance of {@link WsStopPointsDiscoveryAnswerStructure }
     * 
     */
    public WsStopPointsDiscoveryAnswerStructure createWsStopPointsDiscoveryAnswerStructure() {
        return new WsStopPointsDiscoveryAnswerStructure();
    }

    /**
     * Create an instance of {@link GetSiriServiceRequestStructure }
     * 
     */
    public GetSiriServiceRequestStructure createGetSiriServiceRequestStructure() {
        return new GetSiriServiceRequestStructure();
    }

    /**
     * Create an instance of {@link StopMonitoringMultipleRequestStructure }
     * 
     */
    public StopMonitoringMultipleRequestStructure createStopMonitoringMultipleRequestStructure() {
        return new StopMonitoringMultipleRequestStructure();
    }

    /**
     * Create an instance of {@link WsConnectionTimetableRequestStructure }
     * 
     */
    public WsConnectionTimetableRequestStructure createWsConnectionTimetableRequestStructure() {
        return new WsConnectionTimetableRequestStructure();
    }

    /**
     * Create an instance of {@link WsEstimatedTimetableAnswerStructure }
     * 
     */
    public WsEstimatedTimetableAnswerStructure createWsEstimatedTimetableAnswerStructure() {
        return new WsEstimatedTimetableAnswerStructure();
    }

    /**
     * Create an instance of {@link WsFacilityMonitoringRequestStructure }
     * 
     */
    public WsFacilityMonitoringRequestStructure createWsFacilityMonitoringRequestStructure() {
        return new WsFacilityMonitoringRequestStructure();
    }

    /**
     * Create an instance of {@link VehicleMonitoringAnswerStructure }
     * 
     */
    public VehicleMonitoringAnswerStructure createVehicleMonitoringAnswerStructure() {
        return new VehicleMonitoringAnswerStructure();
    }

    /**
     * Create an instance of {@link SituationExchangeRequestStructure }
     * 
     */
    public SituationExchangeRequestStructure createSituationExchangeRequestStructure() {
        return new SituationExchangeRequestStructure();
    }

    /**
     * Create an instance of {@link WsConnectionTimetableAnswerStructure }
     * 
     */
    public WsConnectionTimetableAnswerStructure createWsConnectionTimetableAnswerStructure() {
        return new WsConnectionTimetableAnswerStructure();
    }

    /**
     * Create an instance of {@link WsFacilityMonitoringAnswerStructure }
     * 
     */
    public WsFacilityMonitoringAnswerStructure createWsFacilityMonitoringAnswerStructure() {
        return new WsFacilityMonitoringAnswerStructure();
    }

    /**
     * Create an instance of {@link StopTimetableRequestStructure }
     * 
     */
    public StopTimetableRequestStructure createStopTimetableRequestStructure() {
        return new StopTimetableRequestStructure();
    }

    /**
     * Create an instance of {@link WsDataSupplyRequestStructure }
     * 
     */
    public WsDataSupplyRequestStructure createWsDataSupplyRequestStructure() {
        return new WsDataSupplyRequestStructure();
    }

    /**
     * Create an instance of {@link StopMonitoringRequestStructure }
     * 
     */
    public StopMonitoringRequestStructure createStopMonitoringRequestStructure() {
        return new StopMonitoringRequestStructure();
    }

    /**
     * Create an instance of {@link WsSubscriptionAnswerStructure }
     * 
     */
    public WsSubscriptionAnswerStructure createWsSubscriptionAnswerStructure() {
        return new WsSubscriptionAnswerStructure();
    }

    /**
     * Create an instance of {@link WsEstimatedTimetableRequestStructure }
     * 
     */
    public WsEstimatedTimetableRequestStructure createWsEstimatedTimetableRequestStructure() {
        return new WsEstimatedTimetableRequestStructure();
    }

    /**
     * Create an instance of {@link StopTimetableAnswerStructure }
     * 
     */
    public StopTimetableAnswerStructure createStopTimetableAnswerStructure() {
        return new StopTimetableAnswerStructure();
    }

    /**
     * Create an instance of {@link WsDataSupplyAnswerStructure }
     * 
     */
    public WsDataSupplyAnswerStructure createWsDataSupplyAnswerStructure() {
        return new WsDataSupplyAnswerStructure();
    }

    /**
     * Create an instance of {@link WsDeleteSubscriptionRequestStructure }
     * 
     */
    public WsDeleteSubscriptionRequestStructure createWsDeleteSubscriptionRequestStructure() {
        return new WsDeleteSubscriptionRequestStructure();
    }

    /**
     * Create an instance of {@link WsLinesDiscoveryAnswerStructure }
     * 
     */
    public WsLinesDiscoveryAnswerStructure createWsLinesDiscoveryAnswerStructure() {
        return new WsLinesDiscoveryAnswerStructure();
    }

    /**
     * Create an instance of {@link WsStopPointsDiscoveryStructure }
     * 
     */
    public WsStopPointsDiscoveryStructure createWsStopPointsDiscoveryStructure() {
        return new WsStopPointsDiscoveryStructure();
    }

    /**
     * Create an instance of {@link WsConnectionMonitoringRequestStructure }
     * 
     */
    public WsConnectionMonitoringRequestStructure createWsConnectionMonitoringRequestStructure() {
        return new WsConnectionMonitoringRequestStructure();
    }

    /**
     * Create an instance of {@link WsServiceRequestInfoStructure }
     * 
     */
    public WsServiceRequestInfoStructure createWsServiceRequestInfoStructure() {
        return new WsServiceRequestInfoStructure();
    }

    /**
     * Create an instance of {@link WsSubscriptionRequestInfoStructure }
     * 
     */
    public WsSubscriptionRequestInfoStructure createWsSubscriptionRequestInfoStructure() {
        return new WsSubscriptionRequestInfoStructure();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopMonitoringAnswerStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "GetMultipleStopMonitoringResponse")
    public JAXBElement<StopMonitoringAnswerStructure> createGetMultipleStopMonitoringResponse(StopMonitoringAnswerStructure value) {
        return new JAXBElement<StopMonitoringAnswerStructure>(_GetMultipleStopMonitoringResponse_QNAME, StopMonitoringAnswerStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsGetCapabilitiesRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "GetCapabilities")
    public JAXBElement<WsGetCapabilitiesRequestStructure> createGetCapabilities(WsGetCapabilitiesRequestStructure value) {
        return new JAXBElement<WsGetCapabilitiesRequestStructure>(_GetCapabilities_QNAME, WsGetCapabilitiesRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsGetCapabilitiesAnswerStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "GetCapabilitiesResponse")
    public JAXBElement<WsGetCapabilitiesAnswerStructure> createGetCapabilitiesResponse(WsGetCapabilitiesAnswerStructure value) {
        return new JAXBElement<WsGetCapabilitiesAnswerStructure>(_GetCapabilitiesResponse_QNAME, WsGetCapabilitiesAnswerStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsLinesDiscoveryStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "LinesDiscovery")
    public JAXBElement<WsLinesDiscoveryStructure> createLinesDiscovery(WsLinesDiscoveryStructure value) {
        return new JAXBElement<WsLinesDiscoveryStructure>(_LinesDiscovery_QNAME, WsLinesDiscoveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSiriServiceAnswerStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "GetSiriServiceResponse")
    public JAXBElement<GetSiriServiceAnswerStructure> createGetSiriServiceResponse(GetSiriServiceAnswerStructure value) {
        return new JAXBElement<GetSiriServiceAnswerStructure>(_GetSiriServiceResponse_QNAME, GetSiriServiceAnswerStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsConnectionTimetableRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "GetConnectionTimetable")
    public JAXBElement<WsConnectionTimetableRequestStructure> createGetConnectionTimetable(WsConnectionTimetableRequestStructure value) {
        return new JAXBElement<WsConnectionTimetableRequestStructure>(_GetConnectionTimetable_QNAME, WsConnectionTimetableRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SituationExchangeAnswerStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "GetSituationExchangeResponse")
    public JAXBElement<SituationExchangeAnswerStructure> createGetSituationExchangeResponse(SituationExchangeAnswerStructure value) {
        return new JAXBElement<SituationExchangeAnswerStructure>(_GetSituationExchangeResponse_QNAME, SituationExchangeAnswerStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsDataSupplyAnswerStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "DataSupplyResponse")
    public JAXBElement<WsDataSupplyAnswerStructure> createDataSupplyResponse(WsDataSupplyAnswerStructure value) {
        return new JAXBElement<WsDataSupplyAnswerStructure>(_DataSupplyResponse_QNAME, WsDataSupplyAnswerStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsEstimatedTimetableRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "GetEstimatedTimetable")
    public JAXBElement<WsEstimatedTimetableRequestStructure> createGetEstimatedTimetable(WsEstimatedTimetableRequestStructure value) {
        return new JAXBElement<WsEstimatedTimetableRequestStructure>(_GetEstimatedTimetable_QNAME, WsEstimatedTimetableRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopMonitoringRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "GetStopMonitoring")
    public JAXBElement<StopMonitoringRequestStructure> createGetStopMonitoring(StopMonitoringRequestStructure value) {
        return new JAXBElement<StopMonitoringRequestStructure>(_GetStopMonitoring_QNAME, StopMonitoringRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneralMessageAnswerStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "GetGeneralMessageResponse")
    public JAXBElement<GeneralMessageAnswerStructure> createGetGeneralMessageResponse(GeneralMessageAnswerStructure value) {
        return new JAXBElement<GeneralMessageAnswerStructure>(_GetGeneralMessageResponse_QNAME, GeneralMessageAnswerStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorConditionStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "WSErrorConditionElement")
    public JAXBElement<ErrorConditionStructure> createWSErrorConditionElement(ErrorConditionStructure value) {
        return new JAXBElement<ErrorConditionStructure>(_WSErrorConditionElement_QNAME, ErrorConditionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsSubscriptionAnswerStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "SubscribeResponse")
    public JAXBElement<WsSubscriptionAnswerStructure> createSubscribeResponse(WsSubscriptionAnswerStructure value) {
        return new JAXBElement<WsSubscriptionAnswerStructure>(_SubscribeResponse_QNAME, WsSubscriptionAnswerStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SituationExchangeRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "GetSituationExchange")
    public JAXBElement<SituationExchangeRequestStructure> createGetSituationExchange(SituationExchangeRequestStructure value) {
        return new JAXBElement<SituationExchangeRequestStructure>(_GetSituationExchange_QNAME, SituationExchangeRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopMonitoringMultipleRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "GetMultipleStopMonitoring")
    public JAXBElement<StopMonitoringMultipleRequestStructure> createGetMultipleStopMonitoring(StopMonitoringMultipleRequestStructure value) {
        return new JAXBElement<StopMonitoringMultipleRequestStructure>(_GetMultipleStopMonitoring_QNAME, StopMonitoringMultipleRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductionTimetableAnswerStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "GetProductionTimetableResponse")
    public JAXBElement<ProductionTimetableAnswerStructure> createGetProductionTimetableResponse(ProductionTimetableAnswerStructure value) {
        return new JAXBElement<ProductionTimetableAnswerStructure>(_GetProductionTimetableResponse_QNAME, ProductionTimetableAnswerStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleMonitoringRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "GetVehicleMonitoring")
    public JAXBElement<VehicleMonitoringRequestStructure> createGetVehicleMonitoring(VehicleMonitoringRequestStructure value) {
        return new JAXBElement<VehicleMonitoringRequestStructure>(_GetVehicleMonitoring_QNAME, VehicleMonitoringRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDeliveryErrorConditionStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "WSServiceDeliveryErrorConditionElement")
    public JAXBElement<ServiceDeliveryErrorConditionStructure> createWSServiceDeliveryErrorConditionElement(ServiceDeliveryErrorConditionStructure value) {
        return new JAXBElement<ServiceDeliveryErrorConditionStructure>(_WSServiceDeliveryErrorConditionElement_QNAME, ServiceDeliveryErrorConditionStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsStopPointsDiscoveryStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "StopPointsDiscovery")
    public JAXBElement<WsStopPointsDiscoveryStructure> createStopPointsDiscovery(WsStopPointsDiscoveryStructure value) {
        return new JAXBElement<WsStopPointsDiscoveryStructure>(_StopPointsDiscovery_QNAME, WsStopPointsDiscoveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsConnectionMonitoringRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "GetConnectionMonitoring")
    public JAXBElement<WsConnectionMonitoringRequestStructure> createGetConnectionMonitoring(WsConnectionMonitoringRequestStructure value) {
        return new JAXBElement<WsConnectionMonitoringRequestStructure>(_GetConnectionMonitoring_QNAME, WsConnectionMonitoringRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsConnectionTimetableAnswerStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "GetConnectionTimetableResponse")
    public JAXBElement<WsConnectionTimetableAnswerStructure> createGetConnectionTimetableResponse(WsConnectionTimetableAnswerStructure value) {
        return new JAXBElement<WsConnectionTimetableAnswerStructure>(_GetConnectionTimetableResponse_QNAME, WsConnectionTimetableAnswerStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopMonitoringAnswerStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "GetStopMonitoringResponse")
    public JAXBElement<StopMonitoringAnswerStructure> createGetStopMonitoringResponse(StopMonitoringAnswerStructure value) {
        return new JAXBElement<StopMonitoringAnswerStructure>(_GetStopMonitoringResponse_QNAME, StopMonitoringAnswerStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsCheckStatusStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "CheckStatus")
    public JAXBElement<WsCheckStatusStructure> createCheckStatus(WsCheckStatusStructure value) {
        return new JAXBElement<WsCheckStatusStructure>(_CheckStatus_QNAME, WsCheckStatusStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsDeleteSubscriptionRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "DeleteSubscription")
    public JAXBElement<WsDeleteSubscriptionRequestStructure> createDeleteSubscription(WsDeleteSubscriptionRequestStructure value) {
        return new JAXBElement<WsDeleteSubscriptionRequestStructure>(_DeleteSubscription_QNAME, WsDeleteSubscriptionRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsFacilityMonitoringAnswerStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "GetFacilityMonitoringResponse")
    public JAXBElement<WsFacilityMonitoringAnswerStructure> createGetFacilityMonitoringResponse(WsFacilityMonitoringAnswerStructure value) {
        return new JAXBElement<WsFacilityMonitoringAnswerStructure>(_GetFacilityMonitoringResponse_QNAME, WsFacilityMonitoringAnswerStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsDataSupplyRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "DataSupply")
    public JAXBElement<WsDataSupplyRequestStructure> createDataSupply(WsDataSupplyRequestStructure value) {
        return new JAXBElement<WsDataSupplyRequestStructure>(_DataSupply_QNAME, WsDataSupplyRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSiriServiceRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "GetSiriService")
    public JAXBElement<GetSiriServiceRequestStructure> createGetSiriService(GetSiriServiceRequestStructure value) {
        return new JAXBElement<GetSiriServiceRequestStructure>(_GetSiriService_QNAME, GetSiriServiceRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsLinesDiscoveryAnswerStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "LinesDiscoveryResponse")
    public JAXBElement<WsLinesDiscoveryAnswerStructure> createLinesDiscoveryResponse(WsLinesDiscoveryAnswerStructure value) {
        return new JAXBElement<WsLinesDiscoveryAnswerStructure>(_LinesDiscoveryResponse_QNAME, WsLinesDiscoveryAnswerStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopTimetableAnswerStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "GetStopTimetableResponse")
    public JAXBElement<StopTimetableAnswerStructure> createGetStopTimetableResponse(StopTimetableAnswerStructure value) {
        return new JAXBElement<StopTimetableAnswerStructure>(_GetStopTimetableResponse_QNAME, StopTimetableAnswerStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsStopPointsDiscoveryAnswerStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "StopPointsDiscoveryResponse")
    public JAXBElement<WsStopPointsDiscoveryAnswerStructure> createStopPointsDiscoveryResponse(WsStopPointsDiscoveryAnswerStructure value) {
        return new JAXBElement<WsStopPointsDiscoveryAnswerStructure>(_StopPointsDiscoveryResponse_QNAME, WsStopPointsDiscoveryAnswerStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleMonitoringAnswerStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "GetVehicleMonitoringResponse")
    public JAXBElement<VehicleMonitoringAnswerStructure> createGetVehicleMonitoringResponse(VehicleMonitoringAnswerStructure value) {
        return new JAXBElement<VehicleMonitoringAnswerStructure>(_GetVehicleMonitoringResponse_QNAME, VehicleMonitoringAnswerStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsConnectionLinksDiscoveryStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "ConnectionLinksDiscovery")
    public JAXBElement<WsConnectionLinksDiscoveryStructure> createConnectionLinksDiscovery(WsConnectionLinksDiscoveryStructure value) {
        return new JAXBElement<WsConnectionLinksDiscoveryStructure>(_ConnectionLinksDiscovery_QNAME, WsConnectionLinksDiscoveryStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneralMessageRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "GetGeneralMessage")
    public JAXBElement<GeneralMessageRequestStructure> createGetGeneralMessage(GeneralMessageRequestStructure value) {
        return new JAXBElement<GeneralMessageRequestStructure>(_GetGeneralMessage_QNAME, GeneralMessageRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsConnectionLinksDiscoveryAnswerStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "ConnectionLinksDiscoveryResponse")
    public JAXBElement<WsConnectionLinksDiscoveryAnswerStructure> createConnectionLinksDiscoveryResponse(WsConnectionLinksDiscoveryAnswerStructure value) {
        return new JAXBElement<WsConnectionLinksDiscoveryAnswerStructure>(_ConnectionLinksDiscoveryResponse_QNAME, WsConnectionLinksDiscoveryAnswerStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsCheckStatusResponseStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "CheckStatusResponse")
    public JAXBElement<WsCheckStatusResponseStructure> createCheckStatusResponse(WsCheckStatusResponseStructure value) {
        return new JAXBElement<WsCheckStatusResponseStructure>(_CheckStatusResponse_QNAME, WsCheckStatusResponseStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopTimetableRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "GetStopTimetable")
    public JAXBElement<StopTimetableRequestStructure> createGetStopTimetable(StopTimetableRequestStructure value) {
        return new JAXBElement<StopTimetableRequestStructure>(_GetStopTimetable_QNAME, StopTimetableRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsEstimatedTimetableAnswerStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "GetEstimatedTimetableResponse")
    public JAXBElement<WsEstimatedTimetableAnswerStructure> createGetEstimatedTimetableResponse(WsEstimatedTimetableAnswerStructure value) {
        return new JAXBElement<WsEstimatedTimetableAnswerStructure>(_GetEstimatedTimetableResponse_QNAME, WsEstimatedTimetableAnswerStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsFacilityMonitoringRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "GetFacilityMonitoring")
    public JAXBElement<WsFacilityMonitoringRequestStructure> createGetFacilityMonitoring(WsFacilityMonitoringRequestStructure value) {
        return new JAXBElement<WsFacilityMonitoringRequestStructure>(_GetFacilityMonitoring_QNAME, WsFacilityMonitoringRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsDeleteSubscriptionAnswerStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "DeleteSubscriptionResponse")
    public JAXBElement<WsDeleteSubscriptionAnswerStructure> createDeleteSubscriptionResponse(WsDeleteSubscriptionAnswerStructure value) {
        return new JAXBElement<WsDeleteSubscriptionAnswerStructure>(_DeleteSubscriptionResponse_QNAME, WsDeleteSubscriptionAnswerStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsSubscriptionRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "Subscribe")
    public JAXBElement<WsSubscriptionRequestStructure> createSubscribe(WsSubscriptionRequestStructure value) {
        return new JAXBElement<WsSubscriptionRequestStructure>(_Subscribe_QNAME, WsSubscriptionRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductionTimetableRequestStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "GetProductionTimetable")
    public JAXBElement<ProductionTimetableRequestStructure> createGetProductionTimetable(ProductionTimetableRequestStructure value) {
        return new JAXBElement<ProductionTimetableRequestStructure>(_GetProductionTimetable_QNAME, ProductionTimetableRequestStructure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WsConnectionMonitoringAnswerStructure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.siri.org.uk", name = "GetConnectionMonitoringResponse")
    public JAXBElement<WsConnectionMonitoringAnswerStructure> createGetConnectionMonitoringResponse(WsConnectionMonitoringAnswerStructure value) {
        return new JAXBElement<WsConnectionMonitoringAnswerStructure>(_GetConnectionMonitoringResponse_QNAME, WsConnectionMonitoringAnswerStructure.class, null, value);
    }

}
