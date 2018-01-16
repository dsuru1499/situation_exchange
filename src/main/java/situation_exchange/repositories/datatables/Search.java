package situation_exchange.repositories.datatables;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Search {

	private String value;

	private boolean regex;
}
