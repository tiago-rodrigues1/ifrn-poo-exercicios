import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);
		
		// 1kg = 2.2 libras
		final double VALOR_1KG_LIBRAS = 2.2;
		
		System.out.print("- Digite o valor em kg: ");
		double valorKG = scanTeclado.nextDouble();
		
		double kgEmLibras = valorKG * VALOR_1KG_LIBRAS;
		
		System.out.print("\n");;
		
		System.out.format("> %.2fkg é igual a %.2f libras", valorKG, kgEmLibras);

	}

}
