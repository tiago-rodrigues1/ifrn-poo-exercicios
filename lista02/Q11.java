import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);
		
		double precoProduto = 0;
		
		System.out.println("Código      Item       Preço unitário\n");
		System.out.println("200         Chuteira   R$ 159,99");
		System.out.println("301         Meião      R$ 14,99");
		System.out.println("102         Camiseta   R$ 59,99");
		System.out.println("403         Calção     R$ 29,99");
		
		System.out.print("\n- Digite o código do item desejado: ");
		int codigoProduto = scanTeclado.nextInt();
		
		System.out.print("- Digite a quantidade: ");
		int quantidadeProduto = scanTeclado.nextInt();
		
		switch (codigoProduto) {
			case 200: {
				precoProduto = 159.99;
				
				break;
			}
			
			case 301: {
				precoProduto = 14.99;
				
				break;
			}
			
			case 102: {
				precoProduto = 59.99;
				
				break;
			}
			
			case 403: {
				precoProduto = 29.99;
				
				break;
			}

		}
		
		double valorTotal = precoProduto * quantidadeProduto;
		
		System.out.format("\n> O valor total da compra é: R$ %.2f", valorTotal);

	}
}
