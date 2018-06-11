package situation_exchange.common.errors.factories;

import org.apache.commons.lang3.exception.ExceptionUtils;

import situation_exchange.common.errors.ParametersIgnoredError;
import uk.org.siri.siri.ParametersIgnoredErrorStructure;
import uk.org.siri.siri.ServiceDeliveryErrorConditionStructure;

public class ServiceDeliveryParametersIgnoredErrorFactory extends ServiceDeliveryErrorConditionFactory<ParametersIgnoredError> {

	static {
		_factories.put(ParametersIgnoredError.class, new ServiceDeliveryParametersIgnoredErrorFactory());
	}

	@Override
	protected ServiceDeliveryErrorConditionStructure createServiceDeliveryErrorCondition(ParametersIgnoredError e) {
		ServiceDeliveryErrorConditionStructure result = _factory.createServiceDeliveryErrorConditionStructure();
		ParametersIgnoredErrorStructure error = _factory.createParametersIgnoredErrorStructure();
		error.setErrorText(ExceptionUtils.getMessage(e));
		error.getParameterName().addAll(e.getParameterName());
		result.setParametersIgnoredError(error);
		return result;
	}

}
