package situation_exchange.common.errors.factories;

import org.apache.commons.lang3.exception.ExceptionUtils;

import situation_exchange.common.errors.OtherError;
import uk.org.siri.siri.ErrorConditionStructure;
import uk.org.siri.siri.OtherErrorStructure;

public class OtherErrorFactory extends ErrorConditionFactory<OtherError> {

	static {
		_factories.put(OtherError.class, new OtherErrorFactory());
	}

	@Override
	protected ErrorConditionStructure createErrorCondition(OtherError e) {
		ErrorConditionStructure result = _factory.createErrorConditionStructure();
		OtherErrorStructure error = _factory.createOtherErrorStructure();
		error.setErrorText(ExceptionUtils.getMessage(e));
		result.setOtherError(error);
		return result;
	}

}
