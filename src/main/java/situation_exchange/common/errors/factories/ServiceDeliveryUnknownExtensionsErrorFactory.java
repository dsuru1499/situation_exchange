package situation_exchange.common.errors.factories;

import org.apache.commons.lang3.exception.ExceptionUtils;

import situation_exchange.common.errors.UnknownExtensionsError;
import uk.org.siri.siri.ServiceDeliveryErrorConditionStructure;
import uk.org.siri.siri.UnknownExtensionsErrorStructure;

public class ServiceDeliveryUnknownExtensionsErrorFactory extends ServiceDeliveryErrorConditionFactory<UnknownExtensionsError> {

	static {
		_factories.put(UnknownExtensionsError.class, new ServiceDeliveryUnknownExtensionsErrorFactory());
	}

	@Override
	protected ServiceDeliveryErrorConditionStructure createServiceDeliveryErrorCondition(UnknownExtensionsError e) {
		ServiceDeliveryErrorConditionStructure result = _factory.createServiceDeliveryErrorConditionStructure();
		UnknownExtensionsErrorStructure error = _factory.createUnknownExtensionsErrorStructure();
		error.setErrorText(ExceptionUtils.getMessage(e));
		error.getExtensionName().addAll(e.getExtensionName());
		result.setUnknownExtensionsError(error);
		return result;
	}

}
