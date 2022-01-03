/* Alunos:
 * Gabrielly Beatriz Brandão Nogueira
 * Tiago Rodrigues dos Santos
 * Vinicius Costa de Oliveira
 * Welida Souza Silva
 */

public class Q03 {

	public static void main(String[] args) {
		String palavra = "ABRACADABRA";
		StringBuilder str = new StringBuilder();
		
		for (int i = palavra.length() - 1; i >= 0 ; i--) {
			str.append(palavra.charAt(i));
		}
		
		str.toString();
		
		System.out.println(str);

	}

}
