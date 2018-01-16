package situation_exchange.common;

import java.lang.reflect.InvocationTargetException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;

import uk.org.siri.siri.AccessNotAllowedErrorStructure;
import uk.org.siri.siri.AllowedResourceUsageExceededErrorStructure;
import uk.org.siri.siri.BeyondDataHorizonErrorStructure;
import uk.org.siri.siri.CapabilityNotSupportedErrorStructure;
import uk.org.siri.siri.EndpointDeniedAccessStructure;
import uk.org.siri.siri.EndpointNotAvailableAccessStructure;
import uk.org.siri.siri.ErrorCodeStructure;
import uk.org.siri.siri.ErrorConditionStructure;
import uk.org.siri.siri.ErrorDescriptionStructure;
import uk.org.siri.siri.InvalidDataReferencesErrorStructure;
import uk.org.siri.siri.MessageQualifierStructure;
import uk.org.siri.siri.NaturalLanguageStringStructure;
import uk.org.siri.siri.NoInfoForTopicErrorStructure;
import uk.org.siri.siri.ObjectFactory;
import uk.org.siri.siri.OtherErrorStructure;
import uk.org.siri.siri.ParametersIgnoredErrorStructure;
import uk.org.siri.siri.ParticipantRefStructure;
import uk.org.siri.siri.ServiceDeliveryErrorConditionStructure;
import uk.org.siri.siri.ServiceNotAvailableErrorStructure;
import uk.org.siri.siri.UnapprovedKeyAccessStructure;
import uk.org.siri.siri.UnknownEndpointErrorStructure;
import uk.org.siri.siri.UnknownExtensionsErrorStructure;
import uk.org.siri.siri.UnknownParticipantErrorStructure;

public class SiriStructureFactory {

	private static DatatypeFactory xmlFactory;
	static {
		try {
			xmlFactory = DatatypeFactory.newInstance();
		} catch (DatatypeConfigurationException ignored) {
		}
	}
	private static ObjectFactory factory = new ObjectFactory();

	public static XMLGregorianCalendar createXMLGregorianCalendar() {
		return createXMLGregorianCalendar();
	}

	public static XMLGregorianCalendar createXMLGregorianCalendar(long epochMilli) {
		LocalDateTime dateTime = Instant.ofEpochMilli(epochMilli).atZone(ZoneId.systemDefault()).toLocalDateTime();
		return createXMLGregorianCalendar(dateTime);
	}

	public static XMLGregorianCalendar createXMLGregorianCalendar(LocalDateTime dateTime) {
		GregorianCalendar calendar = GregorianCalendar.from(ZonedDateTime.of(dateTime, ZoneId.systemDefault()));
		return xmlFactory.newXMLGregorianCalendar(calendar);
	}

	public static Duration createDuration(long delay) {
		return xmlFactory.newDuration(delay);
	}

	public static NaturalLanguageStringStructure createNaturalLanguageStringStructure(String text) {
		return createNaturalLanguageStringStructure(text, Locale.getDefault());
	}

	public static NaturalLanguageStringStructure createNaturalLanguageStringStructure(String text, Locale locale) {
		NaturalLanguageStringStructure result = factory.createNaturalLanguageStringStructure();
		result.setValue(text);
		// result.setLang(locale.getLanguage());
		return result;
	}

	public static MessageQualifierStructure createMessageIdentifier() {
		return createMessageIdentifier(UUID.randomUUID().toString());
	}

	public static MessageQualifierStructure createMessageIdentifier(String value) {
		MessageQualifierStructure result = factory.createMessageQualifierStructure();
		result.setValue(value);
		return result;
	}

	public static ParticipantRefStructure createParticipantRef(String domain, String name) {
		ParticipantRefStructure result = factory.createParticipantRefStructure();
		if (name == null || name.isEmpty()) {
			result.setValue(domain);
		} else {
			result.setValue(domain + ":" + name);
		}
		return result;
	}

	public static final ServiceDeliveryErrorConditionStructure createServiceDeliveryErrorConditionStructure(SiriException e) {
		ServiceDeliveryErrorConditionStructure result = factory.createServiceDeliveryErrorConditionStructure();
		ErrorCodeStructure error = createErrorCodeStructure(e);
		switch (e.getCode()) {
		case UnapprovedKeyAccessError:
			result.setUnapprovedKeyAccessError((UnapprovedKeyAccessStructure) error);
			break;
		case UnknownParticipantError:
			result.setUnknownParticipantError((UnknownParticipantErrorStructure) error);
			break;
		case UnknownEndpointError:
			result.setUnknownEndpointError((UnknownEndpointErrorStructure) error);
			break;
		case EndpointDeniedAccessError:
			result.setEndpointDeniedAccessError((EndpointDeniedAccessStructure) error);
			break;
		case EndpointNotAvailableAccessError:
			result.setEndpointNotAvailableAccessError((EndpointNotAvailableAccessStructure) error);
			break;
		case ServiceNotAvailableError:
			result.setServiceNotAvailableError((ServiceNotAvailableErrorStructure) error);
			break;
		case CapabilityNotSupportedError:
			result.setCapabilityNotSupportedError((CapabilityNotSupportedErrorStructure) error);
			break;
		case AccessNotAllowedError:
			result.setAccessNotAllowedError((AccessNotAllowedErrorStructure) error);
			break;
		case InvalidDataReferencesError:
			result.setInvalidDataReferencesError((InvalidDataReferencesErrorStructure) error);
			break;
		case BeyondDataHorizon:
			result.setBeyondDataHorizon((BeyondDataHorizonErrorStructure) error);
			break;
		case NoInfoForTopicError:
			result.setNoInfoForTopicError((NoInfoForTopicErrorStructure) error);
			break;
		case ParametersIgnoredError:
			result.setParametersIgnoredError((ParametersIgnoredErrorStructure) error);
			break;
		case UnknownExtensionsError:
			result.setUnknownExtensionsError((UnknownExtensionsErrorStructure) error);
			break;
		case AllowedResourceUsageExceededError:
			result.setAllowedResourceUsageExceededError((AllowedResourceUsageExceededErrorStructure) error);
			break;
		case OtherError:
			result.setOtherError((OtherErrorStructure) error);
			break;
		default:
			ErrorDescriptionStructure description = factory.createErrorDescriptionStructure();
			description.setValue(ExceptionUtils.getMessage(e));
			result.setDescription(description);
			break;
		}
		return result;

	}

	public static final ErrorConditionStructure createErrorConditionStructure(SiriException e) {

		ErrorConditionStructure result = factory.createErrorConditionStructure();
		ErrorCodeStructure error = createErrorCodeStructure(e);

		switch (e.getCode()) {

		case ServiceNotAvailableError:
			result.setServiceNotAvailableError((ServiceNotAvailableErrorStructure) error);
			break;
		case CapabilityNotSupportedError:
			result.setCapabilityNotSupportedError((CapabilityNotSupportedErrorStructure) error);
			break;
		case AccessNotAllowedError:
			result.setAccessNotAllowedError((AccessNotAllowedErrorStructure) error);
			break;
		case InvalidDataReferencesError:
			result.setInvalidDataReferencesError((InvalidDataReferencesErrorStructure) error);
			break;
		case BeyondDataHorizon:
			result.setBeyondDataHorizon((BeyondDataHorizonErrorStructure) error);
			break;
		case NoInfoForTopicError:
			result.setNoInfoForTopicError((NoInfoForTopicErrorStructure) error);
			break;
		case ParametersIgnoredError:
			result.setParametersIgnoredError((ParametersIgnoredErrorStructure) error);
			break;
		case UnknownExtensionsError:
			result.setUnknownExtensionsError((UnknownExtensionsErrorStructure) error);
			break;
		case AllowedResourceUsageExceededError:
			result.setAllowedResourceUsageExceededError((AllowedResourceUsageExceededErrorStructure) error);
			break;
		case OtherError:
			result.setOtherError((OtherErrorStructure) error);
			break;
		default:
			result.setDescription(createNaturalLanguageStringStructure(ExceptionUtils.getMessage(e)));
			break;
		}

		return result;

	}

	public static final ErrorCodeStructure createErrorCodeStructure(SiriException e) {

		ErrorCodeStructure result = null;
		switch (e.getCode()) {
		case UnapprovedKeyAccessError:
			result = factory.createUnapprovedKeyAccessStructure();
			break;
		case UnknownParticipantError:
			result = factory.createUnknownParticipantErrorStructure();
			break;
		case UnknownEndpointError:
			result = factory.createUnknownEndpointErrorStructure();
			break;
		case EndpointDeniedAccessError:
			result = factory.createEndpointDeniedAccessStructure();
			break;
		case EndpointNotAvailableAccessError:
			result = factory.createEndpointNotAvailableAccessStructure();
			break;
		case ServiceNotAvailableError:
			result = factory.createServiceNotAvailableErrorStructure();
			break;
		case CapabilityNotSupportedError:
			result = factory.createCapabilityNotSupportedErrorStructure();
			break;
		case AccessNotAllowedError:
			result = factory.createAccessNotAllowedErrorStructure();
			break;
		case InvalidDataReferencesError:
			result = factory.createInvalidDataReferencesErrorStructure();
			break;
		case BeyondDataHorizon:
			result = factory.createBeyondDataHorizonErrorStructure();
			break;
		case NoInfoForTopicError:
			result = factory.createNoInfoForTopicErrorStructure();
			break;
		case ParametersIgnoredError:
			result = factory.createParametersIgnoredErrorStructure();
			break;
		case UnknownExtensionsError:
			result = factory.createUnknownExtensionsErrorStructure();
			break;
		case AllowedResourceUsageExceededError:
			result = factory.createAllowedResourceUsageExceededErrorStructure();
			break;
		case OtherError:
			result = factory.createOtherErrorStructure();
			break;
		default:
			break;
		}

		if (result != null) {
			result.setErrorText(ExceptionUtils.getMessage(e));

			Map<String, Object> values = e.getValues();
			if (values != null) {
				for (Entry<String, Object> entry : values.entrySet()) {
					if (entry.getValue() instanceof String) {
						String value = (String) entry.getValue();
						try {
							BeanUtils.setProperty(result, entry.getKey(), value);
						} catch (IllegalAccessException | InvocationTargetException ignored) {
						}
					} else if (entry.getValue() instanceof Collection) {
						Collection<?> list = (Collection<?>) entry.getValue();
						for (Object o : list) {
							if (o instanceof String) {
								String value = (String) o;
								try {
									BeanUtils.setProperty(result, entry.getKey(), value);
								} catch (IllegalAccessException | InvocationTargetException ignored) {
								}
							}
						}
					}
				}
			}
		}

		return result;
	}

}
