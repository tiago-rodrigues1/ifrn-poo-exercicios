import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);
		
		String situacaoAluno = "";
		
		System.out.print("- Digite a 1ª nota: ");
		double nota1 = scanTeclado.nextDouble();
		
		System.out.print("- Digite a 2ª nota: ");
		double nota2 = scanTeclado.nextDouble();
				
		System.out.print("- Digite a 3ª nota: ");
		double nota3 = scanTeclado.nextDouble();
		
		System.out.print("- Digite o número de faltas: ");
		int quantFaltas = scanTeclado.nextInt();
		
		double soma3Notas = nota1 + nota2 + nota3;
		double media = soma3Notas / 3;
		
		boolean isEmRecuperacao = media >= 3 && media < 7;
		
		if (media < 3 || quantFaltas > 7) {
			situacaoAluno = "Reprovado";
			
		} else if (isEmRecuperacao) {
			situacaoAluno = "Recuperão";
			
		} else {
			situacaoAluno = "Aprovado";
		}
		
		System.out.format("\n> Média do aluno: %.1f", media);
		System.out.format("\n> Situação do aluno: %s", situacaoAluno);
		
		if (isEmRecuperacao) {
			System.out.println("\n\n# O aluno está em recuperação\n");
			
			System.out.print("- Digite o valor da 4ª nota: ");
			double nota4 = scanTeclado.nextDouble();
			
			double mediaFinal = (soma3Notas + nota4) / 4;
			
			System.out.println("\n> O aluno " + (mediaFinal >= 5 ? "passou" : "não passou"));
		}

	}

}
