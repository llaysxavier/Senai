package statics;

import java.time.LocalDate;

public class Pessoa {
	
	private String nome;
	private LocalDate idade;
	private double salario;

	public Pessoa(String nome, LocalDate idade, double salario) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return Util.formatarData(idade);
	}

	public void setIdade(LocalDate idade) {
		this.idade = idade;
	}

	public String getSalario() {
		return Util.formatarBrl(salario);
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
