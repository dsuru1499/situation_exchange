package situation_exchange.common.errors.factories;

import org.apache.commons.lang3.exception.ExceptionUtils;

import situation_exchange.common.errors.InvalidDataReferencesError;
import uk.org.siri.siri.ErrorConditionStructure;
import uk.org.siri.siri.InvalidDataReferencesErrorStructure;

public class InvalidDataReferencesErrorFactory extends ErrorConditionFactory<InvalidDataReferencesError> {

	static {
		_factories.put(InvalidDataReferencesError.class, new InvalidDataReferencesErrorFactory());
	}

	@Override
	protected ErrorConditionStructure createErrorCondition(InvalidDataReferencesError e) {
		ErrorConditionStructure result = _factory.createErrorConditionStructure();
		InvalidDataReferencesErrorStructure error = _factory.createInvalidDataReferencesErrorStructure();
		error.setErrorText(ExceptionUtils.getMessage(e));
		error.getInvalidRef().addAll(e.getInvalidRef());
		result.setInvalidDataReferencesError(error);
		return result;
	}

}
