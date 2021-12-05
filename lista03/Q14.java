import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);

		double total = 0;

		System.out.println("Espeficação             Preço unitário\n");
		System.out.println("100 Cachorro quente     R$ 1,10");
		System.out.println("101 Bauru simples       R$ 1,30");
		System.out.println("102 Bauru c/ ovo        R$ 1,50");
		System.out.println("103 Hamburguer          R$ 1,10");
		System.out.println("104 Cheeseburger        R$ 1,30");
		System.out.println("105 Refrigerante        R$ 1,00");

		do {
			double precoProduto = 0;
			int quantidade = 0;

			System.out.print("\n- Código do produto [-1 p/ sair]: ");
			int codigoProduto = scanTeclado.nextInt();

			if (codigoProduto == -1) {
				break;
			}

			switch (codigoProduto) {
				case 100: {
					System.out.print("- Quantidade de Cachorro quente: ");
					quantidade = scanTeclado.nextInt();

					precoProduto = 1.1;

					break;
				}

				case 101: {
					System.out.print("- Quantidade de Bauru simples: ");
					quantidade = scanTeclado.nextInt();

					precoProduto = 1.3;

					break;
				}

				case 102: {
					System.out.print("- Quantidade de Bauru c/ ovo: ");
					quantidade = scanTeclado.nextInt();

					precoProduto = 1.5;

					break;
				}

				case 103: {
					System.out.print("- Quantidade de Hamburger: ");
					quantidade = scanTeclado.nextInt();

					precoProduto = 1.1;

					break;
				}

				case 104: {
					System.out.print("- Quantidade de Cheeseburger: ");
					quantidade = scanTeclado.nextInt();

					precoProduto = 1.3;

					break;
				}

				case 105: {
					System.out.print("- Quantidade de Refrigerante: ");
					quantidade = scanTeclado.nextInt();

					precoProduto = 1.0;

					break;
				}

			}

			double subtotal = precoProduto * quantidade;

			total += subtotal;

		} while (true);

		System.out.format("\n> Preço total do seu pedido: R$ %.2f\n", total);

		scanTeclado.close();

	}

}
