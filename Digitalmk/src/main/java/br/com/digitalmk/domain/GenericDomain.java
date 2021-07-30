package br.com.digitalmk.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
@SuppressWarnings("serial")
@MappedSuperclass //serve para indicar que não se trata de uma tabela porem vai ser usada por outras.
public class GenericDomain implements Serializable{
@Id 	// serve para informar que é uma chave primaria da tabela.
@GeneratedValue(strategy = GenerationType.AUTO) //serve para o banco gerencia o sequencial do id.
	private long codigo;
	
	public long getCodigo() {
		return codigo;
	}
	
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	
	//@Override
	//public String toString() {
		
		//return String.format("%[codigo=%d]", getClass().getSimpleName(),getCodigo());
	//}


}
