import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet") // http://localhost:8088/edu/FirstServlet
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<h1>첫 번째 서블릿 수행</h1>");
		out.print("<hr>");
		// http://localhost:8088/edu/FirstServlet?guest=이충헌
		out.println("<h2>반가워요 %s님!!</h2>".formatted(request.getParameter("guest")));
		out.close();
	}
}
