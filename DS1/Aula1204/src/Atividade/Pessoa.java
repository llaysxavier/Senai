package Atividade;


public abstract class Pessoa {
    protected int id;
    protected String nome;
    protected Genero genero;
    protected Endereco endereco;
    
	public Pessoa(int id, String nome, Genero genero, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.genero = genero;
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

    
}
    
    
	
