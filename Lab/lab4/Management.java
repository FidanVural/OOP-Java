package lab4;

import java.io.*;
import java.util.LinkedList;

public class Management{
	
	private String isim;
	
	public Management(String isim) {
		this.isim = isim;
	}

	public void saveBookings(LinkedList <Customer> list){
		String fileName = "bookings.txt";
		
		try {
			ObjectOutputStream dosya = new ObjectOutputStream(new FileOutputStream( fileName ) );
			dosya.writeObject( list );
			dosya.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

    @SuppressWarnings("unchecked")
	public void customerInfo(Customer customer) throws FileNotFoundException, IOException, ClassNotFoundException{
        String fileName = "bookings.txt";
        ObjectInputStream dosya = new ObjectInputStream(new FileInputStream(fileName));
        
		LinkedList<Customer> list = (LinkedList<Customer>)dosya.readObject();
        for(Customer cust : list) {
            if(customer.getTcNo() == cust.getTcNo()) {
                System.out.println("Customer Name : " + customer.getIsim() +
                        "\nRoom Number : " + customer.getR().getOda_no() +
                        "\nStay Time : " + customer.getGunSayisi() +
                        "\nTotal Cost : " + customer.getR().getUcret() * cust.getGunSayisi());
            }
        }
        dosya.close();
    }

	public void changeBooking(Customer customer, int gun) throws FileNotFoundException, IOException, ClassNotFoundException {
		 ObjectInputStream dosya = new ObjectInputStream(
                 new FileInputStream("bookings.txt"));
		 
         @SuppressWarnings("unchecked")
		LinkedList<Customer> list = (LinkedList<Customer>)dosya.readObject();
         for (Customer cust : list) {
             if (cust.getTcNo() == customer.getTcNo()) {
            	 cust.setGunSayisi(gun);
                 dosya.close();
                 break;
             }
         }
                    
         dosya.close();

         ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("bookings.txt"));
         writer.writeObject(list);
         writer.close();
	}
}
