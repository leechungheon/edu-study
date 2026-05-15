package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

public class SelectEmpLab {

	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		try(Connection conn = DriverManager.getConnection(url, user, passwd);
		Statement stmt = conn.createStatement();){
			if(new Random().nextBoolean()) {
			ResultSet rs = stmt.executeQuery("select ename, sal from emp");
			while(rs.next()) {
				System.out.printf("%s 직원의 월급은 %,d달러입니다.\n", rs.getString("ename"), rs.getInt("sal"));
			}
			rs.close();
		}else {
			ResultSet rs = stmt.executeQuery("select ename, year(hiredate) as y, month(hiredate) as m, day(hiredate) as d from emp order by hiredate");
			while(rs.next()) {
				System.out.printf("%s 직원은 %d년 %d월 %d일에 입사하였습니다.\n", rs.getString("ename"), rs.getInt("y"), rs.getInt("m"), rs.getInt("d"));
			}
			rs.close();
		}
			
		}	
	}
}
