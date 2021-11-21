import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);

		System.out.print("- Digite a nota da prova escrita: ");
		double notaProvaEscrita = scanTeclado.nextDouble();

		System.out.print("- Digite a nota da prova de desempenho: ");
		double notaProvaDesempenho = scanTeclado.nextDouble();

		System.out.print("- Digite a nota da prova de títulos: ");
		double notaProvaTitulos = scanTeclado.nextDouble();

		double notaFinal = (notaProvaEscrita * 0.4) + (notaProvaDesempenho * 0.4) + (notaProvaTitulos * 0.2);

		System.out.print("\n");

		System.out.format("> A nota final desse candidato é: %.2f", notaFinal);
	}

}
