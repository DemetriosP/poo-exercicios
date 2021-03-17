package empresa;

public class Diretor extends Funcionario {
	String area;
	
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Diretor(String nome, double salario, String cpf, String area) {
		super(nome, salario, cpf);
		this.area=area;
	}
	
	public void getPromocao() {
		salario=salario*1.2;
	}

}
