package br.com.digitalmk.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import org.omnifaces.util.Messages;

import br.com.digitalmk.dao.EstadoDAO;
import br.com.digitalmk.domain.Estado;

@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class EstadoBean implements Serializable {

	private Estado estado;
	private List<Estado> estados;

	public List<Estado> getEstados() {
		return estados;
	}

	public void setEstados(List<Estado> estados) {
		this.estados = estados;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	// ------conteudo----------///

	@PostConstruct // para carregar a grid quando a tela for aberta
	public void listar() {

		try {

			EstadoDAO estadoDAO = new EstadoDAO();
			estados = estadoDAO.listar();

		} catch (RuntimeException erro) {
			Messages.addFlashGlobalError("Erro ao listar conteudo ");
			erro.printStackTrace();
		}

	}

	public void novo() {

		estado = new Estado();
	}

	public void salvar() {

		EstadoDAO estadoDAO = new EstadoDAO();
		estadoDAO.merge(estado); //meger defini entre editar e salvar

		novo();
		estados = estadoDAO.listar();//vai forcar recarregar a pesquisa para atualizar as iformações.

		Messages.addFlashGlobalInfo("Estado Salvo com sucesso");

	}

	public void excluir(ActionEvent evento) {

		try {
		
		estado = (Estado) evento.getComponent().getAttributes().get("linhaSelecionada");
		
		EstadoDAO estadoDAO = new EstadoDAO();
		estadoDAO.excluir(estado);
		
		estados = estadoDAO.listar(); //limpando a tela apos a exclusão acertar tabem na visão com ajax em opcoes.
		Messages.addFlashGlobalInfo("Dados Excluidos com sucesso!!");
		
		}catch(RuntimeException erro) {
			
			Messages.addFlashGlobalError("Atenção! ocorreu um erro ao tentar excluir");
			erro.printStackTrace();
		}

	}
	
	public void editar(ActionEvent evento) {
		
		estado = (Estado) evento.getComponent().getAttributes().get("linhaSelecionada");
		
	}

}
