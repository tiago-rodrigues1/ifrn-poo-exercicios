/*
 * Alunos: 
 * Gabrielly Beatriz
 * Tiago Rodrigues
 */

import java.util.Scanner;

public class Q01 {

		static double soma(double num1, double num2 ) {
			return num1 + num2;
		}

		static double sub(double num1, double num2){
			return num1-num2;
		}

		static double multi(double num1, double num2) {
			return num1*num2;
		}

		static double divi(double num1, double num2) {
			return num1/num2;
		}

		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);

			System.out.println("Digite um número: ");
			double num1 = leia.nextDouble();
			System.out.println("Digite um número: ");
			double num2 = leia.nextDouble();

			System.out.println("A soma dos números é: " + soma(num1, num2));
			System.out.println("A subtração dos números é: " + sub(num1, num2));
			System.out.println("A multiplicação dos némeros é: " + multi(num1, num2));
			System.out.println("A divisão dos números é: " + divi(num1, num2));

	}

}
