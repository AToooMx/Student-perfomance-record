<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<jsp:include page="allResources.jsp"></jsp:include>
</head>
<body class="bg-body">
	<div
		class="bg-light bg-gradient p-3 col-2 mt-5 rounded container text-center border shadow-lg">
		<form:form method="POST" action="proccess-login">
			<div class="form-group m-2">
				<input type="text" class="form-control" placeholder="Логін"
					name="username" />
			</div>
			<div class="form-group m-2">
				<input type="password" name="password" class="form-control"
					placeholder="Пароль" />
			</div>
			<div class="form-group m-2">
				<input type="submit" class="btn btn-danger" class="form-control"
					value="Увійти" value="Login">
			</div>
		</form:form>
	</div>
</body>
</html>