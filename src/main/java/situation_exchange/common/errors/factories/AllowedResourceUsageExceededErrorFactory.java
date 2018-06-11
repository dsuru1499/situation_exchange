package situation_exchange.common.errors.factories;

import org.apache.commons.lang3.exception.ExceptionUtils;

import situation_exchange.common.errors.AllowedResourceUsageExceededError;
import uk.org.siri.siri.AllowedResourceUsageExceededErrorStructure;
import uk.org.siri.siri.ErrorConditionStructure;

public class AllowedResourceUsageExceededErrorFactory extends ErrorConditionFactory<AllowedResourceUsageExceededError> {

	static {
		_factories.put(AllowedResourceUsageExceededError.class, new AllowedResourceUsageExceededErrorFactory());
	}

	@Override
	protected ErrorConditionStructure createErrorCondition(AllowedResourceUsageExceededError e) {
		ErrorConditionStructure result = _factory.createErrorConditionStructure();
		AllowedResourceUsageExceededErrorStructure error = _factory.createAllowedResourceUsageExceededErrorStructure();
		error.setErrorText(ExceptionUtils.getMessage(e));
		result.setAllowedResourceUsageExceededError(error);
		return result;
	}

}
