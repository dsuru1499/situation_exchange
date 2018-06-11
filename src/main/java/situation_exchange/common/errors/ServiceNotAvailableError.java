package situation_exchange.common.errors;

public class ServiceNotAvailableError extends SiriException {

	private static final long serialVersionUID = 1L;

	private static final String DESCRIPTION = "Service Not Available Error";

	public ServiceNotAvailableError() {
		super(DESCRIPTION);
	}
}
