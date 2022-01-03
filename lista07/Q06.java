/*
 * Alunos:
 * Gabrielly Beatriz
 * Tiago Rodrigues 
*/

import java.util.Scanner;

public class Q06 {
	
	static int getFatorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
			
		} else {
			return n * getFatorial(n-1);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("- Digite um número: ");
		int num = scan.nextInt();
		
		int fatorial = getFatorial(num);
		
		System.out.printf("> %d! = %d\n", num, fatorial);
		
		scan.close();

	}

}
