package controller;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import model.domain.ProductDTO;

@WebServlet("/cart")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(); // true
		if(session.getAttribute("cart") == null) {
			session.setAttribute("cart", new ProductDTO());
		}
		ProductDTO p = (ProductDTO)session.getAttribute("cart");
		
		String pid = request.getParameter("pid");
		if (pid != null) {
			if(pid.equals("p001"))
				p.setApple(1);
			else if(pid.equals("p002"))
				p.setBanana(1);
			else if (pid.equals("p003"))
				p.setHalabong(1);
		} else { 
			session.removeAttribute("cart");
		}
		request.getRequestDispatcher("/jspexam/productView.jsp")
		                                .forward(request,response);
	}
}
