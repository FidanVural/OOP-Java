package lab2;

public class Departman {
	
	private final int calSayisi = 3;
	private Calisan[] calisanlar = new Calisan[calSayisi];
	
	
	public int getCalSayisi() {
		return calSayisi;
	}
	
	public Calisan[] getCalisanlar() {
		return calisanlar;
	}

	public void calisanEkle(Calisan calisan) {
		for(int i=0;i<calisanlar.length;i++) {
			if(calisanlar[i] == null) {
				calisanlar[i] = calisan;
				System.out.println("Basarili sekilde eklendi.\n");
				break;
			}
		}
	}
	
	public double maasOrtalama() {
		double toplam = 0;
		int count = 0;
		
		for(int i=0;i<calisanlar.length;i++) {
			if(calisanlar[i] != null) {
				toplam += calisanlar[i].getMaas();
				count++;
			}
		}
		
		return toplam/count;
	}
	
	public void depBilgisi(int depNo){
		int aSayisi=0;
		int ySayisi=0;
		
		for(int i=0; i<calSayisi; i++){
			if(calisanlar[i] instanceof Analist)
				aSayisi++;
			else if(calisanlar[i] instanceof Yazýlýmcý) //sadece else deyip býrakýrsak, boþ dizi elemanýný da yazýlýmcý olarak sayar.
				ySayisi++;
		}
		System.out.println(depNo+" numaralý departmanda "+aSayisi+" tane Analist, "+ySayisi+" tane Yazýlýmcý vardýr.");
		
	}
	
//	if(nesneAdi instanceof sinifAdi) -> eðer nesne, adý verilen sýnýfa ait ise true döner,
//	aksi halde false döner.
//	if(calisanNesnesi instanceof Calisan) -> true
//	if(analistNesnesi insanceof Calisan) -> true
//	if(analistNesnesi instanceof Yazýlýmcý) -> false
	
	
}
