package situation_exchange.common.errors.factories;

import org.apache.commons.lang3.exception.ExceptionUtils;

import situation_exchange.common.errors.UnknownParticipantError;
import uk.org.siri.siri.ParticipantRefStructure;
import uk.org.siri.siri.ServiceDeliveryErrorConditionStructure;
import uk.org.siri.siri.UnknownParticipantErrorStructure;

public class ServiceDeliveryUnknownParticipantErrorFactory extends ServiceDeliveryErrorConditionFactory<UnknownParticipantError> {

	static {
		_factories.put(UnknownParticipantError.class, new ServiceDeliveryUnknownParticipantErrorFactory());
	}

	@Override
	protected ServiceDeliveryErrorConditionStructure createServiceDeliveryErrorCondition(UnknownParticipantError e) {
		ServiceDeliveryErrorConditionStructure result = _factory.createServiceDeliveryErrorConditionStructure();
		UnknownParticipantErrorStructure error = _factory.createUnknownParticipantErrorStructure();
		error.setErrorText(ExceptionUtils.getMessage(e));
		ParticipantRefStructure participantRef = _factory.createParticipantRefStructure();
		participantRef.setValue(e.getParticipantRef());
		error.setParticipantRef(participantRef);
		result.setUnknownParticipantError(error);
		return result;
	}

}
