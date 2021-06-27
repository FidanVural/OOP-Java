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
			else if(calisanlar[i] instanceof Yaz�l�mc�) //sadece else deyip b�rak�rsak, bo� dizi eleman�n� da yaz�l�mc� olarak sayar.
				ySayisi++;
		}
		System.out.println(depNo+" numaral� departmanda "+aSayisi+" tane Analist, "+ySayisi+" tane Yaz�l�mc� vard�r.");
		
	}
	
//	if(nesneAdi instanceof sinifAdi) -> e�er nesne, ad� verilen s�n�fa ait ise true d�ner,
//	aksi halde false d�ner.
//	if(calisanNesnesi instanceof Calisan) -> true
//	if(analistNesnesi insanceof Calisan) -> true
//	if(analistNesnesi instanceof Yaz�l�mc�) -> false
	
	
}
