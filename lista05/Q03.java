/*
 * Dupla: Tiago Rodrigues e Gabrielly Beatriz
*/

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] m = new int[3][3];
		int[] diagonalPrincipalElementos = new int[3];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("- Digite um valor para [%d][%d]: ", i, j);
				m[i][j] = scan.nextInt();
				
				if (i == j) {
					diagonalPrincipalElementos[i] = m[i][j];
				}
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			
			System.out.println();
		}
		
		System.out.println("\n# Elementos da diagonal principal");
		
		for (int elemento : diagonalPrincipalElementos) {
			System.out.print(elemento + " ");
		}
		
		System.out.println();
		
		scan.close();

	}

}
