package th.co.cdgs.ttd_day02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import badcode.ArgumentNullException;
import badcode.RegisterBusiness;
import badcode.Speaker;

class RegisterBusinessTest {

	@Test
	public void case01() {
		RegisterBusiness rb = new RegisterBusiness();
		Exception e = assertThrows(ArgumentNullException.class, ()->{
			rb.register(null, new Speaker());
			
		});
		assertEquals("First name is required.", e.getMessage());
	}

}
