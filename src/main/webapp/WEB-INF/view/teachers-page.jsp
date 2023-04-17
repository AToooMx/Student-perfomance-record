<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Вчителі</title>
<jsp:include page="allResources.jsp"></jsp:include>
</head>
<body class="bg-body user-select-none">
	<jsp:include page="nav.jsp"></jsp:include>
	<div class="container">
		<div class="bg-light bg-gradient rounded m-5 p-3 shadow-lg border">
			<div class="w-100 text-center border-bottom">
				<h3>Викладачі</h3>
			</div>
			<div class="mt-3 text-center">
				<a href="addTeacher" class="btn btn-primary mb-3 col-2">Додати</a>
			</div>
			<c:choose>
				<c:when test="${not empty teachers}">
					<table border="1" class="table table-striped text-center shadow border">
						<thead>
							<tr>
								<td>ПІБ</td>
								<td>Дата народження</td>
								<td>Номер телефону</td>
								<td>Електронна пошта</td>
							</tr>
						</thead>

						<c:forEach var="teacher" items="${teachers}">
							<tr>
								<td><a href="teacherInfo?id=${teacher.id}"
									class="text-decoration-none">${teacher.lastName}
										${teacher.firstName} ${teacher.fatherName}</a></td>
								<td>${teacher.dateOfBirthday}</td>
								<td>${teacher.phone}</td>
								<td>${teacher.email}</td>
							</tr>
						</c:forEach>

					</table>
				</c:when>
				<c:otherwise>
					<div class="ms-5 h4">Записів не знайдено</div>
				</c:otherwise>
			</c:choose>
		</div>
	</div>
</body>
</html>