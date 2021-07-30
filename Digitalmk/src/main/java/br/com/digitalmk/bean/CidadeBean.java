package br.com.digitalmk.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import org.omnifaces.util.Messages;

import br.com.digitalmk.dao.CidadeDAO;
import br.com.digitalmk.dao.EstadoDAO;
import br.com.digitalmk.domain.Cidade;
import br.com.digitalmk.domain.Estado;

@SuppressWarnings("serial")
@ManagedBean
@ViewScoped

public class CidadeBean implements Serializable {
	private Cidade cidade;
	private List<Cidade> cidades;
	private List<Estado> estados; // carregar combobox

	public List<Estado> getEstados() {
		return estados;
	}

	public void setEstados(List<Estado> estados) {
		this.estados = estados;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public List<Cidade> getCidades() {
		return cidades;
	}

	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
	}

	@PostConstruct
	public void lista() {

		try {

			CidadeDAO cidadeDAO = new CidadeDAO();
			cidades = cidadeDAO.listar();

		} catch (RuntimeException erro) {
			Messages.addFlashGlobalError("Erro ao listar conteudo ");
			erro.printStackTrace();
		}

	}

	public void novo() {

		try {
			cidade = new Cidade();

			EstadoDAO estadoDAO = new EstadoDAO();// INICIANDO A INSTANCIA DO OBJETO DA COMBOBOX
			estados = estadoDAO.listar();

		} catch (RuntimeException erro) {
			Messages.addFlashGlobalError("Erro ao inserir um novo registro");
			erro.printStackTrace();
		}

	}

	public void salvar() {

		try {

			CidadeDAO cidadeDAO = new CidadeDAO();
			cidadeDAO.merge(cidade);

			cidade = new Cidade();

			EstadoDAO estadoDAO = new EstadoDAO();
			estados = estadoDAO.listar();

			cidades = cidadeDAO.listar();

			Messages.addGlobalInfo("Dados Gravados com sucesso!!");
		} catch (RuntimeException erro) {
			Messages.addFlashGlobalError("Erro ao inserir um novo registro");
			erro.printStackTrace();
		}

	}

	public void excluir(ActionEvent evento) {

		try {

			cidade = (Cidade) evento.getComponent().getAttributes().get("linhaSelecionada");

			CidadeDAO cidadeDAO = new CidadeDAO();
			cidadeDAO.excluir(cidade);

			cidades = (List<Cidade>) cidadeDAO.listar();// limpando a tela apos a exclusão acertar tabem na visão com
														// ajax em opcoes.
			Messages.addFlashGlobalInfo("Dados Excluidos com sucesso!!");

		} catch (RuntimeException erro) {

			Messages.addFlashGlobalError("Atenção! ocorreu um erro ao tentar excluir");
			erro.printStackTrace();
		}
	}

	public void editar(ActionEvent evento) {

		try {
			cidade = (Cidade) evento.getComponent().getAttributes().get("linhaSelecionada");

			EstadoDAO estadoDAO = new EstadoDAO();// INICIANDO A INSTANCIA DO OBJETO DA COMBOBOX
			estados = estadoDAO.listar();

		} catch (RuntimeException erro) {
			Messages.addFlashGlobalError("Erro ao inserir um novo registro");
			erro.printStackTrace();
		}
	}
}