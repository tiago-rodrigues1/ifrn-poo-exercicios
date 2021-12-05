import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);

		int quantAprovados = 0, quantReprovados = 0, quantAlunos = 0;

		do {
			System.out.print("- Número da matrícula [9999 p/ sair]: ");
			int matricula = scanTeclado.nextInt();

			if (matricula == 9999) {
				break;
			}

			System.out.format("\n# Notas do aluno %d\n", matricula);

			System.out.print("> Nota 1: ");
			int nota1 = scanTeclado.nextInt();

			System.out.print("> Nota 2: ");
			int nota2 = scanTeclado.nextInt();

			System.out.print("> Nota 3: ");
			int nota3 = scanTeclado.nextInt();

			System.out.print("\n");

			double mediaFinal = ((nota1 * 2) + (nota2 * 3) + (nota3 * 4)) / 9;

			String situacao = "";

			if (mediaFinal >= 5) {
				situacao = "APROVADO";
				quantAprovados++;

			} else {
				situacao = "REPROVADO";
				quantReprovados++;
			}

			System.out.format("> Matrícula %d\n", matricula);
			System.out.format("> Média final: %.2f\n", mediaFinal);
			System.out.format("> Situação: %s\n\n", situacao);

			quantAlunos++;

		} while (true);

		System.out.format("\n> Quantidade de alunos: %d\n", quantAlunos);
		System.out.format("> Quantidade de aprovados: %d\n", quantAprovados);
		System.out.format("> Quantidade de reprovados: %d\n", quantReprovados);

		scanTeclado.close();

	}

}
