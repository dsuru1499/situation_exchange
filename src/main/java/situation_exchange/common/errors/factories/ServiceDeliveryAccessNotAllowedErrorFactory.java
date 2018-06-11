package situation_exchange.common.errors.factories;

import org.apache.commons.lang3.exception.ExceptionUtils;

import situation_exchange.common.errors.AccessNotAllowedError;
import uk.org.siri.siri.AccessNotAllowedErrorStructure;
import uk.org.siri.siri.ServiceDeliveryErrorConditionStructure;

public class ServiceDeliveryAccessNotAllowedErrorFactory extends ServiceDeliveryErrorConditionFactory<AccessNotAllowedError> {

	static {
		_factories.put(AccessNotAllowedError.class, new ServiceDeliveryAccessNotAllowedErrorFactory());
	}

	@Override
	protected ServiceDeliveryErrorConditionStructure createServiceDeliveryErrorCondition(AccessNotAllowedError e) {
		ServiceDeliveryErrorConditionStructure result = _factory.createServiceDeliveryErrorConditionStructure();
		AccessNotAllowedErrorStructure error = _factory.createAccessNotAllowedErrorStructure();
		error.setErrorText(ExceptionUtils.getMessage(e));
		result.setAccessNotAllowedError(error);
		return result;
	}

}
