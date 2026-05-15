package lab;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LottoServlet1
 */
@WebServlet("/lotto")
public class LottoServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;");
		int selectedNum = Integer.parseInt(request.getParameter("number"));
		int lottoNum = (int)(Math.random()*6)+1;
		System.out.println("전달된 값"+selectedNum+", 추출된 값 : "+lottoNum);
		
		RequestDispatcher rd;
		if(selectedNum==lottoNum) {
			rd = request.getRequestDispatcher("/clientexam/success.html");
		}else {
			rd = request.getRequestDispatcher("/clientexam/fail.html");
		}

		rd.forward(request,  response);
	}

}
