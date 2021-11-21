/*
 * Autor: Tiago Rodrigues dos Santos
 * Data: 21/11/2021
 * Descrição: Lê a quantidade dias de vida do usuário e imprime esses dias convertido para anos, meses e dias
*/

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);
		
		final int DIAS_DE_1_ANO = 365;
		final int DIAS_DE_1_MES = 30;
		
		System.out.print("- Digite quantos dias de vida você tem: ");
		int diasDeVida = scanTeclado.nextInt();
		
		int anosDeVida = diasDeVida / DIAS_DE_1_ANO;
		diasDeVida = diasDeVida % DIAS_DE_1_ANO;
		
		int mesesDeVida = diasDeVida / DIAS_DE_1_MES;
		diasDeVida = diasDeVida % DIAS_DE_1_MES;
		
		System.out.print("\n");
		
		System.out.format("> Você tem: %d anos(s), %d mês(es) e %d dia(s) de vida \n", anosDeVida, mesesDeVida, diasDeVida);

	}

}
