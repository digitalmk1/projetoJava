package br.com.digitalmk.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Pessoa extends GenericDomain {
	
	@Column(length = 60, nullable = false)
	private String nome;
	
	@Column(length = 15, nullable = false)
	private String  cpf;
	
	@Column(length = 15, nullable = false)
	private String rg;
	
	@Column(length = 7,nullable = false)
	private String numero;
	
	@Column(length = 50, nullable = false)
	private String bairro;
	
	@Column(length = 8)
	private String cep;
	
	@Column(length = 30)
    private String complemento;
	
	@Column(length = 15, nullable = false)
	private String celular;
	
	@Column(length = 15)
	private String telefone;
	
	@Column(length = 120, nullable = false)
	private String email;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Cidade cidade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	

}
