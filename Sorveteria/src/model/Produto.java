package model;

public class Produto {


	private Integer id;
	private String nome;
	private String desc;
	private int fornecedorId;
	private String color;
	private float preco;
	private Integer qtd;
	
	public Produto(String nome, String desc, int fornecedorId, String color, float preco, Integer qtd) {
		super();
		this.nome = nome;
		this.desc = desc;
		this.fornecedorId = fornecedorId;
		this.color = color;
		this.preco = preco;
		this.qtd = qtd;
	}
	
	public Produto(Integer id, String nome, String desc, int fornecedorId, String color, float preco, Integer qtd) {
		super();
		this.id = id;
		this.nome = nome;
		this.desc = desc;
		this.fornecedorId = fornecedorId;
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
	public int getFornecedorId() {
		return fornecedorId;
	}
	public void setFornecedorId(int fornecedorId) {
		this.fornecedorId = fornecedorId;
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
