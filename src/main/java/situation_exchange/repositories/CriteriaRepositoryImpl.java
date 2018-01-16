package situation_exchange.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.mongodb.client.result.DeleteResult;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class CriteriaRepositoryImpl<T> implements CriteriaRepository<T> {

	@Autowired
	ReactiveMongoTemplate template;

	@Override
	public Flux<T> findAll(Class<T> type, Criteria criteria) {
		Query query = new Query(criteria);
		return template.find(query, type);
	}

	@Override
	public Mono<DeleteResult> deleteAll(Class<T> type, Criteria criteria) {
		Query query = new Query(criteria);
		template.remove(query, type);
		return template.remove(query, type);
	}

	@Override
	public < U extends Entity>  Mono<U> update(Class<U> type, Criteria criteria, U  entity) {
		Query query = new Query(criteria);
		return template.findOne(query, type).flatMap(t -> {
			entity.setId(t.getId());
			return template.save(entity);
		});
	}
}
