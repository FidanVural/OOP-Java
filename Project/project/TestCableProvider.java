package proje;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCableProvider {

	CableProvider cabletest = new CableProvider("Turkcell", 1);
	
	@Test
	void test() {
		String name = "Turkcell";
		assertEquals(name, cabletest.getName());
	}
}
