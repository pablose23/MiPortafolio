package videoclub;

public class Alquiler {
	private String DVD;
	private String tiempo;
	
	public Alquiler() {
		super();
		this.DVD = "";
		this.tiempo = "";
	}

	public Alquiler(String DVD, String tiempo) {
		super();
		this.DVD = DVD;
		this.tiempo = tiempo;
	}

	public String getDVD() {
		return DVD;
	}

	public String getTiempo() {
		return tiempo;
	}

}
