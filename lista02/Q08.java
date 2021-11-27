import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);

		final int PRECO_DIARIA = 130;
		double taxaDeServicos;

		System.out.print("- Digite seu nome: ");
		String nome = scanTeclado.nextLine();

		System.out.print("- Digite quantas diárias você permanecerá no hotel: ");
		int quantDiarias = scanTeclado.nextInt();

		if (quantDiarias < 2) {
			taxaDeServicos = 15 / 100.0; // 15%

		} else if (quantDiarias >= 2 && quantDiarias <= 3) {
			taxaDeServicos = 10 / 100.0; // 10%

		} else if (quantDiarias >= 4 && quantDiarias <= 7) {
			taxaDeServicos = 7.5 / 100.0; // 7.5%

		} else {
			taxaDeServicos = 7 / 100.0; // 7%
		}

		double precoTotal = (PRECO_DIARIA * quantDiarias) + (PRECO_DIARIA * taxaDeServicos);

		System.out.format("\n> %s, você pagará R$ %.2f pela hospedagem\n", nome, precoTotal);

		scanTeclado.close();
	}

}
