package empresa;

public class Principal {

	public static void main(String[] args) {
				
		Funcionario funcionarios[] = new Funcionario[8];
				
		funcionarios[0] = new Programador("Ana",4000.00, "12122","Backend");
		funcionarios[1] = new Gerente("Joao",5000.00, "23322","RH");
		funcionarios[2] = new Secretaria("Maria",3000.00, "14322", "Joao");
		funcionarios[3] = new Diretor("Pedro", 10000.00, "342342", "Administrativa");
		funcionarios[4] = new Programador("Alberto", 3900.00, "78924", "Frontend");
		funcionarios[5] = new Gerente("Maximus", 6000.00, "96348", "Financeiro");
		funcionarios[6] = new Secretaria("Clara", 2800.00, "45786", "Maximus");
		funcionarios[7] = new Diretor("Eduardo", 11000.00, "21679", "Relações Externas");
		
		for(Funcionario f: funcionarios) {
			System.out.println("Nome: " + f.getNome());
			System.out.println("Salário antes da promoção: " + Math.round(f.getSalario()));
			f.getPromocao();
			System.out.println("Salário depois da promoção: " + Math.round(f.getSalario()));
			System.out.println();
		}
	}

}
