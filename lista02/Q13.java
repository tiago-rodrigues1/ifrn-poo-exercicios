import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);

		String categoria;

		System.out.print("- Digite o nome do atleta: ");
		String nome = scanTeclado.nextLine();

		System.out.print("- Digite a idade atleta: ");
		int idade = scanTeclado.nextInt();

		if (idade >= 5 && idade <= 10) {
			categoria = "Infantil";

		} else if (idade >= 11 && idade <= 15) {
			categoria = "Juvenil";

		} else if (idade >= 16 && idade <= 20) {
			categoria = "Júnior";

		} else if (idade >= 21 && idade <= 25) {
			categoria = "Profissional";

		} else {
			categoria = "Inválida";

		}

		System.out.format("\n> Nome: %s", nome);
		System.out.format("\n> Idade: %d", idade);
		System.out.format("\n> Categoria: %s\n", categoria);

		scanTeclado.close();

	}

}
