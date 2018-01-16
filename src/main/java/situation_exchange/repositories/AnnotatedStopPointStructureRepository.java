package situation_exchange.repositories;

import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;

import situation_exchange.repositories.datatables.DataTablesRepository;
import uk.org.siri.siri.AnnotatedStopPointStructure;

@Repository
public interface AnnotatedStopPointStructureRepository extends ReactiveSortingRepository<AnnotatedStopPointStructure, String>,
		CriteriaRepository<AnnotatedStopPointStructure>, DataTablesRepository<AnnotatedStopPointStructure> {

}
