package th.cd.cdgs.ttd_day01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import th.cd.cdgs.ttd_day01.exception.InputInvalidException;

public class MyRangeTestWithException {
	
	 @Test
	 @DisplayName("ขึ้นต้นด้วย [, ( เท่านั้น input = 1,5]")
	    public void case01() {
	        try {
	            MyRange range = new MyRange("1,5]");
	            range.validate();
	            fail("ไม่ผิด");
	        } catch (InputInvalidException e) {
	            if(!"input error".equals(e.getMessage())) {
	                fail("Error message ผิด " + e.getMessage());
	            }
	        }
	    }

	@Test
	@DisplayName("ขึ้นต้นด้วย [, ( เท่านั้น input = 1,5] with junit 5")
	public void case02() {
	    MyRange range = new MyRange("1,5]");
	    Exception e = assertThrows(InputInvalidException.class, range::validate);
	    assertEquals("input error", e.getMessage() );
	}

}
