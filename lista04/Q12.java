import java.util.Random;

public class Q12 {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[] arr = new int[10];
		double[] cubos = new double[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(16);
			cubos[i] = Math.pow(arr[i], 3);
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("> %d ao cubo = %.0f\n", arr[i], cubos[i]);
		}

	}

}
