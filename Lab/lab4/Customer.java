package lab4;

public class Customer implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private int tcNo;
	private String isim;
	private int gunSayisi;
	private Room r;
	
	public Customer(int tcNo, String isim, int gunSayisi, Room r) {
		this.tcNo = tcNo;
		this.isim = isim;
		this.gunSayisi = gunSayisi;
		this.r = r;
	}

	public int getTcNo() {
		return tcNo;
	}

	public void setTcNo(int tcNo) {
		this.tcNo = tcNo;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getGunSayisi() {
		return gunSayisi;
	}

	public void setGunSayisi(int gunSayisi) {
		this.gunSayisi = gunSayisi;
	}

	public Room getR() {
		return r;
	}

	public void setR(Room r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "Customer [tcNo=" + tcNo + ", isim=" + isim + ", gunSayisi=" + gunSayisi + ", r=" + r + "]";
	}
}
