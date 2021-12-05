
public class Q09 {

	public static void main(String[] args) {
		int i = 1;

		do {
			System.out.format("\n# Tabuada do %d\n\n", i);

			for (int j = 1; j <= 10; j++) {
				int produto = i * j;
				System.out.format("> %d x %d = %d\n", i, j, produto);
			}

			i++;
		} while (i <= 10);

	}

}
