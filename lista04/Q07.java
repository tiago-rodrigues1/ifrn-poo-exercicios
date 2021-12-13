import java.util.Random;
import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int[] A = new int[10];
		
		System.out.print("- Digite o valor que você deseja buscar: ");
		int target = scan.nextInt();
		
		int targetIndex = -1;
		
		System.out.println();
		
		for (int i = 0; i < A.length; i++) {
			A[i] = random.nextInt(101);
			
			System.out.printf("[%d] ", A[i]);
		}
		
		for (int i = 0; i < A.length; i++) {
			if (A[i] == target) {
				targetIndex = i;
			}
		}
		
		if (targetIndex != -1) {
			System.out.printf("\n> Encontramos o valor digitado! Posição: %d\n", targetIndex);
			
		} else {
			System.out.println("\n> Não ncontramos o valor digitado!");
		}
		
		scan.close();

	}

}
