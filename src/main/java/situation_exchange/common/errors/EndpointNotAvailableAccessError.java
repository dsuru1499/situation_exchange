package situation_exchange.common.errors;

import lombok.Getter;

public class EndpointNotAvailableAccessError extends SiriException {
	
	static final long serialVersionUID = 1L;

	private static final String DESCRIPTION = "Endpoint Not Available Access Error";

	@Getter
	private String endpoint;

	public EndpointNotAvailableAccessError(String value) {
		super(DESCRIPTION);
		this.endpoint = value;
	}
}
