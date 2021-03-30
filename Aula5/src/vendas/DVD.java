package vendas;

public class DVD extends Produto{

	private String duracao;
	
	public DVD(String nome, double preco, int codBarras, String duracao) {
		super(nome, preco, codBarras);
		this.duracao = duracao;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		String informacoes;
		informacoes = "DVD\n" + "Nome: " + getNome()  + "\n" + 
		"Preço: " + getPreco() +"\n" + "Duração: " + duracao + "\n";
		return informacoes;
	}
	
}
