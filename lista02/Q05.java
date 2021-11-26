import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);
		
		int horasDeJogo = 0;
		
		System.out.print("- Digite a hora de início: ");
		int horaInicio = scanTeclado.nextInt();
		
		System.out.print("- Digite a hora de término: ");
		int horaTermino = scanTeclado.nextInt();
		
		if (horaInicio == horaTermino) {
			horasDeJogo = 24;
			
		} else if (horaTermino > horaInicio) {
			horasDeJogo = horaTermino - horaInicio;
			
		} else {
			horasDeJogo = (24 - horaInicio) + horaTermino;
			
		}
		
		System.out.format("\n> O jogo durou %d hora(s)", horasDeJogo);

	}

}
