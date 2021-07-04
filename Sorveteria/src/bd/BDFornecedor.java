package bd;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import model.Fornecedor;

public class BDFornecedor {
	
	public List<Fornecedor> getAll() {
		List<Fornecedor> listFornecedor = new ArrayList<Fornecedor>();
		try {
			Connection conn = BDConnection.getConnection();
			
			Statement st = (Statement) conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * from Fornecedor;");
			while (rs.next()) {
				
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				String endereco = rs.getString("endereco");
				Fornecedor fornecedor = new Fornecedor(id,nome,endereco);
				listFornecedor.add(fornecedor);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listFornecedor;
		
	}
	
	public Fornecedor getFornecedorById(Integer id) {
		Fornecedor fornecedor = null;
		try {
		Connection conn = BDConnection.getConnection();
		
		Statement st = (Statement) conn.createStatement();
		ResultSet rs = st.executeQuery("SELECT * from Fornecedor where id = "+ id + ";");
		
		rs.next();
		String nome = rs.getString("nome");
		String endereco = rs.getString("endereco");
		fornecedor = new Fornecedor(id,nome,endereco);
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		return fornecedor;
	}
	
	public boolean insertFornecedor(Fornecedor fornecedor) {
		try {
			Connection conn = BDConnection.getConnection();
			
			String query = "INSERT INTO Fornecedor (nome, endereco) values (?, ?)";
			PreparedStatement preparedStmt = (PreparedStatement) conn.prepareStatement(query);
			preparedStmt.setString(1, fornecedor.getNome());
			preparedStmt.setString(2, fornecedor.getEndereco());
			
			preparedStmt.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
