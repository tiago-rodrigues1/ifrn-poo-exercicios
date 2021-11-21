import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);

		System.out.print("- Digite um número (dividendo): ");
		int dividendo = scanTeclado.nextInt();

		System.out.print("- Digite outro número (divisor): ");
		int divisor = scanTeclado.nextInt();

		int quociente = dividendo / divisor;
		int resto = dividendo % divisor;

		System.out.print("\n");

		System.out.format("> Dividendo: %d", dividendo);
		System.out.format("\n> Divisor: %d", divisor);
		System.out.format("\n> Quociente: %d", quociente);
		System.out.format("\n> Resto da divisão: %d", resto);
	}

}
