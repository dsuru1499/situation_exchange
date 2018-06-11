package situation_exchange.common.errors.factories;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;

import org.junit.Test;

import situation_exchange.common.errors.AccessNotAllowedError;
import situation_exchange.common.errors.AllowedResourceUsageExceededError;
import situation_exchange.common.errors.BeyondDataHorizonError;
import situation_exchange.common.errors.CapabilityNotSupportedError;
import situation_exchange.common.errors.InvalidDataReferencesError;
import situation_exchange.common.errors.NoInfoForTopicError;
import situation_exchange.common.errors.OtherError;
import situation_exchange.common.errors.ParametersIgnoredError;
import situation_exchange.common.errors.ServiceNotAvailableError;
import situation_exchange.common.errors.SiriException;
import situation_exchange.common.errors.UnapprovedKeyAccessError;
import situation_exchange.common.errors.UnknownEndpointError;
import situation_exchange.common.errors.UnknownExtensionsError;
import situation_exchange.common.errors.UnknownParticipantError;
import uk.org.siri.siri.AccessNotAllowedErrorStructure;
import uk.org.siri.siri.AllowedResourceUsageExceededErrorStructure;
import uk.org.siri.siri.BeyondDataHorizonErrorStructure;
import uk.org.siri.siri.CapabilityNotSupportedErrorStructure;
import uk.org.siri.siri.InvalidDataReferencesErrorStructure;
import uk.org.siri.siri.NoInfoForTopicErrorStructure;
import uk.org.siri.siri.OtherErrorStructure;
import uk.org.siri.siri.ParametersIgnoredErrorStructure;
import uk.org.siri.siri.ServiceDeliveryErrorConditionStructure;
import uk.org.siri.siri.ServiceNotAvailableErrorStructure;
import uk.org.siri.siri.UnapprovedKeyAccessStructure;
import uk.org.siri.siri.UnknownEndpointErrorStructure;
import uk.org.siri.siri.UnknownExtensionsErrorStructure;
import uk.org.siri.siri.UnknownParticipantErrorStructure;

public class ServiceDeliveryErrorConditionFactoryTest {

	@Test
	public void testErrorConditionAccessNotAllowedError() {
		SiriException e = new AccessNotAllowedError();
		ServiceDeliveryErrorConditionStructure message = ServiceDeliveryErrorConditionFactory.create(e);
		AccessNotAllowedErrorStructure error = message.getAccessNotAllowedError();
		assertNotNull(error);
	}

	@Test
	public void testAllowedResourceUsageExceededError() {
		SiriException e = new AllowedResourceUsageExceededError();
		ServiceDeliveryErrorConditionStructure message = ServiceDeliveryErrorConditionFactory.create(e);
		AllowedResourceUsageExceededErrorStructure error = message.getAllowedResourceUsageExceededError();
		assertNotNull(error);
	}

	@Test
	public void testBeyondDataHorizonError() {
		SiriException e = new BeyondDataHorizonError();
		ServiceDeliveryErrorConditionStructure message = ServiceDeliveryErrorConditionFactory.create(e);
		BeyondDataHorizonErrorStructure error = message.getBeyondDataHorizon();
		assertNotNull(error);
	}

	@Test
	public void testCapabilityNotSupportedError() {
		String value = "TEST";
		SiriException e = new CapabilityNotSupportedError(value);
		ServiceDeliveryErrorConditionStructure message = ServiceDeliveryErrorConditionFactory.create(e);
		CapabilityNotSupportedErrorStructure error = message.getCapabilityNotSupportedError();
		assertNotNull(error);
		assertEquals(value, error.getCapabilityRef());
	}

	@Test
	public void testInvalidDataReferencesError() {
		String[] values = { "TEST1", "TEST2" };
		SiriException e = new InvalidDataReferencesError(values);
		ServiceDeliveryErrorConditionStructure message = ServiceDeliveryErrorConditionFactory.create(e);
		InvalidDataReferencesErrorStructure error = message.getInvalidDataReferencesError();
		assertNotNull(error);
		assertEquals(Arrays.asList(values), error.getInvalidRef());
	}

	@Test
	public void testNoInfoForTopicError() {
		SiriException e = new NoInfoForTopicError();
		ServiceDeliveryErrorConditionStructure message = ServiceDeliveryErrorConditionFactory.create(e);
		NoInfoForTopicErrorStructure error = message.getNoInfoForTopicError();
		assertNotNull(error);
	}

	@Test
	public void testOtherError() {
		SiriException e = new OtherError(new Exception());
		ServiceDeliveryErrorConditionStructure message = ServiceDeliveryErrorConditionFactory.create(e);
		OtherErrorStructure error = message.getOtherError();
		assertNotNull(error);
	}

	@Test
	public void testParametersIgnoredError() {
		String[] values = { "TEST1", "TEST2" };
		SiriException e = new ParametersIgnoredError(values);
		ServiceDeliveryErrorConditionStructure message = ServiceDeliveryErrorConditionFactory.create(e);
		ParametersIgnoredErrorStructure error = message.getParametersIgnoredError();
		assertNotNull(error);
		assertEquals(Arrays.asList(values), error.getParameterName());
	}

	@Test
	public void testServiceNotAvailableError() {
		SiriException e = new ServiceNotAvailableError();
		ServiceDeliveryErrorConditionStructure message = ServiceDeliveryErrorConditionFactory.create(e);
		ServiceNotAvailableErrorStructure error = message.getServiceNotAvailableError();
		assertNotNull(error);
	}

	@Test
	public void testUnapprovedKeyAccessError() {
		String value = "TEST";
		SiriException e = new UnapprovedKeyAccessError(value);
		ServiceDeliveryErrorConditionStructure message = ServiceDeliveryErrorConditionFactory.create(e);
		UnapprovedKeyAccessStructure error = message.getUnapprovedKeyAccessError();
		assertNotNull(error);
		assertEquals(value, error.getKey());
	}

	@Test
	public void testUnknownEndpointError() {
		String value = "TEST";
		SiriException e = new UnknownEndpointError(value);
		ServiceDeliveryErrorConditionStructure message = ServiceDeliveryErrorConditionFactory.create(e);
		UnknownEndpointErrorStructure error = message.getUnknownEndpointError();
		assertNotNull(error);
		assertEquals(value, error.getEndpoint());
	}

	@Test
	public void testUnknownExtensionsError() {
		String[] values = { "TEST1", "TEST2" };
		SiriException e = new UnknownExtensionsError(values);
		ServiceDeliveryErrorConditionStructure message = ServiceDeliveryErrorConditionFactory.create(e);
		UnknownExtensionsErrorStructure error = message.getUnknownExtensionsError();
		assertNotNull(error);
		assertEquals(Arrays.asList(values), error.getExtensionName());
	}

	@Test
	public void testUnknownParticipantError() {
		String value = "TEST";
		SiriException e = new UnknownParticipantError(value);
		ServiceDeliveryErrorConditionStructure message = ServiceDeliveryErrorConditionFactory.create(e);
		UnknownParticipantErrorStructure error = message.getUnknownParticipantError();
		assertNotNull(error);
		assertEquals(value, error.getParticipantRef().getValue());
	}

}
