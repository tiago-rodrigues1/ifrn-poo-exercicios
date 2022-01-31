import java.util.Scanner;
import java.util.ArrayList;

public class TesteDoador {
	private static boolean isTipoValido(String tipo) {
		ArrayList<String> tiposSanguineosValidos = new ArrayList<String>();
		
		tiposSanguineosValidos.add("A+");
		tiposSanguineosValidos.add("B+");
		tiposSanguineosValidos.add("AB+");
		tiposSanguineosValidos.add("O+");
		tiposSanguineosValidos.add("A-");
		tiposSanguineosValidos.add("B-");
		tiposSanguineosValidos.add("AB-");
		tiposSanguineosValidos.add("O-");
		
		return tiposSanguineosValidos.contains(tipo);
	}
	
	private static String setAndGetDadosDoador1() {
		Scanner scan = new Scanner(System.in);
		Doador doador1 = new Doador();
		
		System.out.println("===== DOE SANGUE =====");
		
		System.out.print("- Nome: ");
		String doador1Nome = scan.nextLine();
		
		System.out.print("- Idade: ");
		int doador1Idade = scan.nextInt();
		
		System.out.print("- Tipo Sanguíneo: ");
		String doador1TipoSanguineo = scan.next().toUpperCase();
		
		System.out.print("- Peso: ");
		double doador1Peso = scan.nextDouble();
		
		scan.close();
		
		if (isTipoValido(doador1TipoSanguineo)) {
			doador1.setNome(doador1Nome);
			doador1.setIdade(doador1Idade);
			doador1.setTipoSanguineo(doador1TipoSanguineo);
			doador1.setPeso(doador1Peso);
		} else {
			System.out.println("\n> Tipo sanguíneo inválido");
		}
		
		return doador1.toString();
	}
	
	private static String setAndGetDadosDoador2() {
		Doador doador2 = new Doador();
		
		doador2.setNome("Tiago Rodrigues");
		doador2.setIdade(17);
		doador2.setTipoSanguineo("A+");
		doador2.setPeso(60);
		
		StringBuilder str = new StringBuilder();
		
		str.append("> Nome: " + doador2.getNome() + "\n");
		str.append("> Idade: " + doador2.getIdade() + "\n");
		str.append("> Tipo sanguíneo: " + doador2.getTipoSanguineo() + "\n");
		str.append("> Peso (kg): " + doador2.getPeso() + "\n");
		
		return str.toString();
	}

	public static void main(String[] args) {
		String dadosDoador1 = setAndGetDadosDoador1();
		String dadosDoador2 = setAndGetDadosDoador2();
		
		System.out.println();
		
		System.out.println("# Doador 1:");
		System.out.println(dadosDoador1);
		
		System.out.println("# Doador 2:");
		System.out.println(dadosDoador2);

	}

}
