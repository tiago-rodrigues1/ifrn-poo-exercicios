
public class Jogador {
	private String nome;
	private String matricula;
	private String posicao;
	private double altura;
	private double peso;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	
	public String getPosicao() {
		return this.posicao;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getPeso() {
		return this.peso;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		
		str.append("> Nome: " + this.nome + "\n");
		str.append("> Matrícula: " + this.matricula + "\n");
		str.append("> Posição: " + this.posicao + "\n");
		str.append("> Altura: " + this.altura + "\n");
		str.append("> Peso (kg): " + this.peso + "\n");
		
		return str.toString();
	}
	
	
}
