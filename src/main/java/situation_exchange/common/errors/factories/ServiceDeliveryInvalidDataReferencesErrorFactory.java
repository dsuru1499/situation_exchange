package situation_exchange.common.errors.factories;

import org.apache.commons.lang3.exception.ExceptionUtils;

import situation_exchange.common.errors.InvalidDataReferencesError;
import uk.org.siri.siri.InvalidDataReferencesErrorStructure;
import uk.org.siri.siri.ServiceDeliveryErrorConditionStructure;

public class ServiceDeliveryInvalidDataReferencesErrorFactory
		extends ServiceDeliveryErrorConditionFactory<InvalidDataReferencesError> {

	static {
		_factories.put(InvalidDataReferencesError.class, new ServiceDeliveryInvalidDataReferencesErrorFactory());
	}

	@Override
	protected ServiceDeliveryErrorConditionStructure createServiceDeliveryErrorCondition(InvalidDataReferencesError e) {
		ServiceDeliveryErrorConditionStructure result = _factory.createServiceDeliveryErrorConditionStructure();
		InvalidDataReferencesErrorStructure error = _factory.createInvalidDataReferencesErrorStructure();
		error.setErrorText(ExceptionUtils.getMessage(e));
		error.getInvalidRef().addAll(e.getInvalidRef());
		result.setInvalidDataReferencesError(error);
		return result;
	}

}
