package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertBookLab {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";

		try(Connection conn = DriverManager.getConnection(url,user,passwd);
				PreparedStatement pstmt = conn.prepareStatement("insert into book(title,price,kind) values(?, ?, ?)");
				Scanner sc = new Scanner(System.in)){
			int totalInsertNum=0;
			out:while(true) {
				System.out.print("도서명을 입력하세요 :");
				String bookName = sc.nextLine();
				System.out.print("가격을 입력하세요 :");
				int bookPrice = sc.nextInt();
				sc.nextLine();
				System.out.print("도서분류에 대한 넘버를 입력하세요.\r\n"
						+ "	    1. 프로그래밍 언어\r\n"
						+ "	    2. 웹 프로그래밍\r\n"
						+ "	    3. 빅데이터\r\n"
						+ "	    4. 데이터베이스\r\n"
						+ "	    5. 인프라\r\n"
						+ "            선택(1~5) :");
				String bookKind = sc.nextLine();
				System.out.println("정보가 입력되었습니다.");
				pstmt.setString(1, bookName);
				pstmt.setInt(2, bookPrice);
				pstmt.setString(3, "b0"+bookKind);
				totalInsertNum += pstmt.executeUpdate();
				
				System.out.print("계속 입력하겠습니까?(y/n)");
				while(true) {
					String choice = sc.nextLine();
					if(choice.equalsIgnoreCase("y")) {
						break;
					}else if(choice.equalsIgnoreCase("n")) {
						System.out.println(totalInsertNum+"개의 데이터 입력 완료!");
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
