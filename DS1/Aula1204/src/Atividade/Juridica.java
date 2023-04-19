package Atividade;

import java.time.LocalDate;

public class Juridica extends Pessoa {
	
	private String cnpj;
	private String inscricaoEstadual;
	private LocalDate dataInicio;
	private LocalDate dataTermino;
	private Double valorContrato;
	
	
	public Juridica(int id, String nome, Genero genero, Endereco endereco, String cnpj, String inscricaoEstadual,
			LocalDate dataInicio, LocalDate dataTermino, Double valorContrato) {
		super(id, nome, genero, endereco);
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.valorContrato = valorContrato;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}


	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}


	public LocalDate getDataInicio() {
		return dataInicio;
	}


	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}


	public LocalDate getDataTermino() {
		return dataTermino;
	}


	public void setDataTermino(LocalDate dataTermino) {
		this.dataTermino = dataTermino;
	}


	public Double getValorContrato() {
		return valorContrato;
	}


	public void setValorContrato(Double valorContrato) {
		this.valorContrato = valorContrato;
	}
	
	public String toString() {
		return "\nJuridica" + 
				"\nCnpj = " + this.cnpj + 
				"\nInscricaoo Estadual = " + this.inscricaoEstadual + 
				"\nData de Inicio = " + Util.FormatarData(getDataInicio()) + 
				"\nData de Termino = " + Util.FormatarData(getDataTermino()) + 
				"\nValor do Contrato = " + Util.FormatarMoeda(getValorContrato()) + 
				"\nId = " + this.id + 
				"\nNome = " + this.nome + 
				"\nGenero = " + this.genero.texto + 
				"\n" + this.endereco.toString();
	}
	
	
}
