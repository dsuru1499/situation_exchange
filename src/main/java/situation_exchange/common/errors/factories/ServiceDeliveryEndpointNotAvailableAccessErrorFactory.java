package situation_exchange.common.errors.factories;

import org.apache.commons.lang3.exception.ExceptionUtils;

import situation_exchange.common.errors.EndpointNotAvailableAccessError;
import uk.org.siri.siri.EndpointNotAvailableAccessStructure;
import uk.org.siri.siri.ServiceDeliveryErrorConditionStructure;

public class ServiceDeliveryEndpointNotAvailableAccessErrorFactory
		extends ServiceDeliveryErrorConditionFactory<EndpointNotAvailableAccessError> {

	static {
		_factories.put(EndpointNotAvailableAccessError.class, new ServiceDeliveryEndpointNotAvailableAccessErrorFactory());
	}

	@Override
	protected ServiceDeliveryErrorConditionStructure createServiceDeliveryErrorCondition(EndpointNotAvailableAccessError e) {
		ServiceDeliveryErrorConditionStructure result = _factory.createServiceDeliveryErrorConditionStructure();
		EndpointNotAvailableAccessStructure error = _factory.createEndpointNotAvailableAccessStructure();
		error.setErrorText(ExceptionUtils.getMessage(e));
		error.setEndpoint(e.getEndpoint());
		result.setEndpointNotAvailableAccessError(error);
		return result;
	}

}
