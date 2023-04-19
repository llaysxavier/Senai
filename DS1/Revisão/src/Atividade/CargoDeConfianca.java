package Atividade;

import java.time.LocalDate;

public abstract class CargoDeConfianca extends Funcionario {
	
	protected Bonificacao bonificacao;

	public CargoDeConfianca(String nome, String cpf, String rg, Genero genero, Double salarioBase,
			LocalDate dataAdmissao, Bonificacao bonificacao) {
		super(nome, cpf, rg, genero, salarioBase, dataAdmissao);
		this.bonificacao = bonificacao;
	}

	public Bonificacao getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(Bonificacao bonificacao) {
		this.bonificacao = bonificacao;
	}
	

}
