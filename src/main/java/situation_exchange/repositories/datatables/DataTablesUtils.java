package situation_exchange.repositories.datatables;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

public class DataTablesUtils {

	public static <T> Query getQuery(final DataTablesInput input) {

		Criteria criteria = new Criteria();

		Criteria[] columnFilter = createColumnFilter(input);
		if (columnFilter.length > 0) {
			criteria.andOperator(columnFilter);
		}

		Criteria[] globalFilter = createGlobalFilter(input);
		if (globalFilter.length > 0) {
			criteria.orOperator(globalFilter);
		}

		return Query.query(criteria);
	}

	public static Pageable getPageable(DataTablesInput input) {
		return PageRequest.of((input.getStart() / input.getLength()), input.getLength());
	}

	public static Sort getOrders(DataTablesInput input) {
		Sort result = Sort.unsorted();
		List<org.springframework.data.domain.Sort.Order> orders = new ArrayList<org.springframework.data.domain.Sort.Order>();
		for (Order order : input.getOrder()) {
			Column column = input.getColumns().get(order.getColumn());
			if (column != null) {
				Sort.Direction direction = Sort.Direction.fromString(order.getDir());
				orders.add(new org.springframework.data.domain.Sort.Order(direction, column.getData()));
			}
		}
		if (!orders.isEmpty()) {
			result = Sort.by(orders);
		}

		return result;
	}

	private static Criteria[] createColumnFilter(final DataTablesInput input) {
		List<Criteria> result = new ArrayList<Criteria>();

		List<Column> columns = input.getColumns();
		for (Column column : columns) {
			if (column.isSearchable()) {
				Search search = column.getSearch();
				if (search != null && StringUtils.isNotBlank(search.getValue())) {
					result.add(createCriteria(column.getData(), search.getValue()));
				}
			}
		}

		return result.toArray(new Criteria[result.size()]);
	}

	private static Criteria[] createGlobalFilter(final DataTablesInput input) {
		List<Criteria> result = new ArrayList<Criteria>();

		List<Column> columns = input.getColumns();
		for (Column column : columns) {
			if (column.isSearchable()) {
				Search search = input.getSearch();
				if (search != null && StringUtils.isNotBlank(search.getValue())) {
					result.add(createCriteria(column.getData(), search.getValue()));
				}
			}
		}

		return result.toArray(new Criteria[result.size()]);
	}

	private static Criteria createCriteria(String data, String filter) {
		System.out.println("-------------> where : " + data + " like : " + filter);
		return Criteria.where(data).regex(getLikeFilterPattern(filter));
	}

	private static Pattern getLikeFilterPattern(String regex) {
		return Pattern.compile(regex, Pattern.CASE_INSENSITIVE | Pattern.LITERAL);
	}

}
