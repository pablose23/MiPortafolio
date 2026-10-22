package otrasActividades;

public class Racional {
	private int num;
	private int den;
	
	public Racional() {
		this.num=1;
		this.den=1;
	}
	
	public Racional(int num, int den) {
		this.num=num;
		this.den=den;
	}
	
	public String toString() {
		return (this.num+"/"+this.den);
	}
	
	public Racional producto(Racional t) {
		return new Racional(this.num*t.num, this.den*t.den);
	}
	
	public static void main(String[] args) {
		Racional r=new Racional(3,2);
		Racional q=new Racional(3,7);

		System.out.println(r+" * "+q+" = "+r.producto(q));
	}
}
