import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);
		
		double precoCoxinha = 1.75, precoPastel = 1.5, precoRefrigerante = 2.5;
		
		System.out.print("- Digite quantas coxinhas você deseja: ");
		int quantCoxinhas = scanTeclado.nextInt();
		
		System.out.print("- Digite quantos pastéis você deseja: ");
		int quantPasteis = scanTeclado.nextInt();
		
		System.out.print("- Digite quantos refrigerantes você deseja: ");
		int quantRefrigerantes = scanTeclado.nextInt();
		
		double valorTotalPedido = (quantCoxinhas * precoCoxinha) + (quantPasteis * precoPastel) + (quantRefrigerantes * precoRefrigerante);
		double cincoPorcentoPedido = valorTotalPedido * 0.05;
		
		System.out.print("\n");
		
		System.out.format("> Valor total do seu pedido: R$ %.2f", valorTotalPedido);
		System.out.format("\n> Valor de 5%c do seu pedido: R$ %.2f", ((char) 37),cincoPorcentoPedido);

	}

}
