package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.domain.MemberDTO;

import java.io.IOException;

/**
 * Servlet implementation class MemberServlet
 */
@WebServlet("/member")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = getSafeParam(request.getParameter("name"));
	    String tel = getSafeParam(request.getParameter("tel"));
	    String account = getSafeParam(request.getParameter("account"));
	    String password = getSafeParam(request.getParameter("password"));
		
		request.setAttribute("info", new MemberDTO());
		MemberDTO memberDTO = (MemberDTO)request.getAttribute("info");
		memberDTO.setName(name);
		memberDTO.setTel(tel);
		memberDTO.setAccount(account);
		memberDTO.setPassword(password);
		request.setAttribute("name", name);
		request.setAttribute("tel", tel);
		request.setAttribute("account", account);
		request.setAttribute("password", password);
		
		request.getRequestDispatcher("/jspexam/memberView.jsp")
        .forward(request,response);
	}
	public String getSafeParam(String value) {
        return (value != null && !value.trim().isEmpty()) ? value : "없음";
    }

}
