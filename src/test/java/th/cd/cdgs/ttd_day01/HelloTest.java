package th.cd.cdgs.ttd_day01;

import static org.junit.Assert.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class HelloTest {

	@Test
	@DisplayName("เรากำลังทดสอบด้วย junit 5")
	public void test() {
		Hello hello = new Hello();
		
		String result = hello.say("jetsada");
		
		assertEquals("Hello jetsada", result);
	}

}
