<!DOCTYPE html>

<html>
	<head>
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
		</style>
	</head>

	<body>
		<h1>
		Hotel Reservation System
		</h1>
		<h2>
		Login
		</h2>

		<form class ="login" action="${pageContext.servletContext.contextPath}/index" method="post"> <br/>
			<table>
  			<tr>
			<td>Username:</td><td><input type="text" name="username"> </td>
			</tr>
			<tr>
			<td>Password:</td><td><input type="password" name="password"> </td>
			</tr>
			</table>
			<input class="loginButton" type="submit" name="Login" value="Login"> 
		</form> 
		<form class="createAccount" action="../HotelReservationSystem/newAccount">
     		<input class="createAccountButton" type="submit" name="Create Account" value="Create Account">
 		</form> 
	</body>
</html>
