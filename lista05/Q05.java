/*
 * Dupla: Tiago Rodrigues e Gabrielly Beatriz
*/

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double [][] alunos = new double [4][3];
		double [] mediaP = new double [4];
		double mediaT = 0;
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				switch (j) {
				case 0:
					System.out.println("Informe a nota da primeira prova ");
					alunos[i][0] = leia.nextDouble();
					break;
				case 1:
					System.out.println("Informe a nota da segunda prova ");
					alunos[i][1]= leia.nextDouble();
					break;
				case 2: 
					System.out.println("Informe a nota do trabalho ");
					alunos[i][2] = leia.nextDouble();
					break;	
				}
				System.out.println("");
				
			}
			mediaP[i] = ((alunos[i][0] * 0.4) + (alunos[i][1] * 0.4) + (alunos[i][2] * 0.2));
		}
		
		
		for (int i = 0; i < 4; i++) {
			System.out.println("O aluno " + (i + 1) + "ficou com " + alunos[i][0] + " na primeira prova");
			System.out.println("O aluno " + (i + 1) + "ficou com " + alunos[i][1] + " na segunda prova");
			System.out.println("O aluno " + (i + 1) + "ficou com " + alunos[i][2] + " no trabalho");
			System.out.println("O aluno " + (i + 1) + "ficou com " + mediaP[i] + " na nota final");
			
			if (mediaP[i] >= 9.0) {
				System.out.println("Conceito A");
			}else if (mediaP[i] >= 7.5 && mediaP[i] < 9.0) {
				System.out.println("Conceito B");
			}else if (mediaP[i] >= 6.0 && mediaP[i] < 7.5) {
				System.out.println("Conceito C");
			}else if (mediaP[i] >= 3.0 && mediaP[i] < 6.0) {
				System.out.println("Conceito R (recuperação)");
			}else if (mediaP[i] < 3.0) {
				System.out.println("Conceito D");
			}
			
			System.out.println("");
			mediaT += mediaP[i];
		}
		System.out.println("A média da turma é " + (mediaT/4));
	}

}
