package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CheckEmpLab {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
        String user = "jdbctest";
        String passwd = "jdbctest";
        try(Connection conn = DriverManager.getConnection(url, user, passwd);
        		Scanner sc = new Scanner(System.in);
        		Statement stmt = conn.createStatement()) {
            while (true) {
                System.out.print("직원의 이름을 입력하세요: ");
                String inputName = sc.next();

                ResultSet rs = stmt.executeQuery("select ename, year(hiredate) as y, month(hiredate) as m, deptno from emp where ename = '" + inputName + "'");
                if (rs.next()) {
                    System.out.printf("%s 직원은 근무중입니다.\n", rs.getString("ename"));
                    System.out.printf("%d년 %d월에 입사했고 현재 %d번 부서에서 근무하고 있습니다.\n", rs.getInt("y"), rs.getInt("m"), rs.getInt("deptno"));
                } else {
                    System.out.printf("%s 직원은 존재하지 않습니다.\n", inputName);
                }
                System.out.print("검토를 종료하려면 n을 누르세요. (계속 하려면 아무 키나 누르세요)");
                String str = sc.next();
                if (str.equalsIgnoreCase("n")) {
                    break;
                }
                rs.close();
            }
        } catch (SQLException e) {
        	e.printStackTrace();
        }
    }
}