/*
 * Alunos: 
 * Gabrielly Beatriz
 * Tiago Rodrigues
 */

import java.util.Scanner;

public class Q04 {

	public static double divi(double num) {
		int cont = 0;

		for (int i = 1; i <= num; i++) {
			if(num % i == 0){
				cont++;
			}
		}
		return cont;
	}

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número positivo:");
		double num = leia.nextDouble();
		
		System.out.println("Esse número tem " + divi(num) + " divisores");
	}

}
