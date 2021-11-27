import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner scanTeclado = new Scanner(System.in);

		String campus;

		System.out.println("Código");
		System.out.println("\n* SC \n* NC \n* CNAT \n* CANG \n* JC");

		System.out.print("\n- Digite o código do campus: ");
		String campusCodigo = scanTeclado.next().toUpperCase();

		switch (campusCodigo) {
			case "SC": {
				campus = "Santa Cruz";

				break;
			}

			case "NC": {
				campus = "Nova Cruz";

				break;
			}

			case "CNAT": {
				campus = "Natal Central";

				break;
			}

			case "CANG": {
				campus = "Canguaretama";

				break;
			}

			case "JC": {
				campus = "João Câmara";

				break;
			}

			default: {
				campus = "Campus inválido";

				break;
			}
		}

		System.out.format("\n> %s: IFRN/%s\n", campusCodigo, campus);

		scanTeclado.close();

	}

}
