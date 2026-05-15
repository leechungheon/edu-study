package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import model.service.MeetingDAO;
import model.domain.MeetingDTO;
import model.domain.ReplyDTO;

@WebServlet("/meeting")
public class MeetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String targetName = request.getParameter("targetname");
		String id = request.getParameter("id");
		String action = request.getParameter("action");

		MeetingDAO dao = new MeetingDAO();
		if(targetName== null) {
			if(action != null && action.equals("delete")) {
				boolean result = dao.deleteM(Integer.parseInt(id));
				if (result) {
					request.setAttribute("msg", "글이 성공적으로 삭제되었습니다.");
				} else {
					request.setAttribute("msg", "글이 삭제되지 않았습니다.");
				}				
			} else if(action != null && action.equals("ireply")){
				ReplyDTO vo = new ReplyDTO();
				vo.setRefid(Integer.parseInt(request.getParameter("refid")));
				vo.setName(request.getParameter("name"));
				vo.setContent(request.getParameter("content"));
				boolean result = dao.insertReply(vo);
				response.setContentType("text/json; charset=utf-8");
				PrintWriter out = response.getWriter();
				HashMap<String, Boolean> hm = new HashMap<>();
				if (result)
					hm.put("result", true);
				else
					hm.put("result", false);				
				JSONObject obj = new JSONObject(hm);				
				out.print(obj.toJSONString());
				out.close();
				return;				
			} else if(action != null && action.equals("lreply")){				
				List<ReplyDTO> list = dao.listReply(Integer.parseInt(request.getParameter("id")));
				response.setContentType("text/json; charset=utf-8");
				PrintWriter out = response.getWriter();
				HashMap<String, String> hm = null;
				JSONArray jsonArray = new JSONArray();
				for (ReplyDTO vo : list) {
					hm = new HashMap<>();
					hm.put("id", String.valueOf(vo.getId()));
					hm.put("name", vo.getName());
					hm.put("content", vo.getContent());
					JSONObject obj = new JSONObject(hm);
					jsonArray.add(obj);
				}
				out.print(jsonArray.toJSONString());
				out.close();
				return;				
			} 	
			request.setAttribute("list", dao.listM());
		} else {
			List<MeetingDTO> list = dao.searchM(targetName);
			if (list != null && list.size() == 0) {
				request.setAttribute("msg", targetName + "님을 만나기로한 글이 없습니다.");
			} else {
				request.setAttribute("list", dao.searchM(targetName));
			}
		}
		request.getRequestDispatcher("/jspexam/meetingView.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		String name = request.getParameter("name");
		String title = request.getParameter("title");
		String meetingDate = request.getParameter("meetingDate");
		MeetingDAO dao = new MeetingDAO();
		MeetingDTO vo = new MeetingDTO();
		vo.setName(name);
		vo.setTitle(title);
		vo.setMeetingDate(meetingDate);
		if(action.equals("insert")) {
			boolean result = dao.insertM(vo);
			if (result) {			
				request.setAttribute("msg", name + "님의 글이 성공적으로 입력되었습니다.");			
			} else {
				request.setAttribute("msg", name + "님의 글이 입력되지 않았습니다.");
			}
		} else {
			vo.setId(Integer.parseInt(action));
			boolean result = dao.updateM(vo);
			if (result) {			
				request.setAttribute("msg", name + "님의 글이 성공적으로 수정되었습니다.");			
			} else {
				request.setAttribute("msg", name + "님의 글이 수정되지 않았습니다.");
			}
		}
		request.setAttribute("list", dao.listM());
		request.getRequestDispatcher("/jspexam/meetingView.jsp").forward(request, response);
	}
}
