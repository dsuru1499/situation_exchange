package situation_exchange.repositories.datatables;

import java.util.Collections;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "datatables")
public class DataTablesOutput<T> {

	private int draw;

	private long recordsTotal = 0L;

	private long recordsFiltered = 0L;

	private List<T> data = Collections.emptyList();

	private String error;

}
