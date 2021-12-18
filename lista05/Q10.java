import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numLinhas = 5, numCols = 7;
		
		double[][] m = new double[numLinhas][numCols];
		
		int quantNegativos = 0;
		double produto = 1;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.printf("- Digite um valor para [%d][%d]: ", i, j);
				m[i][j] = scan.nextInt();
				
				if (m[i][j] < 0) {
					quantNegativos++;
					
				} else if (m[i][j] != 0) {
					produto *= m[i][j];
				}
			}
		}
		
		double[] maioresDasLinhas = new double[5];
		
		for (int i = 0; i < m.length; i++) {
			double maiorDaLinha = m[i][0];
			
			for (int j = 0; j < m[i].length; j++) {
				
				if (m[i][j] > maiorDaLinha) {
					maiorDaLinha = m[i][j];
				}
				
			}
			
			maioresDasLinhas[i] = maiorDaLinha;
		}
		
		double[] maioresDasColunas = new double[7];
		double[] mediasCols = new double[7];
		
		for (int j = 0; j < numCols; j++) {
			double maiorDaColuna = m[0][j];
			double soma = 0;
			
			for (int i = 0; i < numLinhas; i++) {
				soma += m[i][j];
				
				if (m[i][j] > maiorDaColuna) {
					maiorDaColuna = m[i][j];
				}
				
			}
			
			maioresDasColunas[j] = maiorDaColuna;
			
			double media = soma / 7;
			mediasCols[j] = media;
		}
		
		System.out.println();
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			
			System.out.println();
		}
		
		System.out.println("\n# Maior elemento de cada linha");
		
		for (int i = 0; i < maioresDasLinhas.length; i++) {
			System.out.printf("> Linha %d: %.2f\n", i, maioresDasLinhas[i]);
		}
		
		System.out.println("\n# Maior elemento de cada coluna");
		
		for (int i = 0; i < maioresDasColunas.length; i++) {
			System.out.printf("> Coluna %d: %.2f\n", i, maioresDasColunas[i]);
		} 
		
		System.out.println("\n# Média dos elementos de cada coluna");
		
		for (int i = 0; i < mediasCols.length; i++) {
			System.out.printf("> Coluna %d: %.2f\n", i, mediasCols[i]);
		}
		
		System.out.printf("\n# Produto dos elementos não nulos\n%.2f\n", produto); 
		
		System.out.println("\n# Quantidade de elementos negativos\n" + quantNegativos);
		
		scan.close();
	}

}