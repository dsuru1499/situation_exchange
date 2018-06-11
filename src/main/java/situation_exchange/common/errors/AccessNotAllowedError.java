package situation_exchange.common.errors;

public class AccessNotAllowedError extends SiriException {

	private static final long serialVersionUID = 1L;

	private static final String DESCRIPTION = "Access Not Allowed Error";

	public AccessNotAllowedError() {
		super(DESCRIPTION);
	}
}
