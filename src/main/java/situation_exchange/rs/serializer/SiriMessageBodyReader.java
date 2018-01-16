package situation_exchange.rs.serializer;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Consumes;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;

import lombok.extern.log4j.Log4j;
import uk.org.siri.siri.Siri;

@Provider
@Consumes(MediaType.APPLICATION_JSON)
@Log4j
public class SiriMessageBodyReader implements MessageBodyReader<Object> {

	private ObjectMapper mapper;

	public SiriMessageBodyReader() {
		initialize();
	}

	@Override
	public boolean isReadable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		return type.isAssignableFrom(Siri.class);
		// return type.isAnnotationPresent(XmlRootElement.class) || type.isAnnotationPresent(XmlType.class);
	}

	@Override
	public Object readFrom(Class<Object> type, Type genericType, Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, String> httpHeaders, InputStream in) throws IOException, WebApplicationException {
		Object result = null;
		try {
			result = mapper.readValue(in, type);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return result;
	}

	private void initialize() {
		this.mapper = new ObjectMapper();
		JaxbAnnotationModule jaxbModule = new JaxbAnnotationModule();
		mapper.registerModule(jaxbModule);

		SimpleModule module = new SimpleModule();
		for (Class<?> type : SiriConstants.classes) {
			SimpleElementDeserializer deserializer = new SimpleElementDeserializer(type);
			module.addDeserializer(type, deserializer);
		}
		mapper.registerModule(module);
	}

}
