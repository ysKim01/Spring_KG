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
	.no-underline{
		text-decoration: none;
	}
</style>
<title>Side Menu</title>
</head>
<body>
	<h1>사이드 메뉴</h1>
	<h1>
		<a href='#' class='no-underline'>회원관리</a><br>
		<a href='#' class='no-underline'>게시판관리</a><br>
		<a href='#' class='no-underline'>상품관리</a><br>
	</h1>
</body>
</html>







