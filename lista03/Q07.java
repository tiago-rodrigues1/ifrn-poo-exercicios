import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);

		boolean isPrimo = false;

		System.out.print("- Digite um número: ");
		int num = scanTeclado.nextInt();

		if (num == 2) {
			isPrimo = true;

		} else {
			int divisores = 0;

			if (num % 2 != 0) {
				for (int i = 1; i <= num; i++) {
					if (num % i == 0) {
						divisores++;
					}
				}
			}

			isPrimo = divisores == 2;
		}

		System.out.format("\n> %d %s um número primo\n", num, (isPrimo ? "é" : "não é"));

		scanTeclado.close();

	}

}
