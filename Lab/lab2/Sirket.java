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
	
	public void sirketTan�t() {
		for(int i=0; i<depSayisi; i++)
			departmanlar[i].depBilgisi(i);
		
	}
	
	public void depMaasOrt(int depNo) {
		System.out.println(depNo + " numaral� departmanda �al��anlar�n maa� ortalamas�: "+ departmanlar[depNo].maasOrtalama());
		
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
					return;  //return diyerek metottan ��k�� yap�laca��n� s�yl�yoruz. Aksi halde for d�ng�s� devam edecek, ayn� �al��an� dizinin t�m elemanlar�na ekleyecektir.
				}
			}
		}
		
	}
	
	
	public int maxYil(){  //t�m �al��anlar aras�ndaki en uzun g�rev y�l�n� d�nd�r�r.
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
		
		int max = maxYil();  //bir metodun ba��nda nesne veya s�n�f ad� yazmadan �a��r�yorsak, bu s�n�f i�inde tan�ml� bir metot demektir.
		
		for(int i=0;i<depSayisi;i++) {
			for(int j=0;j<departmanlar[i].getCalSayisi();j++){
				if(departmanlar[i].getCalisanlar()[j]!=null && departmanlar[i].getCalisanlar()[j].getGorevSayisi() == max ){
					System.out.println(departmanlar[i].getCalisanlar()[j].getIsim()); 
				}
			}
		}
		
	}
	
}
