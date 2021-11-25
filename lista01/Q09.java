/*
 * Autor: Tiago Rodrigues dos Santos
 * Data: 21/11/2021
 * Descrição: Lê a quatindade das comidas oferecidas e imprime o valor total do pedido e o valor referente a 5% 
 * sobre o total do pedido
*/

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);

		final double PRECO_COXINHA = 1.75, PRECO_PASTEL = 1.5, PRECO_REFRIGERANTE = 2.5;

		System.out.print("- Digite quantas coxinhas você deseja: ");
		int quantCoxinhas = scanTeclado.nextInt();

		System.out.print("- Digite quantos pastéis você deseja: ");
		int quantPasteis = scanTeclado.nextInt();

		System.out.print("- Digite quantos refrigerantes você deseja: ");
		int quantRefrigerantes = scanTeclado.nextInt();

		double valorTotalPedido = (quantCoxinhas * PRECO_COXINHA) + (quantPasteis * PRECO_PASTEL)
				+ (quantRefrigerantes * PRECO_REFRIGERANTE);
		double cincoPorcentoPedido = valorTotalPedido * 0.05;

		System.out.print("\n");

		char simboloPorcentagem = (char) 37;

		System.out.format("> Valor total do seu pedido: R$ %.2f \n", valorTotalPedido);
		System.out.format("> Valor de 5%c do seu pedido: R$ %.2f \n", simboloPorcentagem, cincoPorcentoPedido);

	}

}
