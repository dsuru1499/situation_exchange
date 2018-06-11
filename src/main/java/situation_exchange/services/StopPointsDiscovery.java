package situation_exchange.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;

import reactor.core.publisher.Mono;
import situation_exchange.common.SiriStructureFactory;
import situation_exchange.common.errors.OtherError;
import situation_exchange.common.errors.SiriException;
import situation_exchange.common.errors.factories.ServiceDeliveryErrorConditionFactory;
import situation_exchange.configuration.SituationExchangeConfiguration;
import uk.org.siri.siri.AnnotatedStopPointStructure;
import uk.org.siri.siri.ObjectFactory;
import uk.org.siri.siri.ServiceDeliveryErrorConditionStructure;
import uk.org.siri.siri.StopPointsDeliveryStructure;

public abstract class StopPointsDiscovery {

	protected static final String SERVICE_NAME = "stoppoints-discovery";
	protected static ObjectFactory factory = new ObjectFactory();

	@Autowired
	protected SituationExchangeConfiguration configuration;

	protected Criteria createCriteria(StopPointsDiscoveryParameters parameters) {
		return new Criteria();
	}

	protected Mono<StopPointsDiscoveryParameters> validate(StopPointsDiscoveryParameters parameters) {
		return Mono.<StopPointsDiscoveryParameters>create(sink -> {
			try {
				sink.success(parameters);
			} catch (Exception e) {
				sink.error(e);
			}
		});
	}

	protected StopPointsDeliveryStructure onSuccess(List<AnnotatedStopPointStructure> list) {
		StopPointsDeliveryStructure delivery = factory.createStopPointsDeliveryStructure();
		delivery.getAnnotatedStopPointRef().addAll(list);
		return delivery;
	}

	protected StopPointsDeliveryStructure onError(Throwable t) {
		SiriException e = null;
		if (t instanceof SiriException) {
			e = (SiriException) t;
		} else {
			e = new OtherError(e);
		}

		StopPointsDeliveryStructure delivery = factory.createStopPointsDeliveryStructure();
		delivery.setVersion(configuration.getVersion());
		delivery.setResponseTimestamp(SiriStructureFactory.createXMLGregorianCalendar(LocalDateTime.now()));
		delivery.setStatus(Boolean.FALSE);
		ServiceDeliveryErrorConditionStructure error = ServiceDeliveryErrorConditionFactory.create(e);
		delivery.setErrorCondition(error);
		return delivery;
	}
}
