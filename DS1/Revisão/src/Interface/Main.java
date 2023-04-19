package Interface;

public class Main {
	
	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro ();
		Gato gato = new Gato ();
		Galo galo = new Galo ();
		Pato pato = new Pato ();
		
		System.out.println(cachorro.comer());
		System.out.println(cachorro.emitirsom());
		System.out.println(gato.comer());
		System.out.println(gato.emitirsom());
		System.out.println(galo.comer());
		System.out.println(galo.emitirsom());
		System.out.println(pato.comer());
		System.out.println(pato.emitirsom());
	}

}
