package proje;

public class CableProvider implements ServiceProvider{
	private String name;
	private SubscriptionPlan [] subscriptionPlans;
	
	public CableProvider(String name, int n) {
		this.name = name;
		subscriptionPlans = new SubscriptionPlan[n];
	}
	
	public void addSubscriptionPlan(SubscriptionPlan subscriptionPlan) {
		for(int i=0;i<subscriptionPlans.length;i++) {
			if(subscriptionPlans[i] == null) {
				subscriptionPlans[i] = subscriptionPlan;
				break;
			}
		}
	}
	
	public SubscriptionPlan findSubscriptionPlan(String name) {
		for(SubscriptionPlan plan: subscriptionPlans) {
			if(plan.getName().equals(name)) {
				return plan;
			}
		}
		return null;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
