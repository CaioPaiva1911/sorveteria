package model;

public class Usuario {
	
	private int id;
	private String login;
	private String senha;
	private String tipo;
	
	public Usuario(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}
	
	public Usuario(int id, String login, String senha, String tipo) {
		super();
		this.login = login;
		this.senha = senha;
		this.tipo = tipo;
	}
	
	public int getId() {
		return id;
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
	public String getTipo() {
		return tipo;
	}


	
	
	
	

}
