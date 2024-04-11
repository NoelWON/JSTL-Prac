<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>JSTL : forEach</h4>
		<c:forEach items="${list }" var="vo" varStatus="status">
			<h6>[index: ${status.index } count: ${status.count} ]${vo.no } : ${vo.name }</h6>
		</c:forEach>
	
	<h4> for</h4>
		<c:forEach begin="0" end="9" step="1" var="i">
			<h6>${i }</h6>
		</c:forEach>
		
	<h4> if</h4>
</body>
</html>