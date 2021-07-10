package utils;

import bd.BDUsuario;
import model.Usuario;

public class Logar {
	
	
	public static Usuario logar(String login, String senha) {
		BDUsuario bdusuario = new BDUsuario();
		Usuario achadoNoBanco = bdusuario.getUsuarioByName(login);
		
		if (achadoNoBanco.getLogin().equals(login) && achadoNoBanco.getSenha().equals(senha)) {
			return achadoNoBanco;
		}
		
		return null;		
	}
	
	public static boolean isAdmin(Usuario usuario) {
		
		usuario = logar(usuario.getLogin(), usuario.getSenha());
		if (usuario.getTipo() != null) {
			if (usuario.getTipo().equals("admin") ) {
				return true;
			}
		}
		return false;
	}
}
