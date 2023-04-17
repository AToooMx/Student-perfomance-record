<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Предмети</title>
<jsp:include page="allResources.jsp"></jsp:include>
</head>
<body class="bg-body user-select-none">
	<jsp:include page="nav.jsp"></jsp:include>
	<div class="container">
		<div class="bg-light bg-gradient m-5 rounded shadow-lg border">
			<div class="w-100 text-center p-3 border-bottom">
				<h3>Предмети</h3>
			</div>
			<div class="mt-3 container">
				<form:form modelAttribute="subject" method="POST"
					action="addSubject" class="row g-3 justify-content-center">
					<div class="col-6">
						<form:input path="name" class="form-control" placeholder="Назва предмету"></form:input>
					</div>
					<div class="col-auto">
						<input type="submit" value="Додати" class="btn btn-primary">
					</div>
				</form:form>

			</div>
			<div class="row p-2">
				<div class="bg-light rounded p-3 m-3 col-sm text-center border shadow-sm">
					<table border="1" class="table table-striped text-center">
						<c:forEach var="subject" items="${subjectsOne}">
							<tr>
								<td>${subject.name}</td>
								<td><a href="removeSubject?id=${subject.id}"
									class="btn btn-danger">Видалити</a></td>
							</tr>
						</c:forEach>

					</table>
				</div>
				<div class="bg-light rounded p-3 col-sm m-3 text-center border shadow-sm">
					<table border="1" class="table table-striped text-center">
						<c:forEach var="subject" items="${subjectsTwo}">
							<tr>
								<td>${subject.name}</td>
								<td><a href="${subject.id}" class="btn btn-danger">Видалити</a></td>
							</tr>
						</c:forEach>

					</table>
				</div>
			</div>
		</div>
	</div>

</body>
</html>