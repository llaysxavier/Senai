package Atividade;

public class Fornecedor extends Juridica {

	private String produto;

	/* CONSTRUCTORS */
	public Fornecedor() {
		super();
	}

	public Fornecedor(int id, String nome, String telefone, String email, String cnpj, String inscricaoEstadual,
			Endereco endereco, String produto) {
		super(id, nome, telefone, email, cnpj, inscricaoEstadual, endereco);
		this.produto = produto;
	}

	/* GETTER AND SETTER */
	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "Fornecedor"  
				+ "\nNome=" + super.nome 
				+ "\nID" + super.id 
				+"\nProduto: " + this.produto 
				+ "\nTelefone=" + super.telefone
				+ "\nE-mail=" + super.email 
				+ "\n\nENDERECO\n" + endereco.toString();
	}

	
	
}