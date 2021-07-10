package bd;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import model.Produto;

public class BDProdutos {
	
	public List<Produto> getAll() {
		List<Produto> listProduto = new ArrayList<Produto>();
		try {
			Connection conn = BDConnection.getConnection();
			
			Statement st = (Statement) conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * from produto;");
			while (rs.next()) {
				
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				String descricao = rs.getString("descricao");
				int fornecedorId = rs.getInt("fornecedorId");
				String sabor = rs.getString("sabor");
				float preco = rs.getFloat("preco");
				int quantidade = rs.getInt("quantidade");
				Produto produto = new Produto(id,nome,descricao,fornecedorId,sabor,preco,quantidade);
				listProduto.add(produto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listProduto;
		
	}
	
	public Produto getProdutoById(Integer id) {
		Produto produto = null;
		try {
		Connection conn = BDConnection.getConnection();
		
		Statement st = (Statement) conn.createStatement();
		ResultSet rs = st.executeQuery("SELECT * from produto where id = "+ id + ";");
		
		rs.next();
			int newid = rs.getInt("id");
			String nome = rs.getString("nome");
			String descricao = rs.getString("descricao");
			int fornecedorId = rs.getInt("fornecedorId");
			String sabor = rs.getString("sabor");
			float preco = rs.getFloat("preco");
			int quantidade = rs.getInt("quantidade");
			produto = new Produto(id,nome,descricao,fornecedorId,sabor,preco,quantidade);
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		return produto;
	}
	
	public Produto getProdutoByName(String name) {
		Produto produto = null;
		try {
		Connection conn = BDConnection.getConnection();
		
		Statement st = (Statement) conn.createStatement();
		ResultSet rs = st.executeQuery("SELECT * from Produto where nome = \""+ name + "\";");
		
		rs.next();
			int id = rs.getInt("id");
			String nome = rs.getString("nome");
			String descricao = rs.getString("descricao");
			int fornecedorId = rs.getInt("fornecedorId");
			String sabor = rs.getString("sabor");
			float preco = rs.getFloat("preco");
			int quantidade = rs.getInt("quantidade");
			produto = new Produto(id,nome,descricao,fornecedorId,sabor,preco,quantidade);
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		return produto;
	}
	
	public boolean updateProduto(Produto produto) {
		try {
			Connection conn = BDConnection.getConnection();
			
			String query = "UPDATE produto SET nome = ?, descricao = ?, fornecedorid = ?, sabor = ?, preco = ?, quantidade = ? WHERE id = ?";
			PreparedStatement preparedStmt = (PreparedStatement) conn.prepareStatement(query);
			preparedStmt.setString(1, produto.getNome());
			preparedStmt.setString(2, produto.getDesc());
			preparedStmt.setInt(3, produto.getFornecedorId());
			preparedStmt.setString(4, produto.getColor());
			preparedStmt.setFloat(5, produto.getPreco());
			preparedStmt.setInt(6, produto.getQtd());
			
			preparedStmt.setInt(7, produto.getId());
			
			preparedStmt.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	public boolean insertProduto(Produto produto) {
		try {
			Connection conn = BDConnection.getConnection();
			
			String query = "INSERT INTO produto (nome, descricao, fornecedorid, sabor, preco, quantidade) values (?, ?, ?, ?, ?, ?)";
			PreparedStatement preparedStmt = (PreparedStatement) conn.prepareStatement(query);
			preparedStmt.setString(1, produto.getNome());
			preparedStmt.setString(2, produto.getDesc());
			preparedStmt.setInt(3, produto.getFornecedorId());
			preparedStmt.setString(4, produto.getColor());
			preparedStmt.setFloat(5, produto.getPreco());
			preparedStmt.setInt(6, produto.getQtd());
			
			preparedStmt.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean deleteProduto(Produto produto) {
		try {
			Connection conn = BDConnection.getConnection();
			
			String query = "DELETE FROM produto WHERE id = ?";
			PreparedStatement preparedStmt = (PreparedStatement) conn.prepareStatement(query);
			preparedStmt.setInt(1, produto.getId());
			
			preparedStmt.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

}
