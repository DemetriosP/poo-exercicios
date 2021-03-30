package vendas;

public class CD extends Produto{
	
	private int numeroDeFaixas;
	
	public CD(String nome, double preco, int codBarras, int numeroDeFaixas) {
		super(nome, preco, codBarras);
		this.numeroDeFaixas = numeroDeFaixas;
	}

	public int getNumeroDeFaixas() {
		return numeroDeFaixas;
	}

	public void setNumeroDeFaixas(int numeroDeFaixas) {
		this.numeroDeFaixas = numeroDeFaixas;
	}

	@Override
	public String toString() {
		String informacoes;
		informacoes = "CD\n" + "Nome: " + getNome()  + "\n" + "Preço: " 
		+ getPreco() +"\n" + "Número de Faixas: " + numeroDeFaixas + "\n";
		return informacoes;
	}


}
