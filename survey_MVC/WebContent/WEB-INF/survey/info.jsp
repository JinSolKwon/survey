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
<title>설문자 정보 입력</title>
	<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<h1>알코올 중독 여부 확인 설문조사</h1>
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1" >
			<ul class="nav navbar-nav">
				<li><a href="<%= request.getContextPath() %>/main">설문조사 홈으로</a></li>
			</ul>
		</div>
		<div class="container" >
			<div class="row">
			<h2>설문자 정보 입력</h2>
			<form action='<%= request.getContextPath() %>/form2'>
			<h3>⊙ 성별</h3>
			<input type='radio' name='gender' value='0' id="gender1"/><label for="gender1">남성</label>
			<input type='radio' name='gender' value='1' id="gender2" required/><label for="gender2">여성</label>
			<h3>⊙ 나이</h3>
			<input type='text' name='age' placeholder="나이 입력" required/>
			<h3>⊙ 주거 형태</h3>
			<select name='house' size='1' required>
				<option value="" selected>선택하세요.</option>
				<option value="7">자가 아파트/빌라/오피스텔</option>
				<option value="6">자가 단독</option>
				<option value="5">전세 아파트/빌라/오피스텔</option>
				<option value="4">전세 단독</option>
				<option value="3">월세 아파트/빌라/오피스텔</option>
				<option value="2">월세 단독</option>
				<option value="1">기타</option>
			</select>
			<h3>⊙ 학력</h3>
			<input type='radio' name='school' value='1' id="school1"/><label for="school1">대졸</label>
			<input type='radio' name='school' value='2' id="school2"/><label for="school2">고졸</label>
			<input type='radio' name='school' value='3' id="school3"/><label for="school3">중졸</label>
			<input type='radio' name='school' value='4' id="school4"/><label for="school4">초졸</label>
			<input type='radio' name='school' value='5' id="school5" required/><label for="school5">기타</label>
			<h3>⊙ 결혼여부</h3>
			<input type='radio' name='marry' value='1' id="marry1"/><label for="marry1">기혼</label>
			<input type='radio' name='marry' value='0' id="marry2" required/><label for="marry2">미혼</label><br><br>
			<input type='submit' value='다음으로'>
			<h5> </h5>
			</form> 
			</div>
		</div>
		<div id="footer">
		Copyright 2021 wlsthf0046@gmail.com
	</div>
</body>
</html>