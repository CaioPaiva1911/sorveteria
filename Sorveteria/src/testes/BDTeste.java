package testes;

import com.mysql.jdbc.Connection;

import bd.BDConnection;

public class BDTeste {
	
	public static void main(String args[]) {
		BDConnection bdConnection = new BDConnection();
		try {
			Connection conn = bdConnection.getConnection();
			System.out.println("yes");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
