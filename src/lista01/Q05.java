import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);
		
		final double PERCENTUAL_MULTA = 0.02; // 2%
		
		System.out.print("- Digite o valor do produto: ");
		double valorProduto = scanTeclado.nextDouble();
		
		System.out.print("- Digite a quantidade de parcelas desejada: ");
		int quantParcelas = scanTeclado.nextInt();
		
		double valorParcela = valorProduto / quantParcelas;
		double valorMulta = valorParcela * PERCENTUAL_MULTA;
		
		System.out.print("\n");
		
		System.out.printf("> Valor da parcela: R$ %.2f", valorParcela);
		System.out.printf("\n> Valor da multa por atraso: R$ %.2f", valorMulta);
		
		
		

	}

}
