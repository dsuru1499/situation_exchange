package situation_exchange.common.errors.factories;

import org.apache.commons.lang3.exception.ExceptionUtils;

import situation_exchange.common.errors.NoInfoForTopicError;
import uk.org.siri.siri.NoInfoForTopicErrorStructure;
import uk.org.siri.siri.ServiceDeliveryErrorConditionStructure;

public class ServiceDeliveryNoInfoForTopicErrorFactory extends ServiceDeliveryErrorConditionFactory<NoInfoForTopicError> {

	static {
		_factories.put(NoInfoForTopicError.class, new ServiceDeliveryNoInfoForTopicErrorFactory());
	}

	@Override
	protected ServiceDeliveryErrorConditionStructure createServiceDeliveryErrorCondition(NoInfoForTopicError e) {
		ServiceDeliveryErrorConditionStructure result = _factory.createServiceDeliveryErrorConditionStructure();
		NoInfoForTopicErrorStructure error = _factory.createNoInfoForTopicErrorStructure();
		error.setErrorText(ExceptionUtils.getMessage(e));
		result.setNoInfoForTopicError(error);
		return result;
	}

}
