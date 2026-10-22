package poo;

public class Principal {
	public static void main(String[] args) {
		Perro perro1=new Perro("Berta", "Pastor Alemán", 10);
		Perro perro2=new Perro("Paco", "Caniche", 7);
		System.out.println(perro1.getId());
		System.out.println(perro2.getId());
		perro1.setSobrepeso(true);
		perro2.setSobrepeso(false);
		System.out.println(perro1);
		System.out.println(perro2);
		
		if(perro1.getEdad()> perro2.getEdad())
			System.out.println(perro1.getNombre()+" es mayor que "+perro2.getNombre());
		else {
			if(perro2.getEdad()> perro1.getEdad())
				System.out.println(perro2.getNombre()+" es mayor que "+perro1.getNombre());
			else
				System.out.println("Son de la misma edad");
		}
		
		if(perro1.isSobrepeso())
			System.out.println(perro1.getNombre()+" tiene sobrepeso");
		if(perro2.isSobrepeso())
			System.out.println(perro2.getNombre()+" tiene sobrepeso");
		
		System.out.println();
		System.out.println("Longitud del nombre es: "+perro1.getNombre().length());
		System.out.println("Longitud del nombre es: "+perro2.getNombre().length());
	}
}
