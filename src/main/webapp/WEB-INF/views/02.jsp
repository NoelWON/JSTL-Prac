<%@page import="servlets.UserVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	UserVo vo0 = new UserVo();
	vo0.setNo(0L);
	vo0.setName("둘리page");
	pageContext.setAttribute("vo", vo0);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>객체의 존속 범위 확인 Scope</h4>
	${vo.no }<br>
	${vo.name }<br>
	
	== pageScope ========<br>
	${pageScope.vo.no }<br>
	${pageScope.vo.name }<br>
	
	== requestScope ========<br>
	${requestScope.vo.no }<br>
	${requestScope.vo.name }<br>

	== sessionScope ========<br>
	${sessionScope.vo.no }<br>
	${sessionScope.vo.name }<br>

	== applicationScope ========<br>
	${applicationScope.vo.no }<br>
	${applicationScope.vo.name }<br>

</body>
</html>