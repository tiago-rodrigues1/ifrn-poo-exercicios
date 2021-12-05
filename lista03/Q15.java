import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);

		int somaDosTermos = 1;
		String sequencia = "";

		System.out.print("- Digite quantos valores de Fibonacci você quer: ");
		int quantValores = scanTeclado.nextInt();

		if (quantValores == 1) {
			sequencia += "0";

		} else if (quantValores == 2) {
			sequencia += "0 1";
			somaDosTermos = 1;

		} else {
			int antesDoAnterior = 0;
			int anterior = 1;

			sequencia += "0 1";

			for (int i = 0; i < quantValores - 2; i++) {
				int termoAtual = antesDoAnterior + anterior;

				sequencia += " " + termoAtual;

				int temp = anterior;
				anterior = termoAtual;
				antesDoAnterior = temp;

				somaDosTermos += termoAtual;
			}
		}

		System.out.format("\n> O(s) %d primeiro(s) número(s) da sequência de fibonacci:\n", quantValores);
		System.out.println("\n" + sequencia + "\n");
		System.out.format("> Soma dos termos: %d\n", somaDosTermos);

		scanTeclado.close();

	}

}
