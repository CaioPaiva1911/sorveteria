package model;

import bd.BDProdutos;
import bd.BDUsuario;

public class Admin extends Usuario{

	public Admin(String login, String senha) {
		super(login, senha);
	}
	public Admin(int id,String login, String senha, String tipo) {
		super(id, login, senha, tipo);
	}
	
	public boolean cadastrarCliente(Usuario usuario) {
		BDUsuario bd = new BDUsuario();
		return bd.insertUser(usuario);
	}
	
	public boolean alterarCliente(Usuario usuario) {
		BDUsuario bd = new BDUsuario();
		return bd.updateUser(usuario);
		
	}
	
	public boolean removerProduto(Produto prod) {
		BDProdutos bd = new BDProdutos();
		return bd.deleteProduto(prod);
	}

	public boolean adicionarProduto(Produto prod) {
		BDProdutos bd = new BDProdutos();
		return bd.insertProduto(prod);
	}
	
}
