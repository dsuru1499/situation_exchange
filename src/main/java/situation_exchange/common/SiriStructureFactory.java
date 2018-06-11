package situation_exchange.common;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import uk.org.siri.siri.MessageQualifierStructure;
import uk.org.siri.siri.NaturalLanguageStringStructure;
import uk.org.siri.siri.ObjectFactory;
import uk.org.siri.siri.ParticipantRefStructure;

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

}
