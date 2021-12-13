import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("- Digite o %dº valor: ", i + 1);
			arr[i] = scan.nextInt();
		}
		
		System.out.println();
		
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.printf("[%d] ", arr[i]);
		}
		
		System.out.println();
		
		scan.close();

	}

}
