package situation_exchange.common.errors;

import lombok.Getter;

public class CapabilityNotSupportedError extends SiriException {

	private static final long serialVersionUID = 1L;

	private static final String DESCRIPTION = "Capability Not Supported Error";

	@Getter
	private String capabilityRef;

	public CapabilityNotSupportedError(String value) {
		super(DESCRIPTION);
		this.capabilityRef = value;
	}
}
