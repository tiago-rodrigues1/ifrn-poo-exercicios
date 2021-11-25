/*
 * Autor: Tiago Rodrigues dos Santos
 * Data: 21/11/2021
 * Descrição: Programa que lê o tempo e a velocidade média de uma viagem e imprime, além desses dados:
 *  - A quantidade de combustível gasta
 *  - A distância percorrida
*/

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);

		final int KM_POR_LITRO = 12;

		System.out.print("- Digite o tempo de viagem: ");
		double tempoDeViagem = scanTeclado.nextDouble();

		System.out.print("- Digite a velocidade média durante a viagem: ");
		double velocidadeMedia = scanTeclado.nextDouble();

		double distancia = tempoDeViagem * velocidadeMedia;
		double litrosUsados = distancia / KM_POR_LITRO;

		System.out.print("\n");

		System.out.format("> Velocidade média: %.1f \n", velocidadeMedia);
		System.out.format("> Tempo de viagem: %.1f \n", tempoDeViagem);
		System.out.format("> Distância percorrida: %.1f \n", distancia);
		System.out.format("> Quant. de combustível gasta: %.2f \n", litrosUsados);

	}

}
