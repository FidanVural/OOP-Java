package lab1;

public class Urun {
	private int ID;
	private String ad;
	private double fiyat;
	private static int zamSayisi=0;
	
	public Urun(int ID, String ad, double fiyat) {
		this.ID = ID;
		this.ad = ad;
		this.fiyat = fiyat;
	}

	public String getAd() {
		return ad;
	}
	
	public int getID() {
		return ID;
	}
	
	public double getFiyat() {
		return fiyat;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public double zamYap(double zamOrani) {
		zamSayisi += 1;
		fiyat += (fiyat * zamOrani);
		return fiyat;
	}

	public static int getZamSayisi() {
		return zamSayisi;
	}

	@Override
	public String toString() {
		return "Urun [ID=" + ID + ", ad=" + ad + ", fiyat=" + fiyat + "]";
	}
	
	
	
	
}
