package empresa;

public class Programador extends Funcionario {
	
	String grupo;
	
	public Programador(String nome, double salario, String cpf, String grupo) {
		super(nome, salario, cpf);
		this.grupo=grupo;		
	}
	
	public void getPromocao() {
		salario=salario*1.11;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	
	

}
