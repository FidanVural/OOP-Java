package proje;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

class TestSubscription {
	
	@Test
	void test() throws ParseException {
		SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy");
		Date d1 = date.parse("01/01/2020");
		
		GSMProvider gsmtest =  new GSMProvider("test", 1);
		SubscriptionPlan subplantest = new SubscriptionPlan("Plan1", gsmtest);
		Subscription subtest = new Subscription(d1, subplantest);
		
		assertEquals(subtest.getSubscriptionPlan(), subplantest);
	}

}
