package th.cd.cdgs.ttd_day01;

import th.cd.cdgs.ttd_day01.exception.InputInvalidException;

public class MyRange {

	private final String input;
	public MyRange(String input) {
		this.input = input;
	}
	
	public boolean isInclude() {
		return input.startsWith("[");
	}
	
	public void validate() {
		if(!input.startsWith("[")|| !input.startsWith("(") ) {
			throw new InputInvalidException("input error");
		}
	}
}
