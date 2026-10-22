package videoclub;

public class Cliente {
	private String Nombre;
	private Alquiler[] alquiler;
	
	public Cliente() {
		super();
		this.Nombre = "";
		this.alquiler = new Alquiler[2];
	}

	public Cliente(String nombre, Alquiler[] alquiler) {
		super();
		this.Nombre = nombre;
		this.alquiler = alquiler;
	}
	
}
