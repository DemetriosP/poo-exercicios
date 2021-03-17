package empresa;

public class Funcionario {
	String nome;	
	protected double salario;
	String cpf;
	
	public Funcionario(String nome, double salario, String cpf) {
		this.nome = nome;
		this.salario = salario;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void getPromocao() {
		salario=salario*1.1;
	}

}




