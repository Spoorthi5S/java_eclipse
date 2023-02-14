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
			<a href="index.jsp">home</a>

		</div>


	</nav>

	<h1>Welcome to valentine data page</h1>
	<c:forEach items="${error}" var="v">
		<span style="color:red">${v.message }</span><br>
		</c:forEach>
	
	<form action="valentine" method="post">
		<pre>
		
Name<input type="text" name="name" />
ValentineName<input type="text" name="valentineName" />
places<select name="places">
<option value="">SELECT</option>
<c:forEach items="${places}" var="p">
<option value="${p}">${p}</option>
</c:forEach>
</select>
Gift<select name="gifts">
<option value="">SELECT</option>
<c:forEach items="${gifts}" var="g">
<option value="${g}">${g}</option>
</c:forEach>
</select>
<input type="submit" value="save" />
</pre>
	</form>

</body>
</html>