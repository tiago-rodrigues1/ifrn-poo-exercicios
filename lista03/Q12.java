import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);

		int qPares = 0, qImpares = 0;

		while (true) {
			System.out.print("- Digite um número [-1 p/ encerrar]: ");
			int num = scanTeclado.nextInt();

			if (num == -1) {
				break;

			} else {

				if (num % 2 == 0) {
					qPares++;

				} else {
					qImpares++;
				}
			}

		}

		System.out.format("\n> Quantidade de números pares: %d", qPares);
		System.out.format("\n> Quantidade de números ímpares: %d\n", qImpares);

		scanTeclado.close();

	}

}
