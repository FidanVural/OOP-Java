package proje;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSubscriptionPlan {

	GSMProvider gsmtest = new GSMProvider("Turkcell", 1);
	SubscriptionPlan plantest = new SubscriptionPlan("4GB", gsmtest);
			
	@Test
	void test() {
		assertEquals(plantest.getServiceProvider(), gsmtest);
	}

}
