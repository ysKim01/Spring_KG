<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" isELIgnored="false"%>
<%@	taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%	request.setCharacterEncoding("utf-8"); %>
<c:set var='contextPath' value='${pageContext.request.contextPath}' />
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Result</title>
</head>
<body>
	<h1>���ε尡 �Ϸ�Ǿ����ϴ�.</h1>
	<label>���̵� : </label>
	<input type='text' name='id' value='${map.id }'readonly>
	<label>�̸� : </label>
	<input type='text' name='name' value='${map.name }' readonly>
	<div class='result-images'>
		<c:forEach var='imageFileName' items='${map.fileList}'>
			<img src='${contextPath}/download?imageFileName=${imageFileName}'>
			<br><br><br>
		</c:forEach>
	</div>
	<p><a href="${pageContext.request.contextPath }/form">�ٽ� ���ε� �ϱ�</a>
</body>
</html>