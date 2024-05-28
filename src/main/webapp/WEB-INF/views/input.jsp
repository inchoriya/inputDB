<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Input</title>
</head>
<body>
	<h2>Input.jsp</h2>
	
	<form action="insert" method="get">
		<fieldset>
			<legend>데이터 입력</legend>
			<label>data1 : <input type="text" name="data1" id="data1" placeholder="문자 입력" /></label><br/>
			<label>data2 : <input type="text" name="data2" id="data2" placeholder="숫자 입력" /></label><br/>
			<!-- input 태그에서 name속성과 id속성의 차이점 -->
			
			<input type="submit" value="전송"/>
						
		</fieldset>	
	</form>
	
</body>



</html>