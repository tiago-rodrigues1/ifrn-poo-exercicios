/* Alunos:
 * Gabrielly Beatriz Brandão Nogueira
 * Tiago Rodrigues dos Santos
 * Vinicius Costa de Oliveira
 * Welida Souza Silva
 */
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palavra = "Aprender JAVA é muito bom!.";	
		
		
		String fim = (palavra.replaceAll("\\s+",""));
		
		System.out.println("Com os espaços removidos a frase fica: " + fim);
	}

}
