package vendas;

public abstract class Produto implements Comparable<Object>{
	
	private String nome;
	private double preco;
	private int codBarras;
	
	public Produto(String nome, double preco, int codBarras) {
		this.nome = nome;
		this.preco = preco;
		this.codBarras = codBarras;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(int codBarras) {
		this.codBarras = codBarras;
	}
	
	@Override
	public abstract String toString();

	@Override
	public boolean equals(Object outroObjeto) {
		if(getCodBarras() == ((Produto) outroObjeto).getCodBarras()) {return true;}
		else {return false;}
	}
	
	/*
	//compareTo por nome
	@Override
	public int compareTo(Object produto) {
		
		char nome = getNome().charAt(0), nomeCompara = ((Produto) produto).getNome().charAt(0);
		int valor = 0, valorNome = (int) nome, valorNomeCompara = (int) nomeCompara;
		
		if(valorNome == valorNomeCompara) valor = 0;
		if(valorNome < valorNomeCompara) valor = -1;
		if(valorNome > valorNomeCompara) valor = 1;
		
		return valor;

	}
	*/
	
	//compareTo por preço
	@Override
	public int compareTo(Object arg0) {
		
		int valor = 0;
		
		if(getPreco() == ((Produto) arg0).getPreco()) valor = 0;
		if(getPreco() < ((Produto) arg0).getPreco()) valor = -1;
		if(getPreco() > ((Produto) arg0).getPreco()) valor = 1;
		
		return valor;
	}
	
}
