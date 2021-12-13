import java.util.Random;

public class Q10 {

	public static void main(String[] args) {
		Random random = new Random();

		int[] numeros = new int[10];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(101);
		}

		int maiorNumeroIndex = 0;
		int maiorNumero = numeros[0];
		int ultimoNumeroIndex = numeros.length - 1;
		int ultimoNumeroOriginal = numeros[ultimoNumeroIndex];

		System.out.println("# Vetor inicial");

		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("[%d] ", numeros[i]);

			if (numeros[i] > maiorNumero) {
				maiorNumero = numeros[i];
				maiorNumeroIndex = i;
			}
		}

		int maiorNumeroIndexOriginal = maiorNumeroIndex;
		int temp = numeros[maiorNumeroIndex];
		numeros[maiorNumeroIndex] = numeros[ultimoNumeroIndex];
		numeros[ultimoNumeroIndex] = temp;

		System.out.println("\n\n# Vetor alterado");

		for (int num : numeros) {
			System.out.printf("[%d] ", num);
		}

		System.out.printf("\n\n> Último elemento do vetor inicial: %d\n", ultimoNumeroOriginal);
		System.out.printf("> Maior elemento: %d\n", maiorNumero);
		System.out.printf("> Posiçã do maior elemento no vetor inicial: %d\n", maiorNumeroIndexOriginal);

	}

}
