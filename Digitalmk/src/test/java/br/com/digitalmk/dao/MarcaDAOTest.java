package br.com.digitalmk.dao;

import org.junit.Ignore;
import org.junit.Test;

import br.com.digitalmk.domain.Marca;

public class MarcaDAOTest {

	@Test
	@Ignore
	public void salvar() {

		Marca marca = new Marca();
		marca.setDescricao("");

		MarcaDAO marcaDAO = new MarcaDAO();
		marcaDAO.salvar(marca);

	}

	@Test
	public void merge() {

		//Marca marca = new Marca();
		//marca.setDescricao("TESTE B");

		//MarcaDAO marcaDAO = new MarcaDAO();
		//marcaDAO.merge(marca);
		
		MarcaDAO marcaDAO = new MarcaDAO();
		Marca marca = marcaDAO.buscar(9L);
		marca.setDescricao("SAMSUNG");
		marcaDAO.merge(marca);
	}
	
	
}
