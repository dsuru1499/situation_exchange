package situation_exchange.common.errors.factories;

import org.apache.commons.lang3.exception.ExceptionUtils;

import situation_exchange.common.errors.ParametersIgnoredError;
import uk.org.siri.siri.ErrorConditionStructure;
import uk.org.siri.siri.ParametersIgnoredErrorStructure;

public class ParametersIgnoredErrorFactory extends ErrorConditionFactory<ParametersIgnoredError> {

	static {
		_factories.put(ParametersIgnoredError.class, new ParametersIgnoredErrorFactory());
	}

	@Override
	protected ErrorConditionStructure createErrorCondition(ParametersIgnoredError e) {
		ErrorConditionStructure result = _factory.createErrorConditionStructure();
		ParametersIgnoredErrorStructure error = _factory.createParametersIgnoredErrorStructure();
		error.setErrorText(ExceptionUtils.getMessage(e));
		error.getParameterName().addAll(e.getParameterName());
		result.setParametersIgnoredError(error);
		return result;
	}

}
