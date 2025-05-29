package java021_jdbc.part01;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class JdbcTest {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	public JdbcTest() {
		// TODO Auto-generated constructor stub
	}
	
	public void process() {
		//1. 드라이버 연동
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		//2.DB서버 연결
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String username = "hr";
			String password = "a1234";
					
			Connection conn = DriverManager.getConnection(url,username,password );
//			System.out.println(conn);
			
			//3. 쿼리문 실행을 위한 Statement 객체를 생성
			stmt = conn.createStatement();
			
			//4. 쿼리문을 실행 : SELECT - executeQuery(),
			// 		         UPDATE, INSERT, DELETE - executeUpdate()
			String sql = "SELECT * FROM mem	";
			rs = stmt.executeQuery(sql);
//			System.out.println(rs.);
			
			//5. 쿼리의 결과 출력
			// 	rs.next() : 다음에 읽어올 레코드가있는지 여부를 체크한다.
			while(rs.next()) {
				int num = rs.getInt("num");  // num number
				String name = rs.getNString("name");  //  name varchar2
				int age = rs.getInt("age");  // age number
				String loc = rs.getString("loc");  //  loc varchar2
				System.out.printf("%d %s %d %s\n",num,name,age,loc);
				}
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			//6. 자원 종료
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(stmt !=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(conn !=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
