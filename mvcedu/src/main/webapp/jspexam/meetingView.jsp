<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import = "model.domain.MeetingDTO, java.util.ArrayList" %> 
<!DOCTYPE html>
<html>
<head>
<link href="https://fonts.googleapis.com/css?family=Poor+Story:400" rel="stylesheet">
<style>
    * {
    	font-family: "Poor Story"
    }
	td{
		border-bottom : 2px dotted green;
		padding-left : 20px;
	}
	tr:hover{ 
		background-color : pink;	
		font-weight : bold;
	}
	td:nth-child(2){
		width : 300px;
	}
	input, textarea {
		padding-bottom : 8px;
		border-radius : 5px;
	}
	div {
		margin-top : 20px;
	}
</style>
</head>
<body>
<%
	ArrayList<MeetingDTO> list = (ArrayList<MeetingDTO>)request.getAttribute("list");
	if(list != null){
%>
	<h2>미팅 스케쥴</h2><hr>
	<table>
<%
		for(MeetingDTO vo : list){
%>
			<tr>
			<td class='<%= vo.getId() %>'  ><%= vo.getName() %></td>
			<td class='<%= vo.getId() %>' onclick="displayReply(<%= vo.getId()%>)" ><%= vo.getTitle() %></td>
			<td class='<%= vo.getId() %>'><%= vo.getMeetingDate() %></td>
			<td><a href ='/mvcedu/meeting?action=delete&id=<%= vo.getId() %>'>
			<img src = "/mvcedu/images/delete.png" width ='20'></a></td>
			<td><img onclick="displayUpdateForm('<%= vo.getId() %>')" 
			       src="/mvcedu/images/edit.png" width ='20'></td>
			<td><img onclick="insertReply('<%= vo.getId() %>')" 
			       src="/mvcedu/images/comment.png" width ='25'></td>
			</tr>
<%
		}
%>
	</table>
<%
	}
	if (request.getAttribute("msg") != null) {
%>
	<script>
		alert('${ msg }');
	</script>

<%
	}
%>
<hr>
<button onclick="displayDiv(1);">미팅 정보 작성</button>
<button onclick="displayDiv(2);">미팅 정보 검색</button>
<script>
function displayDiv(type) {
	if(type == 1) {
		document.getElementById("search").style.display='none';
		document.getElementById("write").style.display='block';
		document.getElementById("divT").textContent="미팅정보 작성";
		document.querySelector("#write [type=submit]").value="등록";
		document.querySelector("#write [type=hidden]").value="insert";
	} else if(type == 2) {
		document.getElementById("write").style.display='none';
		document.getElementById("search").style.display='block';
	}	
}
function displayUpdateForm(cv) {
    var doms = document.getElementsByClassName(cv);
    document.getElementById("search").style.display='none';
	document.getElementById("write").style.display='block';	
	document.getElementById("m_name").value = 
		                                  doms[0].textContent;
	document.getElementById("m_title").value = 
		                                  doms[1].textContent;
	var str = doms[2].textContent;
	var ary = str.split(/\D+/g)
	var meeting_dt = ary[0]+"-"+ary[1]+"-"+ary[2]+
	                          "T"+ary[3]+":"+ary[4];
	document.getElementById("m_dt").value = meeting_dt;
	document.getElementById("divT").textContent="미팅정보 수정";
	document.querySelector("#write [type=submit]").value="수정";
	document.querySelector("#write [type=hidden]").value=cv;
}
function displayReply(id) {
	var xhr = new XMLHttpRequest();
	xhr.onload = function () {
		if(xhr.status == 200) {				
			let jsondoms = JSON.parse(xhr.responseText);
			let replyContent = "";			
			for(let i in jsondoms) {	
				i = Number(i);
				replyContent += "[댓글"+(i+1)+"] 작성자명 : "+jsondoms[i].name+", 내용 : "+jsondoms[i].content+"\n"; 
			}
			if (!replyContent)
				replyContent = "아직 작성된 댓글이 없네요...😂";
			window.alert(replyContent);
		}
	}
	xhr.open("GET", "/mvcedu/meeting?action=lreply&id="+id, true);
	xhr.send();		
}
function insertReply(id) {
	let name = window.prompt("댓글 작성자의 성명을 입력하세요..");
	let content = window.prompt("댓글 내용을 입력하세요..");
	let query = "action=ireply&name="+name+"&content="+content+"&refid="+id;	
	var xhr = new XMLHttpRequest();
	xhr.onload = function () {
		if(xhr.status == 200) {				
			let jsondom = JSON.parse(xhr.responseText);
			if (jsondom.result == true)
				window.alert("댓글 작성이 완료되었습니다.");
			else
				window.alert("댓글 작성에 실패했습니다.");
		}
	};
	xhr.open("GET", "/mvcedu/meeting?"+query, true);
	xhr.send();		
}
</script>
<div id="write"  style="display:none">
 <hr><h2 id="divT">미팅정보 작성</h2>
 <form method = "post" action = "/mvcedu/meeting">
 <input type="hidden" name="action" value="insert">
 미팅 대상 이름 : <input id="m_name" type="text"  name="name">
 <br>
 미팅 목적 : <br>
 <textarea id="m_title"  rows="3" cols="60" name = "title" ></textarea>
 <br>
 날짜와 시간 :  <input id="m_dt" type="datetime-local" name="meetingDate">
 <br><br>
 <input type = "submit" value = "등록">
 <button onclick="document.getElementById('write').style.display='none';return false">취소</button>
 </form>
</div>
<div id="search" style="display:none">
 <hr>
 <form method = "get" action ="/mvcedu/meeting">
 미팅 대상 이름 : <input type = "search" name = "targetname" >
 <input type = "submit" value = "검색">
 </form>
</div>
<hr>
<div>
 <button type="button" onclick="location.href='/mvcedu/meeting' ">전체 미팅 스케쥴 보기</button>
</div>
</body>
</html>





