import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);
		
		final double VALOR_1JARDA_EM_METROS = 0.91;
		
		System.out.print("- Digite o valor em jardas: ");
		double valorJardas = scanTeclado.nextDouble();
		
		double valorConvertido = valorJardas * VALOR_1JARDA_EM_METROS;
		
		System.out.print("\n");
		
		System.out.format("> %.2f jardas é igual %.2f metros", valorJardas, valorConvertido);

	}

}
