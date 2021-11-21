/*
* Autor: Tiago Rodrigues dos Santos
* Data: 21/11/2021
* Descrição: Ler o saldo do usuário e imprime um novo reajustado +7,5%
*/

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);

		final double TAXA_REAJUSTE = 7.5 / 100; // 7.5%

		System.out.print("- Digite seu saldo bancário: ");
		double saldo = scanTeclado.nextDouble();

		double novoSaldo = saldo + (saldo * TAXA_REAJUSTE);

		System.out.print("\n");

		System.out.printf("> Seu novo saldo é R$ %.2f", novoSaldo);

	}

}
