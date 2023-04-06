package interfaces;

public class VideoGame {
	
	public void ligar () {
		System.out.println("Ligando console.");
	}
	
	public void jogar (Jogo jogo) {
			jogo.jogar();
		
	}
	
	public void fechar (Jogo jogo) {
		jogo.fechar ();
	}
	
	public void desligar () {
		System.out.println("Desligando o console...");
	}
}
