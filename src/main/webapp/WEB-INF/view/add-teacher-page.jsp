<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add new teacher</title>
<jsp:include page="allResources.jsp"></jsp:include>
</head>
<body class="bg-body">
	<jsp:include page="nav.jsp"></jsp:include>
	<div class="container">
		<div class="row justify-content-center ">
			<div class="bg-light rounded m-3 p-3 col-4 text-center shadow border">
				<form:form action="save-teacher" method="GET"
					modelAttribute="teacher">
					<form:hidden path="" />
					<div class="form-group mb-3">
						<form:input path="lastName" class="form-control" placeholder="Прізвище"></form:input>
						<form:errors path="lastName" class="danger"></form:errors>
					</div>
					<div class="form-group mb-3">
						<form:input path="firstName" class="form-control" placeholder="Ім'я"></form:input>
						<form:errors path="firstName" class="danger"></form:errors>
					</div>
					<div class="form-group mb-3">
						<form:input path="fatherName" class="form-control" placeholder="Побатькові"></form:input>
						<form:errors path="fatherName" class="danger"></form:errors>
					</div>
					<div class="form-group  mb-3">
						<form:input path="dateOfBirthday" class="form-control"
							placeholder="Дата народження (YYYY-MM-DD)"></form:input>
					</div>
					<div class="form-group  mb-3">
						<form:input path="Phone" class="form-control"
							placeholder="Номер телефону"></form:input>
					</div>
					<div class="form-group  mb-3">
						<form:input path="Email" class="form-control" placeholder="Email"></form:input>
						<form:errors path="fatherName" class="danger"></form:errors>
					</div>
					<input type="submit" value="Зберегти" class="btn btn-danger " />
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>