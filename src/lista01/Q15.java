import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);
		
		final int diasDe1Ano = 365;
		final int diasDe1Mes = 30;
		
		System.out.print("- Digite quantos dias de vida você tem: ");
		int diasDeVida = scanTeclado.nextInt();
		
		int anosDeVida = diasDeVida / diasDe1Ano;
		diasDeVida = diasDeVida % diasDe1Ano;
		
		int mesesDeVida = diasDeVida / diasDe1Mes;
		diasDeVida = diasDeVida % diasDe1Mes;
		
		System.out.print("\n");
		
		System.out.format("> Você tem: %d anos(s), %d mês(es) e %d dia(s) de vida", anosDeVida, mesesDeVida, diasDeVida);

	}

}
