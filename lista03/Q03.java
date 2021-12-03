import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);
		
		int acm = 0, i = 0;
		char resp;
		
		do {
			System.out.print("- Digite a idade do aluno: ");
			int idade = scanTeclado.nextInt();
			
			acm += idade;
			
			i++;
			
			System.out.print("\n- Deseja continuar ? [s/n]: ");
			resp = scanTeclado.next().charAt(0);
			
			System.out.print("\n");
			
		} while (resp == 's' || resp == 'S');
		
		double mediaIdades = (double) acm / i;
		
		System.out.format("\n> Idades cadastradas: %d\n", i);
		System.out.format("> Média das idades: %.2f", mediaIdades);
		
		scanTeclado.close();

	}

}
