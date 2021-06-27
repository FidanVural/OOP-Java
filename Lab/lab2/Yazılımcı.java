package lab2;

public class Yazılımcı extends Calisan{
	private int sertifikaSayisi;
	
	public Yazılımcı(String isim, int gorevSayisi, double maas, int sertifikaSayisi) {
		super(isim, gorevSayisi, maas);
		this.sertifikaSayisi = sertifikaSayisi;
	}
	
	public int getSertifikaSayisi() {
		return sertifikaSayisi;
	}
	
	public void setSertifikaSayisi(int sertifikaSayisi) {
		this.sertifikaSayisi = sertifikaSayisi;
	}
	
	public void zamYap() {
		int gorev = getGorevSayisi();
		gorev++;
		setGorevSayisi(gorev);
		
		double maas = getMaas();
		maas = maas + maas * 0.15;
		setMaas(maas);
	}
	
	@Override
	public String kendiniTanıt() {
		return super.kendiniTanıt() + getSertifikaSayisi() +" adet sertifikam var.";
	}
	
}
