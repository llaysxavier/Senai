package Atividade;

import java.time.LocalDate;

public class Diretor extends CargoDeConfianca{
	private final double PARTICIPACAO_LUCRO = 0.1; 
	

	public Diretor(String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataAdmissao) {
		super(nome, cpf, rg, genero, salarioBase, dataAdmissao, Bonificacao.DIRETOR);
		
	}

	public double getPARTICIPACAO_LUCRO() {
		return PARTICIPACAO_LUCRO;
	}

	
	@Override
	public double getSalarioFinal(double salarioBase) {
		double salarioFinal = salarioBase + ((salarioBase * Bonificacao.DIRETOR.valor) + (salarioBase * PARTICIPACAO_LUCRO));
		return salarioFinal;
	}

	@Override
	public String toString() {
		return "\nDiretor"+ 
				"\nNome = " + super.nome + 
				"\nCpf = " + super.cpf + 
				"\nRg = " + super.rg + 
				"\nGenero = " + super.genero.texto + 
				"\nSalario Base = " + super.getSalarioBase() + 
				"\nData de Admissao = " + super.getDataAdmissao() +
				"\nSalario Final = " + Util.FormatarMoeda(getSalarioFinal(salarioBase));
	}

	
	
	
}

