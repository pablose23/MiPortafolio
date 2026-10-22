package videoclub;

public class Dvd {
	private String titulo;
	private int tipo;
	public static final int infantil=2;
	public static final int normal=0;
	public static final int novedad=1;
	
	public Dvd() {
		super();
		this.titulo = "";
		this.tipo = 0;
	}

	public Dvd(String titulo, int tipo) {
		super();
		this.titulo = titulo;
		this.tipo = tipo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
}
