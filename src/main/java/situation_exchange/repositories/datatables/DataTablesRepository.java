package situation_exchange.repositories.datatables;

import reactor.core.publisher.Mono;

public interface DataTablesRepository<T> {

	Mono<DataTablesOutput<T>> findAll(Class<T> type, DataTablesInput input);

}
