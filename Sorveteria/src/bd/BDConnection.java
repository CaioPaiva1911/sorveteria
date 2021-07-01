package bd;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class BDConnection {
	
	static String dbUrl = "jdbc:mysql://localhost:3306/sostenes";
	static String user = "root";
	static String password = "1234567";

	public static Connection conn = null;
	
	public static Connection getConnection() {
		try {
			conn = (Connection) DriverManager.getConnection(dbUrl, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	
}
