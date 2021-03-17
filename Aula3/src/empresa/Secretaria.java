package empresa;

public class Secretaria extends Funcionario {
	String lider;
	
	public Secretaria(String nome, double salario, String cpf, String lider) {
		super(nome, salario, cpf);
		this.lider=lider;
	}
		
	public String getLider() {
		return lider;
	}

	public void setLider(String lider) {
		this.lider = lider;
	}
	
	public void getPromocao() {
		salario=salario*1.11;
	}

}
