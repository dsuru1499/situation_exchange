package situation_exchange.repositories;

import org.springframework.data.mongodb.core.query.Criteria;

import com.mongodb.client.result.DeleteResult;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CriteriaRepository<T> {

	Flux<T> findAll(Class<T> type, Criteria criteria);

	Mono<DeleteResult> deleteAll(Class<T> type, Criteria criteria);

	<U extends Entity> Mono<U> update(Class<U> type, Criteria criteria, U entity);

}
