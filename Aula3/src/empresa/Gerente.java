package empresa;

public class Gerente extends Funcionario {
	String setor;

	public Gerente(String nome, double salario, String cpf, String setor) {
		super(nome, salario, cpf);
		this.setor = setor;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public void getPromocao() {
		this.salario=this.salario*1.15;
	}	
	
}


