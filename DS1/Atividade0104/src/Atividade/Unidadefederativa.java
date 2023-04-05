package Atividade;

public enum Unidadefederativa {
    ACRE("AC","Acre"),
    ALAGOAS("AL","Alagoas"),
    AMAPA("AP","Amapá"),
    AMAZONAS("AM","Amazonas"),
    BAHIA("BA","Bahia"),
    CEARA("CE","Ceará"),
    ESPIRITO_SANTO("ES","Espírito Santo"),
    GOIAS("GO","Goiás"),
    MARANHAO("MA","Maranhão"),
    MATO_GROSSO("MT","Mato Grosso"),
    MATO_GROSSO_DO_SUL("MS","Mato Grosso do Sul"),
    MINAS_GERAIS("MG","Minas Gerais"),
    PARA("PA","Pará"),
    PARAIBA("PB","Paraíba"),
    PARANA("PR","Paraná"),
    PERNAMBUCO("PE","Pernambuco"),
    PIAUI("PI","Piauí"),
    RIO_DE_JANEIRO("RJ","Rio de Janeiro"),
    RIO_GRANDE_DO_NORTE("RN","Rio Grande do Norte"),
    RIO_GRANDE_DO_SUL("RS","Rio Grande do Sul"),
    RONDONIA("RO","Rondônia"),
    RORAIMA("RR","Roraima"),
    SANTA_CATARINA("SC","Santa Catarina"),
    SAO_PAULO("SP","São Paulo"),
    SERGIPE("SE","Sergipe"),
    TOCANTINS("TO","Tocantins");

	protected String sigla;
	protected String estado;

	/* Constructor */

	Unidadefederativa(String sigla, String estado) {
		this.sigla = sigla;
	}

	/* Getter and Setter */
	public String getSigla() {
		return sigla;
	}

	public String getEstado() {
		return estado;
	}

	public String getNome() {
		return nome;
	}
	
	
}
