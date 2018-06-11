package situation_exchange.common.errors;

public class AllowedResourceUsageExceededError extends SiriException {

	private static final long serialVersionUID = 1L;

	private static final String DESCRIPTION = "Allowed Resource Usage Exceeded Error";

	public AllowedResourceUsageExceededError() {
		super(DESCRIPTION);
	}
}
