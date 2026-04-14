package lab;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReservationServlet
 */
@WebServlet("/reservation")
public class ReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String room = request.getParameter("room");
		String[] extra = request.getParameterValues("extra");
		String dateStr = request.getParameter("date");
		LocalDate parsedDateStr = LocalDate.parse(dateStr);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		String date = formatter.format(parsedDateStr);
		
		out.print("<h1 style= 'color:blue;'>"+name+"님의 예약내용</h1><hr>");
		out.print("<ul>");
		out.print("<li>선택한 룸 : "+room+"</li>");
		out.print("<li>추가 요청 사항 : ");
		for(int i=0; i<extra.length; i++) {
			out.print(extra[i]);
			if(i!=extra.length-1) {
				out.print(",");
			}else {
				out.print("</li>");
			}
		}
		out.print("<li>예약날짜 : "+date+"</li>");
	}

}
