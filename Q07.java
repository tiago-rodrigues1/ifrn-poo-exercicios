import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int matrizLength = 5;
		
		int[][] m1 = new int[matrizLength][matrizLength];
		int[][] m2 = new int[matrizLength][matrizLength];
		
		int[][] diferencas = new int[matrizLength][matrizLength];
		
		System.out.println("# Preencha a matriz 01\n");
		
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				System.out.printf("- Digite o valor de [%d][%d]: ", i, j);
				m1[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("\n# Preencha a matriz 02\n");
		
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[i].length; j++) {
				System.out.printf("- Digite o valor de [%d][%d]: ", i, j);
				m2[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("\n# Diferença das matrizes\n");
		
		for (int i = 0; i < diferencas.length; i++) {
			for (int j = 0; j < diferencas[i].length; j++) {
				diferencas[i][j] = m2[i][j] - m1[i][j];
				
				System.out.print(diferencas[i][j] + " ");
			}
			
			System.out.println();
		}
		
		scan.close();
		

	}

}
