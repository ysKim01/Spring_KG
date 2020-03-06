<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" isELIgnored="false"%>
<%@	taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%	request.setCharacterEncoding("utf-8"); %>
<c:set var='contextPath' value='${pageContext.request.contextPath}' />
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<script src='http://code.jquery.com/jquery-latest.js'></script>
<script>
	var cnt=1;
	function fn_addFile(){
		$("#d_file").append("<br>"+"<input type='file' name='file"+cnt+"' />");
		cnt++;
	}
</script>
<title>Upload Form</title>
</head>
<body>
	<h1>���� ���ε� �ϱ�</h1>
	<form method='post' action='${contextPath}/upload' enctype="multipart/form-data">
		<label>���̵� : </label>
		<input type='text' name='id'><br>
		<label>�̸� : </label>
		<input type='text' name='name'><br>
		<input type='button' value='�����߰�' onclick='fn_addFile()'><br>
		<div id='d_file'></div>
		<input type='submit' value='���ε�'>
	</form>
</body>
</html>