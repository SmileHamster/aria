<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"	isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<%
  request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.sendBox{
		border:border-box;
		border:1px solid black;
		width:100%;
	}
	.sendBox:hover{
		transition:all ease 1.5s;
		background:#eecccc;
	}
</style>
</head>
<body>
	<h1>사업자 페이지 입니다!!</h1>
	<br><br>
	<label for="next"></label>
	<form>
	<button id="next2" type="submit" formmethod="post" formaction="${contextPath }/bupage/bupageSelectStore.do">사업자 매장 등록 페이지로 가기 -></button>
	</form>
	<br><br><br>
	<label for="next"></label>
	<form>
	<button id="next3" type="submit" formmethod="post" formaction="${contextPath }/test/testPage3.do">공공데이터 조회 페이지로 가기 -></button>
	</form>
	<br><br>

</body>
</html>