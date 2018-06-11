package situation_exchange.common.errors;

import lombok.Getter;

public class EndpointDeniedAccessError extends SiriException {

	private static final long serialVersionUID = 1L;

	private static final String DESCRIPTION = "Endpoint Denied Access Error";

	@Getter
	private String endpoint;

	public EndpointDeniedAccessError(String value) {
		super(DESCRIPTION);
		this.endpoint = value;
	}
}
