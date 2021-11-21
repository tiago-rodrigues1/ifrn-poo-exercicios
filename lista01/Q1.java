/*
 * Autor: Tiago Rodrigues dos Santos
 * Data: 21/11/2021
 * Descrição: Lê um número imprime sua quinta pôtencia e sua raiz quadrada
*/

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);

		System.out.print("- Digite um número: ");
		double numeroDigitado = scanTeclado.nextDouble();

		double raizQuadrada = Math.sqrt(numeroDigitado);
		double quintaPotencia = Math.pow(numeroDigitado, 5);

		System.out.print("\n");

		System.out.format("> A raiz quadrada de %.2f é %.2f \n", numeroDigitado, raizQuadrada);
		System.out.format("> A quinta potência de %.2f é %.2f \n", numeroDigitado, quintaPotencia);

	}

}
