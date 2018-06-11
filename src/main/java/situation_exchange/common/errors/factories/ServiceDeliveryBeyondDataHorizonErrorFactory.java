package situation_exchange.common.errors.factories;

import org.apache.commons.lang3.exception.ExceptionUtils;

import situation_exchange.common.errors.BeyondDataHorizonError;
import uk.org.siri.siri.BeyondDataHorizonErrorStructure;
import uk.org.siri.siri.ServiceDeliveryErrorConditionStructure;

public class ServiceDeliveryBeyondDataHorizonErrorFactory extends ServiceDeliveryErrorConditionFactory<BeyondDataHorizonError> {

	static {
		_factories.put(BeyondDataHorizonError.class, new ServiceDeliveryBeyondDataHorizonErrorFactory());
	}

	@Override
	protected ServiceDeliveryErrorConditionStructure createServiceDeliveryErrorCondition(BeyondDataHorizonError e) {
		ServiceDeliveryErrorConditionStructure result = _factory.createServiceDeliveryErrorConditionStructure();
		BeyondDataHorizonErrorStructure error = _factory.createBeyondDataHorizonErrorStructure();
		error.setErrorText(ExceptionUtils.getMessage(e));
		result.setBeyondDataHorizon(error);
		return result;
	}

}
