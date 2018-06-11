package situation_exchange.common.errors;

import lombok.Getter;

public class UnknownEndpointError extends SiriException {

	private static final long serialVersionUID = 1L;

	private static final String DESCRIPTION = "Unknown Endpoint Error";

	@Getter
	private String endpoint;

	public UnknownEndpointError(String value) {
		super(DESCRIPTION);
		this.endpoint = value;
	}
}
