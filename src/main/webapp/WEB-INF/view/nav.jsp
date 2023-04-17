<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<nav class="navbar sticky-top navbar-expand-lg bg-light shadow-sm border-bottom" style="background-color: #e3f2fd;">
	<div class="container-fluid">
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link btn btn-primary m-1 text-white" href="homePage">Домашня
						сторінка</a></li>
				<li class="nav-item"><a class="nav-link btn btn-primary m-1 text-white"
					aria-current="page" href="groups">Групи</a></li>
				<li class="nav-item"><a class="nav-link btn btn-primary m-1 text-white"
					aria-current="page" href="">Рейтинг</a></li>
				<li class="nav-item"><a class="nav-link btn btn-primary m-1 text-white"
					aria-current="page" href="teachers">Викладачі</a></li>
				<li class="nav-item"><a class="nav-link btn btn-primary m-1 text-white"
					aria-current="page" href="subjects">Предмети</a></li>
				<li class="nav-item"><a class="nav-link btn btn-primary m-1 text-white"
					aria-current="page" href="logout">Вихід</a></li>

			</ul>
			<form class="d-flex mr-3" role="search" action="search" method="GET">
				<input class="form-control me-2" type="search" placeholder="Запит"
					aria-label="Search" name="search">
				<button class="btn btn-outline-success" type="submit">Пошук</button>
			</form>
		</div>
	</div>
</nav>