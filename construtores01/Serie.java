/*
 * Gabrielly Beatriz Brandão Nogueira
 * Tiago Rodrigues dos Santos 
*/

public class Serie {
	private String titulo;
	private String anoLancamento;
	private String posterImgLink;
	private String sinopse;
	private String genero;
	private double imdbRating;
	private int quantEpisodios;
	private int quantTemporadas;

	public Serie() {

	}

	public Serie(
			String titulo,
			String anoLancamento,
			String posterImgLink,
			String sinopse,
			String genero,
			double imdbRating,
			int quantEpisodios,
			int quantTemporadas) {
		this.titulo = titulo;
		this.anoLancamento = anoLancamento;
		this.posterImgLink = posterImgLink;
		this.sinopse = sinopse;
		this.genero = genero;
		this.imdbRating = imdbRating;
		this.quantEpisodios = quantEpisodios;
		this.quantTemporadas = quantTemporadas;

	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAnoLancamento() {
		return this.anoLancamento;
	}

	public void setAnoLancamento(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getPosterImgLink() {
		return this.posterImgLink;
	}

	public void setPosterImgLink(String posterImgLink) {
		this.posterImgLink = posterImgLink;
	}

	public String getSinopse() {
		return this.sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getImdbRating() {
		return this.imdbRating;
	}

	public void setImdbRating(double imdbRating) {
		this.imdbRating = imdbRating;
	}

	public int getQuantEpisodios() {
		return this.quantEpisodios;
	}

	public void setQuantEpisodios(int quantEpisodios) {
		this.quantEpisodios = quantEpisodios;
	}

	public int getQuantTemporadas() {
		return this.quantTemporadas;
	}

	public void setQuantTemporadas(int quantTemporadas) {
		this.quantTemporadas = quantTemporadas;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();

		str.append("{\n");
		str.append("  titulo: " + getTitulo() + "\n");
		str.append("  ano_lançamento: " + getAnoLancamento() + "\n");
		str.append("  poster_img_link: " + getPosterImgLink() + "\n");
		str.append("  sinopse: " + getSinopse() + "\n");
		str.append("  genero: " + getGenero() + "\n");
		str.append("  imdb_rating: " + getImdbRating() + "\n");
		str.append("  quantidade_episodios: " + getQuantEpisodios() + "\n");
		str.append("  quantidade_temporadas: " + getQuantTemporadas() + "\n");
		str.append("}");

		return str.toString();
	}

}
