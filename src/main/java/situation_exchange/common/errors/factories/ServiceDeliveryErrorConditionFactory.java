package situation_exchange.common.errors.factories;

import java.util.HashMap;
import java.util.Map;

import lombok.extern.log4j.Log4j;
import situation_exchange.common.errors.SiriException;
import uk.org.siri.siri.ObjectFactory;
import uk.org.siri.siri.ServiceDeliveryErrorConditionStructure;

@Log4j
public abstract class ServiceDeliveryErrorConditionFactory<T extends SiriException> {

	protected static ObjectFactory _factory = new ObjectFactory();

	protected static Map<Class<?>, ServiceDeliveryErrorConditionFactory<?>> _factories = new HashMap<Class<?>, ServiceDeliveryErrorConditionFactory<?>>();

	protected abstract ServiceDeliveryErrorConditionStructure createServiceDeliveryErrorCondition(T e);

	@SuppressWarnings("unchecked")
	public static <T extends SiriException> ServiceDeliveryErrorConditionStructure create(T e) {
		ServiceDeliveryErrorConditionFactory<T> factory = (ServiceDeliveryErrorConditionFactory<T>) _factories.get(e.getClass());
		if (factory == null) {
			try {
				String name = ServiceDeliveryErrorConditionFactory.class.getPackage().getName() + ".ServiceDelivery"
						+ e.getClass().getSimpleName() + "Factory";
				Class.forName(name);
				factory = (ServiceDeliveryErrorConditionFactory<T>) _factories.get(e.getClass());
			} catch (ClassNotFoundException t) {
				log.error(t.getMessage(), t);
				throw new RuntimeException(t);
			}
		}
		return factory.createServiceDeliveryErrorCondition(e);
	}

}
