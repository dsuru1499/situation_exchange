package situation_exchange.common.errors;

import lombok.Getter;

public class UnknownParticipantError extends SiriException {

	private static final long serialVersionUID = 1L;

	private static final String DESCRIPTION = "Unknown Participant Error";

	@Getter
	private String participantRef;

	public UnknownParticipantError(String value) {
		super(DESCRIPTION);
		this.participantRef = value;
	}
}
