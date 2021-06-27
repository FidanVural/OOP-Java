package proje;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestExistingCustomer {

	ExistingCustomer custest = new ExistingCustomer("12345");
	
	@Test
	void test() {
		String cnumber = "12345";
		assertEquals(cnumber, custest.getCitizenshipNr());
	}

}
