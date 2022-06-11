package tw.com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbTools {
	public static Connection getConnection() throws SQLException {
		
		String url ="jdbc:mysql://localhost:3306/testdb20220611?serverTimezone=CST&useSSL=false&allowPublicKeyRetrieval=true"; 
		String acc = "root";
		String pass = "123456";
		Connection conn = DriverManager.getConnection(url,acc,pass);
		
		return conn;
	}
}
