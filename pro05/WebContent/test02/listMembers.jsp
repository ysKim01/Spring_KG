<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }"/>
<%	request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border='1' align='center' width='80%'>
	<tr align='center' bgcolor='lightgreen'>
		<td><b>아이디</b></td>
		<td><b>패스워드</b></td>
		<td><b>이름</b></td>
		<td><b>이메일</b></td>
		<td><b>가입일</b></td>
		<td><b>수정</b></td>
		<td><b>삭제</b></td>
	</tr> 
	<c:forEach var='member' items='${membersList }'>
	<tr align='center'>
		<td>${member.id }</td>
		<td>${member.pw }</td>
		<td>${member.name }</td>
		<td>${member.email }</td>
		<td>${member.joinDate }</td>
		<td><a href='${contextPath }/mem4.do?action=modForm&id=${member.id}'>수정하기</a></td>
		<td><a href='${contextPath }/mem4.do?action=deleteMember&id=${member.id}'>삭제하기</a></td>
	</tr> 
	</c:forEach>
</table>
<a href='${contextPath }/member/memberForm.do'><h1 style='text-align:center'>회원가입</h1></a>
</body>
</html>