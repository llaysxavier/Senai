package Atividade;

public abstract class Juridica extends Pessoa {

	private String cnpj;
	private String inscricaoEstadual;

	/* CONSTRUCTOR */

	public Juridica() {
		super();
	}

	public Juridica(int id, String nome, String telefone, String email, String cnpj,
			String inscricaoEstadual, Endereco endereco) {
		super(id, nome, telefone, email, endereco);
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
	}

	/* GETTERS AND SETTERS */

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	@Override
	public String toString() {
		return "CLIENTE\n" + 
				"\nNome: " + nome +
				"\nID: " + id +
				"\nInscri�ao Estadual: " + inscricaoEstadual +
				"\nCNPJ: " + cnpj +
				"\nTelefone: " + telefone +
				"\nE-mail: " +  email +
				"\n\nENDERECO\n" + endereco.toString();
	}



}
