package th.cd.cdgs.ttd_day01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class MyRangeTest {

	@Test
	@DisplayName("inputตัวแรกเป็น [input = [1,5] result = true")
	public void case01() {
		MyRange test = new MyRange("[1,5]");
		assertTrue(test.isInclude());
	}
}
