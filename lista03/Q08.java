import java.util.Scanner;
import java.util.Random;

public class Q08 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);
		Random randomNum = new Random();
		
		int numSorteado = randomNum.nextInt(101);
		
		System.out.println("# Advinhe o número! [MIN = 0; MAX = 100]");
		System.out.println("# Digite -1 para sair");
		
		do {
			System.out.print("\n- Digite um número: ");
			int numDigitado = scanTeclado.nextInt();
			
			if (numDigitado == -1) {
				System.out.println("\n> Obrigado por jogar!");
				break;
				
			} else if (numDigitado == numSorteado) {
				System.out.println("\n> Parabéns! Você acertou o número!");
				break;
				
			} else {
				String estadoTentativa = numDigitado > numSorteado ? "maior" : "menor";
				System.out.format("\n> O número que você escolheu é %s que o número sorteado\n", estadoTentativa);
				
			}
			
			
			
		} while (true);
		
		scanTeclado.close();

	}

}
