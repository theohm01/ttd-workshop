package th.co.cdgs.ttd_day02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import badcode.RegisterBusiness;
import badcode.Speaker;

class RegisterBusinessGetFeeTest {

	
	@ParameterizedTest
	@CsvSource({
		 "0,500",
         "1,500",
         "2,250",
         "3,250",
         "4,100",
         "5,100",
         "8,50",
         "9,50",
         "10,0",
	})
	void testGetFee(int year,int fee) {
		Speaker s = new Speaker();
		int actureFee =s.getFee(year);
		assertEquals(actureFee, fee);
	}

}
