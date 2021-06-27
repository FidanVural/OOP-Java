package lab2;

public abstract class Calisan {
	private String isim;
	private int gorevSayisi;
	private double maas;
	
	public Calisan(String isim, int gorevSayisi, double maas) {
		this.isim = isim;
		this.gorevSayisi = gorevSayisi;
		this.maas = maas;
	}
	
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getGorevSayisi() {
		return gorevSayisi;
	}

	public void setGorevSayisi(int gorevSayisi) {
		this.gorevSayisi = gorevSayisi;
	}

	public double getMaas() {
		return maas;
	}

	public void setMaas(double maas) {
		this.maas = maas;
	}

	public abstract void zamYap();
	
	public String kendiniTanýt() {
		String s = "Ýsmim: "+ getIsim() +", "+ getGorevSayisi()+" yýldýr çalýþýyorum. "+getMaas()+" lira maaþ alýyorum.";
		return s;
		
	}
	
}
