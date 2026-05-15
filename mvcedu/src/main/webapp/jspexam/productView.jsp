<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.domain.ProductDTO" %>
<!DOCTYPE html>
<html>
<head> 
<meta charset="UTF-8">
<title>Insert title here</title> 
<style>
a {
    text-decoration : none;
    background : linear-gradient(to right, lime , pink, yellow);
}
</style>
</head>
<body>
<% if ( session.getAttribute("cart") != null ) {%>
	<h3>선택된 상품 정보는 다음과 같습니다.</h3>
	<hr>
	<%
		ProductDTO cart1 = (ProductDTO)session.getAttribute("cart");
	%>
	선택된 사과의 개수 : <%=cart1.getApple()%> <br>
	선택된 바나나의 개수 : <%=cart1.getBanana()%> <br>
	선택된 한라봉의 개수 : <%=cart1.getHalabong()%> <br>
	<hr> 
	선택된 사과의 개수 : ${sessionScope.cart.apple}<br>
	선택된 바나나의 개수 : ${sessionScope.cart.banana}<br>
	선택된 한라봉의 개수 : ${sessionScope.cart.halabong}<br>
	<hr> 
	선택된 사과의 개수 : ${cart.apple}<br>
	선택된 바나나의 개수 : ${cart.banana}<br>
	선택된 한라봉의 개수 : ${cart.halabong}<br>
<% } else { %>
    <h3>장바구니를 비웠습니다.</h3>  
<% } %>
<hr> 
<a href="${ header.referer }">상품 선택화면</a>
</body>
</html>







