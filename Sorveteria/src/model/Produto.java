package model;

public class Produto {


	private Integer id;
	private String nome;
	private String desc;
	private String fornecedor;
	private String color;
	private float preco;
	private Integer qtd;
	
	
	public Produto(Integer id, String nome, String desc, String fornecedor, String color, float preco, Integer qtd) {
		super();
		this.id = id;
		this.nome = nome;
		this.desc = desc;
		this.fornecedor = fornecedor;
		this.color = color;
		this.preco = preco;
		this.qtd = qtd;
	}
	
	
	public Integer getId() {
		return this.id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public Integer getQtd() {
		return qtd;
	}
	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}
}



//Não sei se vou utilizar
enum COR {
	amarelo,
	vermelho,
	laranja,
	
	
}
