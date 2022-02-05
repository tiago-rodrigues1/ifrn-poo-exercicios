/*
 * Gabrielly Beatriz Brandão Nogueira
 * Tiago Rodrigues dos Santos 
*/

package atvdSemana12;

public class Musica {

	private String titulo;
	private int duracao;
	private String artista;
	private String album;
	private int anoDeLancamento;
	private int ranking;

	// Gets e Sets

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getArtista() {
		return artista;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getAlbum() {
		return album;
	}

	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}

	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public int getRanking() {
		return ranking;
	}

	// Construtor

	public Musica(String titulo, int duracao, String artista, String album, int anoDeLancamento, int ranking) {
		this.titulo = titulo;
		this.duracao = duracao;
		this.artista = artista;
		this.album = album;
		this.anoDeLancamento = anoDeLancamento;
		this.ranking = ranking;
	}

	public Musica() {

	}

	public String toString() {
		return "Musica " + this.titulo + " de " + this.artista;
	}

}
