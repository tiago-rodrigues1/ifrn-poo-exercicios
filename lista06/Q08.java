package lista06;

/* Alunos:
 * Gabrielly Beatriz Brandão Nogueira
 * Tiago Rodrigues dos Santos
 * Vinicius Costa de Oliveira
 * Welida Souza Silva
 */

public class Q08 {
	
	public static void main(String[] args) {
		// Crie um vetor que armazene cada palavra da frase “Aprender JAVA é muito bom!”.
		
		String frase = "Aprender JAVA é muito bom!";
		
		System.out.println(frase);
		
		String[] palavras = frase.split(" ");
		
		int ultimaPalavraIndex = palavras.length - 1;
		
		palavras[ultimaPalavraIndex] = palavras[ultimaPalavraIndex].replace("!", "");
		
		System.out.println("\nvetor com as palavras da frase: ");		
		for(int i = 0; i < palavras.length; i++) {
			System.out.printf("palavras[%d] = %s\n", i, palavras[i]);
		}
	}

}
