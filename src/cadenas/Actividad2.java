package cadenas;

public class Actividad2 {

	public static void main(String[] args) {
		String palabra="murcielago";
		String nueva=palabra;
		for(int i=nueva.length()-1; i>=0; i--) {
			System.out.println(nueva.indexOf(i));
		}

	}

}
