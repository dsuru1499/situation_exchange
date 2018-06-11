package situation_exchange.common.errors.factories;

import org.apache.commons.lang3.exception.ExceptionUtils;

import situation_exchange.common.errors.BeyondDataHorizonError;
import uk.org.siri.siri.BeyondDataHorizonErrorStructure;
import uk.org.siri.siri.ErrorConditionStructure;

public class BeyondDataHorizonErrorFactory extends ErrorConditionFactory<BeyondDataHorizonError> {

	static {
		_factories.put(BeyondDataHorizonError.class, new BeyondDataHorizonErrorFactory());
	}

	@Override
	protected ErrorConditionStructure createErrorCondition(BeyondDataHorizonError e) {
		ErrorConditionStructure result = _factory.createErrorConditionStructure();
		BeyondDataHorizonErrorStructure error = _factory.createBeyondDataHorizonErrorStructure();
		error.setErrorText(ExceptionUtils.getMessage(e));
		result.setBeyondDataHorizon(error);
		return result;
	}

}
