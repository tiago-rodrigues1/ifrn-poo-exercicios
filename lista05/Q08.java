import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] m = new int[6][6];
		int[] diagonalPrincipalElementos = new int[6];
		int[] linhasParesElementos = new int[12];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("- Digite um valor para [%d][%d]", i, j);
				m[i][j] = scan.nextInt();
				
				if (i == 2) {
					linhasParesElementos[j] = m[i][j];
					
				} else if (i == 4) {
					linhasParesElementos[j + 6] = m[i][j];
				}
				
				if (i == j) {
					diagonalPrincipalElementos[i] = m[i][j];
				}
			}
		}
		
		System.out.println("\n# Elementos da diagonal principal: ");
		for (int i : diagonalPrincipalElementos) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n# Elementos das linhas pares: ");
		for (int i : linhasParesElementos) {
			System.out.print(i + " ");
		}
		
		scan.close();

	}

}
