/*
* Autor: Tiago Rodrigues dos Santos
* Data: 21/11/2021
* Descrição: Programa que lê o tempo e a velocidade média de uma viagem e imprime, além desses dados:
* 	- A quantidade de combustível gasta
* 	- A distância percorrida
*/

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);

		final int KM_POR_LITRO = 12;

		// user inputs
		System.out.print("- Digite o tempo de viagem: ");
		double tempoDeViagem = scanTeclado.nextDouble();

		System.out.print("\n- Digite a velocidade media durante a viagem: ");
		double velocidadeMedia = scanTeclado.nextDouble();

		double distancia = tempoDeViagem * velocidadeMedia;
		double litrosUsados = distancia * KM_POR_LITRO;

		System.out.print("\n");

		System.out.printf("> Velocidade media: %.1f", velocidadeMedia);
		System.out.printf("\n> Tempo de viagem: %.1f", tempoDeViagem);
		System.out.printf("\n> Distancia percorrida: %.1f", distancia);
		System.out.printf("\n> Quant. de combustivel gasta: %.2f", litrosUsados);

	}

}
