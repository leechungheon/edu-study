package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectBookLab {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";

		try(Connection conn = DriverManager.getConnection(url,user,passwd);
				Statement stmt = conn.createStatement();
				Scanner sc = new Scanner(System.in)){
			out:while(true) {
				System.out.print("1. 모두 출력하기\r\n"
						+ "2. 가격이 높은 순으로 출력하기\r\n"
						+ "3. 20000 이상의 도서들만 출력하기 \r\n"
						+ "4. 웹 프로그래밍 도서들만 출력하기\r\n"
						+ "5. 데이터베이스와 인프라 도서들만 출력하기\r\n"
						+ "6. 도서명에 '자바'를 포함하는 도서들만 출력하기\r\n"
						+ "             \r\n"
						+ "원하는 메뉴의 번호를 선택 : ");
				int menuNum = sc.nextInt();
				ResultSet rs;
				switch(menuNum) {
				case 1:
					rs = stmt.executeQuery("select id, title, concat(format(price,0),'원') as price, kind from book");
					while(rs.next()) {
						System.out.printf("%d, %s, %s, %s\n", rs.getInt("id"), rs.getString("title"), rs.getString("price"), rs.getString("kind"));
					}
					break;
				case 2:
					rs = stmt.executeQuery("select id, title, concat(format(price,0),'원') as p, kind from book order by price desc");
					while(rs.next()) {
						System.out.printf("%d, %s, %s, %s\n", rs.getInt("id"), rs.getString("title"), rs.getString("p"), rs.getString("kind"));
					}
					break;
				case 3:
					rs = stmt.executeQuery("select title, concat(format(price,0),'원') as price from book where price>=20000");
					while(rs.next()) {
						System.out.printf("%s, %s\n", rs.getString("title"), rs.getString("price"));
					}
					break;
				case 4:
					rs = stmt.executeQuery("select title, concat(format(price,0),'원') as price from book where kind='b02'");
					while(rs.next()) {
						System.out.printf("%s, %s\n", rs.getString("title"), rs.getString("price"));
					}
					break;
				case 5:
					rs = stmt.executeQuery("select title, concat(format(price,0),'원') as price from book where kind='b04' or kind='b05'");
					while(rs.next()) {
						System.out.printf("%s, %s\n", rs.getString("title"), rs.getString("price"));
					}
					break;
				case 6:
					rs = stmt.executeQuery("select title, concat(format(price,0),'원') as price from book where title like '%자바%'");
					while(rs.next()) {
						System.out.printf("%s, %s\n", rs.getString("title"), rs.getString("price"));
					}
					break;
				}
				System.out.print("계속 입력하겠습니까?(y/n)");
				while(true) {
					String choice = sc.next();
					if(choice.equalsIgnoreCase("y")) {
						break;
					}else if(choice.equalsIgnoreCase("n")) {
						break out;
					}else {
						System.out.println("잘못된 형식입니다.");
					}
				}
			}
				
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
