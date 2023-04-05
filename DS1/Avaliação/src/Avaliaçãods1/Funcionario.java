package Avaliaçãods1;

	public abstract class Funcionario extends Fisica {
		
		protected String cpf;
		protected String rg;
		protected String matricula;
		protected Double salario;
		protected Setor setor;
		
		public Funcionario(int id, String nome, String telefone, String email, Endereco endereco, int idade,
				Genero genero, String cpf, String rg, String matricula, Double salario, Setor setor) {
			super(id, nome, telefone, email, endereco, idade, genero);
			this.cpf = cpf;
			this.rg = rg;
			this.matricula = matricula;
			this.salario = salario;
			this.setor = setor;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getRg() {
			return rg;
		}

		public void setRg(String rg) {
			this.rg = rg;
		}

		public String getMatricula() {
			return matricula;
		}

		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}

		public Double getSalario() {
			return salario;
		}

		public void setSalario(Double salario) {
			this.salario = salario;
		}

		public Setor getSetor() {
			return setor;
		}

		public void setSetor(Setor setor) {
			this.setor = setor;
		}
		

		
	}
