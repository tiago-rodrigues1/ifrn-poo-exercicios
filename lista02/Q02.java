import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);
		
		System.out.print("- Digite um número entre 0 e 100: ");
		double numeroDigitado = scanTeclado.nextDouble();
		
		if (numeroDigitado >= 0 && numeroDigitado <= 100.0) {
			System.out.println("\n> Você digitou um número entre 0 e 100");
			
		} else {
			System.out.println("\n> Você digitou um número fora do intervalo entre 0 e 100");
		}

	}

}
