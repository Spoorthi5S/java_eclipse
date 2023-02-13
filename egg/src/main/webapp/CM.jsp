<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title><link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</head>


<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"><img alt=""
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				height="80" width="60"> </a>

			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<a href="CM.jsp">CM</a>
		</div>


	</nav>

	<h1>Welcome to CM info</h1>
	
<form action="cm" method="post">
<div class="mb-3">
				<label for="formFile" class="form-label">name</label> <input
						class="form-control" type="text" id="formFile" name="name"
						placeholder="Enter cm name">
			</div>
			Select party<select class="form-select"
					aria-lable="Default select example" name="party">
			<option selected value="">Select party</option>
			<option value="Select">Select</option>
			<option value="BJP">BJP</option>
			<option value="Congress">Congress</option>
			<option value="JDS">JDS</option>
			<option value="AAP">AAP</option>
			<option value="KJP">KJP</option>
			</select>
			
			Select state<select class="form-select"
					aria-lable="Default select example" name="state">
			<option selected value="">Select party</option>
			
			<option value="Karnataka">Karnataka</option>
			<option value="TamilNadu">TamilNadu</option>
			<option value="AndraPradesh">AndraPradesh</option>
			<option value="Bihar">Bihar</option>
			<option value="Assam">Assam</option>
			</select>
			Select Tenure<select class="form-select"
					aria-lable="Default select example" name="tenure">
			<option selected value="">Select tenure</option>
			
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
			</select>
			Portfolio<textarea rows="3" class="50" name="portfolio"></textarea>
			
			<input type="submit" value="save" class="btn btn-primary"/>


		</form>
			
</body>
</html>