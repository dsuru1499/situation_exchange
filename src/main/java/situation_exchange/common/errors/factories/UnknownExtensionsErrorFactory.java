package situation_exchange.common.errors.factories;

import org.apache.commons.lang3.exception.ExceptionUtils;

import situation_exchange.common.errors.UnknownExtensionsError;
import uk.org.siri.siri.ErrorConditionStructure;
import uk.org.siri.siri.UnknownExtensionsErrorStructure;

public class UnknownExtensionsErrorFactory extends ErrorConditionFactory<UnknownExtensionsError> {

	static {
		_factories.put(UnknownExtensionsError.class, new UnknownExtensionsErrorFactory());
	}

	@Override
	protected ErrorConditionStructure createErrorCondition(UnknownExtensionsError e) {
		ErrorConditionStructure result = _factory.createErrorConditionStructure();
		UnknownExtensionsErrorStructure error = _factory.createUnknownExtensionsErrorStructure();
		error.setErrorText(ExceptionUtils.getMessage(e));
		error.getExtensionName().addAll(e.getExtensionName());
		result.setUnknownExtensionsError(error);
		return result;
	}

}
