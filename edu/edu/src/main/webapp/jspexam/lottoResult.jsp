<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	if(request.getAttribute("success")!=null&&!(boolean)request.getAttribute("success")){
	%>
		<h1 style="color: red; margin-bottom: 20px;">
		    <%= request.getAttribute("msg") %>
		</h1>
		<img src="<%= request.getAttribute("imginfo") %>" style='width: 700px'><br>
		<a href="/edu/clientexam/lottoForm2.html" 
		   style="display: inline-block; padding: 10px; background: #eee; text-decoration: none;">
		   다시 시도하기
		</a>
	<%
	}else if(request.getAttribute("success")!=null&&(boolean)request.getAttribute("success")){%>
		<h1 style="color: red; margin-bottom: 20px;">
		    <%= request.getAttribute("msg") %>
		</h1>
		<img src="<%= request.getAttribute("imginfo") %>" style='width: 700px'><br>
	<%	
	}else if(request.getAttribute("success")==null){%>
		<h1 style="color: red; margin-bottom: 20px;">
	    <%= request.getAttribute("msg") %>
	</h1>
	<%
	}
	%>
</body>
</html>