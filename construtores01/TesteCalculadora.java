/*
 * Gabrielly Beatriz Brandão Nogueira
 * Tiago Rodrigues dos Santos 
*/

package atvdAula17;

import java.util.Scanner;

public class TesteCalculadora extends Calculadora {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Calculadora c = new Calculadora();

		System.out.println("Digite um n�mero: ");
		double n1 = leia.nextDouble();
		System.out.println("Digite um segundo n�mero: ");
		double n2 = leia.nextDouble();

		System.out.println("A soma dos dois n�meros � " + c.soma(n1, n2));
		System.out.println("A subtra��o dos dois n�meros � " + c.subtracao(n1, n2));
		System.out.println("A multiplica��o dos dois n�meros � " + c.multiplicacao(n1, n2));
		System.out.println("A divis�o dos dois n�meros � " + c.divisao(n1, n2));

	}

}
