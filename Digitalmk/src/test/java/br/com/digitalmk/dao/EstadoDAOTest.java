package br.com.digitalmk.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.digitalmk.domain.Estado;

public class EstadoDAOTest {
	@Test
	@Ignore
	public void salvar() {
		Estado estado = new Estado();
		estado.setNome("SAO PAULO");
		estado.setSigla("SP");

		EstadoDAO estadoDAO = new EstadoDAO();
		estadoDAO.salvar(estado);

	}
// listagem

	@SuppressWarnings("unused")
	@Test
	@Ignore
	public void listar() {
		EstadoDAO estadoDAO = new EstadoDAO();
		List<Estado> resultado = estadoDAO.listar();

		for (Estado estado : resultado) {
			System.out.println(estado.getSigla() + "-" + estado.getNome());

		}

	}

	@SuppressWarnings("unused")
	@Test
	@Ignore
	public void buscar() {

		Long codigo = 8L;
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(codigo);

		if (estado == null) {

			System.out.println("Nem um registro encontrado ");
		} else {

			System.out.println("Registro encontrado:");
			System.out.println(estado.getCodigo() + " - " + estado.getNome() + " - " + estado.getSigla());
		}

	}

	@Test
	@Ignore
	public void exculir() {

		Long codigo = 7L;
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(codigo);

		if (estado == null) {

			System.out.println("Nem um registro encontrado ");
		} else {
			estadoDAO.excluir(estado);
			System.out.println("Registro removido com sucesso!:");
			System.out.println(estado.getCodigo() + " - " + estado.getNome() + " - " + estado.getSigla());
		}

	}
	@Test
	@Ignore
  public void editar() {
	  
	  Long codigo = 3L;
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(codigo);
		estado.setNome("Santa Catarina");
		estadoDAO.editar(estado);
	  
  }
}
