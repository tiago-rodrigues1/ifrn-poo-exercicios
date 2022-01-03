/*
 * Alunos:
 * Gabrielly Beatriz
 * Tiago Rodrigues 
*/

import java.util.Scanner;

public class Q15 {
	
	static String[][] getMatriz() {
		Scanner scan = new Scanner(System.in);
		
		String[][] m = new String[2][2];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("- Digite um valor para [%d][%d]: ", i, j);
				m[i][j] = scan.next();
			}
		}
		
		scan.close();
		
		return m;
	}
	
	static String[] getElementosDiagonalPrincipal(String[][] m) {
		String[] diagonalPrincipalElementos = new String[2];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (i == j)  {
					diagonalPrincipalElementos[i] = m[i][j];
				}
			}
		}
		
		return diagonalPrincipalElementos;
	}

	public static void main(String[] args) {
		String[][] m = getMatriz();
		String[] diagonalPrincipalElementos = getElementosDiagonalPrincipal(m);
		
		System.out.println("\n# Elementos da diagonal principal");
		
		for (String elemento : diagonalPrincipalElementos) {
			System.out.println("> " + elemento);
		}
		
	}

}
