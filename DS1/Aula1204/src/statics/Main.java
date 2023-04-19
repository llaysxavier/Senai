package statics;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Lays", LocalDate.of(1997, 03, 24), 80000);
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getIdade());
		System.out.println(pessoa.getSalario());
	}
	

}
