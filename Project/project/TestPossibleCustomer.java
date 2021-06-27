package proje;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPossibleCustomer {

	PossibleCustomer custest = new PossibleCustomer("1234");
	
	@Test
	void test() {
		String tel = "+90123456789";
		custest.setTel(tel);
		String tel2 = "+90123456789";
		assertEquals(custest.getTel(), tel2);
	}

}
