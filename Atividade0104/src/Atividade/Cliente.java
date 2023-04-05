package Atividade;

import java.time.LocalDate;

public class Cliente extends Fisica {

	private int protocoloAtendimento;

	/* CONSTRUCTORS */

	public Cliente() {

	}

	/* GETTERS AND SETTERS */

	public Cliente(int id, String nome, String telefone, String email, Endereco endereco, Genero genero,
			EstadoCivil estadoCivil, LocalDate dataNascimento, int protocoloAtendimento) {
		super(id, nome, telefone, email, endereco, genero, estadoCivil, dataNascimento);
		this.protocoloAtendimento = protocoloAtendimento;
	}

	public int getProtocoloAtendimento() {
		return protocoloAtendimento;
	}

	public void setProtocoloAtendimento(int protocoloAtendimento) {
		this.protocoloAtendimento = protocoloAtendimento;
	}

	@Override
	public String toString() {
		return "CLIENTE\n" + "\nNome: " + super.nome + "\nData nascimento: " + super.dataNascimento + "\nID: "
				+ super.id + "\nProtocolo de atendimento" + this.protocoloAtendimento + "\nGenero: " + genero.texto
				+ "\nTelefone: " + telefone + "\nE-mail: " + email + "\n\nENDERECO\n" + endereco.toString();
	}

}