package br.com.pudim;

public class Gerente extends Funcionario {

	int senha;
	int numeroFuncionario;
	
	public Gerente(String nome, String cpf, double salario, int senha,
			int numeroFuncionaro) {
		super(nome, cpf, salario);
		this.senha = senha;
		this.numeroFuncionario = numeroFuncionario;
	}

	public void ImprimeDados() {
		System.out.println("O nome é: " + this.nome);
		System.out.println("O CPF é: " + this.cpf);
		System.out.println("O seu salario é: " + this.salario);
		System.out.println("O sua senha é: " + this.senha);
		System.out.println("O número do funcionário é: "+ this.numeroFuncionario);
	}
}
