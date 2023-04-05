package Atividade;


public class Main {
	public static void main(String[] args) {

		Advogado a1 = new Advogado(35, "Felipe", "71 9988-5454", "felipeadv@email.com", 26, Genero.MASCULINO, "41568974",
				"1547896", "23669", 10101, "2227", new Endereco("3214", "Rua sao tadeu", "23",
						"perto do bar de si", "salvador", UnidadeFederativa.));

		Cliente c1 = new Cliente(777, "Yuri", "3362-0535", "yuriluli@email.com", 23,
				Genero.MASCULINO, 2001, new Endereco("0120", "Rua freitas pinho", "10", "Proximo ao condominio vale azul",
						"Lauro de Freitas", Unidadefederativa.BAHIA));

		Engenheiro a1 = new Engenheiro (35, "Felipe", "71 9988-5454", "felipeadv@email.com", 26, Genero.MASCULINO, "41568974",
				"1547896", "23669", 10101, "2227", new Endereco("3214", "Rua sao tadeu", "23",
						"perto do bar de si", "salvador", Unidadefederativa.BAHIA));

		Medico a1 = new Medico(35, "Felipe", "71 9988-5454", "felipeadv@email.com", 26, Genero.MASCULINO, "41568974",
				"1547896", "23669", 10101, "2227", new Endereco("3214", "Rua sao tadeu", "23",
						"perto do bar de si", "salvador", Unidadefederativa.BAHIA));

		PessoaJuridica pj1 = new PessoaJuridica(258, "Lays", "71 99961-0588", "llays@email.com",
				"1234567", "4569871", new Endereco("2403", "Rua albuquerque", "22", "condominio vale azul",
						"Salvador", UnidadeFederativa.BAHIA));


