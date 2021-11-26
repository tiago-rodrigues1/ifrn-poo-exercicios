import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);
		
		int contador = 0;
		String situacaoInterrogado;
		
		System.out.print("- Telefonou para a vítima ? [S/N] ");
		char telefonouParaVitima = scanTeclado.next().charAt(0);
		
		System.out.print("- Esteve no local do crime ? [S/N] ");
		char esteveNoLocal = scanTeclado.next().charAt(0);
		
		System.out.print("- Mora perto da vítima ? [S/N] ");
		char moraPertoDaVitima = scanTeclado.next().charAt(0);
		
		System.out.print("- Devia para a vítima ? [S/N] ");
		char deviaParaVitima = scanTeclado.next().charAt(0);
		
		System.out.print("- Já trabalhou para a vítima ? [S/N] ");
		char trabalhouParaVitima = scanTeclado.next().charAt(0);
		
		if (telefonouParaVitima == 'S' || telefonouParaVitima == 's') {
			contador += 1;
		}
		
		if (esteveNoLocal == 'S' || esteveNoLocal == 's') {
			contador += 1;
		}
		
		if (moraPertoDaVitima == 'S' || moraPertoDaVitima == 's') {
			contador += 1;
		}
		
		if (deviaParaVitima == 'S' || deviaParaVitima == 's') {
			contador += 1;
		}
		
		if (trabalhouParaVitima == 'S' || trabalhouParaVitima == 's') {
			contador += 1;
		}
		
		if (contador == 2) {
			situacaoInterrogado = "Suspeita";
			
		} else if (contador == 3 || contador == 4) {
			situacaoInterrogado = "Cúmplice";
			
		} else if (contador == 5) {
			situacaoInterrogado = "Culpada";
			
		} else {
			situacaoInterrogado = "Inocente";
		}
		
		System.out.format("\n> Essa pessoa é: %s", situacaoInterrogado);
	}

}
