package situation_exchange.common.errors.factories;

import org.apache.commons.lang3.exception.ExceptionUtils;

import situation_exchange.common.errors.ServiceNotAvailableError;
import uk.org.siri.siri.ServiceDeliveryErrorConditionStructure;
import uk.org.siri.siri.ServiceNotAvailableErrorStructure;

public class ServiceDeliveryServiceNotAvailableErrorFactory extends ServiceDeliveryErrorConditionFactory<ServiceNotAvailableError> {

	static {
		_factories.put(ServiceNotAvailableError.class, new ServiceDeliveryServiceNotAvailableErrorFactory());
	}

	@Override
	protected ServiceDeliveryErrorConditionStructure createServiceDeliveryErrorCondition(ServiceNotAvailableError e) {
		ServiceDeliveryErrorConditionStructure result = _factory.createServiceDeliveryErrorConditionStructure();
		ServiceNotAvailableErrorStructure error = _factory.createServiceNotAvailableErrorStructure();
		error.setErrorText(ExceptionUtils.getMessage(e));
		result.setServiceNotAvailableError(error);
		return result;
	}

}
