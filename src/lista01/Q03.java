/*
* Autor: Tiago Rodrigues dos Santos
* Data: 21/11/2021
* Descrição: converte uma quantidade de segundos dada pelo usuário e converte em dias, horas, minutos e segundos 
*/

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);

		int segundosDeUmMinuto = 60;
		int segundosDeUmaHora = segundosDeUmMinuto * 60;
		int segundosDeUmDia = segundosDeUmaHora * 24;
		
		System.out.print("- Digite o numero de segundos: ");
		int segundosUsuario = scanTeclado.nextInt();
		
		int segundosUsuarioParaDias = (int) Math.floor(segundosUsuario / segundosDeUmDia);
		segundosUsuario -= segundosUsuarioParaDias * segundosDeUmDia;
		
		int segundosUsuarioParaHoras = (int) Math.floor(segundosUsuario / segundosDeUmaHora);
		segundosUsuario -= segundosUsuarioParaHoras * segundosDeUmaHora;
		
		int segundosUsuarioParaMinutos = (int) Math.floor(segundosUsuario / segundosDeUmMinuto);
		segundosUsuario -= segundosUsuarioParaMinutos * segundosDeUmMinuto;
		
		int segundosRestantes = segundosUsuario;
		
		System.out.print("\n");
		
		System.out.printf("> %d dias, %d horas, %d minutos, %d segundos", segundosUsuarioParaDias, segundosUsuarioParaHoras, segundosUsuarioParaMinutos, segundosRestantes);

		
		
	}

}
