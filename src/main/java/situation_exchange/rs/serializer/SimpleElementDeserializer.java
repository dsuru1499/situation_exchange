package situation_exchange.rs.serializer;

import java.io.IOException;

import org.apache.commons.beanutils.BeanUtils;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import lombok.extern.log4j.Log4j;
import uk.org.siri.siri.ObjectFactory;

@Log4j
public class SimpleElementDeserializer extends StdDeserializer {

	private static final String VALUE = "value";
	private static ObjectFactory factory = new ObjectFactory();

	public SimpleElementDeserializer() {
		this(null);
	}

	public SimpleElementDeserializer(Class<?> clazz) {
		super(clazz);
	}

	@Override
	public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {

		Object result = null;
		try {
			JsonNode node = p.getCodec().readTree(p);
			log.info("[DSU] node : " + node);
			String value = node.asText();
			log.info("[DSU] value : " + value);
			Class type = handledType();
			log.info("[DSU] type : " + type);
			result = type.newInstance();
			BeanUtils.setProperty(result, VALUE, value);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return result;
	}

}
