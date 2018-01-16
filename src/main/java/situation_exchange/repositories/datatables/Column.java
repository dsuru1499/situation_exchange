package situation_exchange.repositories.datatables;

import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Column {

	@NotBlank
	private String data;

	private String name;

	private boolean searchable;

	private boolean orderable;

	private Search search = new Search();

}
