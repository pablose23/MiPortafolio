package poo;

public class Libro {
	private String ISBN;
	private String titulo;
	private String autor;
	private int npaginas;
	
	//Constructor
	public Libro() {
		this.ISBN="";
		this.titulo="";
		this.autor="";
		this.npaginas=0;
	}
	
	public Libro(String ISBN, String titulo, String autor, int npaginas) {
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.autor = autor;
		this.npaginas = npaginas;
	}
	
	public Libro(String titulo, String autor, int npaginas) {
		this.ISBN="";
		this.titulo = titulo;
		this.autor = autor;
		this.npaginas = npaginas;
	}
	
	public Libro(String ISBN) {
		this.ISBN = ISBN;
		this.titulo="";
		this.autor="";
		this.npaginas=0;
	}

	//getters y setters
	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNpaginas() {
		return npaginas;
	}

	public void setNpaginas(int npaginas) {
		this.npaginas = npaginas;
	}

	@Override
	public String toString() {
		return "El libro: "+ titulo + " con ISBN: " + ISBN + " creado por el Autor " + autor + " tiene " + npaginas + " páginas \n";
	}
	
	public static void main(String[] args) {
		Libro libro1=new Libro();
		libro1.setTitulo("El señor de los anillos");
		libro1.setISBN("456-0895527669");
		libro1.setAutor("Paco");
		libro1.setNpaginas(800);
		Libro libro2=new Libro();
		libro2.setTitulo("Luces de bohemias");
		libro2.setISBN("975-0834327669");
		libro2.setAutor("Hugo");
		libro2.setNpaginas(200);
		
		System.out.println(libro1);
		System.out.println(libro2);
		
		if(libro1.getNpaginas()>libro2.getNpaginas())
			System.out.println("El libro " +libro1.getTitulo()+ " de "+libro1.getAutor()+" tiene más páginas que el libro " +libro2.getTitulo()+ " de "+libro2.getAutor());
		else
			System.out.println("El libro " +libro2.getTitulo()+ " de "+libro2.getAutor()+" tiene más páginas que el libro " +libro1.getTitulo()+ " de "+libro1.getAutor());
	}
	
}
