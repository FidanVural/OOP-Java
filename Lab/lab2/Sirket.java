package lab2;

public class Sirket {
	private String isim;
	private final int depSayisi = 4;
	private Departman [] departmanlar = new Departman[depSayisi];
	
	public Departman[] getDep() {
		return departmanlar;
	}
	
	public String getIsim() {
		return isim;
	}
	
	public void sirketTanýt() {
		for(int i=0; i<depSayisi; i++)
			departmanlar[i].depBilgisi(i);
		
	}
	
	public void depMaasOrt(int depNo) {
		System.out.println(depNo + " numaralý departmanda çalýþanlarýn maaþ ortalamasý: "+ departmanlar[depNo].maasOrtalama());
		
	}
	
	public Sirket(String isim) {
		this.isim = isim;
		for(int i = 0;i<depSayisi;i++) {
			departmanlar[i] = new Departman();
		}
	}
	
	public void calisanEkle(Calisan calisan) {
		
		for(int i=0;i<depSayisi;i++) {
			for(int j=0;j<departmanlar[i].getCalSayisi();j++) {
				if(departmanlar[i].getCalisanlar()[j]==null){
					departmanlar[i].getCalisanlar()[j]=calisan;
					return;  //return diyerek metottan çýkýþ yapýlacaðýný söylüyoruz. Aksi halde for döngüsü devam edecek, ayný çalýþaný dizinin tüm elemanlarýna ekleyecektir.
				}
			}
		}
		
	}
	
	
	public int maxYil(){  //tüm çalýþanlar arasýndaki en uzun görev yýlýný döndürür.
		int max=0;
		int a=0;
		
		for(int i=0;i<depSayisi;i++) {
			for(int j=0;j<departmanlar[i].getCalSayisi();j++){
				if(departmanlar[i].getCalisanlar()[j]!=null){
					 a = departmanlar[i].getCalisanlar()[j].getGorevSayisi();
					
					if(a>=max)
						max=a;
				}
					
			}
		}
		return max;
	}
	
public void maxGorevYili(){
		
		int max = maxYil();  //bir metodun baþýnda nesne veya sýnýf adý yazmadan çaðýrýyorsak, bu sýnýf içinde tanýmlý bir metot demektir.
		
		for(int i=0;i<depSayisi;i++) {
			for(int j=0;j<departmanlar[i].getCalSayisi();j++){
				if(departmanlar[i].getCalisanlar()[j]!=null && departmanlar[i].getCalisanlar()[j].getGorevSayisi() == max ){
					System.out.println(departmanlar[i].getCalisanlar()[j].getIsim()); 
				}
			}
		}
		
	}
	
}
