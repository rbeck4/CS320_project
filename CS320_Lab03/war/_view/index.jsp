<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<html>
<head>
<link href='https://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css'>
<title>Login</title>
<style type="text/css">
.error {
	color: red;
}

td.label {
	text-align: left;
	padding-bottom: 20px;
}

form.login {
	text-align: left;
	padding-bottom: 10px;
}

input.loginButton {
	text-align: left;
	margin-left: 250px;
	font-size: 120%
}

form.createAccount {
	text-align: left;
	padding-top: 10px;
}

input.createAccountButton {
	text-align: left;
	margin-left: 250px;
	font-size: 120%
}
	h1.title {
		padding-top: 10px;
		text-align: Left;
		color: black;
		font-family: 'Open Sans', sans-serif;
	}
		h2.loginT {
			padding-top: 10px;
			text-align: Left;
			color: black;
			font-family: 'Open Sans', sans-serif;
		}
		td.user {
			padding-top: 10px;
			text-align: Left;
			color: black;
			font-family: 'Open Sans', sans-serif;
		}
		td.pass {
			padding-top: 10px;
			text-align: Left;
			color: black;
			font-family: 'Open Sans', sans-serif;
		}
</style>
</head>

<body>
	<c:if test="${! empty errorMessage}">
		<div class="error">${errorMessage}</div>
	</c:if>
	<h1 class ="title">Hotel Reservation System</h1>
	<h2 class = "loginT">Login</h2>

	<form class="login" action="${pageContext.servletContext.contextPath}/index" method="post">
		<br />
		<table>
			<tr>
				<td class="user">Username:</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td class="pass">Password:</td>
				<td><input type="password" name="password"></td>
			</tr>
		</table>
		<input class="loginButton" type="submit" name="Login" value="Login">
	</form>
	<form class="createAccount"
		action="../HotelReservationSystem/newAccount">
		<input class="createAccountButton" type="submit" name="Create Account"
			value="Create Account">
	</form>
</body>
</html>
