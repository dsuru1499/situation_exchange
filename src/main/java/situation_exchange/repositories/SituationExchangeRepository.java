package situation_exchange.repositories;

import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;

import situation_exchange.repositories.datatables.DataTablesRepository;
import uk.org.siri.siri.PtSituationElementStructure;

@Repository
public interface SituationExchangeRepository extends ReactiveSortingRepository< PtSituationElementStructure, String>,
		CriteriaRepository< PtSituationElementStructure>, DataTablesRepository< PtSituationElementStructure> {

}
