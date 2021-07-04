package testes;

import com.mysql.jdbc.Connection;

import bd.BDConnection;
import bd.BDFornecedor;
import model.Fornecedor;

public class BDTeste {
	
	public static void main(String args[]) {
		BDConnection bdConnection = new BDConnection();
		try {
			Connection conn = bdConnection.getConnection();
			BDFornecedor forn = new BDFornecedor();
			forn.getAll();
			Fornecedor forn1 = new Fornecedor("José", "Alvorada 52");
			forn.insertFornecedor(forn1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
