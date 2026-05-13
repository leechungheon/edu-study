package lab;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class LottoServlet1
 */
@WebServlet("/lotto2")
public class LottoServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		int cnt = 1;
		if(session.getAttribute("cnt")!=null) {
			cnt=(int)session.getAttribute("cnt");
		}else {
			session.setAttribute("cnt", cnt);
		}
		System.out.println(cnt);
		int selectedNum = Integer.parseInt(request.getParameter("number"));
		int lottoNum = (int)(Math.random()*6)+1;
		System.out.println("전달된 값 : "+selectedNum+", 추출된 값 : "+lottoNum);
		
		if(selectedNum==lottoNum && cnt<4) {
			request.setAttribute("msg", "당첨~~~ 추카추카");
			request.setAttribute("imginfo", "/edu/images/chukha.jpg");
			request.setAttribute("success", true);
			cnt=4;
		}else if(cnt<4){
			request.setAttribute("msg", "실패~~~ 아쉽아쉽");
			request.setAttribute("imginfo", "/edu/images/toup.jfif");
			request.setAttribute("success", false);
		}else {
			request.setAttribute("msg", "더 이상 응모할 수 없어요... 브라우저를 재기동한 후에는 가능하답니다.");
		}
		session.setAttribute("cnt", cnt+1);
		request.getRequestDispatcher("/jspexam/lottoResult.jsp").forward(request, response);
	}

}
