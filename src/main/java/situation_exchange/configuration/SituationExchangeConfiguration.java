package situation_exchange.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix = "situation-exchange")
@Data
public class SituationExchangeConfiguration {

	private String producerAddress;
	private String version;
	private Integer maxAge;

	private String participantRef;

}
