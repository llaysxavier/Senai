package Atividade;

public enum Setor {
	ENGENHARIA("Engenharia"), 
	JURIDICO("Juridico"), 
	SAUDE("Saude");

	protected String nomeSetor;

	private Setor(String nomeSetor) {
		this.nomeSetor = nomeSetor;
	}

	public String getNomeSetor() {
		return nomeSetor;
	}

}

