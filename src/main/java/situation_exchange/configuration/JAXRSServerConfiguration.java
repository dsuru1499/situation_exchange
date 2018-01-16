package situation_exchange.configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.swagger.Swagger2Feature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;

import situation_exchange.rs.LinesDiscoveryRestService;
import situation_exchange.rs.SituationExchangeRestService;
import situation_exchange.rs.StopPointsDiscoveryRestService;
import situation_exchange.rs.serializer.QueryStringMessageBodyReader;
import situation_exchange.rs.serializer.SiriMessageBodyReader;
import situation_exchange.rs.serializer.SiriMessageBodyWriter;
import situation_exchange.services.LinesDiscovery;

@Configuration
public class JAXRSServerConfiguration {

	@Autowired
	private Bus bus;

	@Bean
	LinesDiscovery linesDiscovery() {
		return new LinesDiscoveryRestService();
	}

	@Bean
	StopPointsDiscoveryRestService stopPointsDiscovery() {
		return new StopPointsDiscoveryRestService();
	}

	@Bean
	SituationExchangeRestService situationExchange() {
		return new SituationExchangeRestService();
	}

	@Bean
	public Server server() {
		JAXRSServerFactoryBean endpoint = new JAXRSServerFactoryBean();
		endpoint.setBus(bus);
		endpoint.setServiceBeans(Arrays.<Object>asList(linesDiscovery(), stopPointsDiscovery(), situationExchange()));
		endpoint.setAddress("/siri-lite");
		List<Object> providers = new ArrayList<Object>();
		providers.add(new JacksonJaxbJsonProvider());
		providers.add(new SiriMessageBodyWriter());
		providers.add(new SiriMessageBodyReader());
		providers.add(new QueryStringMessageBodyReader());
		endpoint.setProviders(providers);
		Swagger2Feature feature = new Swagger2Feature();
		feature.setBasePath("/siri-lite");
		endpoint.getFeatures().addAll(Arrays.asList(feature));
		return endpoint.create();
	}
}
