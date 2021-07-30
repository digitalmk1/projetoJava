package br.com.digitalmk.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

// estou erdando a chave primaria do GenerecDomain 

@SuppressWarnings("serial")

 @Entity //Serve para informar que o estado é uma entidade do hibernate                    
public class Estado extends GenericDomain {

	@Column(length = 2, nullable = false)
	private String sigla;
	
	 @Column(length = 50, nullable = false)
	private String nome;
	
  
	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
