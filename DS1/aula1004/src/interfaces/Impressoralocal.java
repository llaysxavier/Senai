package interfaces;

public class Impressoralocal {
	
	public void instalar () {
		System.out.println("Instalando a impressora...");
	}
	
	public void imprimir () {
		
	}
	
	public void imprimir (Impressora impressão) {
		impressão.imprimir ();
	}
	

}
