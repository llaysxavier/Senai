package Atividade;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Prestacaoservico extends Juridica {

	private LocalDate contratoInicio;
	private LocalDate contratoFim;

	// DATE FORMATTER
	DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	/* CONSTRUCTORS */
	public Prestacaoservico() {
		super();
	}

	public Prestacaoservico(int id, String nome, String telefone, String email, String cnpj, String inscricaoEstadual,
			LocalDate contratoInicio, LocalDate contratoFim, Endereco endereco) {
		super(id, nome, telefone, email, cnpj, inscricaoEstadual, endereco);
		this.contratoInicio = contratoInicio;
		this.contratoFim = contratoFim;
	}

	/* GETTERS AND SETTERS */

	public String getContratoInicio() {

		return contratoInicio.format(formatar);
	}

	public void setContratoInicio(LocalDate contratoInicio) {
		this.contratoInicio = contratoInicio;
	}

	public String getContratoFim() {
		return contratoFim.format(formatar);
	}

	public void setContratoFim(LocalDate contratoFim) {
		this.contratoFim = contratoFim;
	}

	@Override
	public String toString() {
		return "PrestacaoServico" 
				+ "\nNome=" + super.nome 
				+ "\nID" + super.id 
				+ "\nData Inicio contrato: " + this.contratoInicio 
				+ "\nData fim contrato: " + this.contratoFim 
				+ "\nTelefone=" + super.telefone
				+ "\nE-mail=" + super.email 
				+ "\n\nENDERECO\n" + endereco.toString();
	}

}
