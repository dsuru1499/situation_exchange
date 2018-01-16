package situation_exchange.rs.serializer;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;

import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.PropertyUtils;

import lombok.extern.log4j.Log4j;

@Provider
@Log4j
public class QueryStringMessageBodyReader implements MessageBodyReader<Object> {

	@Context
	private UriInfo uriInfo;

	@Override
	public boolean isReadable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
		return type.isAnnotationPresent(QueryString.class);
	}

	@Override
	public Object readFrom(Class<Object> type, Type genericType, Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, String> httpHeaders, InputStream entityStream) throws IOException, WebApplicationException {

		Object result = null;
		try {
			result = type.newInstance();
			MultivaluedMap<String, String> parameters = uriInfo.getQueryParameters();
			for (Entry<String, List<String>> entry : parameters.entrySet()) {
				setProperty(result, entry.getKey(), entry.getValue().get(0));
			}
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}

		return result;
	}

	private static void setProperty(Object bean, String name, Object value) throws Exception {
		int index = name.indexOf(".");
		if (index != -1) {
			String left = name.substring(0, index);
			Object target = getProperty(bean, left);
			String right = name.substring(index + 1);
			setProperty(target, right, value);
		} else {
			Field field = bean.getClass().getDeclaredField(name);
			Object object = ConvertUtils.convert(value, field.getType());
			PropertyUtils.setProperty(bean, name, object);
		}
	}

	private static Object getProperty(Object bean, String name) throws Exception {

		try {
			return PropertyUtils.getProperty(bean, name);
		} catch (IndexOutOfBoundsException e) {
			String[] values = parse(name);
			Class<?> type = getType(bean, values[0]);
			Object value = newInstance(type);
			Object list = PropertyUtils.getProperty(bean, values[0]);
			Method add = List.class.getDeclaredMethod("add", Object.class);
			add.invoke(list, value);
			return PropertyUtils.getProperty(bean, name);
		}
	}

	private static String[] parse(String name) {
		final Pattern pattern = Pattern.compile("\\w+");
		final Matcher matcher = pattern.matcher(name);
		List<String> result = new ArrayList<String>();
		while (matcher.find()) {
			result.add(matcher.group());
		}
		return result.toArray(new String[result.size()]);
	}

	private static Class<?> getType(Object bean, String name) throws Exception {
		Field field = bean.getClass().getDeclaredField(name);
		Type type = field.getGenericType();
		if (type instanceof ParameterizedType) {
			type = ((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0];
			return Class.forName(type.getTypeName());
		} else {
			return field.getType();
		}
	}

	private static Object newInstance(Type type) throws Exception {
		Object result = null;
		Class<?> clazz = Class.forName(type.getTypeName());
		result = clazz.newInstance();
		return result;
	}

	// public static void main(String[] args) throws Exception {
	//
	// Map<String, String> parameters = new LinkedHashMap<String, String>();
	// parameters.put("length", "1000");
	// parameters.put("columns[0].data", "LineRef.value");
	// parameters.put("columns[0].name", "");
	// parameters.put("columns[0].searchable", "true");
	// parameters.put("columns[0].orderable", "true");
	// parameters.put("columns[0].search.value", "");
	// parameters.put("columns[0].search.regex", "false");
	// parameters.put("columns[1].data", "LineName.0.value");
	// parameters.put("columns[1].name", "");
	// parameters.put("columns[1].searchable", "true");
	// parameters.put("columns[1].orderable", "true");
	// parameters.put("columns[1].search.value", "");
	// parameters.put("columns[1].search.regex", "false");
	// parameters.put("order[0].column", "0");
	// parameters.put("order[0].dir", "asc");
	// parameters.put("start", "0");
	// parameters.put("length", "1000");
	// parameters.put("search.value", "");
	// parameters.put("search.regex", "false");
	//
	// Object result = DataTablesInput.class.newInstance();
	//
	// for (Entry<String, String> entry : parameters.entrySet())
	// setProperty(result, entry.getKey(), entry.getValue());
	//
	// System.out.println(result);
	//
	// }
}
