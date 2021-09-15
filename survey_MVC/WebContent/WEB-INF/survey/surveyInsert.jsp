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
<title>본 조사 내용</title>
	<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<h1>알코올 중독 여부 확인 설문조사</h1>
		<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1" >
			<ul class="nav navbar-nav">
				<li><a href="<%= request.getContextPath() %>/main">설문조사 홈으로</a></li>
			</ul>
		</div>
		<div class="container" style="text-align:center;border: 2px solid black; color:white;
		background-color: black; width:804px; font-size:17px; margin-left: auto; margin-right: auto;">
			<h4>아래의 설문내용은 알코올 중독과 관련한 여러 가지 문항들입니다. 각 문항에 따라<br>
			해당되는 본인의 상태 혹은 습관의 정도를 빠지지 않고 선택하여 제출해주세요.<br>
			모든 문항을 빠짐없이 모두 설문 진행해주시기 바랍니다.<br>
			${pageContext.request.contextPath}</h4>
			<div class="row">
			<form action="<%= request.getContextPath() %>/result">
			<h4>1. 얼마나 자주 술을 마십니까?</h4>
			<input type='radio' name='s1' value='0'/>안마심<br>
			<input type='radio' name='s1' value='1'/>월 1회 이하<br>
			<input type='radio' name='s1' value='2'/>월 2~4회<br>
			<input type='radio' name='s1' value='3'/>주 2~3회<br>
			<input type='radio' name='s1' value='4' required/>주 4회 이상
			<h4>2. 술을 마시면 한 번에 몇 잔 정도 마십니까?</h4>
			<input type='radio' name='s2' value='0'/>소주 1~2잔<br>
			<input type='radio' name='s2' value='1'/>소주 3~4잔<br>
			<input type='radio' name='s2' value='2'/>소주 5~6잔<br>
			<input type='radio' name='s2' value='3'/>소주 7~9잔<br>
			<input type='radio' name='s2' value='4' required/>소주 10잔 이상
			<h4>3. 한번에 소주 1병 또는 맥주 4병 이상 마시는 경우는 얼마나 자주 있습니까?</h4>
			<input type='radio' name='s3' value='0'/>없다<br>
			<input type='radio' name='s3' value='1'/>월 1회 미만<br>
			<input type='radio' name='s3' value='2'/>월 1회<br>
			<input type='radio' name='s3' value='3'/>매주<br>
			<input type='radio' name='s3' value='4' required/>거의 매일
			<h4>4. 지난 1년 간 한 번 술을 마시기 시작하면 멈출 수 없었던 때가 얼마나 자주 있습니까?</h4>
			<input type='radio' name='s4' value='0'/>없다<br>
			<input type='radio' name='s4' value='1'/>월 1회 미만<br>
			<input type='radio' name='s4' value='2'/>월 1회<br>
			<input type='radio' name='s4' value='3'/>매주<br>
			<input type='radio' name='s4' value='4' required/>거의 매일
			<h4>5. 지난 1년 간 평소 같으면 할 수 있던 일을 음주 때문에 실패한 적이 얼마나 자주 있었습니까?</h4>
			<input type='radio' name='s5' value='0'/>없다<br>
			<input type='radio' name='s5' value='1'/>월 1회 미만<br>
			<input type='radio' name='s5' value='2'/>월 1회<br>
			<input type='radio' name='s5' value='3'/>매주<br>
			<input type='radio' name='s5' value='4' required/>거의 매일
			<h4>6. 지난 1년 간 술을 마신 다음날 일어나기 위해 해장술이 필요했던 적은 얼마나 자주 있었습니까?</h4>
			<input type='radio' name='s6' value='0'/>없다<br>
			<input type='radio' name='s6' value='1'/>월 1회 미만<br>
			<input type='radio' name='s6' value='2'/>월 1회<br>
			<input type='radio' name='s6' value='3'/>매주<br>
			<input type='radio' name='s6' value='4' required/>거의 매일
			<h4>7. 지난 1년 간 음주 후에 죄책감이 든 적이 얼마나 자주 있었습니까?</h4>
			<input type='radio' name='s7' value='0'/>없다<br>
			<input type='radio' name='s7' value='1'/>월 1회 미만<br>
			<input type='radio' name='s7' value='2'/>월 1회<br>
			<input type='radio' name='s7' value='3'/>매주<br>
			<input type='radio' name='s7' value='4' required/>거의 매일
			<h4>8. 지난 1년 간 음주 때문에 전날 밤에 있었던 일이 기억나지 않았던 적이 얼마나 자주 있었습니까?</h4>
			<input type='radio' name='s8' value='0'/>없다<br>
			<input type='radio' name='s8' value='1'/>월 1회 미만<br>
			<input type='radio' name='s8' value='2'/>월 1회<br>
			<input type='radio' name='s8' value='3'/>매주<br>
			<input type='radio' name='s8' value='4' required/>거의 매일
			<h4>9. 음주로 인해 자신이나 다른 사람이 다친 적이 있습니까?</h4>
			<input type='radio' name='s9' value='0'/>없다<br>
			<input type='radio' name='s9' value='2'/>있지만 지난 1년 간 없음<br>
			<input type='radio' name='s9' value='4' required/>지난 1년 간 있음
			<h4>10. 친척이나 친구, 의사가 당신이 술 마시는 것을 걱정하거나 당신에게 술 끊기를 권유한 적이 있었습니까?</h4>
			<input type='radio' name='s10' value='0'/>없다<br>
			<input type='radio' name='s10' value='2'/>있지만 지난 1년 간 없음<br>
			<input type='radio' name='s10' value='4' required/>지난 1년 간 있음<br><br>
			<input type='submit' value='결과보기'>
			<h5></h5>			
			</form>
			</div>
			</div>
			<div id="footer">
		Copyright 2021 wlsthf0046@gmail.com
	</div>
</body>
</html>