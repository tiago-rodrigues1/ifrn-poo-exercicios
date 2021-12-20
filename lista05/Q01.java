/*
 * Dupla: Tiago Rodrigues e Gabrielly Beatriz
*/

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a qtd de linhas ");
		int linha = leia.nextInt();
		System.out.println("Digite a qtd de colunas ");
		int coluna = leia.nextInt();
		
		String[][] m = new String [linha][coluna];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.println("Digite um valor para [" + i + "] [" + j + "]");
				m [i][j] = leia.next();
			}
		}
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

}
