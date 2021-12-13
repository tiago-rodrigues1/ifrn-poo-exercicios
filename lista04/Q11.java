import java.util.Random;

public class Q11 {

	public static void main(String[] args) {
		  Random random = new Random();
		  
		  int[] arr = new int[20];
		  
		  System.out.println("# Vetor gerado");
		  
		  for (int i = 0; i < arr.length; i++) {
			  arr[i] = random.nextInt(101);
			  
			  System.out.printf("[%d] ", arr[i]);
		  }
		  
		  int cont = arr.length - 1;
		  
		  for (int i = 0; i < arr.length / 2; i++) {
			  int temp = arr[i];
			  arr[i] = arr[cont];
			  arr[cont] = temp;
			  
			  cont--;
		  }
		  
		  System.out.println("\n\n# Vetor com posições trocadas");
		  
		  for (int i : arr) {
			  System.out.printf("[%d] ", i);
		  }
		  
		  System.out.println();

	}

}
