<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Form Example</title>
	</head>
	<body>
		<h2>${headerMessage} </h2>
		<form action="/FirstSpring/SubmitForm.html" method="post">
			Name: <input type="text" name="name"/>
			<br>
			Password: <input type="password" name="password" />
			<br>
			<input type="submit" value="submit" />
			<input type="reset" value="cancel" />
		</form>
		<hr>
		<h4>With Parameters and Model object binding</h4>
		<form action="/FirstSpring/SubmitForm1.html" method="post">
			Name: <input type="text" name="name"/>
			<br>
			Password: <input type="password" name="password" />
			<br>
			<input type="submit" value="submit" />
			<input type="reset" value="cancel" />
		</form>
		<hr>
		<h4>With Model object binding</h4>
		<form:errors path="user1.*" />
		<form action="/FirstSpring/SubmitForm2.html" method="post">
			Name: <input type="text" name="name"/>
			<br>
			Password: <input type="password" name="password" />
			<br>
			Phone Number: <input type="text" name="phoneNumber"/>
			<br>
			Date Of Birth: <input type="text" name="dateOfBirth" />
			<br>
			Course : <select name="course" multiple>
						<option value="java">Java</option>
						<option value="PHP">PHP</option>
						<option value="Dot net">.Net</option>
					  </select>
			<br>
			Address
			<br>
			Country: <input type="text" name="userAddress.country" />
			<br>
			City: <input type="text" name="userAddress.city" />
			<br>
			State: <input type="text" name="userAddress.state" />
			<br>
			<input type="submit" value="submit" />
			<input type="reset" value="cancel" />
		</form>
	</body>
</html>