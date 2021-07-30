package br.com.digitalmk.dao;

import org.junit.Test;

import br.com.digitalmk.domain.Cidade;
import br.com.digitalmk.domain.Pessoa;

public class PessoaDAOTest {
	@Test
	public void salvar() {
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(1L);
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("MILENA MISAELY FLORENTINO OLIVEIRA");
		pessoa.setBairro("OFICINAS");
		pessoa.setCidade(cidade);
		pessoa.setCelular("(48)36262354");
		pessoa.setCep("88701000");
		pessoa.setComplemento("RUA PEDRO GOMES DE CARVALHO");
		pessoa.setEmail("milenamisaely@gmail.com");
		pessoa.setNumero("3567");
		pessoa.setRg("0795345462");
		pessoa.setTelefone("(48)3053-2156");
		pessoa.setCpf("86699422587");
		PessoaDAO pessoaDAO = new PessoaDAO();
		pessoaDAO.salvar(pessoa);
		
	
		
		

	}

}
