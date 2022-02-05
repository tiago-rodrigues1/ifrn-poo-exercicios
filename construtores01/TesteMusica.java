/*
 * Gabrielly Beatriz Brandão Nogueira
 * Tiago Rodrigues dos Santos 
*/

package atvdSemana12;

import java.util.Scanner;

public class TesteMusica extends Musica {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Qual o t�tulo da m�sica?");
		String t1 = leia.next();
		System.out.println("Qual a dura��o?");
		int duracao1 = leia.nextInt();
		System.out.println("Qual o artista?");
		String artista1 = leia.next();
		System.out.println("Qual o album?");
		String album1 = leia.next();
		System.out.println("Qual o ano de lan�amento?");
		int ano1 = leia.nextInt();
		System.out.println("Qual ranking?");
		int ranking1 = leia.nextInt();

		Musica musica1 = new Musica(t1, duracao1, artista1, album1, ano1, ranking1);

		System.out.println("M�sica 2");
		Musica musica2 = new Musica();

		System.out.println("Qual o t�tulo da m�sica?");
		String t2 = leia.next();
		musica2.setTitulo(t2);
		System.out.println("Qual a dura��o?");
		int duracao2 = leia.nextInt();
		musica2.setDuracao(duracao2);
		System.out.println("Qual o artista?");
		String artista2 = leia.next();
		musica2.setArtista(artista2);
		System.out.println("Qual o album?");
		String album2 = leia.next();
		musica2.setAlbum(album2);
		System.out.println("Qual o ano de lan�amento?");
		int ano2 = leia.nextInt();
		musica2.setAnoDeLancamento(ano2);
		System.out.println("Qual ranking?");
		int ranking2 = leia.nextInt();
		musica2.setRanking(ranking2);

		Musica musica3 = new Musica("Sozinho", 150, "Caetano Veloso", "Prenda Minha", 1998, 2);

		System.out.println("Musica 1:");
		System.out.println("T�tulo: " + musica1.getTitulo() + " Dura��o: " + musica1.getDuracao() + " Artista: "
				+ musica1.getArtista() + " �lbum: " + musica1.getAlbum() +
				" Ano de lan�amento " + musica1.getAnoDeLancamento() + " Ranking: " + musica1.getRanking());

		System.out.println("Musica 2:");
		System.out.println("T�tulo: " + musica2.getTitulo() + " Dura��o: " + musica2.getDuracao() + " Artista: "
				+ musica2.getArtista() + " �lbum: " + musica2.getAlbum() +
				" Ano de lan�amento " + musica2.getAnoDeLancamento() + " Ranking: " + musica2.getRanking());

		System.out.println("Musica 3:");
		System.out.println(musica3.toString());

	}

}
