package lista06;

import java.util.Scanner;

/* Alunos:
 * Gabrielly Beatriz Brand�o Nogueira
 * Tiago Rodrigues dos Santos
 * Vinicius Costa de Oliveira
 * Welida Souza Silva
 */

public class Q12 {

	public static void main(String[] args) {
		/* Escreva um programa em Java que l� uma String do teclado e produz como resultado uma nova
		 * String com as iniciais de cada palavra contida no texto original. Por exemplo, o resultado
		 * de Programar n�o � moleza � Pn�m.
		 */
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		String frase = scn.nextLine();
		
		String[] palavras = frase.split(" ");
		
		System.out.println("A frase em sigla fica: ");
		for(int i = 0; i < palavras.length; i++) {
			System.out.print(palavras[i].charAt(0));
		}
		scn.close();

	}

}
