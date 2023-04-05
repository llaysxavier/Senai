package Atividade;

import java.text.NumberFormat;
import java.time.LocalDate;

public abstract class Funcionario extends Fisica {
	protected String cpf;
	protected String rg;
	protected String matricula;
	protected Setor setor;
	protected double salario;

	/* Constructor */

	public Funcionario() {

	}

	public Funcionario(int id, String nome, String telefone, String email, Endereco endereco, Genero genero,
			EstadoCivil estadoCivil, LocalDate dataNascimento, String cpf, String rg, String matricula, Setor setor,
			double salario) {
		super(id, nome, telefone, email, endereco, genero, estadoCivil, dataNascimento);
		this.cpf = cpf;
		this.rg = rg;
		this.matricula = matricula;
		this.setor = setor;
		this.salario = salario;
	}

	/* Getter and Setter */

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

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public String getSalario() {
		NumberFormat brl = NumberFormat.getCurrencyInstance();
		return brl.format(salario);
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario\n" 
				+ "\nNome: " + super.nome 
				+ "\nData nascimento: " + super.dataNascimento 
				+ "\nIdade: " + super.getIdade()
				+ "\nID: " + super.id 
				+ "\nMatricula: " + this.matricula 
				+ "\nCPF" + this.cpf + "\nRG: " + this.rg 
				+ "\nGenero: "+ super.genero.texto 
				+ "\nSetor: " + this.setor.nomeSetor 
				+ "\nSalario: R$" + this.salario
				+ "\n\nENDERE�O\n" + endereco.toString();

	}
}