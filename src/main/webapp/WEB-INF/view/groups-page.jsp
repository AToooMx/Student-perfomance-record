<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Групи</title>
<jsp:include page="allResources.jsp"></jsp:include>
</head>
<body class="bg-body user-select-none">
	<jsp:include page="nav.jsp"></jsp:include>
	<div class="container-fluid">
		<div class="bg-light bg-gradient rounded m-5 p-3 shadow-lg border">
			<div class="w-100 text-center border-bottom">
				<h3>Групи</h3>
			</div>
			<div class="container mt-3 text-center">
				<a href="addTeacher" class="btn btn-primary mb-3 col-2">Додати</a>
			</div>
			<table border="1" class="table table-striped text-center shadow">
				<thead>
					<tr>
						<td>Код спеціальності</td>
						<td>Назва групи</td>
						<td>Форма навчання</td>
						<td>Програма</td>
						<td>Спеціальність</td>
						<td>Факультет</td>
					</tr>
				</thead>

				<c:forEach var="group" items="${groups}">
					<tr>
						<td>${group.specialty.id}</td>
						<td><a href="groupInfo?id=${group.id}"
							class="text-decoration-none">${group.groupName}-${group.course}</a></td>
						<td>${group.formName }</td>
						<td>${group.programmName }</td>
						<td>${group.specialty.specialtyUkrName}
							(${group.specialty.specialtyName})</td>
						<td>${group.specialty.faculty.facultyName}</td>
					</tr>
				</c:forEach>

			</table>

		</div>
	</div>
</body>
</html>