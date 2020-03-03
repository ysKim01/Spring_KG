<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }"/>
<%	request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원수정창</title>
<style>
	.text_center{
		text-align : center;
	}
</style>
</head>
<body>
<form method='post' action="${contextPath}/mem4.do?action=updateMember">
<h1 class='text_center'>회원 수정 창</h1>
<table align='center'>
	<tr>
		<td width='200'><p align='right'>아이디</p></td>
		<td width='400'><input type='text' name='id_show' value='${member.id}' disabled></td>
		<input type='hidden' name='id' value='${member.id}'>
	</tr>
	<tr>
		<td width='200'><p align='right'>패스워드</p></td>
		<td width='400'><input type='password' name='pw' value='${member.pw}'></td>
	</tr>
	<tr>
		<td width='200'><p align='right'>이름</p></td>
		<td width='400'><input type='text' name='name' value='${member.name}'></td>
	</tr>
	<tr>
		<td width='200'><p align='right'>이메일</p></td>
		<td width='400'><input type='text' name='email' value='${member.email}'></td>
	</tr>
	<tr>
		<td width='200'><p>&nbsp;</p></td>
		<td width='400'>
			<input type='submit' value='수정하기'>
			<input type='reset' value='다시입력'>
		</td>
	</tr>
</table>
</form>
</body>
</html>