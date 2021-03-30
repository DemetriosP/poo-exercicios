package vendas;

import java.util.Arrays;

public class Loja {
	
	public static void buscarProduto(Produto produto, Produto vetor[]) {
		boolean encontrado = false;
		int posicao = 0;
		
		for(Produto produtos: vetor) {
			if(produto.getNome() == produtos.getNome()) {
				if(produto.getPreco() == produtos.getPreco()) {
					if(produto.equals(produtos)) {
						System.out.println(" O produto se encontra "
						+ "na posicao " + posicao + " do vetor");
						encontrado = true;
						break;
					}
				}
			}
			posicao++;
		}
		if(!encontrado) {System.out.println("O produto não se encontra no vetor");}
	}
		
	
	public static void main(String[] args) {
		
		Produto produto[] = new Produto[5];
		
		produto[0] = new Livro("As Crônicas de Gahnor", 40.00, 46982, "Leonal Caldela");
		produto[1] = new CD("Lightning Bolt", 30.99, 23975, 12);
		produto[2] = new DVD("Vingadores: Ultimato", 34.90, 47536,"3h 2m");	
		produto[3] = new Livro("1984", 20.90, 36942,"George Orwell");
		produto[4] = new DVD("Interestelar", 35.70, 12048, "2h49m");
		
		Livro livroMaisVendido = new Livro("asdsadfds", 20.00, 47924, "asuisdf");
		
		
		for(Object produtos: produto) {
			System.out.println(produtos);
		}
		
		System.out.println("O produto 0 e o produto 1 tem o "
		+ "mesmo código de barras? " + produto[0].equals(produto[1]));
		
		buscarProduto(livroMaisVendido, produto);
		
		System.out.println("O produto na posição 0 é igual ao produto na "
				+ "posição 0? 0 é sim, 1 é não: " + produto[0].compareTo(produto[0]) + "\n");
		
		Arrays.sort(produto);
		
		for(Object produtos: produto) {
			System.out.println(produtos);
		}
		 
 	}

}
