package br.com.fiap.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/produto")
public class ProdutoResource {

	private ProdutoBO produtoBo = new ProdutoBO();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ProdutoTO> buscar() {
		return produtoBo.listar();
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public ProdutoTO buscar(@PathParam("id") int codigo) {
		return produtoBo.buscar(codigo);
	}

	/*
	 * @GET
	 * 
	 * @Produces(MediaType.TEXT_PLAIN) public String buscar(){ return "Ola Mundo!";
	 * }
	 */

}
