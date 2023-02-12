<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
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

			<a href="index.jsp">Home</a>
		</div>


	</nav>

	<h1>Welcome to egg Application</h1>
	
<form action="egg" method="post">

<div class="mb-3">
				<label for="formFile" class="form-label">hotelName</label> <input
						class="form-control" type="text" id="formFile" name="hotelName"
						placeholder="Enter hotel name">
			</div>
			Select your dish Name<select class="form-select"
					aria-lable="Default select example" name="dishName">
			<option selected>Select your type of food</option>
			<option value="1">Omlet</option>
			<option value="2">Egg-rice</option>
			<option value="3">Egg-dose</option>
			<option value="4">Egg-maggie</option>
			<option value="5">Half Boil</option>
			<option value="6">Egg Burge</option>
			<option value="7">Egg Puff</option>
			<option value="8">Egg Masala</option>
			<option value="9">Egg Bonda</option>
			<option value="10">Egg Chilli</option>
			<option value="11">Egg Soup</option>
			<option value="12">Egg gobi</option>
			<option value="13">Cake</option>
			<option value="14">Egg Chocolate</option>
			</select>
			
			Select Egg type<select class="form-select"
					aria-lable="Default select example" name="type">
			<option selected>Select your Egg type</option>
			<option value="Select">Select</option>
			<option value="Nati">Nati</option>
			<option value="Farm">Farm</option>
			<option value="Boiler">Boiler</option>
			<option value="Duck">Duck</option>
			<option value="Ostrich">Ostrich</option>
			<option value="Snake">Snake</option>
			</select>
			<div class="mb-3">
				<label for="formFile" class="form-label">Price</label> <input
						class="form-control" type="text" id="formFile" name="price"
						placeholder="price">
			</div>
			Select quantity<select class="form-select"
					aria-lable="Default select example" name="quantity">
			<option selected>Select how much you want to order</option>
			<option value="Select">Select</option>
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="6">6</option>
			<option value="8">8</option>
			<option value="11">11</option>
			</select>
	
	
	<h6>Take Away</h6>		
	<div class="form-check">
 
		
  <input class="form-check-input" type="radio" value="true" id="flexCheckDefault" name="takeAway">
  <label  class="form-check-label" for="flexCheckDefault">
 Yes
  </label>
</div>
<div class="form-check">
  <input class="form-check-input" type="radio" value="false" id="flexCheckChecked" name="takeAway" checked>
  <label class="form-check-label" for="flexCheckChecked">
   No
  </label>
</div>		
			
  <input type="submit" value="Order" class="btn btn-primary"/>


		</form>

</body>
</html>