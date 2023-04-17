<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search page</title>
<jsp:include page="allResources.jsp"></jsp:include>
</head>
<body class="bg-body user-select-none">
	<jsp:include page="nav.jsp"></jsp:include>

	<div class="container">
		<div class="row m-5 bg-light bg-gradient p-3 rounded  border shadow-lg">
			<div class="w-100 text-center">
				<h3>Студенти</h3>
			</div>
			<c:choose>
				<c:when test="${not empty students}">
					<table border="1" class="table table-striped text-center">
						<thead>
							<tr>
								<td>ПІБ</td>
								<td>Дата народження</td>
								<td>Номер телефону</td>
								<td>Електронна пошта</td>
							</tr>
						</thead>

						<c:forEach var="student" items="${students}">
							<tr>
								<td><a href="studentInfo?id=${student.id}"
									class="text-decoration-none">${student.lastName}
										${student.firstName} ${student.fatherName}</a></td>
								<td>${student.date}</td>
								<td>${student.email}</td>
								<td>${student.phone}</td>
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

	<div class="container">
		<div class="row m-5 bg-light bg-gradient p-3 rounded border shadow">
			<div class="w-100 text-center">
				<h3>Викладачі</h3>
			</div>
			<c:choose>
				<c:when test="${not empty teachers}">
					<table border="1" class="table table-striped text-center">
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
								<td><a href="teacherInfo?id=${teacher.id}"
									class="text-decoration-none">${teacher.dateOfBirthday}</a></td>
								<td><a href="teacherInfo?id=${teacher.id}"
									class="text-decoration-none">${teacher.phone}</a></td>
								<td><a href="teacherInfo?id=${teacher.id}"
									class="text-decoration-none">${teacher.email}</a></td>
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
	<div class="container">
		<div class="row m-5 bg-light bg-gradient p-3 rounded  border shadow">
			<div class="w-100 text-center">
				<h3>Групи</h3>
			</div>
			<c:choose>
				<c:when test="${not empty groups}">
					<table border="1" class="table table-striped text-center">
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
								<td>${group.specialty.specialtyUkrName}</td>
								<td>${group.specialty.faculty.facultyName}</td>
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