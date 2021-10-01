package th.co.cdgs.ttd_day02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import badcode.ArgumentNullException;
import badcode.DomainEmailInvalidException;
import badcode.RegisterBusiness;
import badcode.SaveSpeakerException;
import badcode.Speaker;
import badcode.SpeakerDoesntMeetRequirementsException;

class RegisterBusinessTest {

	private static final String BLANK_STRING = "";

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
			s.setFirstName(BLANK_STRING);
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
	
	@Test
	@DisplayName("case Last Name require with blank")
	public void case02withBlank() {
		RegisterBusiness rb = new RegisterBusiness();
		Exception e = assertThrows(ArgumentNullException.class, ()->{
			Speaker s = new Speaker();
			s.setFirstName("test");
			s.setLastName(BLANK_STRING);
			rb.register(null, s);
			
		});
		assertEquals("Last name is required.", e.getMessage());
		
	}
	
	@Test
	@DisplayName("case Email require with null")
	public void caseEmailRequire() {
		RegisterBusiness rb = new RegisterBusiness();
		Exception e = assertThrows(ArgumentNullException.class, ()->{
			Speaker s = new Speaker();
			s.setFirstName("test");
			s.setLastName("testLastName");
			rb.register(null, s);
			
		});
		assertEquals("Email is required.", e.getMessage());
	}
	
	@Test
	@DisplayName("case Email require with BLANK")
	public void caseEmailRequireWithBlank() {
		RegisterBusiness rb = new RegisterBusiness();
		Exception e = assertThrows(ArgumentNullException.class, ()->{
			Speaker s = new Speaker();
			s.setFirstName("test");
			s.setLastName("testLastName");
			s.setEmail(BLANK_STRING);
			rb.register(null, s);
			
		});
		assertEquals("Email is required.", e.getMessage());
	}
	
	@Test
	@DisplayName("case Email random")
	public void caseEmailRandomPattern() {
		RegisterBusiness rb = new RegisterBusiness();
		Exception e = assertThrows(DomainEmailInvalidException.class, ()->{
			Speaker s = new Speaker();
			s.setFirstName("test");
			s.setLastName("testLastName");
			s.setEmail("xxxas");
			rb.register(null, s);
			
		});
		assertNull(e.getMessage());
	}
	
	@Test
	@DisplayName("case Email random domain")
	public void caseEmailRandomDomain() {
		RegisterBusiness rb = new RegisterBusiness();
		Exception e = assertThrows(SpeakerDoesntMeetRequirementsException.class, ()->{
			Speaker s = new Speaker();
			s.setFirstName("test");
			s.setLastName("testLastName");
			s.setEmail("xxxas@aaa.com");
			rb.register(null, s);
			
		});
		assertEquals("Speaker doesn't meet our standard rules.",e.getMessage());
	}
	
	@Test
	@DisplayName("case Email Known domain")
	public void caseEmailKnownDomain() {
		RegisterBusiness rb = new RegisterBusiness();
		Exception e = assertThrows(SaveSpeakerException.class, ()->{
			Speaker s = new Speaker();
			s.setFirstName("test");
			s.setLastName("testLastName");
			s.setEmail("xxxas@gmail.com");
			rb.register(null, s);
			
		});
		assertEquals("Can't save a speaker.",e.getMessage());
	}
	
	

}
