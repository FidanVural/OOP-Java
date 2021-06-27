package proje;

public interface ServiceProvider {
	
	public void addSubscriptionPlan(SubscriptionPlan subscriptionPlan);
	public SubscriptionPlan findSubscriptionPlan(String plan);
	public String getName();
	public void setName(String name);
	
}
