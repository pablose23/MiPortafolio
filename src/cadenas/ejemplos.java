package cadenas;

public class ejemplos {
	public static void main(String[]args) {
		String palabra="murcielago";
		System.out.println(palabra.toUpperCase());
		System.out.println(palabra.toLowerCase());
		for (int i = 0; i < palabra.length(); i++) {
			System.out.println(palabra.charAt(i));
			
		}	
		String principio=palabra.substring(0,2);
		System.out.println(principio);
		
		String nueva=palabra.substring(0, 1).toUpperCase()+palabra.substring(1);
		System.out.println(nueva);
		
		System.out.println(nueva.indexOf("1", 0));
	}
}
