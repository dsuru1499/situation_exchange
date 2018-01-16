package situation_exchange.repositories.datatables;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.repository.support.PageableExecutionUtils;

import reactor.core.publisher.Mono;

public class DataTablesRepositoryImpl<T> implements DataTablesRepository<T> {

	@Autowired
	ReactiveMongoTemplate template;

	@Override
	public Mono<DataTablesOutput<T>> findAll(Class<T> type, DataTablesInput input) {

		Query query = DataTablesUtils.getQuery(input);
		Pageable pageable = DataTablesUtils.getPageable(input);
		query.with(pageable);
		Sort sort = DataTablesUtils.getOrders(input);
		query.with(sort);

		return Mono.zip(template.find(query, type).collectList(), count(type, query), count(type)).map(t -> {
			Page<T> page = PageableExecutionUtils.getPage(t.getT1(), pageable, () -> t.getT2());
			DataTablesOutput<T> output = new DataTablesOutput<T>();
			output.setData(page.getContent());
			output.setRecordsTotal(t.getT3());
			output.setRecordsFiltered(page.getTotalElements());
			output.setDraw(input.getDraw());
			return output;
		});
	}

	private Mono<Long> count(Class<T> type) {
		return this.count(type, new Query());
	}

	private Mono<Long> count(Class<T> type, Query query) {
		return template.count(query, type);
	}
}
