/*
 * Autor: Tiago Rodrigues dos Santos
 * Data: 21/11/2021
 * Descrição: Lê um valor em euro e o imprime convertido em real
*/

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);

		final double VALOR_1EURO_EM_REAL = 4.32;

		System.out.print("- Digite o valor em euro: ");
		double valorEuro = scanTeclado.nextDouble();

		double valorConvertido = valorEuro * VALOR_1EURO_EM_REAL;

		System.out.print("\n");

		System.out.format("> %.2f euros é igual R$ %.2f \n", valorEuro, valorConvertido);

	}

}
