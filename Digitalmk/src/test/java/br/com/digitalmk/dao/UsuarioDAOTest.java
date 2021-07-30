package br.com.digitalmk.dao;

import org.junit.Test;

import br.com.digitalmk.domain.Pessoa;
import br.com.digitalmk.domain.Usuario;

public class UsuarioDAOTest {
	@Test
	public void salvar() {
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa  = pessoaDAO.buscar(1L);
		
		Usuario usuario = new Usuario();
		usuario.setAtivo(true);
		usuario.setPessoa(pessoa);
		usuario.setSenha("123456");
		usuario.setTipo('A');
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.salvar(usuario);
	}

}
