<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<%@ include file="everyclass.jsp" %>
<form>
	<div class="form-group">
		<label for="teacher">Teacher Name:</label>
		<input type="text" class="form-control" id="tname" name="tname" placeholder="Enter Name">
		
		
	</div>
	<div class="form-group">
		<label for="class">Class Name:</label>
		<input type="text" class="form-control" id="class" name="class" placeholder="Enter Class">
	</div>
		<button type="submit">Submit</button>
</form>
</body>
</html>