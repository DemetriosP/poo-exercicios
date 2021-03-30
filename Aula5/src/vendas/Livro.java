package vendas;

public class Livro extends Produto{
	
	private String autor;
	
	public Livro(String nome, double preco, int codBarras, String autor) {
		super(nome, preco, codBarras);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		String informacoes;
		informacoes = "Livro\n" + "Nome: " + getNome()  + "\n" + 
		"Preço: " + getPreco() +"\n" + "Autor: " + autor + "\n";
		return informacoes;
	}
	
	
	

}
