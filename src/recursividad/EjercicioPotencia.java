package recursividad;

public class EjercicioPotencia {

	public static int potenciaI(int x, int n) {
		int resultado = 1;
		for (int i = 0; i < n; i++) { // bucle para el exponente
			resultado = x * resultado;
		}
		return resultado;
	}

	public static int potencia(int x, int n) {
		if (n == 0)
			return 1;
		else
			return x * potencia(x, (n - 1));
	}

	public static void main(String[] args) {
//		int x = 5;
//		int n = 3;

		System.out.println(potenciaI(5, 3));
		System.out.println(potencia(5, 3));

	}

}
