package Avaliaçãods1;

public class Juridica {
	
	protected int idade;
	protected Genero genero;
	
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
	@Override
	public String toString() {
		return "Juridica [idade=" + idade + ", genero=" + genero + "]";
	}
	

}
