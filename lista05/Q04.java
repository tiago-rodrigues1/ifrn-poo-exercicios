import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int [][] matriz = { {1, 2, 3} , {4, 5, 6} };
		
		int cont = 0;
		int linha = 0;
		int coluna = 0;
		
		System.out.println("Informe um número ");
		int num = leia.nextInt();
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
				if(num == matriz[i][j]) {
					cont++;
					linha = i;
					coluna = j;
					
				}
			}
			System.out.println();
		}
		if(cont == 1) {
			System.out.println("O número está na linha " + linha + " e na coluna " + coluna);
		} else {
			System.out.println("Número não encontrado ");
		}
		
		
	}

}
