import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);

		System.out.print("- Temperatura em Celsius (°C): ");
		double temperaturaCelsius = scanTeclado.nextDouble();

		double temperaturaFahrenheit = (9 * temperaturaCelsius + 160) / 5;

		System.out.print("\n");

		System.out.format("> %.1f °C é igual a %.1f °F", temperaturaCelsius, temperaturaFahrenheit);

	}

}
