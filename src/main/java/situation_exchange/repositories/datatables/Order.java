package situation_exchange.repositories.datatables;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Order {

	@Min(0)
	private Integer column;

	@NotNull
	@Pattern(regexp = "(desc|asc)")
	private String dir;

}
