package controller;

import java.util.List;

import bd.BDUsuario;
import model.Admin;
import model.Usuario;
import utils.Logar;

public class ControllerUsuario {
	
	public List<Usuario> usuarios;
	Usuario usuario;
	Admin admin;
	
	BDUsuario bdusuario = new BDUsuario();
	
	public boolean cadastrarUsuario(Usuario usuario,String login, String senha) {
		if (Logar.isAdmin(usuario)) {
			admin = (Admin) usuario;
				
			Usuario user = new Usuario(login, senha);
			admin.cadastrarCliente(usuario);
			return true;
				
		}
		return false;
	}
	
	public boolean alterarUsuario(Usuario usuarioLogado, Usuario usuario) {
		if ( Logar.isAdmin(usuarioLogado) ) {
			return bdusuario.updateUser(usuario);
		}
		return false;
	}
	


	
	public Usuario pegarUsuarioPorID(Usuario usuarioLogado, String ID) {
		if (Logar.isAdmin(usuarioLogado)) {
			return bdusuario.getUsuarioById(Integer.parseInt(ID));
		}
		return null;
	}

	public Usuario pegarUsuarioPorNome(Usuario usuarioLogado, String nomeUsuario) {
		if (Logar.isAdmin(usuarioLogado)) {
			return bdusuario.getUsuarioByName(nomeUsuario);
		}
		return null;
		
	}

	public Usuario SemLoginPegarUsuarioPorNome(String nomeUsuario) {
		Usuario usuario = bdusuario.getUsuarioByName(nomeUsuario);
		//Seta a senha para "", assim, evitando que o acesso SEM LOGIN pegue a senha dos usuarios
		usuario.setSenha("");
		return usuario;
	}
	
	

}
