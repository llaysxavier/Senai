package Atividade;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Motoboy m1 = new Motoboy("Felipe", "456.786.222-66", "77.141.661-21", Genero.MASCULINO, 2400, LocalDate.of(1990, 1, 5),"JPG-2427");
		Gerente g1 = new Gerente("Rafaela", "456.786.292-66", "30.272.585-20", Genero.FEMININO, 3215, LocalDate.of(1989, 9, 23));
		Diretor d1 = new Diretor("Benício", "456.776.722-66", "32.222.080-14", Genero.MASCULINO, 9870, LocalDate.of(1997, 3, 24));
		
		
		System.out.println(m1.toString());
		System.out.println(g1.toString());
		System.out.println(d1.toString());
	}
}

