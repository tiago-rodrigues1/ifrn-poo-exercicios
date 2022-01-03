package lista06;

/* Alunos:
 * Gabrielly Beatriz Brandão Nogueira
 * Tiago Rodrigues dos Santos
 * Vinicius Costa de Oliveira
 * Welida Souza Silva
 */

public class Q11 {

	public static void main(String[] args) {
		/* Utilize a classe StringBuilder e remova a palavra “CADA” de ABRACADABRA.
		 * Imprima o que sobrou da palavra na tela.
		 */
		
		String palavra = "ABRACADABRA";
		
		StringBuilder palavra1 = new StringBuilder();
		
		palavra1.append(palavra);
		
		palavra1.delete(4, 7);
		
		palavra.toString();
		
		System.out.println("Antes: " + palavra);
		System.out.println("Depois: " + palavra1);
	}

}
