package situation_exchange.common.errors.factories;

import org.apache.commons.lang3.exception.ExceptionUtils;

import situation_exchange.common.errors.ServiceNotAvailableError;
import uk.org.siri.siri.ErrorConditionStructure;
import uk.org.siri.siri.ServiceNotAvailableErrorStructure;

public class ServiceNotAvailableErrorFactory extends ErrorConditionFactory<ServiceNotAvailableError> {

	static {
		_factories.put(ServiceNotAvailableError.class, new ServiceNotAvailableErrorFactory());
	}

	@Override
	protected ErrorConditionStructure createErrorCondition(ServiceNotAvailableError e) {
		ErrorConditionStructure result = _factory.createErrorConditionStructure();
		ServiceNotAvailableErrorStructure error = _factory.createServiceNotAvailableErrorStructure();
		error.setErrorText(ExceptionUtils.getMessage(e));
		result.setServiceNotAvailableError(error);
		return result;
	}

}
