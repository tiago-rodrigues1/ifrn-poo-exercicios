import java.util.Random;

public class Q13 {

	public static void main(String[] args) {
		Random random = new Random();
		  
		  int[] arr1 = new int[8];
		  int[] arr2 = new int[arr1.length];
		  
		  for (int i = 0; i < arr1.length; i++) {
			  arr1[i] = random.nextInt(101);
			  arr2[i] = random.nextInt(101);
		  }
		  
		  System.out.println("# Vetores gerados\n");
		  
		  System.out.println("> Array 1");
		  for (int i : arr1) {
			  System.out.printf("[%d] ", i);
		  }
		  
		  System.out.println("\n\n> Array 2");
		  for (int i : arr2) {
			  System.out.printf("[%d] ", i);
		  }
		  
		  for (int i = 0; i < arr1.length; i++) {
			  int temp = arr1[i];
			  arr1[i] = arr2[i];
			  arr2[i] = temp;
		  }
		  
		  System.out.println("\n\n\n# Vetores trocados\n");
		  
		  System.out.println("> Array 1");
		  for (int i : arr1) {
			  System.out.printf("[%d] ", i);
		  }
		  
		  System.out.println("\n\n> Array 2");
		  for (int i : arr2) {
			  System.out.printf("[%d] ", i);
		  }

	}

}
