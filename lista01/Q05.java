/*
 * Autor: Tiago Rodrigues dos Santos
 * Data: 21/11/2021
 * Descrição: Lê uma temperatura em graus Celsius e a imprime convertida em Fahrenheit
*/

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);

		System.out.print("- Temperatura em Celsius (°C): ");
		double temperaturaCelsius = scanTeclado.nextDouble();

		double temperaturaFahrenheit = (9 * temperaturaCelsius + 160) / 5;

		System.out.print("\n");

		System.out.format("> %.1f °C é igual a %.1f °F \n", temperaturaCelsius, temperaturaFahrenheit);

	}

}
