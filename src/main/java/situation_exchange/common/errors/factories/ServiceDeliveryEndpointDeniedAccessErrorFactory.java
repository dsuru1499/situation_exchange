package situation_exchange.common.errors.factories;

import org.apache.commons.lang3.exception.ExceptionUtils;

import situation_exchange.common.errors.EndpointDeniedAccessError;
import uk.org.siri.siri.EndpointDeniedAccessStructure;
import uk.org.siri.siri.ServiceDeliveryErrorConditionStructure;

public class ServiceDeliveryEndpointDeniedAccessErrorFactory
		extends ServiceDeliveryErrorConditionFactory<EndpointDeniedAccessError> {

	static {
		_factories.put(EndpointDeniedAccessError.class, new ServiceDeliveryEndpointDeniedAccessErrorFactory());
	}

	@Override
	protected ServiceDeliveryErrorConditionStructure createServiceDeliveryErrorCondition(EndpointDeniedAccessError e) {
		ServiceDeliveryErrorConditionStructure result = _factory.createServiceDeliveryErrorConditionStructure();
		EndpointDeniedAccessStructure error = _factory.createEndpointDeniedAccessStructure();
		error.setErrorText(ExceptionUtils.getMessage(e));
		error.setEndpoint(e.getEndpoint());
		result.setEndpointDeniedAccessError(error);
		return result;
	}

}
