import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);

		System.out.print("- Digite um número: ");
		double num = scanTeclado.nextDouble();

		int i = 1;

		System.out.format("\n# Tabuada do %.2f\n\n", num);

		while (i <= 10) {
			double produto = i * num;

			System.out.format("> %d x %.2f = %.2f\n", i, num, produto);

			i++;
		}

		scanTeclado.close();

	}

}
