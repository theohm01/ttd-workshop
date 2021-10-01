package th.co.cdgs.ttd_day02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import badcode.ArgumentNullException;
import badcode.RegisterBusiness;
import badcode.Speaker;

class RegisterBusinessTest {

	@Test
	@DisplayName("case First Name require null")
	public void case01() {
		RegisterBusiness rb = new RegisterBusiness();
		Exception e = assertThrows(ArgumentNullException.class, ()->{
			rb.register(null, new Speaker());
			
		});
		assertEquals("First name is required.", e.getMessage());
	}
	
	@Test
	@DisplayName("case First Name require Blank")
	public void case01WithBlank() {
		RegisterBusiness rb = new RegisterBusiness();
		Exception e = assertThrows(ArgumentNullException.class, ()->{
			Speaker s = new Speaker();
			s.setFirstName("");
			rb.register(null, s);
			
		});
		assertEquals("First name is required.", e.getMessage());
	}
	
	@Test
	@DisplayName("case Last Name require")
	public void case02() {
		RegisterBusiness rb = new RegisterBusiness();
		Exception e = assertThrows(ArgumentNullException.class, ()->{
			Speaker s = new Speaker();
			s.setFirstName("test");
			rb.register(null, s);
			
		});
		assertEquals("Last name is required.", e.getMessage());
		
	}

}
