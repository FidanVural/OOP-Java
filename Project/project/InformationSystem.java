package proje;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class InformationSystem {

	public static void main(String[] args) throws ParseException {
		
		Scanner sub1 = new Scanner(System.in);
		
		ArrayList<ServiceProvider> sp = new ArrayList<ServiceProvider>();
		ArrayList<SubscriptionPlan> subplan = new ArrayList<SubscriptionPlan>();
		ArrayList<ExistingCustomer> customer = new ArrayList<ExistingCustomer>();
		ArrayList<Subscription> subscription = new ArrayList<Subscription>();

		String provider = null;
		String name = null;
		
		System.out.println("WELCOME TO THE PROGRAM");
		
		boolean flag = true;
		
		while(flag){
			boolean flag0 = true;
			
			while(flag0) {
				// Bu kýsýmda service provider olarak ne seçileceði sorulur.
				System.out.print("Which service provider do you want to prefer (GSM / Cable) : ");
				name = sub1.nextLine();
				
				if(name.equalsIgnoreCase("GSM")) {
					System.out.print("GSM service provider: ");
					provider = sub1.nextLine();
					flag0=false;
				}
				else if(name.equalsIgnoreCase("Cable")) {
					System.out.print("Cable service provider: ");
					provider = sub1.nextLine();
					flag0=false;
				}
				else { // Ýki seçenekten biri girilmezse hata verip tekrar doðru girene kadar döngü devam etmedktedir.
					System.out.println("Incorrect entry !\n");
				}
			}
			
			ServiceProvider sakla = null;
			
			boolean f = true;
			boolean hide = true;
			int count, nmb;
			// Eðer gsm seçilmiþse ve girilen service provider daha önceden varsa tekrar plan sorulmaz.
			if(name.equalsIgnoreCase("GSM")) {
				for(ServiceProvider ser : sp) {
					if(ser.getName().equalsIgnoreCase(provider)) {
						if(ser instanceof GSMProvider) {
							sakla = ser;
							f = false;
							break;
						}
					}
				}
				
				// Eðer o service provider yoksa planlarýn kaç tane olduðu ve isimleri alýnýr.
				if(f) {
					System.out.print("Number of subscription plans: ");
					count = sub1.nextInt();
					sub1.nextLine();
					
					GSMProvider gsm = new GSMProvider(provider, count);
					sakla = gsm;
					
					for(int j=0;j<count;j++) {
						System.out.print("Name of the plan #" + j + " : ");
						String plan = sub1.nextLine();
						SubscriptionPlan tut = new SubscriptionPlan(plan, sakla);
						subplan.add(tut);
						gsm.addSubscriptionPlan(tut);
					}
					sp.add(gsm);
				}
				else {
					hide = false;
					System.out.println(sakla.getName() + " service provider and plans are valid. You can continue :)");
					sp.add(sakla);
				}
			}
			else { // Eðer cable seçilmiþse ve girilen service provider daha önceden varsa tekrar plan sorulmaz.
				for(ServiceProvider ser : sp) {
					if(ser.getName().equalsIgnoreCase(provider)) {
						if(ser instanceof CableProvider) {
							sakla = ser;
							f = false;
							break;
						}
					}
				}
				
				if(f) { // Eðer o service provider yoksa planlarýn kaç tane olduðu ve isimleri alýnýr cable için.
					System.out.print("Number of subscription plans: ");
					count = sub1.nextInt();
					sub1.nextLine();
					
					CableProvider cable = new CableProvider(provider, count);
					sakla = cable;
					
					for(int j=0;j<count;j++) {
						System.out.print("Name of the plan #" + j + " : ");
						String plan = sub1.nextLine();
						SubscriptionPlan tut = new SubscriptionPlan(plan, sakla);
						subplan.add(tut);
						cable.addSubscriptionPlan(tut);
					}
					
					sp.add(cable);
				}
				else {
					hide = false;
					System.out.println(sakla.getName() + " service provider and plans are valid. You can continue :)");
					sp.add(sakla);
				}
			}
			
			// Müþterinin TC numarasý ve ad bilgileri alýnýr.
			System.out.print("Citizenship Number: ");
			String citizenshipNr = sub1.nextLine();
			
			System.out.print("Name: ");
			String name1 = sub1.nextLine();
			
			// Bilgiler alýndýktan sonra bir müþteri oluþturulur.
			ExistingCustomer customer1 = new ExistingCustomer(citizenshipNr);
			customer1.setName(name1);
			customer.add(customer1);
			
			SubscriptionPlan subplan1=null;
			
			boolean flag1 = true;
			while(flag1) { // Doðru girilene kadar müþterinin kayýt olmak istediði plan ismi alýmý tekrar eder.
				System.out.print("Name of the plan to be subscribed : ");
				String nameplan = sub1.nextLine();
				
				if(sakla.findSubscriptionPlan(nameplan) ==  null) {
					System.out.println("Please give correct subscription plan name !\n");
				}
				else {
					subplan1 = sakla.findSubscriptionPlan(nameplan);
					flag1 = false;
				}
			}
			
			// Burada ise ay/gün/yýl olarak tarih bilgisi alýnýr.
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
			System.out.print("Start date for subscription : ");
	        Date date1 = sdf.parse(sub1.nextLine());
	        
	        Subscription subscription1 = new Subscription(date1, subplan1);
	        subscription.add(subscription1);
	        
	        customer1.setSubscription(subscription1);
	        
	        // Aldýðýmýz bilgiler ekrana yazdýrýlýr.
	        System.out.println("\n-----------------------------------------------------------");
	        System.out.println("Customer citizenship number : " + customer1.getCitizenshipNr());
	        System.out.println("Customer name : " + customer1.getName());
	        System.out.println("Service Provider : " + customer1.getSubscription().getSubscriptionPlan().getServiceProvider().getName());
	        String strDate = sdf.format(customer1.getSubscription().getSubscriptionStartDate());  
	        System.out.println("Subscription Start Date : " + strDate);
	        System.out.println("Subscription Plan Name : " + customer1.getSubscription().getSubscriptionPlan().getName());
	        System.out.println("-----------------------------------------------------------\n");
	        
	        // Eklemeye devam etmek istedikçe döngü devam eder.
	        System.out.print("Do you want to continue adding (yes/no) : ");
	        String control = sub1.nextLine();
	        
	        if(control.equalsIgnoreCase("no")) {
	        	flag = false; 
	        }
		}
		
	}
}

