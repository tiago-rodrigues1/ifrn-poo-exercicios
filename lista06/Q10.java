/* Alunos:
 * Gabrielly Beatriz Brandão Nogueira
 * Tiago Rodrigues dos Santos
 * Vinicius Costa de Oliveira
 * Welida Souza Silva
 */

public class Q10 {

	public static void main(String[] args) {
		String frase = "Aprender JAVA é muito bom!";
		String[] palavras = frase.split(" ");
		
		int ultimaPalavraIndex = palavras.length - 1;
		
		palavras[ultimaPalavraIndex] = palavras[ultimaPalavraIndex].replace("!", "");
		
		StringBuilder novaFrase = new StringBuilder();
		
		for (int i = 0; i < palavras.length; i++) {
			novaFrase.append(palavras[i]);
			
			if (i != palavras.length - 1) {
				novaFrase.append(" ");
			}
		}
		
		novaFrase.toString();
		
		System.out.println(novaFrase);

	}

}
