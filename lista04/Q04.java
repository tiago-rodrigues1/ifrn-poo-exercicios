import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double[] notas = new double[30];
		double somaNotas = 0;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("- Digite a nota do %dº aluno: ", i + 1);
			notas[i] = scan.nextDouble();
			
			somaNotas += notas[i];
		}
		
		double mediaTurma = somaNotas / notas.length;
		
		System.out.printf("\n> A média da turma é: %.2f\n\n", mediaTurma);
		
		int acimaMediaCont = 0;
		
		for (double nota : notas) {
			if (nota > mediaTurma) {
				System.out.printf("> %.2f\n", nota);
				acimaMediaCont++;
			}
		}
		
		System.out.printf("\n> %d alunos estão acima da média", acimaMediaCont);
		
		scan.close();

	}

}
