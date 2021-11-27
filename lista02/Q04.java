import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);

		double maior = 0, meio = 0, menor = 0;

		System.out.print("- Digite 1º o número: ");
		double num1 = scanTeclado.nextDouble();

		System.out.print("- Digite 2º o número: ");
		double num2 = scanTeclado.nextDouble();

		System.out.print("- Digite 3º o número: ");
		double num3 = scanTeclado.nextDouble();

		if (num1 < num2) {
			if (num2 < num3) {
				menor = num1;
				meio = num2;
				maior = num3;

			} else if (num1 < num3) {
				menor = num1;
				meio = num3;
				maior = num2;

			} else {
				menor = num3;
				meio = num1;
				maior = num2;
			}

		} else {
			if (num2 < num3) {
				if (num1 < num3) {
					menor = num2;
					meio = num1;
					maior = num3;

				} else {
					menor = num2;
					meio = num3;
					maior = num1;
				}

			} else {
				menor = num3;
				meio = num2;
				maior = num1;
			}

		}

		System.out.format("\n> %.2f, %.2f, %.2f\n", menor, meio, maior);

		scanTeclado.close();

	}

}
