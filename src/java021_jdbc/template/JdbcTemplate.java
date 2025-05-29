package java021_jdbc.template;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Expression Edition : xe
// Enterprise Edition : orcl


public class JdbcTemplate {
	public static Connection getconnConnection() {
		Connection conn = null;
						
				try {
					//1. 드라이버 연동
					Class.forName("oracle.jdbc.OracleDriver");
					
					//2.DB서버 연결
					String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
					String username = "hr";
					String password = "a1234";
					conn = DriverManager.getConnection(url,username,password);	
					
					
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		
		return conn;
	}
	

}
