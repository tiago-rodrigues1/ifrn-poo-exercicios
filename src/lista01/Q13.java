import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);
		
		final double VALOR_1EURO_REAL = 4.32;
		
		System.out.print("- Digite o valor em euro: ");
		double valorEuro = scanTeclado.nextDouble();
		
		double valorConvertido = valorEuro * VALOR_1EURO_REAL;
		
		System.out.print("\n");
		
		System.out.format("> %.2f euros é igual R$ %.2f", valorEuro, valorConvertido);

	}

}
