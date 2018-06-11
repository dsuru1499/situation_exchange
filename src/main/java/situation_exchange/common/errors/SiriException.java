package situation_exchange.common.errors;

public class SiriException extends Exception {

	private static final long serialVersionUID = 1L;

	public SiriException(String value) {
		super(value);
	}

	public SiriException(Throwable e) {
		super(e);
	}

}
