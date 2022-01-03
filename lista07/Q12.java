/*
 * Alunos:
 * Gabrielly Beatriz
 * Tiago Rodrigues 
*/

import java.util.Random;

public class Q12 {
	
	static int[][] getMatriz() {
		Random random = new Random();
		
		int[][] m = new int[3][3];
		
		for (int i = 0; i < m.length; i++) {
			for (int j =  0; j < m[i].length; j++) {
				int num = random.nextInt(101);
				
				m[i][j] = num;
			}
		}
		
		return m;
	}
	
	static int getMaiorValor(int[][] m) {
		int maiorValor = m[0][0];
		
		for (int i = 0; i < m.length; i++) {
			for (int j =  0; j < m[i].length; j++) {
				if (m[i][j] > maiorValor) {
					maiorValor = m[i][j];
				}
			}
		}
		
		return maiorValor;
	}

	public static void main(String[] args) {
		int[][] m = getMatriz();
		int maiorValor = getMaiorValor(m);
		
		System.out.println("# Matriz gerada");
		
		for (int i = 0; i < m.length; i++) {
			for (int j =  0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			
			System.out.println();
		}
		
		System.out.printf("\n> O maior valor da matriz é %d\n", maiorValor);

	}

}
