<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, model.domain.VisitorDTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MVC기반의방명록</title>
<style>
@font-face {
    font-family: 'Happiness-Sans-Title';
    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2205@1.0/Happiness-Sans-Title.woff2') format('woff2');
    font-weight: normal;
    font-style: normal;
}
* {
	font-family: 'Happiness-Sans-Title';
}
table {
	border-collapse: collapse;
}

th {
	border-bottom: 2px solid #008000;
	padding: 5px 20px 5px 20px
}

td {
	border-bottom: 1px dotted #004d00;
	padding: 5px 20px 5px 10px
}

th {
	color: #004d00;	
}

tr:hover {
	background-color: #b3ffb3;
}

hr {
	margin-bottom : 20px;
}

#buttonstyle {
	text-decoration : none;
	padding : 10px;
	border : 1px solid #33ff33;
	border-radius : 5px;
	font-weight : bold;
	background-image : linear-gradient(to right, yellow,white,green);
}
</style>
</head>
<body>
 <% 
      ArrayList<VisitorDTO> vList = (ArrayList<VisitorDTO>)request.getAttribute("list");
 	  if ( vList != null) { 			  
 %>
	  <h1>방명록글 리스트</h1>
	  <hr>	  
      <table>
        <tr><th>작성자명</th><th>작성글</th><th>작성날짜</th><th></th></tr>
		<% for ( VisitorDTO dto : vList ) {  
		%>
		  <tr>
			<td><%= dto.getName() %></td>
			<td><%= dto.getMemo() %></td>
			<td><%= dto.getWriteDate() %></td>
			<td><a href="/mvcedu/visitor?action=delete&id=<%= dto.getId() %>"><img src="/mvcedu/images/delete.png" width="20"></a></td>
		  </tr>   		
	    <% }  %>
	  </table>
<% } else { %>
		<h2>${ msg }</h2>
<% } %>
  <hr> 
  <a href="/mvcedu/visitorMain.html" id="buttonstyle" >방명록 메인화면으로</a>
</body>
</html>







