package bd;

import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import model.Admin;
import model.Usuario;

public class BDUsuario {
	
	public Usuario getUsuarioById(Integer id) {
		Usuario usuario = null;
		try {
			Connection conn = BDConnection.getConnection();
			
			Statement st = (Statement) conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * from usuario where id = "+ id + ";");
			
			rs.next();
			int newid = rs.getInt("id");
			String nome = rs.getString("nome");
			String senha = rs.getString("senha");
			String tipousuario = rs.getString("tipousuario");
			if (tipousuario.equals("admin")) {
				//Cast para usuário porque, quando pega por ID, é usado somente para leitura. A classe nao deve ser usada para modificar algo
				usuario = (Usuario) new Admin(newid,nome, senha,tipousuario);
			} else {
				usuario = new Usuario(newid,nome, senha,tipousuario);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return usuario;
	}
	
	public Usuario getUsuarioByName(String name) {
		Usuario usuario = null;
		try {
			Connection conn = BDConnection.getConnection();
			
			Statement st = (Statement) conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * from usuario where nome = "+ "\"" + name + "\";");
			
			rs.next();
			int id = rs.getInt("id");
			String nome = rs.getString("nome");
;			String senha = rs.getString("senha");
			String tipousuario = rs.getString("tipousuario");
			if (tipousuario.equals("admin")) {
				//Cast para usuário porque, na classe BDUsuario,não pode ter QUALQUER execução dessas classes.
				//A classe BDUsuario somente faz a consulta, nada mais que isto.
				//Caso o usuario precise ser usado como admin, deverá ser feito o upcasting na classe controlladora(controller)
				usuario = (Usuario) new Admin(id,nome, senha,tipousuario);
			} else {
				usuario = new Usuario(id,nome, senha,tipousuario);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return usuario;
	}
	
	public boolean updateUser(Usuario usuario) {
		try {
			Connection conn = BDConnection.getConnection();
			
			String query = "UPDATE usuario SET nome = ?, senha = ? where id = ?";
			PreparedStatement preparedStmt = (PreparedStatement) conn.prepareStatement(query);
			preparedStmt.setString(1, usuario.getLogin());
			preparedStmt.setString(2, usuario.getSenha());
			preparedStmt.setInt(3, usuario.getId());
			
			preparedStmt.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean insertUser(Usuario usuario) {
		try {
			Connection conn = BDConnection.getConnection();
			
			String query = "INSERT INTO usuario (nome, senha, tipousuario) values (?, ?, ?)";
			PreparedStatement preparedStmt = (PreparedStatement) conn.prepareStatement(query);
			preparedStmt.setString(1, usuario.getLogin());
			preparedStmt.setString(2, usuario.getSenha());
			preparedStmt.setString(3, "comum");
			
			preparedStmt.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
