/*
 * Gabrielly Beatriz Brandão Nogueira
 * Tiago Rodrigues dos Santos 
*/

import java.util.Scanner;

public class TesteFilme {

	private static Filme getObj(String formaSetObjEstado) {

		if (formaSetObjEstado.equals("hardCoded")) {
			Filme objFilme = new Filme();

			objFilme.setTitulo("Aquaman");
			objFilme.setAnoLancamento("2018");
			objFilme.setPosterImgLink(
					"https://imdb-api.com/images/original/MV5BOTk5ODg0OTU5M15BMl5BanBnXkFtZTgwMDQ3MDY3NjM@._V1_Ratio0.6762_AL_.jpg");
			objFilme.setDuracaoMins(143);
			objFilme.setSinopse(
					"Born upon the shores of the surface world, Arthur Curry (Jason Momoa) discovers that he is only half human, with the other half of his blood being of Atlanteean descent, thus making him the rightful heir to the throne of the undersea kingdom of Atlantis. However, Arthur learns that Atlantis is being ruled by his malicious half-brother Orm (Patrick Wilson), who seeks to unite the seven underwater kingdoms and wage war upon the surface. With aid from Nuidis Vulko (Willem Dafoe) and the gorgeous Mera (Amber Heard), Arthur must discover the full potential of his true destiny and become Aquaman in order to save Atlantis and the surface from Orm's evil plot.");
			objFilme.setGenero("Ação");
			objFilme.setImdbRating(6.9);

			return objFilme;
		} else {
			Scanner scan = new Scanner(System.in);

			System.out.print("- Título: ");
			String titulo = scan.nextLine();

			System.out.print("- Ano de lançamento: ");
			String anoLancamento = scan.nextLine();

			System.out.print("- Link da imagem do pôster: ");
			String posterImgLink = scan.nextLine();

			System.out.print("- Duração (min): ");
			int duracaoMins = scan.nextInt();

			scan.nextLine();

			System.out.print("- Sinopse: ");
			String sinopse = scan.nextLine();

			System.out.print("- Gênero: ");
			String genero = scan.nextLine();

			System.out.print("- Nota no IMDB: ");
			double imdbRating = scan.nextDouble();

			if (formaSetObjEstado.equals("construtor")) {
				return new Filme(
						titulo,
						anoLancamento,
						posterImgLink,
						duracaoMins,
						sinopse,
						genero,
						imdbRating);
			} else {
				Filme objFilme = new Filme();

				objFilme.setTitulo(titulo);
				objFilme.setAnoLancamento(anoLancamento);
				objFilme.setPosterImgLink(posterImgLink);
				objFilme.setDuracaoMins(duracaoMins);
				objFilme.setSinopse(sinopse);
				objFilme.setGenero(genero);
				objFilme.setImdbRating(imdbRating);

				return objFilme;
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("# Obj 1\n");
		Filme obj1 = getObj("construtor");

		System.out.println("\n# Obj 2\n");
		Filme obj2 = getObj("setters");

		Filme obj3 = getObj("hardCoded");

		StringBuilder strObj1 = new StringBuilder();

		strObj1.append("{\n");
		strObj1.append("  titulo: " + obj1.getTitulo() + "\n");
		strObj1.append("  ano_lançamento: " + obj1.getAnoLancamento() + "\n");
		strObj1.append("  poster_img_link: " + obj1.getPosterImgLink() + "\n");
		strObj1.append("  minutos_duracao: " + obj1.getDuracaoMins() + "\n");
		strObj1.append("  sinopse: " + obj1.getSinopse() + "\n");
		strObj1.append("  genero: " + obj1.getGenero() + "\n");
		strObj1.append("  imdb_rating: " + obj1.getImdbRating() + "\n");
		strObj1.append("}");

		System.out.println("\n# Obj 1\n");
		System.out.println(strObj1.toString());

		StringBuilder strObj2 = new StringBuilder();

		strObj2.append("{\n");
		strObj2.append("  titulo: " + obj2.getTitulo() + "\n");
		strObj2.append("  ano_lançamento: " + obj2.getAnoLancamento() + "\n");
		strObj2.append("  poster_img_link: " + obj2.getPosterImgLink() + "\n");
		strObj2.append("  minutos_duracao: " + obj2.getDuracaoMins() + "\n");
		strObj2.append("  sinopse: " + obj2.getSinopse() + "\n");
		strObj2.append("  genero: " + obj2.getGenero() + "\n");
		strObj2.append("  imdb_rating: " + obj2.getImdbRating() + "\n");
		strObj2.append("}");

		System.out.println("\n# Obj 2");
		System.out.println("\n" + strObj2.toString());

		System.out.println("\n# Obj 3");
		System.out.println("\n" + obj3.toString());

	}

}
