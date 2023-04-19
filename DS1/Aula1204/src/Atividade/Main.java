package Atividade;

	import java.time.LocalDate;

	public class Main {
		public static void main(String[] args) {
			Funcionario f1 = new Funcionario (0, null, null, null, null, null, null, null);
			Juridica j1 = new Juridica (0, null, null, null, null, null,   null, null, null);
			
			
			System.out.println(f1.toString());
			System.out.println(j1.toString());
		}

}
