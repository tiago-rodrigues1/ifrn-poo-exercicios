
public class Q10 {

	public static void main(String[] args) {
		int primosContador = 1, i = 3;
		int termo7 = 0, termo21 = 0;
		
		while (true) {
			int quantDivisores = 0;
			
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					quantDivisores++;
				}
			}
			
			boolean isPrimo = quantDivisores == 2;
			
			if (isPrimo) {
				primosContador++;
			}
			
			if (primosContador == 7) {
				termo7 = i;
			}
			
			if (primosContador == 21) {
				termo21 = i;
				
				break;
			}
			
			i += 2;
		}
		
		int diferenca = termo21 - termo7;
		
		System.out.format("> 7º termo: %d\n", termo7);
		System.out.format("> 21º termo: %d\n", termo21);
		System.out.format("> %d - %d = %d", termo21, termo7, diferenca);

	}

}
