package Atividade;
	
import java.time.LocalDate;

public class Advogado extends Funcionario {
	private String oab;

	/* CONSTRUCTORS */
	public Advogado() {

	}

	/* GETTER AND SETTER */

	public Advogado(int id, String nome, String telefone, String email, Endereco endereco, Genero genero,
			EstadoCivil estadoCivil, LocalDate dataNascimento, String cpf, String rg, String matricula,
			double salario, String oab) {
		super(id, nome, telefone, email, endereco, genero, estadoCivil, dataNascimento, cpf, rg, matricula, Setor.JURIDICO,
				salario);
		this.oab = oab;
	}

	public String getoab() {
		return oab;
	}

	public void setoab(String oab) {
		this.oab = oab;
	}

	@Override
	public String toString() {
		return "Advogado\n" + "\nNome: " + super.nome + "\nData nascimento: " + super.dataNascimento + "\nIdade: " + super.getIdade() + "\nID: "
				+ super.id + "\nMatricula: " + super.matricula + "\nCPF" + super.cpf + "\nRG: " + super.rg + "\nOAB: "
				+ this.oab + "\nGenero: " + super.genero.texto + "\nSetor: " + super.setor.nomeSetor + "\nSalario: "
				+ super.getSalario() + "\n\nENDERECO\n" + endereco.toString();

	}
}