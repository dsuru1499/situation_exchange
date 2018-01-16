package situation_exchange.ws;

import javax.xml.ws.Holder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Mono;
import situation_exchange.repositories.AnnotatedLineStructureRepository;
import situation_exchange.services.LinesDiscovery;
import situation_exchange.services.LinesDiscoveryParameters;
import uk.org.siri.siri.ExtensionsStructure;
import uk.org.siri.siri.LinesDeliveryStructure;
import uk.org.siri.siri.LinesDiscoveryRequestStructure;
import uk.org.siri.wsdl.LinesDiscoveryError;

@Service
public class LineDiscoveryWebService extends LinesDiscovery {

	@Autowired
	private AnnotatedLineStructureRepository annotatedLineDAO;

	public void linesDiscovery(LinesDiscoveryRequestStructure request, ExtensionsStructure requestExtension,
			Holder<LinesDeliveryStructure> answer, Holder<ExtensionsStructure> answerExtension) throws LinesDiscoveryError {
		LinesDeliveryStructure result = validate(request).flatMapMany(t -> {
			return annotatedLineDAO.findAll();
		}).collectList().map(this::onSuccess).onErrorResume(t -> Mono.just(this.onError(t))).block();
		answer.value = result;
	}

	private Mono<LinesDiscoveryParameters> validate(LinesDiscoveryRequestStructure request) {

		LinesDiscoveryParameters parameters = new LinesDiscoveryParameters();

		if (request.isSetMessageIdentifier())
			parameters.setMessageIdentifier(request.getMessageIdentifier().getValue());
		if (request.isSetOperatorRef())
			parameters.setOperatorRef(request.getOperatorRef().getValue());
		if (request.isSetRequestorRef())
			parameters.setRequestorRef(request.getRequestorRef().getValue());
		if (request.isSetRequestTimestamp())
			parameters.setRequestTimestamp(request.getRequestTimestamp());

		return validate(parameters);
	}

}
