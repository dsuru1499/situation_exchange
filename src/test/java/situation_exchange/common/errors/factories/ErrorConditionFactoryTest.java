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
import situation_exchange.common.errors.UnknownExtensionsError;
import uk.org.siri.siri.AccessNotAllowedErrorStructure;
import uk.org.siri.siri.AllowedResourceUsageExceededErrorStructure;
import uk.org.siri.siri.BeyondDataHorizonErrorStructure;
import uk.org.siri.siri.CapabilityNotSupportedErrorStructure;
import uk.org.siri.siri.ErrorConditionStructure;
import uk.org.siri.siri.InvalidDataReferencesErrorStructure;
import uk.org.siri.siri.NoInfoForTopicErrorStructure;
import uk.org.siri.siri.OtherErrorStructure;
import uk.org.siri.siri.ParametersIgnoredErrorStructure;
import uk.org.siri.siri.ServiceNotAvailableErrorStructure;
import uk.org.siri.siri.UnknownExtensionsErrorStructure;

public class ErrorConditionFactoryTest {

	@Test
	public void testCreateErrorConditionAccessNotAllowedError() {
		SiriException e = new AccessNotAllowedError();
		ErrorConditionStructure message = ErrorConditionFactory.create(e);
		AccessNotAllowedErrorStructure error = message.getAccessNotAllowedError();
		assertNotNull(error);
	}

	@Test
	public void testAllowedResourceUsageExceededError() {
		SiriException e = new AllowedResourceUsageExceededError();
		ErrorConditionStructure message = ErrorConditionFactory.create(e);
		AllowedResourceUsageExceededErrorStructure error = message.getAllowedResourceUsageExceededError();
		assertNotNull(error);
	}

	@Test
	public void testBeyondDataHorizonError() {
		SiriException e = new BeyondDataHorizonError();
		ErrorConditionStructure message = ErrorConditionFactory.create(e);
		BeyondDataHorizonErrorStructure error = message.getBeyondDataHorizon();
		assertNotNull(error);
	}

	@Test
	public void testCapabilityNotSupportedError() {
		String value = "TEST";
		SiriException e = new CapabilityNotSupportedError(value);
		ErrorConditionStructure message = ErrorConditionFactory.create(e);
		CapabilityNotSupportedErrorStructure error = message.getCapabilityNotSupportedError();
		assertNotNull(error);
		assertEquals(value, error.getCapabilityRef());
	}

	@Test
	public void testInvalidDataReferencesError() {
		String[] values = { "TEST1", "TEST2" };
		SiriException e = new InvalidDataReferencesError(values);
		ErrorConditionStructure message = ErrorConditionFactory.create(e);
		InvalidDataReferencesErrorStructure error = message.getInvalidDataReferencesError();
		assertNotNull(error);
		assertEquals(Arrays.asList(values), error.getInvalidRef());
	}

	@Test
	public void testNoInfoForTopicError() {
		SiriException e = new NoInfoForTopicError();
		ErrorConditionStructure message = ErrorConditionFactory.create(e);
		NoInfoForTopicErrorStructure error = message.getNoInfoForTopicError();
		assertNotNull(error);
	}

	@Test
	public void testOtherError() {
		SiriException e = new OtherError(new Exception());
		ErrorConditionStructure message = ErrorConditionFactory.create(e);
		OtherErrorStructure error = message.getOtherError();
		assertNotNull(error);
	}

	@Test
	public void testParametersIgnoredError() {
		String[] values = { "TEST1", "TEST2" };
		SiriException e = new ParametersIgnoredError(values);
		ErrorConditionStructure message = ErrorConditionFactory.create(e);
		ParametersIgnoredErrorStructure error = message.getParametersIgnoredError();
		assertNotNull(error);
		assertEquals(Arrays.asList(values), error.getParameterName());
	}

	@Test
	public void testServiceNotAvailableError() {
		SiriException e = new ServiceNotAvailableError();
		ErrorConditionStructure message = ErrorConditionFactory.create(e);
		ServiceNotAvailableErrorStructure error = message.getServiceNotAvailableError();
		assertNotNull(error);
	}

	@Test
	public void testUnknownExtensionsError() {
		String[] values = { "TEST1", "TEST2" };
		SiriException e = new UnknownExtensionsError(values);
		ErrorConditionStructure message = ErrorConditionFactory.create(e);
		UnknownExtensionsErrorStructure error = message.getUnknownExtensionsError();
		assertNotNull(error);
		assertEquals(Arrays.asList(values), error.getExtensionName());
	}
}
