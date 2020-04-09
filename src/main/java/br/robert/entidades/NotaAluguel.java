package br.robert.entidades;

import java.util.Date;

@SuppressWarnings("unused")
public class NotaAluguel {
	
	private Integer preco;
	private Date dataEntrega;

	public Integer getPreco() {
		return preco;
	}

	public void setPreco(Integer preco) {
		this.preco = preco;
	}


	public Date getDataEntrega() {
		return dataEntrega;	
		
	} 

	public void setDataEntrega(java.util.Date date) {
		dataEntrega = (Date) date; 
	}
}
