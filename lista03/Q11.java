import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);

		int i = 0, soma = 0;

		do {
			System.out.print("- Digite um número [9999 p/ encerrar]: ");
			int num = scanTeclado.nextInt();

			if (num == 9999) {
				break;

			} else {
				soma += num;
				i++;
			}

		} while (true);

		double media = (double) soma / i;

		System.out.format("\n> Soma dos valores: %d", soma);
		System.out.format("\n> Média dos valores: %.2f\n", media);

		scanTeclado.close();

	}

}
