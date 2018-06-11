package situation_exchange.common.errors.factories;

import org.apache.commons.lang3.exception.ExceptionUtils;

import situation_exchange.common.errors.NoInfoForTopicError;
import uk.org.siri.siri.ErrorConditionStructure;
import uk.org.siri.siri.NoInfoForTopicErrorStructure;

public class NoInfoForTopicErrorFactory extends ErrorConditionFactory<NoInfoForTopicError> {

	static {
		_factories.put(NoInfoForTopicError.class, new NoInfoForTopicErrorFactory());
	}

	@Override
	protected ErrorConditionStructure createErrorCondition(NoInfoForTopicError e) {
		ErrorConditionStructure result = _factory.createErrorConditionStructure();
		NoInfoForTopicErrorStructure error = _factory.createNoInfoForTopicErrorStructure();
		error.setErrorText(ExceptionUtils.getMessage(e));
		result.setNoInfoForTopicError(error);
		return result;
	}

}
