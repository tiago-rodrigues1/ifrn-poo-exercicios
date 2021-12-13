import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("- Digite o %ḍº valor: ", i + 1);
			arr[i] = scan.nextInt();
		}
		
		System.out.println();
		
		for (int num : arr) {
			System.out.printf("[%d] ", num);
		}
		
		System.out.println();
		
		scan.close();

	}

}
