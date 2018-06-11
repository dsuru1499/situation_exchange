package situation_exchange.common.errors.factories;

import org.apache.commons.lang3.exception.ExceptionUtils;

import situation_exchange.common.errors.OtherError;
import uk.org.siri.siri.OtherErrorStructure;
import uk.org.siri.siri.ServiceDeliveryErrorConditionStructure;

public class ServiceDeliveryOtherErrorFactory extends ServiceDeliveryErrorConditionFactory<OtherError> {

	static {
		_factories.put(OtherError.class, new ServiceDeliveryOtherErrorFactory());
	}

	@Override
	protected ServiceDeliveryErrorConditionStructure createServiceDeliveryErrorCondition(OtherError e) {
		ServiceDeliveryErrorConditionStructure result = _factory.createServiceDeliveryErrorConditionStructure();
		OtherErrorStructure error = _factory.createOtherErrorStructure();
		error.setErrorText(ExceptionUtils.getMessage(e));
		result.setOtherError(error);
		return result;
	}

}
