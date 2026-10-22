package json;

public class Jugadores {
	private String nombre;
	private int edad;
	private String nacionalidad;
	private String club;
	private String posicion;
	
	public Jugadores() {
		this.nombre = "";
		this.edad = 0;
		this.nacionalidad = "";
		this.club = "";
		this.posicion = "";
	}

	public Jugadores(String nombre, int edad, String nacionalidad, String club, String posicion) {
		this.nombre = nombre;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
		this.club = club;
		this.posicion = posicion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	@Override
	public String toString() {
		return "Jugadores [nombre=" + nombre + ", edad=" + edad + ", nacionalidad=" + nacionalidad + ", club=" + club
				+ ", posicion=" + posicion + "]";
	}
}
