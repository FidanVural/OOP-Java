package proje;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestGSMProvider {

	GSMProvider gsmtest = new GSMProvider("Turkcell", 1);
	
	@Test
	void test() {
		String name = "Turkcell";
		assertEquals(name, gsmtest.getName());
	}
}
