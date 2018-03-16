<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div align="center">
		<form action="UserLoginServlet">
			<table>

				<tr>

					<td><label>UserName</label></td>
					<td><input type="text" name="username" value="${username }"></td>
				</tr>
				<tr>
					<td><label>Password</label></td>
					<td>
					<input type="password" name="password" value="${password }">
					</td>

				</tr>
			</table>
			<input type="submit" value="submit">
			<c:if test="${ username!=null}">
				<a href="LogOutServlet">退出</a>
			</c:if>


		</form>
	</div>
</body>
</html>