import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);
		
		System.out.print("- Digite 1º o número: ");
		double num1 = scanTeclado.nextDouble();
		
		System.out.print("- Digite 2º o número: ");
		double num2 = scanTeclado.nextDouble();
		
		System.out.print("- Digite 3º o número: ");
		double num3 = scanTeclado.nextDouble();
		
		double maior;
		double meio = 0;
		double menor;
		
		if (num1 > num2 && num1 > num3) {
			maior = num1;
			
		} else if (num2 > num1 && num2 > num3) {
			maior = num2;
			
		} else {
			maior = num3;
		}
		
		if (num1 < num2 && num1 < num3) {
			menor = num1;
			
		} else if (num2 < num1 && num2 < num3) {
			menor = num2;
			
		} else {
			menor = num3;
		}
		
		if (maior != num1 && menor != num1) {
			meio = num1;
			
		} else if (maior != num2 && menor != num2) {
			meio = num2;
			
		} else {
			meio = num3;
		}
		
		System.out.format("\n> %.2f, %.2f, %.2f", menor, meio, maior);

	}

}
