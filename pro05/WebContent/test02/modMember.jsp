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
<title>ȸ������â</title>
<style>
	.text_center{
		text-align : center;
	}
</style>
</head>
<body>
<form method='post' action="${contextPath}/mem4.do?action=updateMember">
<h1 class='text_center'>ȸ�� ���� â</h1>
<table align='center'>
	<tr>
		<td width='200'><p align='right'>���̵�</p></td>
		<td width='400'><input type='text' name='id'></td>
	</tr>
	<tr>
		<td width='200'><p align='right'>�н�����</p></td>
		<td width='400'><input type='password' name='pw'></td>
	</tr>
	<tr>
		<td width='200'><p align='right'>�̸�</p></td>
		<td width='400'><input type='text' name='name'></td>
	</tr>
	<tr>
		<td width='200'><p align='right'>�̸���</p></td>
		<td width='400'><input type='text' name='email'></td>
	</tr>
	<tr>
		<td width='200'><p>&nbsp;</p></td>
		<td width='400'>
			<input type='submit' value='�����ϱ�'>
			<input type='reset' value='�ٽ��Է�'>
		</td>
	</tr>
</table>
</form>
</body>
</html>