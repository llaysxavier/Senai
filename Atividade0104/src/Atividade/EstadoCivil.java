package Atividade;

public enum EstadoCivil {

	SOLTEIRO("Solteiro(a)"), 
	CASADO("Casado(a)"), 
	SEPARADO("Separado(a)"),
	DIVORCIADO("Divorciado(a)"),
	VIUVO("Viuvo(a)");

	protected String texto;

	private EstadoCivil(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

}
	