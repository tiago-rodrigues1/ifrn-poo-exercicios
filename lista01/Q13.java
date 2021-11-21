/*
 * Autor: Tiago Rodrigues dos Santos
 * Data: 21/11/2021
 * Descrição: Lê o valor de um produto e em parcelas o usuário deseja pagar e imprime o valor da parcela e 
 * o valor da multa em caso de atraso do pagamento
*/

import java.util.Scanner;

public class Q13 {

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
		
		System.out.format("> Valor da parcela: R$ %.2f \n", valorParcela);
		System.out.format("> Valor da multa por atraso: R$ %.2f \n", valorMulta);
		
	}

}
