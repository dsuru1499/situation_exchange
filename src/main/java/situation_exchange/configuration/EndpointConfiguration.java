package situation_exchange.configuration;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import situation_exchange.ws.SiriProducerDocPortService;

@Configuration
public class EndpointConfiguration {

	@Autowired
	private Bus bus;

	@Bean
	SiriProducerDocPortService siri() {
		return new SiriProducerDocPortService();
	}

	@Bean
	public Endpoint endpoint() {
		EndpointImpl endpoint = new EndpointImpl(this.bus, siri());
		endpoint.publish("/siri");
		endpoint.setWsdlLocation("xsd/siri_wsProducer-Document.wsdl");
		return endpoint;
	}
}
