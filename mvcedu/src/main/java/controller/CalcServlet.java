package controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/calc")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("CalcServlet 수행~~~~");
		String q1 = request.getParameter("num1");
		String q2 = request.getParameter("num2");
		int num1 = Integer.parseInt(q1);
		int num2 = Integer.parseInt(q2);
		String oper = request.getParameter("oper");
		String view = "";
		if (oper.equals("/") && num2 == 0) {	
			request.setAttribute("msg", "나눗셈 연산시 두 번째 숫자는 0 일 수 없습니다!!");
			view = "/jspexam/errorResult.jsp";
		} else {
			int result = 0;
			switch (oper) {
			case "+" : result = num1 + num2;
					break;
			case "-" : result = num1 - num2;
	          		break;
			case "*" : result = num1 * num2;
	          		break;
			case "/" : result = num1 / num2;
	          		break;
			}			
			request.setAttribute("result", result);
			view = "/jspexam/calcResult.jsp";
		}
		RequestDispatcher rd = request.getRequestDispatcher(view);
		rd.forward(request, response);	
	}
}


