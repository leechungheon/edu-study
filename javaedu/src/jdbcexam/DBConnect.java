package jdbcexam;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	public static void main(String[] args) {
		Connection conn = null;
		try {
			String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "jdbctest";
			String passwd = "jdbctest";
			conn = DriverManager.getConnection(url, user, passwd);
			System.out.println("데이터베이스에 접속했습니다.");
		    DatabaseMetaData meta = conn.getMetaData();
			System.out.println("DB 서버명 : "+meta.getDatabaseProductName());		
			System.out.println("사용자명 : "+meta.getUserName());						
		} catch (SQLException se1) {
			System.out.println(se1);
		} finally {
			try {
				conn.close();
			}catch(SQLException se2) {
				System.out.println(se2.getMessage());
			}
		}
	}
}
