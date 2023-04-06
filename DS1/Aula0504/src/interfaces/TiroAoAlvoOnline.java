package interfaces;

public class TiroAoAlvoOnline implements Jogo {
	
	public void jogar () {
		System.out.println("Iniciando o jogo");
		System.out.println("Carregando servidor...");
		System.out.println("Preparando partida...");
		System.out.println("Acerte o alvo.");
		
	}

	public void fechar () {
		System.out.println("Fechando partida...");
		System.out.println("Fechando conexão com o servidor...");
		
	}
}
