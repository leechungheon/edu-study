package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

public class SelectPatternEmp2 {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		Connection conn = DriverManager.getConnection(url, user, passwd);
		Statement stmt = conn.createStatement();
		String munja;
		if(new Random().nextBoolean())
			munja = "Z";
		else
			munja = "S";
		ResultSet rs = stmt.executeQuery("select ename, job, sal, deptno  from emp where ename like '%"+munja+"%'");
		
		if(rs.next()) { // 한 행이라도 있는지 없는지 체크
			System.out.printf("%8s%8s%8s%4s\n", "성명", "직무", "급여", "부서");
			System.out.println("  -----------------------------------");
			do{
					System.out.printf("%10s%12s%8d%4d\n", 
							rs.getString("ename"), rs.getString("job"), 
							rs.getInt("sal"), rs.getInt("deptno"));
			}while (rs.next());
		}else {
			System.out.println("이름에 "+munja+"를 포함하고 있는 직원은 없어요~~");
		}
		
		rs.close();
		stmt.close();
		conn.close();
	}
}
