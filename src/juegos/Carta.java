package juegos;

public class Carta {
	
	//Atributos
	private int numero;
	private String palo;

	//Constructor por defecto
	public Carta() {
		this.numero = 0;
		this.palo = "";
	}

	public Carta(int numero, String palo) {
		this.numero = numero;
		this.palo = palo;
	}
	
	//getters y setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public void generarCarta() {
		String[] p= {"oros", "espadas", "bastos","copas"};
		int aleatorio=(int)(Math.random()*4);
		int num;
		do {
			num=(int)(1+Math.random()*12);
		}while(num==8 || num==9);
		
		this.numero=num;
		this.palo=p[aleatorio];
	}
	
	//toString
	@Override
	public String toString() {
		return numero + " de " + palo;
	}
	
	public static void main(String[] args) {
		Carta c=new Carta();
		c.generarCarta();
		System.out.println(c);
	}
	
}
