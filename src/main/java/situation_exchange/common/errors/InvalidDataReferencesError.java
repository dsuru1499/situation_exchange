package situation_exchange.common.errors;

import java.util.Arrays;
import java.util.List;

import lombok.Getter;

public class InvalidDataReferencesError extends SiriException {

	private static final long serialVersionUID = 1L;

	private static final String DESCRIPTION = "Invalid Data References Error";

	@Getter
	private List<String> invalidRef;

	public InvalidDataReferencesError(String... values) {
		super(DESCRIPTION);
		this.invalidRef = Arrays.asList(values);
	}
}
