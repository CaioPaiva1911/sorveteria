package model;

import java.util.ArrayList;
import java.util.List;

public class Fornecedor {
	
	private Integer id;
	private String nome;
	private String endereco;
	
	public Fornecedor(String nome, String endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public Fornecedor(Integer id, String nome, String endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	

}
