package situation_exchange.common.errors.factories;

import org.apache.commons.lang3.exception.ExceptionUtils;

import situation_exchange.common.errors.CapabilityNotSupportedError;
import uk.org.siri.siri.CapabilityNotSupportedErrorStructure;
import uk.org.siri.siri.ServiceDeliveryErrorConditionStructure;

public class ServiceDeliveryCapabilityNotSupportedErrorFactory
		extends ServiceDeliveryErrorConditionFactory<CapabilityNotSupportedError> {

	static {
		_factories.put(CapabilityNotSupportedError.class, new ServiceDeliveryCapabilityNotSupportedErrorFactory());
	}

	@Override
	protected ServiceDeliveryErrorConditionStructure createServiceDeliveryErrorCondition(CapabilityNotSupportedError e) {
		ServiceDeliveryErrorConditionStructure result = _factory.createServiceDeliveryErrorConditionStructure();
		CapabilityNotSupportedErrorStructure error = _factory.createCapabilityNotSupportedErrorStructure();
		error.setErrorText(ExceptionUtils.getMessage(e));
		error.setCapabilityRef(e.getCapabilityRef());
		result.setCapabilityNotSupportedError(error);
		return result;
	}

}
