package Atividade;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public abstract class Fisica extends Pessoa {

	protected Genero genero;
	protected EstadoCivil estadoCivil;
	protected LocalDate dataNascimento;

	/* CONSTRUCTORS */
	public Fisica() {
		super();
	}

	public Fisica(int id, String nome, String telefone, String email, Endereco endereco, Genero genero,
			EstadoCivil estadoCivil, LocalDate dataNascimento) {
		super(id, nome, telefone, email, endereco);
		this.genero = genero;
		this.estadoCivil = estadoCivil;
		this.dataNascimento = dataNascimento;
	}

	/* GETTERS AND SETTERS */
	public int getIdade() {
		return Period.between(this.dataNascimento, LocalDate.now()).getYears();
	}
	
	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getdataNascimento() {
		DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return dataNascimento.format(formatar);
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}