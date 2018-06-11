package situation_exchange.common.errors;

public class NoInfoForTopicError extends SiriException {

	private static final long serialVersionUID = 1L;

	private static final String DESCRIPTION = "No Info For Topic Error";

	public NoInfoForTopicError() {
		super(DESCRIPTION);
	}
}
