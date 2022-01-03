/*
 * Alunos: 
 * Gabrielly Beatriz
 * Tiago Rodrigues
 */

import java.util.Scanner;

public class Q07 {
	public static void conteudo(char[] vetor) {
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + "|");
		}
	}

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do vetor");
		int tam = leia.nextInt();
		
		char vetor[] = new char[tam];	
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite 1 caractere:");
			vetor[i] = leia.next().charAt(0);
		}
		
		conteudo(vetor);

	}

}
