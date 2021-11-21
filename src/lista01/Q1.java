import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);

		System.out.print("- Digite um número: ");
		double numeroDigitado = scanTeclado.nextDouble();

		double raizQuadrada = Math.sqrt(numeroDigitado);
		double quintaPotencia = Math.pow(numeroDigitado, 5);

		System.out.print("\n");

		System.out.format("> A raiz quadrada de %.2f é %.2f", numeroDigitado, raizQuadrada);
		System.out.format("\n> A quinta potência de %.2f é %.2f", numeroDigitado, quintaPotencia);

	}

}
