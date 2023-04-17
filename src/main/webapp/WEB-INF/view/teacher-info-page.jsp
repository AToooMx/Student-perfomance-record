<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${teacher.lastName}</title>
<jsp:include page="allResources.jsp"></jsp:include>
</head>
<body class="bg-body user-select-none">
	<jsp:include page="nav.jsp"></jsp:include>

	<div class="container">
		<div
			class="row bg-light bg-gradient mt-5 rounded p-2 shadow-lg justify-content-center border">
			<div class="bg-light rounded m-3 p-3 col-4 text-center shadow border">
				<form:form action="save-teacher" method="GET"
					modelAttribute="teacher">
					<form:hidden path="id" />
					<div class="form-group mb-3">
						<form:input path="lastName" class="form-control"
							placeholder="Прізвище"></form:input>
						<form:errors path="lastName" class="danger"></form:errors>
					</div>
					<div class="form-group mb-3">
						<form:input path="firstName" class="form-control"
							placeholder="Ім'я"></form:input>
						<form:errors path="firstName" class="danger"></form:errors>
					</div>
					<div class="form-group mb-3">
						<form:input path="fatherName" class="form-control"
							placeholder="Побатькові"></form:input>
						<form:errors path="fatherName" class="danger"></form:errors>
					</div>
					<div class="form-group  mb-3">
						<form:input path="dateOfBirthday" class="form-control"
							placeholder="Дата народження (YYYY-MM-DD)"></form:input>
					</div>
					<div class="form-group  mb-3">
						<form:input path="phone" class="form-control"
							placeholder="Номер телефону"></form:input>
					</div>
					<div class="form-group  mb-3">
						<form:input path="email" class="form-control" placeholder="Email"></form:input>
					</div>
					<input type="submit" value="Зберегти" class="btn btn-danger " />
				</form:form>
			</div>
			<div class="bg-light rounded m-3 p-3 col-7 text-center shadow border">
				<div class="w-100 text-center border-bottom">
					<h4>Предмети</h4>
				</div>

				<table border="1" class="table table-striped text-center">
					<tbody>
						<c:forEach var="subject" items="${teacherSubjects}">
							<form:form modelAttribute="subject" method="POST"
								action="removeSubjectFromTeacher">
								<form:hidden path="teacherId" value="${teacher.id}"></form:hidden>
								<form:hidden path="id" value="${subject.id}"></form:hidden>
								<tr>
									<td>${subject.name}</td>
									<td><input type="submit" class="btn btn-warning"
										value="Видалити"></td>
								</tr>
							</form:form>
						</c:forEach>
					</tbody>
				</table>


				<form:form method="POST" action="addSubjectForTeacher"
					modelAttribute="subject">
					<div class="row">
						<form:hidden path="teacherId" value="${teacher.id}"></form:hidden>
						<div class="form-group mb-3 col-10 text-center">
							<form:select path="subjectId" class="form-control">
								<form:options items="${subjects}" itemValue="id"
									itemLabel="name" />
							</form:select>
						</div>
						<div class="form-group mb-3 col-2 text-center">
							<input type="submit" class="btn btn-danger" value="Додати" />
						</div>
					</div>
				</form:form>


			</div>
		</div>
	</div>
</body>
</html>