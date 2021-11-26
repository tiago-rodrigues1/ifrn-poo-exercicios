import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);
		
		double precoApple;
		
		System.out.print("- Digite quantas maçãs foram compradas: ");
		int quantidadeApples = scanTeclado.nextInt();
		
		if (quantidadeApples >= 12) {
			precoApple = 0.25;
			
		} else {
			precoApple = 0.3;
		}
		
		double valorCompra = quantidadeApples * precoApple;
		
		System.out.format("\n> Valor total da compra: R$ %.2f", valorCompra);

	}

}
