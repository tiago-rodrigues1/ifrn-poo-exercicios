import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		char [][] m = new char [2][2];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.println("Digite um valor para [" + i + "] [" + j + "]");
				m[i][j] = leia.next().charAt(0);
			}
			
		}
		for (int i = 1; i >= 0 ; i--) {
			for (int j = 1; j >= 0; j--) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}

	}

	
		
	}


