package situation_exchange.rs.serializer;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector;

import lombok.extern.log4j.Log4j;
import uk.org.siri.siri.AnnotatedStopPointStructure.Lines;
import uk.org.siri.siri.Siri;

@Provider
@Produces(MediaType.APPLICATION_JSON)
@Log4j
public class SiriMessageBodyWriter implements MessageBodyWriter<Object> {

	private ObjectMapper mapper;

	public SiriMessageBodyWriter() {
		initialize();
	}

	@Override
	public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		return type.isAssignableFrom(Siri.class);
		// return type.isAnnotationPresent(XmlRootElement.class) || type.isAnnotationPresent(XmlType.class);
	}

	@Override
	public long getSize(Object target, Class<?> type, Type generic, Annotation[] annotations, MediaType media) {
		return -1;
	}

	@Override
	public void writeTo(Object target, Class<?> type, Type generic, Annotation[] annotations, MediaType media,
			MultivaluedMap<String, Object> headers, OutputStream out) throws IOException, WebApplicationException {
		try {
			ObjectWriter writer = mapper.writer();
			writer.writeValue(out, target);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private void initialize() {
		this.mapper = new ObjectMapper();
		AnnotationIntrospector introspector = new JaxbAnnotationIntrospector(mapper.getTypeFactory());
		mapper.setAnnotationIntrospector(introspector);
		mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		mapper.disable(SerializationFeature.WRAP_ROOT_VALUE);
		mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

		SimpleModule module = new SimpleModule();
		module.addSerializer(Lines.class, new LinesSerializer());
		SimpleElementSerializer serializer = new SimpleElementSerializer("value");
		for (Class<?> type : SiriConstants.classes) {
			module.addSerializer(type, serializer);
		}

		mapper.registerModule(module);
	}

}
