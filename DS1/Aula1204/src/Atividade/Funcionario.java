package Atividade;

import java.time.LocalDate;

public class Funcionario extends Pessoa {
	
	private String cpf;
	private String rg;
	private LocalDate dataNascimento;
	private Double salario;
	
	public Funcionario(int id, String nome, Genero genero, Endereco endereco, String cpf, String rg,
			LocalDate dataNascimento, Double salario) {
		super(id, nome, genero, endereco);
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
		this.salario = salario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "\nFuncionario" + 
				"\nCpf = " + this.cpf + 
				"\nRg = " + this.rg + 
				"\nData de Nascimento = " + Util.FormatarData(getDataNascimento()) + 
				"\nSalario = " + Util.FormatarMoeda(getSalario()) + 
				"\nId = " + this.id + 
				"\nNome = " + this.nome + 
				"\nGenero = " + this.genero.texto + 
				"\n" + this.endereco.toString();
	}


	

}
