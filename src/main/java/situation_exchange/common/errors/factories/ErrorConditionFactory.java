package situation_exchange.common.errors.factories;

import java.util.HashMap;
import java.util.Map;

import lombok.extern.log4j.Log4j;
import situation_exchange.common.errors.SiriException;
import uk.org.siri.siri.ErrorConditionStructure;
import uk.org.siri.siri.ObjectFactory;

@Log4j
public abstract class ErrorConditionFactory<T extends SiriException> {

	protected static ObjectFactory _factory = new ObjectFactory();

	protected static Map<Class<?>, ErrorConditionFactory<?>> _factories = new HashMap<Class<?>, ErrorConditionFactory<?>>();

	protected abstract ErrorConditionStructure createErrorCondition(T e);

	@SuppressWarnings("unchecked")
	public static <T extends SiriException> ErrorConditionStructure create(T e) {
		ErrorConditionFactory<T> factory = (ErrorConditionFactory<T>) _factories.get(e.getClass());
		if (factory == null) {
			try {
				String name = ErrorConditionFactory.class.getPackage().getName() + "." + e.getClass().getSimpleName() + "Factory";
				Class.forName(name);
				factory = (ErrorConditionFactory<T>) _factories.get(e.getClass());
			} catch (ClassNotFoundException t) {
				log.error(t.getMessage(), t);
				throw new RuntimeException(t);
			}
		}
		return factory.createErrorCondition(e);
	}

}
