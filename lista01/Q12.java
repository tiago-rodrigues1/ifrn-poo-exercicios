/*
 * Autor: Tiago Rodrigues dos Santos
 * Data: 21/11/2021
 * Descrição: Lê um valor em jardas e o imprime convertido em metros
*/

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);
		
		final double VALOR_1JARDA_EM_METROS = 0.91;
		
		System.out.print("- Digite o valor em jardas: ");
		double valorJardas = scanTeclado.nextDouble();
		
		double valorConvertido = valorJardas * VALOR_1JARDA_EM_METROS;
		
		System.out.print("\n");
		
		System.out.format("> %.2f jardas é igual %.2f metros \n", valorJardas, valorConvertido);

	}

}
