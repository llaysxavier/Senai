package Atividade;

public enum Bonificacao {
	
	MOTOBOYB(0.1),
	GERENTE (0.2),
	DIRETOR (0.4);
	
	protected double valor;

	private Bonificacao(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}
	

}
