import java.util.Scanner;
import java.util.Random;

public class Q08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		System.out.print("- Digite quantas o vezes o dado será lançado: ");
		int quantLancamentos = scan.nextInt();
		
		int[] ocorrencias = new int[7];
		
		for (int i = 0; i < quantLancamentos; i++) {
			int lancamento = random.nextInt(6) + 1;
			
			ocorrencias[lancamento] += 1;
		}
		
		System.out.println();
		
		for (int i = 1; i < ocorrencias.length; i++) {
			System.out.printf("> Lado %d: %d vezes\n", i, ocorrencias[i]);
		}
		
		scan.close();

	}

}
