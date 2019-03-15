package br.com.fiap.resource;

public class EstoqueBO {
	public static ProdutoTO consultarProduto(int codigo) throws Exception  {
		if (codigo == 401) {
			return new ProdutoTO(codigo, "Camiseta branca", 2.99, 4);
		} else if (codigo == 402) {
			return new ProdutoTO(codigo, "Camiseta azul", 2.99, 4);
		} else if (codigo == 403) {
			return new ProdutoTO(codigo, "Camiseta rosa", 2.99, 4);
		} else {
			throw new Exception("Produto não encontrado!");
		}
	}
}