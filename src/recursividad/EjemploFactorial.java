package recursividad;

public class EjemploFactorial {
	
	// 1.Recursivo
	static int factorial(int n) {
		// Caso base
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	// 2.Iterativo
	public static int factorialI(int n) {
		int resultado = 1;
		for (int i = 1; i <= n; i++) {
			resultado = resultado * i;
			System.out.println(resultado);
		}

		return resultado;
	}
	
	public static void main(String[] args) {
		int n = 4;

		System.out.println(factorial(n));
		System.out.println(factorialI(n));
	}

}
