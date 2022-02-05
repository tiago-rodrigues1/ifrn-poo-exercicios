/*
 * Gabrielly Beatriz Brandão Nogueira
 * Tiago Rodrigues dos Santos 
*/

public class Filme {
	private String titulo;
	private String anoLancamento;
	private String posterImgLink;
	private int duracaoMins;
	private String sinopse;
	private String genero;
	private double imdbRating;

	public Filme() {

	}

	public Filme(
			String titulo,
			String anoLancamento,
			String posterImgLink,
			int duracaoMins,
			String sinopse,
			String genero,
			double imdbRating) {
		this.titulo = titulo;
		this.anoLancamento = anoLancamento;
		this.posterImgLink = posterImgLink;
		this.duracaoMins = duracaoMins;
		this.sinopse = sinopse;
		this.genero = genero;
		this.imdbRating = imdbRating;

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

	public int getDuracaoMins() {
		return this.duracaoMins;
	}

	public void setDuracaoMins(int duracaoMins) {
		this.duracaoMins = duracaoMins;
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

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();

		str.append("{\n");
		str.append("  titulo: " + getTitulo() + "\n");
		str.append("  ano_lançamento: " + getAnoLancamento() + "\n");
		str.append("  poster_img_link: " + getPosterImgLink() + "\n");
		str.append("  minutos_duracao: " + getDuracaoMins() + "\n");
		str.append("  sinopse: " + getSinopse() + "\n");
		str.append("  genero: " + getGenero() + "\n");
		str.append("  imdb_rating: " + getImdbRating() + "\n");
		str.append("}");

		return str.toString();

	}

}
