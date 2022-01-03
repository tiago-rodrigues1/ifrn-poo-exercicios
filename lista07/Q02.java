/*
 * Alunos: 
 * Gabrielly Beatriz
 * Tiago Rodrigues
 */

import java.util.Scanner;

public class Q02 {

	public static double peri (double raio) {
		return 2*Math.PI*raio;

	}
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o raio do círculo ");
		double raio = leia.nextDouble();
		
		System.out.println("O perímetro do círculo é " + peri(raio));
	}

}
