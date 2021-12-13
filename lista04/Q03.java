import java.util.Random;

public class Q03 {

	public static void main(String[] args) {
		Random randomNum = new Random();
		
		final int MAX_PARES = 20;
		
		int[] numeros = new int[MAX_PARES];
		int contPares = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = randomNum.nextInt(101);
			
			if (numeros[i] % 2 == 0) {
				contPares++;
			}
		}
		
		System.out.printf("\n# %d números pares encontrados no vetor:\n\n", contPares);
		
		for (int numero : numeros) {
			if (numero % 2 == 0) {
				System.out.printf("[%d] ", numero);
			}
		}
		
		System.out.println();

	}

}
