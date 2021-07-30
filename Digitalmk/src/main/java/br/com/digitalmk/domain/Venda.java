package br.com.digitalmk.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
public class Venda extends GenericDomain{
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date horario;
	
	@Column(nullable = false, precision = 7, scale = 2 )
	private BigDecimal precoTotal;
	
	@Column(nullable = false, precision = 6, scale = 2 )
	private BigDecimal precoFor;
	
	@Column(nullable = false, precision = 6, scale = 2 )
	private BigDecimal precoVenda;
	
	@Column(nullable = false, precision = 6, scale = 2 )
	private BigDecimal precoCusto;
	
	@ManyToOne
	@JoinColumn(nullable = true)
	private Cliente cliente;
	
	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}

	public BigDecimal getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(BigDecimal precoTotal) {
		this.precoTotal = precoTotal;
	}

	public BigDecimal getPrecoFor() {
		return precoFor;
	}

	public void setPrecoFor(BigDecimal precoFor) {
		this.precoFor = precoFor;
	}

	public BigDecimal getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(BigDecimal precoVenda) {
		this.precoVenda = precoVenda;
	}

	public BigDecimal getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(BigDecimal precoCusto) {
		this.precoCusto = precoCusto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	@ManyToOne
	@JoinColumn(nullable = false)
	private Funcionario funcionario;
	

}
