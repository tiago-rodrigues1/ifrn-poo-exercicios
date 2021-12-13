import java.util.Random;

public class Q06 {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(101);
			
			System.out.printf("[%d] ", arr[i]);
		}
		
		int maior = arr[0], menor = arr[9];
		int posicaoMaior = 0, posicaoMenor = 9;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maior) {
				maior = arr[i];
				posicaoMaior = i;
			}
			
			if (arr[i] < menor) {
				menor = arr[i];
				posicaoMenor = i;
			}
		}
		
		System.out.printf("\n\n> Maior valor: %d | Posição: %d", maior, posicaoMaior);
		System.out.printf("\n> Menor valor: %d: | Posição: %d\n", menor, posicaoMenor);
	}

}
