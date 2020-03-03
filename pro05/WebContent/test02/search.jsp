<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }"/>
<%	request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원검색창</title>
</head>
<body>
<form action='${contextPath}/mem4.do'>
	입력 : <input type='text' name='value'>
	<select name='action'>
		<option value='listMembers'>전체</option>
		<option value='selectMemberById'>아이디</option>
		<option value='selectMemberByPw'>비밀번호</option>
	</select>
	<br>
	<input type='submit' value='검색'>
</form>
</body>
</html>