package situation_exchange.repositories;

import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;

import situation_exchange.repositories.datatables.DataTablesRepository;
import uk.org.siri.siri.AnnotatedLineStructure;

@Repository
public interface AnnotatedLineStructureRepository extends ReactiveSortingRepository<AnnotatedLineStructure, String>,
		CriteriaRepository<AnnotatedLineStructure>, DataTablesRepository<AnnotatedLineStructure> {

}
