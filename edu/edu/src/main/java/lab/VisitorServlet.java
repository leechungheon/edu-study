package lab;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Servlet implementation class VisitorServlet
 */
@WebServlet("/visitor")
public class VisitorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String content = request.getParameter("content");
		LocalDate today = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 M월 dd일");
		String formattedDate = today.format(formatter);
		
		out.print("<h1>"+name+"님이 "+formattedDate+"에 남긴 글입니다.</h1><hr>");
		out.print("<h2>"+content+"</h2>");
		out.close();
	}

}
