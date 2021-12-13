import java.util.Random;

public class Q05 {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(101);
			
			System.out.printf("[%d] ", arr[i]);
		}
		
		System.out.println();
		
		int maior = arr[0];
		int posicaoMaior = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maior) {
				maior = arr[i];
				posicaoMaior = i;
			}
		}
		
		System.out.printf("\n> Maior valor: %d", maior);
		System.out.printf("\n> Posição: %d\n", posicaoMaior);

	}

}
