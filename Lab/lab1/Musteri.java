package lab1;

public class Musteri {
	private String ad;
	private String soyad;
	private Siparis [] siparisler;
	
	public Musteri(String ad, String soyad) {
		this.ad = ad;
		this.soyad = soyad;
		
		siparisler = new Siparis[3];
		
		for(int i=0;i<3;i++) {
			siparisler[i] = new Siparis();
		}
	}
	
	public void siparisVer(int siparisNo, Urun urun) {
		siparisler[siparisNo].urunEkle(urun);
	}
	
	public void siparisBilgisi(int siparisNo) {
		siparisler[siparisNo].urunleriGoster();
	}
	
	public void tumSiparisler() {
		
		for(int i=0;i<siparisler.length;i++) {
			siparisBilgisi(i);
		}
	}
	
	public void kacSiparis(String UrunAdi) {
		int say=0;
		
		for(int i=0;i<siparisler.length;i++) {
			for(Urun iter: siparisler[i].getUrunler()) {
				if(iter != null) {
					if(iter.getAd().compareTo(UrunAdi)==0) {
						say += 1;
					}
				}
			}
		}
		System.out.println(UrunAdi + " adlý üründen " + say + " adet bulunmaktadýr.\n");
	}
	
	public void tumSiparislerdenUrunCikar(Urun urun) {
		for(int i=0;i<siparisler.length;i++) {
			siparisler[i].urunCikar(urun);
		}
	}
	
	public void urunCikar(int siparisNo, Urun urun) {
		siparisler[siparisNo].urunCikar(urun);
	}
	
	public double getSiparisTutar(int siparisNo) {
		return siparisler[siparisNo].getToplamTutar();
	}
}
