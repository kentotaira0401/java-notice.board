<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>掲示板アプリケーション</h1>

	<form:form action="${pageContext.request.contextPath}/article/display"
		modelAttribute="articleForm">
		投稿者名：<form:input path="name" />
		<br>
		投稿内容：<form:textarea path="content" />
		<br>

		<input type="submit" value="記事投稿">
	</form:form>
	<hr>
	<c:forEach var="article" items="${articleList}">
		コメントID:<c:out value="${article.id}" />
		<br>
		コメント者名：<c:out value="${article.name}" />
		<br>
		コメント内容：<c:out value="${article.content}" />
		<br>
		<hr>
	</c:forEach>


</body>
</html>