import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);
		
		System.out.print("- Digite um número: ");
		int num = scanTeclado.nextInt();
		
		System.out.format("\n# Divisores de %d\n", num);
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.format("> %d\n", i);
			}
		}
		
		scanTeclado.close();

	}

}
