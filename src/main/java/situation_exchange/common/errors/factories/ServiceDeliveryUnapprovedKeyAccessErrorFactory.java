package situation_exchange.common.errors.factories;

import org.apache.commons.lang3.exception.ExceptionUtils;

import situation_exchange.common.errors.UnapprovedKeyAccessError;
import uk.org.siri.siri.ServiceDeliveryErrorConditionStructure;
import uk.org.siri.siri.UnapprovedKeyAccessStructure;

public class ServiceDeliveryUnapprovedKeyAccessErrorFactory extends ServiceDeliveryErrorConditionFactory<UnapprovedKeyAccessError> {

	static {
		_factories.put(UnapprovedKeyAccessError.class, new ServiceDeliveryUnapprovedKeyAccessErrorFactory());
	}

	@Override
	protected ServiceDeliveryErrorConditionStructure createServiceDeliveryErrorCondition(UnapprovedKeyAccessError e) {
		ServiceDeliveryErrorConditionStructure result = _factory.createServiceDeliveryErrorConditionStructure();
		UnapprovedKeyAccessStructure error = _factory.createUnapprovedKeyAccessStructure();
		error.setErrorText(ExceptionUtils.getMessage(e));
		error.setKey(e.getKey());
		result.setUnapprovedKeyAccessError(error);
		return result;
	}

}
