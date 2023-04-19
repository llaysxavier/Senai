package Atividade;

import java.time.LocalDate;

public class Motoboy extends Funcionario {
	
	private String placaDaMoto;
  
	
	
	public Motoboy(String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataAdmissao,
			String placaDaMoto) {
		super(nome, cpf, rg, genero, salarioBase, dataAdmissao);
		this.placaDaMoto = placaDaMoto;
	}

	public String getPlacaDaMoto() {
		return placaDaMoto;
	}

	public void setPlacaDaMoto(String placaDaMoto) {
		this.placaDaMoto = placaDaMoto;
	}

	public double getSalarioFinal (double salarioBase) {
		return salarioBase;
	}
	
	@Override
	public String toString() {
		return "\nMotoboy = " + 
				"\nPlacaDaMoto" + this.placaDaMoto +
		"\nNome = " + super.nome +
		"\nCpf = " + super.cpf + 
		"\nRg = " + super.rg + 
		"\nGenero =" + super.genero.texto +
		"\nSalario Base = " + Util.FormatarMoeda(getSalarioBase()) + 
		"\nData de Admissão = " + Util.FormatarData(getDataAdmissao()) + 
		"\nSalario Final = " + getSalarioFinal(salarioBase);
				

	}
	

}
