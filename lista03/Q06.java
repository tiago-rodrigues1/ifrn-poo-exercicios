public class Q06 {

	public static void main(String[] args) {
		
		int acm = 0, contador = 0;
		
		for (int i = 12; i <= 873; i += 2) {
			acm += i;
			contador++;
		}
		
		double media = (double) acm / contador;
		
		System.out.format("> A média dos números pares entre 12 e 873 é: %.2f\n", media);

	}

}
