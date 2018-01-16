package situation_exchange.repositories.datatables;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Min;

import lombok.Data;
import situation_exchange.rs.serializer.QueryString;

@Data
@QueryString
public class DataTablesInput {

	// TODO add custom bean validators

	private Integer draw;
	
	@Min(0)
	private Integer start;

	@Min(-1)
	private Integer length;

	private Search search = new Search();

	private List<Order> order = new ArrayList<Order>();

	private List<Column> columns = new ArrayList<Column>();

}