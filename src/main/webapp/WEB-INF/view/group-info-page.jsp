<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Group info page</title>
<jsp:include page="allResources.jsp"></jsp:include>
</head>
<body class="bg-body user-select-none">
	<jsp:include page="nav.jsp"></jsp:include>
	<div class="container">
		<div class="bg-light bg-gradient rounded m-5 p-3 shadow-lg border">
			<h3 class="p-3">${group.groupName }
				- ${group.course}, ${group.specialty.specialtyUkrName},
				${group.formName}, ${group.programmName}</h3>
			<c:choose>
				<c:when test="${not empty students}">
					<table border="1" class="table table-striped text-center shadow ">
						<thead>
							<tr>
								<td>ПІБ</td>
								<td>Дата народження</td>
								<td>Електронна пошта</td>
								<td>Номер телефону</td>
							</tr>
						</thead>

						<c:forEach var="student" items="${students}">
							<tr>
								<td><a href="studentInfo?id=${student.id}"
									class="text-decoration-none">${student.lastName}
										${student.firstName} ${student.fatherName}</a></td>
								<td>${student.date}</td>
								<td>${student.phone}</td>
								<td>${student.email}</td>
							</tr>
						</c:forEach>

					</table>
				</c:when>
				<c:otherwise>
					<div class="ms-5 h4">Records not found</div>
				</c:otherwise>
			</c:choose>
		</div>
	</div>
</body>
</html>