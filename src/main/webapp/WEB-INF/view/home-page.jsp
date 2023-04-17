<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Домашня сторінка</title>
<jsp:include page="allResources.jsp"></jsp:include>
</head>
<body class="bg-body user-select-none">
	<jsp:include page="nav.jsp"></jsp:include>
	<div class="container-fluid">
		<div
			class="row justify-content-center bg-light bg-gradient m-5 rounded shadow-lg border">
			<div class="col-3 bg-light mt-5 mb-5 mr-2 rounded p-3 border shadow">
				<div class="h4 text-center w-100  border-bottom text-info">Statistic</div>
				<table class="table table-striped">
					<thead>
						<tr>
							<th>Summary</th>
							<th>Count</th>
						</tr>
					</thead>
					<tr>
						<td>All students</td>
						<td>${statistic.allStudentCount}</td>
					</tr>
					<tr>
						<td>Students on Extramural form</td>
						<td>${statistic.externalStudentCount}</td>
					</tr>
					<tr>
						<td>Full time students</td>
						<td>${statistic.fullTimeStudentCount}</td>
					</tr>
					<tr>
						<td>Teachers</td>
						<td>${statistic.teachersCount}</td>
					</tr>
					<tr>
						<td>Faculty count</td>
						<td>${statistic.facultyCount}</td>
					</tr>
					<tr>
						<td>Specialty count</td>
						<td>${statistic.specialtyCount}</td>
					</tr>
					<tr>
						<td>Groups count</td>
						<td>${statistic.groupsCount}</td>
					</tr>
				</table>
			</div>
			<div class="col-8 bg-light rounded m-5 p-3 border shadow">
				<div class="h4 w-100 text-center border-bottom text-info">The
					last 10 loggs</div>

				<table class="table table-striped">
					<thead>
						<tr>
							<th>Info</th>
							<th>Time</th>
						</tr>
					</thead>
					<c:forEach var="log" items="${loggs}">
						<tr>
							<td>${log.info}</td>
							<td>${log.date}</td>
						</tr>
					</c:forEach>
				</table>

			</div>
		</div>
	</div>
</body>
</html>