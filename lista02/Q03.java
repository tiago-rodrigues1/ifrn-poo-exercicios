import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);

		System.out.print("- Digite um ano: ");
		int ano = scanTeclado.nextInt();

		boolean isAnoBissexto = ano % 400 == 0 || ano % 4 == 0 && !(ano % 100 == 0);

		if (isAnoBissexto) {
			System.out.format("\n> %d é um ano bissexto\n", ano);

		} else {
			System.out.format("\n> %d não é um ano bissexto\n", ano);
		}

		scanTeclado.close();
	}

}
