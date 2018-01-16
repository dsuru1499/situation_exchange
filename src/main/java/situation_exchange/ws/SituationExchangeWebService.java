package situation_exchange.ws;

import java.util.List;

import javax.xml.ws.Holder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Mono;
import situation_exchange.repositories.SituationExchangeRepository;
import situation_exchange.services.SituationExchange;
import situation_exchange.services.SituationExchangeParameters;
import uk.org.siri.siri.ExtensionsStructure;
import uk.org.siri.siri.LineRefStructure;
import uk.org.siri.siri.ProducerResponseEndpointStructure;
import uk.org.siri.siri.SituationExchangeDeliveriesStructure;
import uk.org.siri.siri.SituationExchangeDeliveryStructure;
import uk.org.siri.siri.SituationExchangeRequestStructure;
import uk.org.siri.siri.StopPointRefStructure;
import uk.org.siri.wsdl.SituationExchangeError;
import uk.org.siri.wsdl.WsServiceRequestInfoStructure;

@Service
public class SituationExchangeWebService extends SituationExchange {

	@Autowired
	private SituationExchangeRepository situationsDAO;

	public void getSituationExchange(WsServiceRequestInfoStructure serviceRequestInfo, SituationExchangeRequestStructure request,
			ExtensionsStructure requestExtension, Holder<ProducerResponseEndpointStructure> serviceDeliveryInfo,
			Holder<SituationExchangeDeliveriesStructure> answer, Holder<ExtensionsStructure> answerExtension)
			throws SituationExchangeError {
		SituationExchangeDeliveryStructure result = validate(request).flatMapMany(t -> {
			return situationsDAO.findAll();
		}).collectList().map(this::onSuccess).onErrorResume(t -> Mono.just(this.onError(t))).block();
		answer.value.getSituationExchangeDelivery().add(result);
	}

	private Mono<SituationExchangeParameters> validate(SituationExchangeRequestStructure request) {
		SituationExchangeParameters parameters = new SituationExchangeParameters();

		if (request.isSetVersion())
			parameters.setMessageIdentifier(request.getVersion());
		if (request.isSetRequestTimestamp())
			parameters.setRequestTimestamp(request.getRequestTimestamp());
		if (request.isSetMessageIdentifier())
			parameters.setMessageIdentifier(request.getMessageIdentifier().getValue());
		if (request.isSetPreviewInterval())
			parameters.setPreviewInterval(request.getPreviewInterval());
		if (request.isSetStartTime())
			parameters.setStartTime(request.getStartTime());
		if (request.isSetVehicleMode())
			parameters.setVehicleMode(request.getVehicleMode());
		if (request.isSetSeverity())
			parameters.setSeverity(request.getSeverity());
		if (request.isSetPredictability())
			parameters.setPredictability(request.getPredictability());
		if (request.isSetKeywords())
			parameters.setKeywords(request.getKeywords());
		if (request.isSetOperatorRef())
			parameters.setOperatorRef(request.getOperatorRef().getValue());
		if (request.isSetNetworkRef())
			parameters.setNetworkRef(request.getNetworkRef().getValue());
		if (request.isSetLineRef()) {
			List<String> list = parameters.getLineRef();
			for (LineRefStructure lineRef : request.getLineRef()) {
				list.add(lineRef.getValue());
			}
		}
		if (request.isSetStopPointRef()) {
			List<String> list = parameters.getStopPointRef();
			for (StopPointRefStructure stopPointRef : request.getStopPointRef()) {
				list.add(stopPointRef.getValue());
			}
		}
		if (request.isSetLanguage())
			parameters.setLanguage(request.getLanguage());
		if (request.isSetIncludeTranslations())
			parameters.setIncludeTranslations(request.isIncludeTranslations());
		if (request.isSetMaximumNumberOfSituationElements())
			parameters.setMaximumNumberOfSituationElements(request.getMaximumNumberOfSituationElements().intValue());

		return validate(parameters);
	}
}
