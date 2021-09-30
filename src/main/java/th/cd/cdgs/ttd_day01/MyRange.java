package th.cd.cdgs.ttd_day01;

public class MyRange {

	private final String input;
	public MyRange(String input) {
		this.input = input;
	}
	
	public boolean isInclude() {
		return input.startsWith("[");
	}
	
	
}
