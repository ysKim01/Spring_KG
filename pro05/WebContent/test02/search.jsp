<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }"/>
<%	request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ȸ���˻�â</title>
</head>
<body>
<form action='${contextPath}/mem4.do'>
	�Է� : <input type='text' name='value'>
	<select name='action'>
		<option value='listMembers'>��ü</option>
		<option value='selectMemberById'>���̵�</option>
		<option value='selectMemberByPw'>��й�ȣ</option>
	</select>
	<br>
	<input type='submit' value='�˻�'>
</form>
</body>
</html>