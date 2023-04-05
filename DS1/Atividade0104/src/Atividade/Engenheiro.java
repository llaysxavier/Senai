package Atividade;

import java.time.LocalDate;

public class Engenheiro extends Funcionario {
	private String crea;

	/* CONSTRUCTORS */
	public Engenheiro() {

	}

	/* GETTER AND SETTER */

	public Engenheiro(int id, String nome, String telefone, String email, Endereco endereco, Genero genero,
			EstadoCivil estadoCivil, LocalDate dataNascimento, String cpf, String rg, String matricula,
			double salario, String crea) {
		super(id, nome, telefone, email, endereco, genero, estadoCivil, dataNascimento, cpf, rg, matricula, Setor.ENGENHARIA,
				salario);
		this.crea = crea;
	}

	public String getcrea() {
		return crea;
	}

	public void setcrea(String crea) {
		this.crea = crea;
	}

	@Override
	public String toString() {
		return "Engenheiro\n" + "\nNome: " + super.nome + "\nData nascimento: " + super.dataNascimento + "\nIdade: " + super.getIdade() + "\nID: "
				+ super.id + "\nMatricula: " + super.matricula + "\nCPF" + super.cpf + "\nRG: " + super.rg + "\nCrea: "
				+ this.crea + "\nGenero: " + super.genero.texto + "\nSetor: " + super.setor.nomeSetor + "\nSalario: "
				+ super.getSalario() + "\n\nENDERECO\n" + endereco.toString();

	}
}