<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%	request.setCharacterEncoding("utf-8"); %>
<c:set var='contextPath' value='${pageContext.request.contextPath }' />
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<style>
	p{
		font-size: 20px;
		text-align: center;
	}
</style>
<title>Footer</title>
</head>
<body>
	<p>email : admin@test.com</p>
	<p>회사주소 : 서울시 종로구 단성사</p>
	<p>찾아오는 길 : <a href='#'>약도</a></p>
</body>
</html>