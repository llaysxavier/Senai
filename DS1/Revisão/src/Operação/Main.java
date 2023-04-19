package Operação;

public class Main {
	
	public static void main(String[] args) {
		Soma soma = new Soma ();
		Multiplicacao multiplicacao = new Multiplicacao ();
		Divisao divisao = new Divisao ();
		Subtracao subtracao = new Subtracao ();
		
		System.out.println(soma.somar(5, 8));
		System.out.println(multiplicacao.multiplicar(4, 5));
		System.out.println(divisao.dividir(30, 6));
		System.out.println(subtracao.subtrair(10, 4));
	}

}
