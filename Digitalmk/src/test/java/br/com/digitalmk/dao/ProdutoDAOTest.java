package br.com.digitalmk.dao;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.digitalmk.domain.Marca;
import br.com.digitalmk.domain.Produto;


public class ProdutoDAOTest {
	
	
	@Test
	public void salvar() {
		
	MarcaDAO marcaDAO = new MarcaDAO();
	Marca marca = marcaDAO.buscar(2L);
	Produto produto = new Produto();
	produto.setDescricao("NOTEBOOK SONY VAIO T/ 15 POLEGADAS HD SSD");
	produto.setMarca(marca);
	produto.setPreco(new BigDecimal("380.00"));
	produto.setQuantidade(new Short("5"));

	ProdutoDAO produtoDAO = new ProdutoDAO();
	produtoDAO.salvar(produto);
	System.out.println("Produto Salvo com sucesso");
	
	}

}
