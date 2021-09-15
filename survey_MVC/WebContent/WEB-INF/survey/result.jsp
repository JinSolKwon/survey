<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="member.*"%>
<%@ page import = "member.MemberVoEnv" %>

<!DOCTYPE html>
<html>
<head>
<style>
body {
	background-color: skyblue;
	font-size:15px;
	color: blue;
	margin-bottom:auto;
	margin-left: auto; 
	margin-right:auto;
}

table, td{
	border: 2px solid black;
}
table, th{
	background-color: white;
	text-align: center;
}
table{
	border: 2px solid black; 
	margin-left: auto; 
	margin-right:auto;
	width:700px;
}

#footer{
	text-align: center;
}
a{
	text-decoration:none;
	color: black;
}

ul {
	list-style-type: none;
	padding: 0;
	overflow: hidden;
	width : 800;
	text-align: center;
	margin-bottom: 10px;
}
li {
	float : center;
	display : inline-block;
}
li a {
	padding: 15px;
	text-align: center;
	font-weight: bold;
}

div .row{
	margin-left: auto; 
	margin-right:auto;
	border: 2px solid black;
	background-color: white;
	text-align: left;
	width:800px;
	color:blue;	
}

h1 {
	text-align: center;
}
h2 {
	text-align: center;
}

h3 {
	text-align:left; 
	margin-left:20px
}

input {
	margin-left:30px;
}

select {
	margin-left:30px;
}
</style>
<meta charset="UTF-8">
<title>결과보기</title>
<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
<%
	MemberVoEnv voE = (MemberVoEnv)request.getAttribute("voE");
	int sum = (int)request.getAttribute("sum");
%>
	<h1>알코올 사용 여부 확인 설문조사</h1>
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1" >
			<ul class="nav navbar-nav">
				<li><a href="<%= request.getContextPath() %>/main">설문조사 홈으로</a></li>
				<li><a href="<%= request.getContextPath() %>/resultAll">결과 현황</a>
			</ul>
		</div>
		<div class="container" >
			<div class="row">
			<h2>설문조사 결과</h2>
			<h3 style="text-align:center">당신의 알코올 사용 평가 점수는</h3>
			
			<p style="color:red; text-align:center; font-weight:bold; font-size:20px"> <%= sum%>점 </p>
			<p style="color:red; text-align:center; font-size:17px">
			<% if (voE.getGender()==0 && sum>=10 && sum <= 19){%>
				남성(10점 ~ 19점)은 위험 음주자 입니다.
			<% } else if (voE.getGender()==0 && sum>=20){ %>
				남성(20점 이상)은 알코올 사용장애 환자입니다.
			<% } else if (voE.getGender()==1 && sum>=6 && sum <= 9){ %>
				여성(6점 ~ 9점)은 위험 음주자 입니다.
			<% } else if (voE.getGender()==1 && sum>=10){ %>
				여성(10점 이상)은 위험 음주자 입니다.
			<% } else { %>
				당신은 적절한 음주 생활을 즐기고 있습니다.
			<% } %>
			</p>
			<h4 style="text-align:center">알코올 사용 설문 합계점수를 기록하고 검사를 마친 날짜를 적어놓으세요<br>
			또한, 아래 보기에 해당되는 인원은 본인의 건강을 위해 알코올 사용에 대한 교육을 신청하거나<br>
			가까운 센터를 방문하시어 조속히 건강한 음주 생활을 영위할 수 있도록 힘써주시기 바랍니다.<br><br>
			※ 위험 음주자: 남성 10~19점, 여성 6~9점<br>
			※ 알코올 사용장애 환자: 남성 20점 이상, 여성 10점 이상</h4>

			</div>
			</div>
			<div id="footer">
		Copyright 2021 wlsthf0046@gmail.com
	</div>
</body>
</html>