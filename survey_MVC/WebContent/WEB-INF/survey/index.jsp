<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<title>알코올 중독 여부 설문조사</title>
	<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<h1>알코올 중독 여부 확인 설문조사</h1>
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1" >
			<ul class="nav navbar-nav">
				<li><a href="<%= request.getContextPath() %>/form1">설문조사</a></li>
				<li><a href="<%= request.getContextPath() %>/resultAll">결과현황</a></li>
			</ul>
		</div>
		<div class="container" >
			<div class="row" style="text-align: center">
				<h4 style="font-weight:normal">
				이 설문조사는 개인의 알코올 중독 여부를 조사하기 위한 설문조사 페이지 입니다.<br><br>
				익명성에 근거하여 설문이 진행되며, 단순한 통계자료로 활용할 정보이므로 설문에 참여한 자료는<br><br>
				해당 페이지 외에서는 제공되지 않으니 안심하시고 부담없이 설문에 참여해주시면 감사하겠습니다.<br><br>
				<a href="<%= request.getContextPath() %>/form1" style="font-weight:bold">설문조사 바로가기</a>
				</h4>
			</div>
		</div>
	<div id="footer">
		Copyright 2021 wlsthf0046@gmail.com
	</div>
</body>
</html>