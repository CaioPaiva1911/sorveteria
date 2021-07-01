package model;

public class Admin extends Usuario{

	public Admin(String login, String senha) {
		super(login, senha);
	}
	
	//TODO removerProduto();
	public boolean removerProduto(Produto prod) {
		return true;
	}
	
	//TODO adicionarProduto();
	public boolean adicionarProduto(Produto prod) {
		return true;
	}
	
}
