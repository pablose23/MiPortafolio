package cine;

public class Pelicula {
	private int año;
	private String director;
	private String genero;
	private String nombre;
	
	public Pelicula() {
		this.año = 0;
		this.director = "";
		this.genero = "";
		this.nombre = "";
	}
	
	public Pelicula(int año, String director, String genero, String nombre) {
		this.año = año;
		this.director = director;
		this.genero = genero;
		this.nombre = nombre;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void mostrarPelicula(){
		System.out.println("Pelicula "+this.nombre+ " estrenada en "+this.año+ " de género "+this.genero+ " creada por "+this.director);
	}

}
