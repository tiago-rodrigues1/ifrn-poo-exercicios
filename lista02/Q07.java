import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);
		
		double aumentoPorFaixa;
		
		System.out.print("- Digite o salário: ");
		double salario = scanTeclado.nextDouble();
		
		if (salario >= 1500 && salario < 1750) {
			aumentoPorFaixa = 12 / 100.0; // 12%
			
		} else if (salario >= 1750 && salario < 2000) {
			aumentoPorFaixa = 10 / 100.0; // 10%
			
		} else if (salario >= 2000 && salario < 3000) {
			aumentoPorFaixa = 7.5 / 100.0; // 7.5%
			
		} else if (salario >= 3000) {
			aumentoPorFaixa = 5 / 100.0; // 5%
			
		} else {
			aumentoPorFaixa = 15 / 100.0; // 15%
		}
		
		double novaSalario = salario + (salario * aumentoPorFaixa);
		
		System.out.format("\n> O novo salário é: R$ %.2f", novaSalario);

	}

}
