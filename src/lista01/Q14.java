import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);
		
		System.out.println("# PLANO 1");
		
		System.out.print("- Digite o valor de x: ");
		double pontoX1 = scanTeclado.nextDouble();
		
		System.out.print("- Digite o valor de y: ");
		double pontoY1 = scanTeclado.nextDouble();
		
		System.out.print("\n");
		
		System.out.println("# PLANO 2");
		
		System.out.print("- Digite o valor de x: ");
		double pontoX2 = scanTeclado.nextDouble();
		
		System.out.print("- Digite o valor de y: ");
		double pontoY2 = scanTeclado.nextDouble();
		
		double deltaXAoQuadrado = Math.pow((pontoX2 - pontoX1), 2);
		double deltaYAoQuadrado = Math.pow((pontoY2 - pontoY1), 2);
		
		double distancia = Math.sqrt(deltaXAoQuadrado + deltaYAoQuadrado);
		
		System.out.print("\n");
		
		System.out.format("> A distância entre os pontos é %.4f", distancia);

	}

}
