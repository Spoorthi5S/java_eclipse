<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
</head>
<body>
	<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
		crossorigin="anonymous">
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"><img alt=""
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				height="80px" width="60px"> </a>

			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>


			<form class="d-flex">
				<a href="index.jsp">Home</a>

			</form>
		</div>

	</nav>

	<h1>Welcome to Beach...</h1>
	<div>
		<form action="beach" method="post">
			<div class="mb-3">
				<label for="formFile" class="beach">Name</label> <input
					class="form-control" type="text" id="name" name="name"
					placeholder="Enter your food name">
			</div>
			Select your location type <select class="form-select"
				aria-label="Default select example" name="type">
				<option selected>Select</option>
				<option value="shimoga">shimoga</option>
				<option value="goa">goa</option>
				<option value="both">both</option>
			</select>

			<div class="form-check">
				<input class="form-check-input" type="checkbox" value=""
					id="flexCheckDefault"> <label class="form-check-label"
					for="flexCheckDefault"> It is Clean </label>
			</div>
			<div class="form-check">
				<input class="form-check-input" type="checkbox" value=""
					id="flexCheckChecked" checked> <label
					class="form-check-label" for="flexCheckChecked"> It is not
					clean </label>
			</div>
			<div class="form-check">
				<input class="form-check-input" type="checkbox" value=""
					id="flexCheckDefault"> <label class="form-check-label"
					for="flexCheckDefault"> games is there </label>
			</div>
			<div class="form-check">
				<input class="form-check-input" type="checkbox" value=""
					id="flexCheckChecked" checked> <label
					class="form-check-label" for="flexCheckChecked"> games is not there </label>
			</div>
			<button type="Submit" class="btn btn-dark">beach</button>
		</form>
	</div>
</body>

</body>
</html>