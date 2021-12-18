import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] A = new int[4][4];
		int quantNulos = 0, colsNulas = 0, linhasNulas = 0;
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				System.out.printf("- Digite um valor para [%d][%d]: ", i, j);
				A[i][j] = scan.nextInt();
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				System.out.print(A[i][j] + " ");
				
				if (A[i][j] == 0) {
					quantNulos++;
				}
			}
			
			System.out.println();
			
			if (quantNulos == 4) {
				linhasNulas++;
			}
			
			quantNulos = 0;
		}
		
		for (int j = 0; j < A.length; j++) {
			for (int i = 0; i < A[j].length; i++) {
				if (A[i][j] == 0) {
					quantNulos++;
				}
			}
			
			if (quantNulos == 4) {
				colsNulas++;
			}
			
			quantNulos = 0;
		}
		
		System.out.printf("\n> A matriz tem %d linha(s) nula(s) e %d coluna(s) nula(s)", linhasNulas, colsNulas);
		
		scan.close();

	}

}
