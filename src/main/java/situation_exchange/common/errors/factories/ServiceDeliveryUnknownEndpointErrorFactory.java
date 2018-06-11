package situation_exchange.common.errors.factories;

import org.apache.commons.lang3.exception.ExceptionUtils;

import situation_exchange.common.errors.UnknownEndpointError;
import uk.org.siri.siri.ServiceDeliveryErrorConditionStructure;
import uk.org.siri.siri.UnknownEndpointErrorStructure;

public class ServiceDeliveryUnknownEndpointErrorFactory extends ServiceDeliveryErrorConditionFactory<UnknownEndpointError> {

	static {
		_factories.put(UnknownEndpointError.class, new ServiceDeliveryUnknownEndpointErrorFactory());
	}

	@Override
	protected ServiceDeliveryErrorConditionStructure createServiceDeliveryErrorCondition(UnknownEndpointError e) {
		ServiceDeliveryErrorConditionStructure result = _factory.createServiceDeliveryErrorConditionStructure();
		UnknownEndpointErrorStructure error = _factory.createUnknownEndpointErrorStructure();
		error.setErrorText(ExceptionUtils.getMessage(e));
		error.setEndpoint(e.getEndpoint());
		result.setUnknownEndpointError(error);
		return result;
	}

}
