/*
 * Alunos: 
 * Gabrielly Beatriz
 * Tiago Rodrigues
 */

import java.util.Scanner;

public class Q03 {

	public static double area(double raio) {
		return Math.PI*Math.pow(raio, 2);
	}
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o raio do círculo");
		double raio = leia.nextDouble();
		
		System.out.println("A área do círculo é: " + area(raio));

	}
}
