package situation_exchange.ws;

import javax.xml.ws.Holder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Mono;
import situation_exchange.repositories.AnnotatedStopPointStructureRepository;
import situation_exchange.services.StopPointsDiscovery;
import situation_exchange.services.StopPointsDiscoveryParameters;
import uk.org.siri.siri.ExtensionsStructure;
import uk.org.siri.siri.StopPointsDeliveryStructure;
import uk.org.siri.siri.StopPointsDiscoveryRequestStructure;
import uk.org.siri.wsdl.StopPointsDiscoveryError;

@Service
public class StopPointsDiscoveryWebService extends StopPointsDiscovery {

	@Autowired
	private AnnotatedStopPointStructureRepository stoppointDAO;

	public void stopPointsDiscovery(StopPointsDiscoveryRequestStructure request, ExtensionsStructure requestExtension,
			Holder<StopPointsDeliveryStructure> answer, Holder<ExtensionsStructure> answerExtension)
			throws StopPointsDiscoveryError {
		StopPointsDeliveryStructure result = validate(request).flatMapMany(t -> {
			return stoppointDAO.findAll();
		}).collectList().map(this::onSuccess).onErrorResume(t -> Mono.just(this.onError(t))).block();
		answer.value = result;
	}

	private Mono<StopPointsDiscoveryParameters> validate(StopPointsDiscoveryRequestStructure request) {
		StopPointsDiscoveryParameters parameters = new StopPointsDiscoveryParameters();

		if (request.isSetMessageIdentifier())
			parameters.setMessageIdentifier(request.getMessageIdentifier().getValue());
		if (request.isSetOperatorRef())
			parameters.setOperatorRef(request.getOperatorRef().getValue());
		if (request.isSetRequestorRef())
			parameters.setRequestorRef(request.getRequestorRef().getValue());
		if (request.isSetRequestTimestamp())
			parameters.setRequestTimestamp(request.getRequestTimestamp());

		if (request.isSetLineRef())
			parameters.setLineRef(request.getLineRef().getValue());

		if (request.isSetBoundingBox()) {

			if (request.getBoundingBox().isSetLowerRight()) {
				if (request.getBoundingBox().getLowerRight().isSetLatitude())
					parameters
							.setBoundingBoxLowerRightLatitude(request.getBoundingBox().getLowerRight().getLatitude().floatValue());
				if (request.getBoundingBox().getLowerRight().isSetLongitude())
					parameters.setBoundingBoxLowerRightLongitude(
							request.getBoundingBox().getLowerRight().getLongitude().floatValue());
			}

			if (request.getBoundingBox().isSetUpperLeft()) {

				if (request.getBoundingBox().getUpperLeft().isSetLatitude())
					parameters.setBoundingBoxUpperLeftLatitude(request.getBoundingBox().getUpperLeft().getLatitude().floatValue());

				if (request.getBoundingBox().getUpperLeft().isSetLongitude())
					parameters
							.setBoundingBoxUpperLeftLongitude(request.getBoundingBox().getUpperLeft().getLongitude().floatValue());
			}
		}

		return validate(parameters);
	}

}
