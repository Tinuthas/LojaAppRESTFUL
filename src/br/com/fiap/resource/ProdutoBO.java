package br.com.fiap.resource;

import java.util.ArrayList;
import java.util.List;

public class ProdutoBO {
	
	
	private static List<ProdutoTO> lista = new ArrayList<ProdutoTO>();
	
	public List<ProdutoTO> listar() {

		lista.add(new ProdutoTO(1, "Titulo1", 100, 1));
		lista.add(new ProdutoTO(2, "Titulo2", 101, 2));
		lista.add(new ProdutoTO(3, "Titulo3", 102, 3));
		lista.add(new ProdutoTO(4, "Titulo4", 103, 4));
		lista.add(new ProdutoTO(5, "Titulo5", 104, 5));
		lista.add(new ProdutoTO(6, "Titulo6", 105, 6));
		
		return lista;
	}

	public ProdutoTO buscar(int codigo) {
		lista = listar();
		return lista.get(codigo);
	}

}
