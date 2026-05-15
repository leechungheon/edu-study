<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.domain.MemberDTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원 정보</h1><hr>
	<%MemberDTO m = (MemberDTO)request.getAttribute("info"); %>
	<ul>
		<li>회원 이름 : <%=m.getName() %></li>
		<li>회원 계정 : <%=m.getAccount() %></li>
		<li>회원 암호 : <%=m.getPassword() %></li>
		<li>회원 전화번호 : <%=m.getTel() %></li>
	</ul>
	<ul>
		<li>회원 이름 : ${info.name}</li>
		<li>회원 계정 : ${info.account}</li>
		<li>회원 암호 : ${info.password}</li>
		<li>회원 전화번호 : ${info.tel}</li>
	</ul>
</body>
</html>