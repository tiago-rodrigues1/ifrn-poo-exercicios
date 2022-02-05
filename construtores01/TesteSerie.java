/*
 * Gabrielly Beatriz Brandão Nogueira
 * Tiago Rodrigues dos Santos 
*/

import java.util.Scanner;

public class TesteSerie {

	private static Serie getObj(String formaSetObjEstado) {

		if (formaSetObjEstado.equals("hardCoded")) {
			Serie objSerie = new Serie();

			objSerie.setTitulo("Brooklyn Nine-Nine");
			objSerie.setAnoLancamento("2013");
			objSerie.setPosterImgLink(
					"https://imdb-api.com/images/original/MV5BNzVkYWY4NzYtMWFlZi00YzkwLThhZDItZjcxYTU4ZTMzMDZmXkEyXkFqcGdeQXVyODUxOTU0OTg@._V1_Ratio0.6762_AL_.jpg");
			objSerie.getQuantEpisodios();
			objSerie.setSinopse(
					"Captain Ray Holt takes over Brooklyn's 99th precinct, which includes Detective Jake Peralta, a talented but carefree detective who's used to doing whatever he wants. The other employees of the 99th precinct include Detective Amy Santiago, Jake's over achieving and competitive partner; Detective Rosa Diaz, a tough and kept to herself coworker; Detective Charles Boyle, Jake's best friend who also has crush on Rosa; Detective Sergeant Terry Jeffords, who was recently taken off the field after the birth of his twin girls; and Gina Linetti, the precinct's sarcastic administrator.");
			objSerie.setGenero("Comédia");
			objSerie.setQuantEpisodios(147);
			objSerie.setQuantTemporadas(8);
			objSerie.setImdbRating(8.7);

			return objSerie;
		} else {
			Scanner scan = new Scanner(System.in);

			System.out.print("- Título: ");
			String titulo = scan.nextLine();

			System.out.print("- Ano de lançamento: ");
			String anoLancamento = scan.nextLine();

			System.out.print("- Link da imagem do pôster: ");
			String posterImgLink = scan.nextLine();

			System.out.print("- Quantidade de episódios: ");
			int quantEps = scan.nextInt();

			System.out.print("- Quantidade de temporadas: ");
			int quantTemps = scan.nextInt();

			scan.nextLine();

			System.out.print("- Sinopse: ");
			String sinopse = scan.nextLine();

			System.out.print("- Gênero: ");
			String genero = scan.nextLine();

			System.out.print("- Nota no IMDB: ");
			double imdbRating = scan.nextDouble();

			if (formaSetObjEstado.equals("construtor")) {
				return new Serie(
						titulo,
						anoLancamento,
						posterImgLink,
						sinopse,
						genero,
						imdbRating,
						quantEps,
						quantTemps);
			} else {
				Serie objSerie = new Serie();

				objSerie.setTitulo(titulo);
				objSerie.setAnoLancamento(anoLancamento);
				objSerie.setPosterImgLink(posterImgLink);
				objSerie.setSinopse(sinopse);
				objSerie.setGenero(genero);
				objSerie.setImdbRating(imdbRating);
				objSerie.setQuantEpisodios(quantEps);
				objSerie.setQuantTemporadas(quantTemps);

				return objSerie;
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("# Obj 1\n");
		Serie obj1 = getObj("construtor");

		System.out.println("\n# Obj 2\n");
		Serie obj2 = getObj("setters");

		Serie obj3 = getObj("hardCoded");

		StringBuilder strObj1 = new StringBuilder();

		strObj1.append("{\n");
		strObj1.append("  titulo: " + obj1.getTitulo() + "\n");
		strObj1.append("  ano_lançamento: " + obj1.getAnoLancamento() + "\n");
		strObj1.append("  poster_img_link: " + obj1.getPosterImgLink() + "\n");
		strObj1.append("  sinopse: " + obj1.getSinopse() + "\n");
		strObj1.append("  genero: " + obj1.getGenero() + "\n");
		strObj1.append("  imdb_rating: " + obj1.getImdbRating() + "\n");
		strObj1.append("  quantidade_episodios: " + obj1.getQuantEpisodios() + "\n");
		strObj1.append("  quantidade_temporadas: " + obj1.getQuantTemporadas() + "\n");
		strObj1.append("}");

		System.out.println("\n# Obj 1\n");
		System.out.println(strObj1.toString());

		StringBuilder strObj2 = new StringBuilder();

		strObj2.append("{\n");
		strObj2.append("  titulo: " + obj2.getTitulo() + "\n");
		strObj2.append("  ano_lançamento: " + obj2.getAnoLancamento() + "\n");
		strObj2.append("  poster_img_link: " + obj2.getPosterImgLink() + "\n");
		strObj2.append("  sinopse: " + obj2.getSinopse() + "\n");
		strObj2.append("  genero: " + obj2.getGenero() + "\n");
		strObj2.append("  imdb_rating: " + obj2.getImdbRating() + "\n");
		strObj2.append("  quantidade_episodios: " + obj2.getQuantEpisodios() + "\n");
		strObj2.append("  quantidade_temporadas: " + obj2.getQuantTemporadas() + "\n");
		strObj2.append("}");

		System.out.println("\n# Obj 2");
		System.out.println("\n" + strObj2.toString());

		System.out.println("\n# Obj 3");
		System.out.println("\n" + obj3.toString());

	}

}
