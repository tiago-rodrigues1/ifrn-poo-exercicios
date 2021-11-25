/*
 * Autor: Tiago Rodrigues dos Santos
 * Data: 21/11/2021
 * Descrição: Lê um valor em kg e o imprime convertido em libras
*/

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);

		// 1kg = 2.2 libras
		final double VALOR_1KG_EM_LIBRAS = 2.2;

		System.out.print("- Digite o valor em kg: ");
		double valorKG = scanTeclado.nextDouble();

		double valorConvertido = valorKG * VALOR_1KG_EM_LIBRAS;

		System.out.print("\n");

		System.out.format("> %.2fkg é igual a %.2f libras \n", valorKG, valorConvertido);

	}

}
