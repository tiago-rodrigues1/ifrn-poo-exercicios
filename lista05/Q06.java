/*
 * Dupla: Tiago Rodrigues e Gabrielly Beatriz
*/

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
	
		int[][] matriz = new int [5][5];
		int[][] matriz1 = new int[5][5];
		int[][] matrizF = new int[5][5];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				System.out.println("Informe os números da 1ª matriz, linha " + i + " e coluna " + j);
				matriz[i][j] = leia.nextInt();
			}
		}
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz.length; j++) {
				System.out.print("[" + matriz[i][j] + "]" + " ");
			}
			System.out.println("");
		}
		for(int i = 0; i < matriz1.length; i++) {
			for(int j = 0; j < matriz1.length; j++) {
				System.out.println("Informe o número da 2ª matriz, linha" + i + " e coluna " + j);
				matriz1[i][j] = leia.nextInt();
			}
		}
		for(int i = 0; i < matriz1.length; i++) {
			for(int j = 0; j < matriz1.length; j++) {
				System.out.print("[" + matriz1[i][j] + "]" + " ");
			}
			System.out.println("");
		}
		System.out.println("A matriz final é: ");
		
		for(int i = 0; i < matrizF.length; i++) {
			for(int j = 0; j < matrizF.length; j++) {
				matrizF[i][j] = matriz[i][j] + matriz1[i][j];
				System.out.print("[" + matrizF[i][j] + "]" + " ");
			}
			System.out.println("");
		}
	}

}
