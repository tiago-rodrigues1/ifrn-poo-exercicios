/*
* Autor: Tiago Rodrigues dos Santos
* Data: 21/11/2021
* Descrição: Calcula dinheiro gasto por um fumante com dados informados pelo usuário
*/

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);
		
		System.out.print("- Digite o numero de anos de fumo: ");
		int anosDeFumo = scanTeclado.nextInt();
		
		System.out.print("- Digite o numero de cigarros fumados por dia: ");
		int cigarrosPorDia = scanTeclado.nextInt();
		
		System.out.print("- Digite o preco da carteira com 20 cigarros: ");
		double precoCarteiraCigarros = scanTeclado.nextDouble();
		
		double precoCigarro = precoCarteiraCigarros / 20;
		
		int diasDeFumo = anosDeFumo * 365;
		int quantidadeTotalCigarros = cigarrosPorDia * diasDeFumo;
		
		double dinheiroGasto = quantidadeTotalCigarros * precoCigarro;
		
		System.out.print("/n");
		
		System.out.printf("> Esse fumante gastou R$ %.2f com cigarros", dinheiroGasto);

	}

}
