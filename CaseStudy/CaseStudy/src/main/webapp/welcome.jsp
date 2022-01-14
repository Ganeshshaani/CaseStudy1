<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
		<div>
			<form action="./signin" method="post">
				<h1>log in Here</h1>

				<label for="name"><b>Enter UserName: </b></label> 
				<input type="text" placeholder="UserName" name="uname"><br>
				<label for="psw"><b> Enter Password &nbsp;:</b></label> <input
					type="password" placeholder="Enter Password" name="pwd"><br>

				<button type="submit" class="btn">Login</button>
				<br>
				<p>If you are new user please click here to Register!!</p>
				<br>

			</form>
			<a href="./newuser.jsp">
				<button 	type="submit" class="btn">signup</button>
			</a>
		</div>

		<footer class="footer">
			<h5>Copyright content of CaseStudy from batch : 4 &copy;</h5>

		</footer>
	</div>

</body>
</html>