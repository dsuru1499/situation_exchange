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
import uk.org.siri.siri.AnnotatedLineStructure;
import uk.org.siri.siri.LinesDeliveryStructure;
import uk.org.siri.siri.ObjectFactory;
import uk.org.siri.siri.ServiceDeliveryErrorConditionStructure;

public abstract class LinesDiscovery {

	protected static final String SERVICE_NAME = "lines-discovery";
	protected static ObjectFactory factory = new ObjectFactory();

	@Autowired
	protected SituationExchangeConfiguration configuration;

	protected Criteria createCriteria(LinesDiscoveryParameters parameters) {
		return new Criteria();
	}

	protected Mono<LinesDiscoveryParameters> validate(LinesDiscoveryParameters parameters) {
		return Mono.<LinesDiscoveryParameters>create(sink -> {
			try {
				sink.success(parameters);
			} catch (Exception e) {
				sink.error(e);
			}
		});
	}

	protected LinesDeliveryStructure onSuccess(List<AnnotatedLineStructure> list) {
		LinesDeliveryStructure delivery = factory.createLinesDeliveryStructure();
		delivery.setVersion(configuration.getVersion());
		delivery.setResponseTimestamp(SiriStructureFactory.createXMLGregorianCalendar(LocalDateTime.now()));
		delivery.setStatus(Boolean.TRUE);
		delivery.getAnnotatedLineRef().addAll(list);
		return delivery;
	}

	protected LinesDeliveryStructure onError(Throwable t) {
		SiriException e = null;
		if (t instanceof SiriException) {
			e = (SiriException) t;
		} else {
			e = new OtherError(e);
		}

		LinesDeliveryStructure delivery = factory.createLinesDeliveryStructure();
		delivery.setVersion(configuration.getVersion());
		delivery.setResponseTimestamp(SiriStructureFactory.createXMLGregorianCalendar(LocalDateTime.now()));
		delivery.setStatus(Boolean.FALSE);
		ServiceDeliveryErrorConditionStructure error = ServiceDeliveryErrorConditionFactory.create(e);
		delivery.setErrorCondition(error);
		return delivery;
	}

}
