<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 페이지</title>
</head>
<body>
	<form action="memberJoin" method="post">
	<table>
		<tr>
			<td colspan="2">로그인</td>
		</tr>
		
		<tr>
			<td>아이디</td>
			<td><input type="text" name="mId" placeholder="아이디를 입력해주세요"/></td>
		</tr>
		
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="mPw" placeholder="비밀번호를 입력해주세요"/></td>
		</tr>
		
		<tr>
			<td colspan="2"><input type="submit" value="가입"/></td>
		</tr>
	</table>
</form>
	

</body>
</html>
