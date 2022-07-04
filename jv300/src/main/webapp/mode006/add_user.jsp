<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>

</body>
<div>
	<div id="header">,
		<jsp:include page="/incl/banner.jsp">
			<jsp:param name="subtitle" value="mode007: Java Beans and include"/>
	</div>
	<div id="content-wrapper">
		<form action="add_user.do" method="post"> <!-- action : 폼을 전송할 서버 쪽 스크립트 파일을 지정 -->
			회원아이디  <p><input type="text" name="userId"/></p>
			비밀번호 <p><input type="password" name="passwd"/></p>
			이름 <p><input type="text" name="userName"/></p>
			주민번호 <p><input type="text" name="ssn"/></p>
			이메일1 <p><input type="text" name="email1"/></p>
			이메일2 <p><input type="text" name="email2"/></p>
			주소 <p><input type="text" name="addr" > </p>
				<input type="submit" value="로그인"/>
			W</form>>
	</div>
	<div id="footer">
		<%@ include file="/incl/footer.jsp" %>
	</div>
</div>
</html>