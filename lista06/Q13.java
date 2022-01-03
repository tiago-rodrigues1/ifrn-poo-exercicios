/* Alunos:
 * Gabrielly Beatriz Brandão Nogueira
 * Tiago Rodrigues dos Santos
 * Vinicius Costa de Oliveira
 * Welida Souza Silva
 */

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("- Número de telefone: ");
		String telefone = scan.next();
		
		if (telefone.length() != 11) {
			System.out.println("Impossível formatar esse número. Por favor, digite um número com 11 caracteres");
			
		} else {
			StringBuilder telefoneFormatado = new StringBuilder();
			telefoneFormatado.append(telefone);
			
			telefoneFormatado
			.insert(0, "(")
			.insert(3, ") ")
			.insert(10, "-");
			
			telefoneFormatado.toString();
			
			System.out.printf("> Número formatado: %s\n", telefoneFormatado);
		}
		
		scan.close();

	}

}
