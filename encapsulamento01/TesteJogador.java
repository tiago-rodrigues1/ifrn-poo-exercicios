import java.util.Scanner;

public class TesteJogador {
	
	private static String setAndGetDadosJogador1() {
		Scanner scan = new Scanner(System.in);
		Jogador jogador1 = new Jogador();
		
		System.out.print("- Nome: ");
		String jogador1Nome = scan.nextLine();
		
		System.out.print("- Matrícula: ");
		String jogador1Matricula = scan.nextLine();
		
		System.out.print("- Posição: ");
		String jogador1Posicao = scan.nextLine();
		
		System.out.print("- Altura: ");
		double jogador1Altura = scan.nextDouble();
		
		System.out.print("- Peso: ");
		double jogador1Peso = scan.nextDouble();
		
		scan.close();
		
		jogador1.setNome(jogador1Nome);
		jogador1.setMatricula(jogador1Matricula);
		jogador1.setPosicao(jogador1Posicao);
		jogador1.setAltura(jogador1Altura);
		jogador1.setPeso(jogador1Peso);
		
		return jogador1.toString();
	}
	
	private static String setAndGetDadosJogador2() {
		Jogador jogador2 = new Jogador();
		
		jogador2.setNome("Tiago Rodrigues");
		jogador2.setMatricula("123123123123");
		jogador2.setPosicao("Atacante");
		jogador2.setAltura(1.80);
		jogador2.setPeso(60);
		
		StringBuilder str = new StringBuilder();
		
		str.append("> Nome: " + jogador2.getNome() + "\n");
		str.append("> Matrícula: " + jogador2.getMatricula() + "\n");
		str.append("> Posição: " + jogador2.getPosicao() + "\n");
		str.append("> Altura: " + jogador2.getAltura() + "\n");
		str.append("> Peso (kg): " + jogador2.getPeso() + "\n");
		
		return str.toString();
	}

	public static void main(String[] args) {
		String dadosJogador1 = setAndGetDadosJogador1();
		String dadosJogador2 = setAndGetDadosJogador2();
		
		System.out.println();
		
		System.out.println("# Jogador 1:");
		System.out.println(dadosJogador1);
		
		System.out.println("# Jogador 2:");
		System.out.println(dadosJogador2);

	}

}
