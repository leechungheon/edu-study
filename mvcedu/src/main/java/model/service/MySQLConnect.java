package model.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnect {
	public static Connection connect() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=Asia/Seoul";
			conn = DriverManager.getConnection(url, "jdbctest", "jdbctest");			
		} catch (Exception e) {
			System.out.println("DB접속오류 발생!!");
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void close(Connection conn) {
		try {
			conn.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
