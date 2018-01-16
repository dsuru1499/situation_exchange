package situation_exchange.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import org.springframework.beans.factory.annotation.Autowired;

import com.jamonapi.Monitor;
import com.jamonapi.MonitorFactory;

import lombok.extern.log4j.Log4j;
import situation_exchange.common.Color;
import uk.org.siri.siri.ExtensionsStructure;
import uk.org.siri.siri.LinesDeliveryStructure;
import uk.org.siri.siri.LinesDiscoveryRequestStructure;
import uk.org.siri.siri.ProducerResponseEndpointStructure;
import uk.org.siri.siri.SituationExchangeDeliveriesStructure;
import uk.org.siri.siri.SituationExchangeRequestStructure;
import uk.org.siri.siri.StopPointsDeliveryStructure;
import uk.org.siri.siri.StopPointsDiscoveryRequestStructure;
import uk.org.siri.wsdl.LinesDiscoveryError;
import uk.org.siri.wsdl.SituationExchangeError;
import uk.org.siri.wsdl.StopPointsDiscoveryError;
import uk.org.siri.wsdl.WsServiceRequestInfoStructure;

@Log4j
@WebService(serviceName = "SiriProducerDocPort", targetNamespace = "http://wsdl.siri.org.uk")
public class SiriProducerDocPortService {

	private static final String LINES_DISCOVERY = "lines-discovery";
	private static final String STOPPOINTS_DISCOVERY = "stoppoints-discovery";
	private static final String SITUATION_EXCHANGE = "situation-exchange";

	@Autowired
	private LineDiscoveryWebService lineDiscovery;

	@Autowired
	private StopPointsDiscoveryWebService stopPointsDiscovery;

	@Autowired
	private SituationExchangeWebService situationExchange;

	@WebMethod(operationName = "LinesDiscovery", action = "LinesDiscovery")
	@RequestWrapper(localName = "LinesDiscovery", targetNamespace = "http://wsdl.siri.org.uk", className = "uk.org.siri.wsdl.WsLinesDiscoveryStructure")
	@ResponseWrapper(localName = "LinesDiscoveryResponse", targetNamespace = "http://wsdl.siri.org.uk", className = "uk.org.siri.wsdl.WsLinesDiscoveryAnswerStructure")
	public void linesDiscovery(@WebParam(name = "Request", targetNamespace = "") LinesDiscoveryRequestStructure request,
			@WebParam(name = "RequestExtension", targetNamespace = "") ExtensionsStructure requestExtension,
			@WebParam(name = "Answer", targetNamespace = "", mode = WebParam.Mode.OUT) Holder<LinesDeliveryStructure> answer,
			@WebParam(name = "AnswerExtension", targetNamespace = "", mode = WebParam.Mode.OUT) Holder<ExtensionsStructure> answerExtension)
			throws LinesDiscoveryError {
		Monitor monitor = MonitorFactory.start(LINES_DISCOVERY);
		try {
			lineDiscovery.linesDiscovery(request, requestExtension, answer, answerExtension);
		} finally {
			log.info(Color.YELLOW + monitor.stop() + Color.NORMAL);
		}
	}

	@WebMethod(operationName = "StopPointsDiscovery", action = "StopPointsDiscovery")
	@RequestWrapper(localName = "StopPointsDiscovery", targetNamespace = "http://wsdl.siri.org.uk", className = "uk.org.siri.wsdl.WsStopPointsDiscoveryStructure")
	@ResponseWrapper(localName = "StopPointsDiscoveryResponse", targetNamespace = "http://wsdl.siri.org.uk", className = "uk.org.siri.wsdl.WsStopPointsDiscoveryAnswerStructure")
	public void stopPointsDiscovery(@WebParam(name = "Request", targetNamespace = "") StopPointsDiscoveryRequestStructure request,
			@WebParam(name = "RequestExtension", targetNamespace = "") ExtensionsStructure requestExtension,
			@WebParam(name = "Answer", targetNamespace = "", mode = WebParam.Mode.OUT) Holder<StopPointsDeliveryStructure> answer,
			@WebParam(name = "AnswerExtension", targetNamespace = "", mode = WebParam.Mode.OUT) Holder<ExtensionsStructure> answerExtension)
			throws StopPointsDiscoveryError {
		Monitor monitor = MonitorFactory.start(STOPPOINTS_DISCOVERY);
		try {
			stopPointsDiscovery.stopPointsDiscovery(request, requestExtension, answer, answerExtension);
		} finally {
			log.info(Color.YELLOW + monitor.stop() + Color.NORMAL);
		}
	}

	@WebMethod(operationName = "GetSituationExchange", action = "GetSituationExchange")
	@RequestWrapper(localName = "GetSituationExchange", targetNamespace = "http://wsdl.siri.org.uk", className = "uk.org.siri.wsdl.SituationExchangeRequestStructure")
	@ResponseWrapper(localName = "GetSituationExchangeResponse", targetNamespace = "http://wsdl.siri.org.uk", className = "uk.org.siri.wsdl.SituationExchangeAnswerStructure")
	public void getSituationExchange(
			@WebParam(name = "ServiceRequestInfo", targetNamespace = "") WsServiceRequestInfoStructure serviceRequestInfo,
			@WebParam(name = "Request", targetNamespace = "") SituationExchangeRequestStructure request,
			@WebParam(name = "RequestExtension", targetNamespace = "") ExtensionsStructure requestExtension,
			@WebParam(name = "ServiceDeliveryInfo", targetNamespace = "", mode = WebParam.Mode.OUT) Holder<ProducerResponseEndpointStructure> serviceDeliveryInfo,
			@WebParam(name = "Answer", targetNamespace = "", mode = WebParam.Mode.OUT) Holder<SituationExchangeDeliveriesStructure> answer,
			@WebParam(name = "AnswerExtension", targetNamespace = "", mode = WebParam.Mode.OUT) Holder<ExtensionsStructure> answerExtension)
			throws SituationExchangeError {
		Monitor monitor = MonitorFactory.start(SITUATION_EXCHANGE);
		try {
			situationExchange.getSituationExchange(serviceRequestInfo, request, requestExtension, serviceDeliveryInfo, answer,
					answerExtension);
		} finally {
			log.info(Color.YELLOW + monitor.stop() + Color.NORMAL);
		}
	}

}
