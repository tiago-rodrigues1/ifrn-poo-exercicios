import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);
		
		int i = 1;
		int fatorial = 1;
		
		System.out.print("- Digite um número: ");
		int num = scanTeclado.nextInt();
		
		if (num < 0) {
			System.out.println("> Número inválido! Digite um número maior que 0");
			
		} else {
			if (num == 0 || num == 1) {
				fatorial = 1;
				
			} else {
				while (i <= num) {
					fatorial *= i;
					
					i++;
				}
			}
			
			System.out.format("\n> O fatorial de %d (%d!) é igual a %d\n", num, fatorial);
		}
		
		scanTeclado.close();

	}

}
