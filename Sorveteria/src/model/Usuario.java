package model;

public class Usuario {
	
	private String login;
	private String senha;
	
	
	public Usuario(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}
	
	 //TODO comprarProduto();
	public boolean comprarProduto(Produto prod) {
		return true;
	}
	//TODO criar o bd pra lista de desejos e criar a funcao
	public boolean adicionarNaListaDeDesejos(Produto prod) {
		return true;
	}
	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
