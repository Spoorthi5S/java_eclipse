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

	<h1>Welcome to Casino...</h1>
	<form action="casino" method="post">
		<div class="mb-3">
			<label for="formFile" class="cassino">Name</label> <input
				class="form-control" type="text" id="name" name="name"
				placeholder="Enter your name">
		</div>
		<div class="mb-3">
			<label for="formFile" class="cassino">Cruise</label> <input
				class="form-control" type="text" id="cruise" name="crusie"
				placeholder="Enter crusie name">
		</div>

		<div class="mb-3">
			<label for="formFile" class="cassino">Entry Fee</label> <input
				class="form-control" type="text" id="entryFee" name="entryFee"
				placeholder="Enter your food Price">
		</div>
		<div class="form-check">
			<input class="form-check-input" type="checkbox" value=""
				id="flexCheckDefault"> <label class="form-check-label"
				for="flexCheckDefault"> food is free </label>
		</div>
		<div class="form-check">
			<input class="form-check-input" type="checkbox" value=""
				id="flexCheckChecked" checked> <label
				class="form-check-label" for="flexCheckChecked"> food is not
				free </label>
		</div>
		<button type="Submit" class="btn btn-dark">beach</button>

	</form>

</body>
</html>