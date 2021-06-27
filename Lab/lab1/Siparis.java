package lab1;

public class Siparis {
	
	private Urun [] urunler;
	
	public Siparis() {
		urunler = new Urun[5];
	}

	public Urun[] getUrunler() {
		return urunler;
	}
	
	public void urunEkle(Urun urun) {
		int i=0;
		
		while(i < urunler.length && urunler[i] != null) {
			i++;
		}
		
		if(i != urunler.length) {
			urunler[i] = urun;
		}
	}
	
	public void urunleriGoster() {
		int i=0;
		for(i=0;i<urunler.length;i++) {
			System.out.println(urunler[i]);
		}
	}
	
	public void urunCikar(Urun urun) {
		
		for(int i=0;i<urunler.length;i++){
			if(urunler[i] == urun){
				urunler[i] = null;
				
			}
		}
	}
	
	public double getToplamTutar() {
		int i = 0;
		double toplam = 0.0;
		
		for(i=0;i<urunler.length;i++) {
			if(urunler[i] != null) {
				toplam += (urunler[i].getFiyat());
			}
		}
		return toplam;
	}
}
