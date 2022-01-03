/*
 * Alunos:
 * Gabrielly Beatriz
 * Tiago Rodrigues 
*/

import java.util.Scanner;

public class Q05 {
	
	static boolean isPrimo(int n) {
		boolean isPrimo = false;
		
		int quantDivisores = 0;
		
		if (n == 2) {
			isPrimo = true;
			
		} else {
			if (n % 2 != 0) {
				for (int i = 1; i <= n; i++) {
					if (n % i == 0) {
						quantDivisores++;
					}
				}
				
				isPrimo = quantDivisores == 2;
			}
		}
		
		return isPrimo;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("- Digite um número: ");
		int num = scan.nextInt();
		
		boolean isPrimo = isPrimo(num);
		
		System.out.printf("> %d %s um número primo\n", num, (isPrimo ? "é" : "não é"));
		
		scan.close();
		

	}

}
