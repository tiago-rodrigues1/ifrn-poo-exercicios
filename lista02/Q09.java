import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);
		
		double valorMulta;
		
		System.out.print("- Digite a velocidade máxima permitida: ");
		double velocidadeMax = scanTeclado.nextDouble();
		
		System.out.print("- Digite a velocidade que o motorista estava: ");
		double velocidadeMotorista = scanTeclado.nextDouble();
		
		double excessoVelocidade = velocidadeMotorista - velocidadeMax;
		
		if (excessoVelocidade <= 10) {
			valorMulta = 50;
			
		} else if (excessoVelocidade >= 11 && excessoVelocidade <= 30) {
			valorMulta = 100;
			
		} else {
			valorMulta = 200;
		}
		
		System.out.format("\n> O valor da multa será: R$ %.2f", valorMulta);

	}

}
