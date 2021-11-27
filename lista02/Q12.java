import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);

		String diaSemana = "";

		System.out.print("- Digite um número de 1 a 7: ");
		int diaNumero = scanTeclado.nextInt();

		switch (diaNumero) {
			case 1: {
				diaSemana = "Domingo";

				break;
			}

			case 2: {
				diaSemana = "Segunda";

				break;
			}

			case 3: {
				diaSemana = "Terça";

				break;
			}

			case 4: {
				diaSemana = "Quarta";

				break;
			}

			case 5: {
				diaSemana = "Quinta";

				break;
			}

			case 6: {
				diaSemana = "Sexta";

				break;
			}

			case 7: {
				diaSemana = "Sábado";

				break;
			}

			default: {
				diaSemana = "Dia Inválido";
			}
		}

		System.out.format("\n> %d corresponde a %s\n", diaNumero, diaSemana);

		scanTeclado.close();

	}

}
