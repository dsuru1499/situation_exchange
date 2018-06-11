package situation_exchange.common.errors;

import java.util.Arrays;
import java.util.List;

import lombok.Getter;

public class UnknownExtensionsError extends SiriException {

	private static final long serialVersionUID = 1L;

	private static final String DESCRIPTION = "Unknown Extensions Error";

	@Getter
	private List<String> extensionName;

	public UnknownExtensionsError(String... values) {
		super(DESCRIPTION);
		this.extensionName = Arrays.asList(values);
	}
}
