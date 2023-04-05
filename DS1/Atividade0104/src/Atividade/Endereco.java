package Atividade;


public class Endereco {
	private String cep;
	private String logradouro;
	private String numero;
	private String complemento;
	private String cidade;
	private Unidadefederativa uf;

	/* Constructors */

	public Endereco() {
	}

	public Endereco(String cep, String logradouro, String numero, String complemento, String cidade,
			Unidadefederativa uf) {
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.cidade = cidade;
		this.uf = uf;
	}

	/* Getter and Setter */

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Unidadefederativa getUf() {
		return uf;
	}

	public void setUf(Unidadefederativa uf) {
		this.uf = uf;
	}

	@Override
	public String toString() {
		return "\nCEP: " + cep + 
				"\nLogradouro: " + logradouro +
				"\nNumero: " + numero +
				"\nComplemento: " + complemento	+
				"\nCidade: " + cidade + 
				"\nUF: " + uf.sigla +
				"\n----";
	}
}