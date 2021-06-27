package lab2;

public class Analist extends Calisan{
	
	public Analist(String isim, int gorevSayisi, double maas) {
		super(isim, gorevSayisi, maas);
	}
	
	@Override
	public void zamYap() {
		int gorev = getGorevSayisi();
		gorev++;
		setGorevSayisi(gorev);
		
		double maas = getMaas();
		maas = maas + maas * 0.1;
		setMaas(maas);
	}
}
