package lab2;

public class Test {

	public static void main(String[] args) {
		Sirket sirket = new Sirket("Biliþim Firmasý");
		
		Calisan c[] = new Calisan[12];
		c[0]= new Yazýlýmcý("Yazýlýmcý-1", 6,3, 7500);
		c[1]= new Analist("Analist-1", 5,6500);
		c[2]= new Analist("Analist-2", 6, 6500);
		c[3]= new Yazýlýmcý("Yazýlýmcý-2", 6,4, 7500);
		c[4]= new Yazýlýmcý("Yazýlýmcý-3",5 ,5, 7500);
		c[5]= new Yazýlýmcý("Yazýlýmcý-4", 6,4, 7500);
		c[6]= new Yazýlýmcý("Yazýlýmcý-5", 6,3, 7500);
		c[7]= new Analist("Analist-3", 6, 6500);
		c[8]= new Analist("Analist-4", 6, 6500);
		c[9]= new Yazýlýmcý("Yazýlýmcý-6", 9, 7, 7500);
		c[10]= new Analist("Analist-5", 9, 6500);
		
		
		System.out.println(c[8].kendiniTanýt());
		System.out.println(c[9].kendiniTanýt());
		System.out.println("**********************************");
		
		System.out.println("zamYap metodu çalýþýyor...");
		for(int i=0; i<c.length; i++){
			if(c[i]!=null)
				c[i].zamYap();
		}
		
		System.out.println("**********************************");
		System.out.println(c[8].kendiniTanýt());
		System.out.println(c[9].kendiniTanýt());
		System.out.println("**********************************");
		
		System.out.println("Çalýþanlar departmanlara yerleþtiriliyor...");
		for(int i=0; i<c.length; i++){
			sirket.calisanEkle(c[i]);
		}
		
		System.out.println("**********************************");
		sirket.depMaasOrt(3); 
		
		System.out.println("**********************************");
		System.out.println("Görev yýlý en fazla olan kiþilerin isimleri:");
		sirket.maxGorevYili();
		
		System.out.println("**********************************");
		sirket.sirketTanýt();
		
		

	}

}
