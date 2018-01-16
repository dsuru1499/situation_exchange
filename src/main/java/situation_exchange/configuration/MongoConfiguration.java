package situation_exchange.configuration;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;

// @Configuration
class MongoConfiguration extends AbstractReactiveMongoConfiguration {

	@Override
	protected String getDatabaseName() {
		return "situation_exchange";
	}

	@Override
	protected Collection<String> getMappingBasePackages() {
		return Arrays.asList("org.siri.siri");
	}

	@Bean
	@Override
	public MongoClient reactiveMongoClient() {
		return MongoClients.create();
	}

}