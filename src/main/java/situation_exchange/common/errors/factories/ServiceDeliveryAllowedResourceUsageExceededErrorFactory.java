package situation_exchange.common.errors.factories;

import org.apache.commons.lang3.exception.ExceptionUtils;

import situation_exchange.common.errors.AllowedResourceUsageExceededError;
import uk.org.siri.siri.AllowedResourceUsageExceededErrorStructure;
import uk.org.siri.siri.ServiceDeliveryErrorConditionStructure;

public class ServiceDeliveryAllowedResourceUsageExceededErrorFactory
		extends ServiceDeliveryErrorConditionFactory<AllowedResourceUsageExceededError> {

	static {
		_factories.put(AllowedResourceUsageExceededError.class, new ServiceDeliveryAllowedResourceUsageExceededErrorFactory());
	}

	@Override
	protected ServiceDeliveryErrorConditionStructure createServiceDeliveryErrorCondition(AllowedResourceUsageExceededError e) {
		ServiceDeliveryErrorConditionStructure result = _factory.createServiceDeliveryErrorConditionStructure();
		AllowedResourceUsageExceededErrorStructure error = _factory.createAllowedResourceUsageExceededErrorStructure();
		error.setErrorText(ExceptionUtils.getMessage(e));
		result.setAllowedResourceUsageExceededError(error);
		return result;
	}

}
