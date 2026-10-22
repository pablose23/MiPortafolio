package poo;

public class App {
	public static void main(String[] args) {
		Persona p=new Persona();
		Persona q=new Persona("11111111H", "Francisco", "Lopez");
		p.setApellidos("Pelaez");
		p.setNombre("Rosa");
		p.setDni("222222122Q");
		
		System.out.println(p.getNombre());
		System.out.println(q.getNombre());
	}
}
