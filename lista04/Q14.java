import java.util.Random;

public class Q14 {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[] arr1 = new int[10];
		int[] arr2 = new int[arr1.length];
		int[] produtos = new int[arr1.length];
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = random.nextInt(101);
			arr2[i] = random.nextInt(101);
			
			produtos[i] = arr1[i] * arr2[i];
		}
		
		System.out.println();
		for (int i = 0; i < arr1.length; i++) {
			System.out.printf("[%d] x [%d] = [%d]\n", arr1[i], arr2[i], produtos[i]);
		}

	}

}
