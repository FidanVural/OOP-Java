package lab4;

public class Room implements java.io.Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int oda_no;
	private int ucret;

	public Room(int oda_no, int ucret) {
		this.oda_no = oda_no;
		this.ucret = ucret;
	}

	public int getOda_no() {
		return oda_no;
	}

	public void setOda_no(int oda_no) {
		this.oda_no = oda_no;
	}

	public int getUcret() {
		return ucret;
	}

	public void setUcret(int ucret) {
		this.ucret = ucret;
	}

	@Override
	public String toString() {
		return "Room [oda_no=" + oda_no + ", ucret=" + ucret + "]";
	}
}
