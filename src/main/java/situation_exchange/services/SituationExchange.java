package situation_exchange.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;

import reactor.core.publisher.Mono;
import situation_exchange.common.SiriException;
import situation_exchange.common.SiriStructureFactory;
import situation_exchange.configuration.SituationExchangeConfiguration;
import uk.org.siri.siri.ObjectFactory;
import uk.org.siri.siri.PtSituationElementStructure;
import uk.org.siri.siri.ServiceDeliveryErrorConditionStructure;
import uk.org.siri.siri.SituationExchangeDeliveryStructure;

public abstract class SituationExchange {

	protected static final String SERVICE_NAME = "situation-exchange";
	protected static final ObjectFactory factory = new ObjectFactory();

	@Autowired
	protected SituationExchangeConfiguration configuration;

	protected Criteria createCriteria(SituationExchangeParameters parameters) {
		return new Criteria();
	}

	protected Mono<SituationExchangeParameters> validate(SituationExchangeParameters parameters) {
		return Mono.<SituationExchangeParameters>create(sink -> {
			try {
				sink.success(parameters);
			} catch (Exception e) {
				sink.error(e);
			}
		});
	}

	protected SituationExchangeDeliveryStructure onSuccess(List<PtSituationElementStructure> list) {
		SituationExchangeDeliveryStructure delivery = factory.createSituationExchangeDeliveryStructure();
		SituationExchangeDeliveryStructure.Situations situations = factory.createSituationExchangeDeliveryStructureSituations();
		situations.getPtSituationElement().addAll(list);
		delivery.setSituations(situations);
		return delivery;
	}

	protected SituationExchangeDeliveryStructure onError(Throwable t) {
		SiriException e = null;
		if (t instanceof SiriException) {
			e = (SiriException) t;
		} else {
			e = SiriException.createOtherError(t);
		}

		SituationExchangeDeliveryStructure delivery = factory.createSituationExchangeDeliveryStructure();
		delivery.setVersion(configuration.getVersion());
		delivery.setResponseTimestamp(SiriStructureFactory.createXMLGregorianCalendar(LocalDateTime.now()));
		delivery.setStatus(Boolean.FALSE);
		ServiceDeliveryErrorConditionStructure error = SiriStructureFactory.createServiceDeliveryErrorConditionStructure(e);
		delivery.setErrorCondition(error);
		return delivery;
	}
}
