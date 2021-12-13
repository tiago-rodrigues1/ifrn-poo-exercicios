import java.util.Random;

public class Q09 {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[] horasAcesso = new int[90];
		
		for (int i = 0; i < horasAcesso.length; i++) {
			horasAcesso[i] = random.nextInt(311);
		}
		
		int quantMaisDe100Horas = 0, quantMenosDe10Horas = 0;
		
		for (int hora : horasAcesso) {
			System.out.printf("[%d]\n", hora);
			
			if (hora > 100) {
				quantMaisDe100Horas++;
				
			} else if (hora < 10) {
				quantMenosDe10Horas++;
			}
		}
		
		System.out.printf("\n> Nº de alunos que acessaram mais de 100 horas: %d\n", quantMaisDe100Horas);
		System.out.printf("> Nº de alunos que acessaram menos de 10 horas: %d\n", quantMenosDe10Horas);

	}

}
