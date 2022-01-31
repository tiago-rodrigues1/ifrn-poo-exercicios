
public class Doador {
	private String nome;
	private int idade;
	private String tipoSanguineo;
	private double peso;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setTipoSanguineo(String tipo) {
		this.tipoSanguineo = tipo;
	}
	
	public String getTipoSanguineo() {
		return this.tipoSanguineo;
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
		str.append("> Idade: " + this.idade + "\n");
		str.append("> Tipo sanguíneo: " + this.tipoSanguineo + "\n");
		str.append("> Peso (kg): " + this.peso + "\n");
		
		return str.toString();
	}
	
	
}
