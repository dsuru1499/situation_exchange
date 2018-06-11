package situation_exchange.common.errors;

import lombok.Getter;

public class UnapprovedKeyAccessError extends SiriException {

	private static final long serialVersionUID = 1L;

	private static final String DESCRIPTION = "Unapproved Key Access Error";

	@Getter
	private String key;

	public UnapprovedKeyAccessError(String key) {
		super(DESCRIPTION);
		this.key = key;
	}
}
