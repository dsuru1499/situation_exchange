package situation_exchange.common.errors.factories;

import org.apache.commons.lang3.exception.ExceptionUtils;

import situation_exchange.common.errors.CapabilityNotSupportedError;
import uk.org.siri.siri.CapabilityNotSupportedErrorStructure;
import uk.org.siri.siri.ErrorConditionStructure;

public class CapabilityNotSupportedErrorFactory extends ErrorConditionFactory<CapabilityNotSupportedError> {

	static {
		_factories.put(CapabilityNotSupportedError.class, new CapabilityNotSupportedErrorFactory());
	}

	@Override
	protected ErrorConditionStructure createErrorCondition(CapabilityNotSupportedError e) {
		ErrorConditionStructure result = _factory.createErrorConditionStructure();
		CapabilityNotSupportedErrorStructure error = _factory.createCapabilityNotSupportedErrorStructure();
		error.setErrorText(ExceptionUtils.getMessage(e));
		error.setCapabilityRef(e.getCapabilityRef());
		result.setCapabilityNotSupportedError(error);
		return result;
	}

}
