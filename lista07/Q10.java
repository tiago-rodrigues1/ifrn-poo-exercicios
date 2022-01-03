/*
 * Alunos:
 * Gabrielly Beatriz
 * Tiago Rodrigues 
*/

import java.util.Random;

public class Q10 {
	
	static int[] getVetor() {
		Random random = new Random();
		
		int[] v = new int[10];
		
		for (int i = 0; i < v.length; i++) {
			v[i] = random.nextInt(101);
		}
		
		return v;
	}
	
	static int getIndex(int[] v, int key) {
		int index = -1;
		
		for (int i = 0; i < v.length; i++) {
			if (key == v[i]) {
				index = i;
			}
		}
		
		return index;
	}

	public static void main(String[] args) {
		Random random = new Random();
		
		int[] v = getVetor();
		int num = random.nextInt(101);
		int index = getIndex(v, num);
		
		System.out.println("# Vetor gerado");
		
		for (int i : v) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n\n# Valor sendo procurado: " + num);
		
		if (index == -1) {
			System.out.println("\n> O valor gerado não está no vetor");
			
		} else {
			System.out.printf("\n> O valor gerado está no vetor. Na posição %d", index);
		}

	}

}
