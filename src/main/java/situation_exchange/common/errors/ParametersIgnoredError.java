package situation_exchange.common.errors;

import java.util.Arrays;
import java.util.List;

import lombok.Getter;

public class ParametersIgnoredError extends SiriException {

	private static final long serialVersionUID = 1L;

	private static final String DESCRIPTION = "Parameters Ignored Error";

	@Getter
	List<String> parameterName;

	public ParametersIgnoredError(String... values) {
		super(DESCRIPTION);
		this.parameterName = Arrays.asList(values);
	}
}
