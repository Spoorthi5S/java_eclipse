<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		</div>


	</nav>

	<h1>Welcome Spoorthi..</h1>
	<form method="get" action="email">
		<h6>Display String: ${spoorthi}</h6>
		<input type="submit" value="Email" />
	</form>
	<form action="mobile">
		<h6>Display Primitive: ${mobile}</h6>
		<input type="submit" value="mobile" />
	</form>
	<form action="aadhar">
		<h6>Display String: ${aadhar}</h6>
		<input type="submit" value="aadhar" />
	</form>
	<form action="age">
		<h6>Display Primitive: ${age}</h6>
		<input type="submit" value="age" />
	</form>
	<form action="dobTime">
		<h6>Display DoB: ${dobTime}</h6>
		<input type="submit" value="dobTime" />
	</form>
	<form action="salary">
		<h6>Display Primitive: ${salary}</h6>
		<input type="submit" value="desiredSalary" />
	</form>
	<form action="BestFriends" method="get">
		<input type="submit" value="friends" />
		<ul>
			<c:forEach items="${prends}" var="ref">
				<li>${ref }</li>
			</c:forEach>

		</ul>
	</form>
	<form action="visitedPlace">
		<h6>Display String:</h6>
		<input type="submit" value="places" />
		<ul>
			<c:forEach items="${place}" var="ref">
				<li>${ref }</li>
			</c:forEach>
		</ul>
	</form>
	
	<form  action="skill"
		method="post">
		<input type="submit" value="List Of Skill Set"
			 /> <br>
		<ul>
			<c:forEach items="${skill}" var="reference">
				<li>${reference}</li>
			</c:forEach>
		</ul>
	</form>
	
	<form  action="education" method="post">
		<input type="submit" value="EducationDTO"  />
		 <br><label>${info.qualification}</label>
		 <br><label>${info.schoolName}</label>
		 <br><label>${info.sslcPercentage}</label>
		 <br><label>${info.puCollege}</label>
		 <br><label>${info.puPercentage}</label>
		 <br><label>${info.engineeringCollege}</label>
		 <br><label>${info.bePercentage}</label>
		 <br><label>${info.branch}</label>
		 <br><label>${info.trainingInstitute}</label>
		 <br><label>${info.learntJava}</label>
		 
		</form>
		<form  action="family" method="post">
		<input type="submit" value="FamilyDTO"  />
		 <br><label>${fam.motherName}</label>
		 <br><label>${fam.fatherName}</label>
		 <br><label>${fam.siblings}</label>
		 <br><label>${fam.siblingRelation}</label>
		 <br><label>${fam.siblingName}</label>
		 <br><label>${fam.noOfPeople}</label>
		 <br><label>${fam.livesIn}</label>
		 <br><label>${fam.grandFather}</label>
		 <br><label>${fam.grandMother}</label>
		 <br><label>${fam.married}</label>
		 </form>
		 		 <form  action="mobiledto" method="post">
		<input type="submit" value="MobileDTO" />
		 <br><label>${sim.company}</label>
		 <br><label>${sim.model}</label>
		 <br><label>${sim.noOfSim}</label>
		 <br><label>${sim.simCompany}</label>
		 <br><label>${sim.dualSim}</label>
		 </form>
		<br>
		<form  action="juice" method="post">
		<input type="submit" value="BeverageDTO"  />
		 <br><label>${drink.brand}</label>
		 <br><label>${drink.price}</label>
		 <br><label>${drink.alcohol}</label>
		 <br><label>${drink.quantity}</label>
		 <br><label>${drink.color}</label>
		 <br><label>${drink.tastesGood}</label>
		 <br><label>${drink.goodForHealth}</label>
		 <br><label>${drink.madeOfFruit}</label>
		 </form>
		 
		 <form  action="chat" method="post">
		<input type="submit" value="ChatDTO" />
		 <br><label>${chat.name}</label>
		 <br><label>${chat.price}</label>
		 <br><label>${chat.goodForHealth}</label>
		 <br><label>${chat.available}</label>
		 <br><label>${chat.shopName}</label>
		 <br><label>${chat.ownerName}</label>
		 <br><label>${chat.tastesGood}</label>
		 <br><label>${chat.location}</label>
		 <br><label>${chat.distance}</label>
		 <br><label>${chat.shopOpensAt}</label>
		 <br><label>${chat.shopClosesAt}</label>
		 </form>
</body>

</html>