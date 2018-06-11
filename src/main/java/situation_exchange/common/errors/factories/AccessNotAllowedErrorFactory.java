package situation_exchange.common.errors.factories;

import org.apache.commons.lang3.exception.ExceptionUtils;

import situation_exchange.common.errors.AccessNotAllowedError;
import uk.org.siri.siri.AccessNotAllowedErrorStructure;
import uk.org.siri.siri.ErrorConditionStructure;

public class AccessNotAllowedErrorFactory extends ErrorConditionFactory<AccessNotAllowedError> {

	static {
		_factories.put(AccessNotAllowedError.class, new AccessNotAllowedErrorFactory());
	}

	@Override
	protected ErrorConditionStructure createErrorCondition(AccessNotAllowedError e) {
		ErrorConditionStructure result = _factory.createErrorConditionStructure();
		AccessNotAllowedErrorStructure error = _factory.createAccessNotAllowedErrorStructure();
		error.setErrorText(ExceptionUtils.getMessage(e));
		result.setAccessNotAllowedError(error);
		return result;
	}

}
