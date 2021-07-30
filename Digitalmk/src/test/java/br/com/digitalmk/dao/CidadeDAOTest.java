
package br.com.digitalmk.dao;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.digitalmk.domain.Cidade;
import br.com.digitalmk.domain.Estado;

public class CidadeDAOTest {
	@Test
	@Ignore
	public void salvar() {
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(3L);

		Cidade cidade = new Cidade();
		cidade.setNome("CRISCIUMA");
		cidade.setEstado(estado);

		CidadeDAO cidadeDAO = new CidadeDAO();
		cidadeDAO.salvar(cidade);

	}

	@Test
	@Ignore
	public void listar() {

		CidadeDAO cidadeDAO = new CidadeDAO();
		List<Cidade> resultado = cidadeDAO.listar();

		for (Cidade cidade : resultado) {
			System.out.println("Codigo:" + cidade.getCodigo());
			System.out.println("Nome da cidade:" + cidade.getNome());
			System.out.println("sigla do estado:" + cidade.getEstado().getSigla());
			System.out.println("codigo do estado:" + cidade.getEstado().getCodigo());
			System.out.println("nome do estado:" + cidade.getEstado().getNome());
			System.out.println();
		}

	}
	@Test
	@Ignore
	public void buscar() {
		long codigo = 3L;
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigo);
		System.out.println("Codigo:" + cidade.getCodigo());
		System.out.println("Nome da cidade:" + cidade.getNome());
		System.out.println("sigla do estado:" + cidade.getEstado().getSigla());
		System.out.println("codigo do estado:" + cidade.getEstado().getCodigo());
		System.out.println("nome do estado:" + cidade.getEstado().getNome());
		
	}
	@Test
	@Ignore
	public void excluir() {
		
		long codigo = 5L;
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigo);
		
		if(cidade == null) {
			System.out.println("Nem um registro encontrado");
			
		}else {
			
			cidadeDAO.excluir(cidade);
		}
		
	}
	
	@Test
	public void editar() {
	Long codigo = 6L;
	CidadeDAO cidadeDAO = new CidadeDAO();
	Cidade cidade = cidadeDAO.buscar(codigo);
	cidade.setNome("JAGUARUNA");
	cidadeDAO.editar(cidade);
		
		
	}

		
	
}