package br.com.digitalmk.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
public class Funcionario extends GenericDomain {
	
	@Column(length = 80, nullable = false)
	private String descricao;

	@Column(nullable = true)
	@Temporal(TemporalType.DATE)
	private Date dataAdmissao;
	
	@JoinColumn(nullable = false)
	@OneToOne
	private Pessoa pessoa;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
