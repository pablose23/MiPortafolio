package videoclub;

public class Alquiler {
	private Dvd dvd;
	private int tiempo;
	
	public Alquiler() {
		this.dvd=new Dvd();
		this.tiempo = 0;
	}

	public Alquiler(Dvd dvd, int tiempo) {
		super();
		this.dvd = dvd;
		this.tiempo = tiempo;
	}

	public Dvd getDVD() {
		return dvd;
	}

	public int getTiempo() {
		return tiempo;
	}

}
