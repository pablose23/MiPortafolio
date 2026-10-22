package juegos;

public class Jugador {

	// Atributos
	private String nombre;
	private Carta c; // Objeto carta

	public Jugador() {
		this.nombre = "";
		this.c = new Carta();
	}

	public Jugador(String nombre, Carta c) {
		this.nombre = nombre;
		this.c = c;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Carta getC() {
		return c;
	}

	public void setC(Carta c) {
		this.c = c;
	}
	
	public void extraerCarta() {
			this.c.generarCarta();
	}

	@Override
	public String toString() {
		return "Jugador: " + nombre + " saca " + c + "\n";
	}
	
	public static void main(String[] args) {
		Jugador j=new Jugador();
		Jugador j1=new Jugador();
		j.setNombre("Pablo");
		j.extraerCarta();
		j1.setNombre("Hugo");
		j1.extraerCarta();
		System.out.println(j);
		System.out.println(j1);
	}
}
