package bd;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class BDVendas {
	
	public void insertVenda(int produtoid, int quantidade) {
		try {
			Connection conn = BDConnection.getConnection();
			
			String query = "INSERT INTO venda (produtoid, quantidade) values (?, ?)";
			PreparedStatement preparedStmt = (PreparedStatement) conn.prepareStatement(query);
			preparedStmt.setInt(1, produtoid);
			preparedStmt.setInt(2, quantidade);
			
			preparedStmt.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * 
	 * TODO
	 * getAll();
	 * getVendasPorProduto();
	 * getVendasPorDia();
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
