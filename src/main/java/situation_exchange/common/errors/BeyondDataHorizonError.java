package situation_exchange.common.errors;

public class BeyondDataHorizonError extends SiriException {

	private static final long serialVersionUID = 1L;

	private static final String DESCRIPTION = "Beyond Data Horizon Error";

	public BeyondDataHorizonError() {
		super(DESCRIPTION);
	}
}
