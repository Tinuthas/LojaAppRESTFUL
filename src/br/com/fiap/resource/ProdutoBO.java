package br.com.fiap.resource;

import java.util.ArrayList;
import java.util.List;

public class ProdutoBO {
	
	
	private static List<ProdutoTO> lista = new ArrayList<ProdutoTO>();
	private static ProdutoBO produtoBO;
	
	
	public ProdutoBO () {
		lista.add(new ProdutoTO(1, "Titulo1", 100, 1));
		lista.add(new ProdutoTO(2, "Titulo2", 101, 2));
		lista.add(new ProdutoTO(3, "Titulo3", 102, 3));
		lista.add(new ProdutoTO(4, "Titulo4", 103, 4));
		lista.add(new ProdutoTO(5, "Titulo5", 104, 5));
		lista.add(new ProdutoTO(6, "Titulo6", 105, 6));
	
		
	}
	
	public ProdutoBO getInstance() {
		if(produtoBO.equals(null) || produtoBO == null) {
			produtoBO = new ProdutoBO(); 
		}
		return produtoBO;

	}
	
	public List<ProdutoTO> listar() {
	
		return lista;
	}

	public ProdutoTO buscar(int codigo) {
		return lista.get(codigo);
	}
	
	public String buscarEstoque( int codigo) {
		try {
			return EstoqueBO.consultarProduto(codigo).getTitulo();
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	public void cadastrar(ProdutoTO produto) {
		lista.add(produto);
	}
	
	public void atualizar(ProdutoTO produto) {
		ProdutoTO outro = buscar(produto.getCodigo());
	}

	public void remover(int codigo) {
		
	}

}
