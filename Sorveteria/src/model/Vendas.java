package model;

import java.util.Date;

public class Vendas {
	
	private Date data;
	private Integer produtoId;
	private Integer qtd;
	
	public Vendas(Date data, Integer produtoId, Integer qtd) {
		super();
		this.data = data;
		this.produtoId = produtoId;
		this.qtd = qtd;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Integer getProdutoId() {
		return produtoId;
	}
	public void setProdutoId(Integer produtoId) {
		this.produtoId = produtoId;
	}
	public Integer getQtd() {
		return qtd;
	}
	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}
	
	
	

}
