package th.cd.cdgs.ttd_day01.exception;

public class InputInvalidException extends RuntimeException {
	private static final long serialVersionUID = -662039641692444937L;
	private final String message;
	public InputInvalidException(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	
	
}
