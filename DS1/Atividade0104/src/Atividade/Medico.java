package Atividade;
		
import java.time.LocalDate;

public class Medico extends Funcionario {
	private String crm;

	/* CONSTRUCTORS */
	public Medico() {

	}

	/* GETTER AND SETTER */

	public Medico(int id, String nome, String telefone, String email, Endereco endereco, Genero genero,
			EstadoCivil estadoCivil, LocalDate dataNascimento, String cpf, String rg, String matricula,
			double salario, String crm) {
		super(id, nome, telefone, email, endereco, genero, estadoCivil, dataNascimento, cpf, rg, matricula, Setor.SAUDE,
				salario);
		this.crm = crm;
	}

	public String getcrm() {
		return crm;
	}

	public void setcrm(String crm) {
		this.crm = crm;
	}

	@Override
	public String toString() {
		return "Medico\n" + "\nNome: " + super.nome + "\nData nascimento: " + super.dataNascimento + "\nIdade: " + super.getIdade() +
				"\nID: "
				+ super.id + "\nMatricula: " + super.matricula + "\nCPF" + super.cpf + "\nRG: " + super.rg + "\nCRM: "
				+ this.crm + "\nGenero: " + super.genero.texto + "\nSetor: " + super.setor.nomeSetor + "\nSalario: "
				+ super.getSalario() + "\n\nENDERECO\n" + endereco.toString();

	}
}