<!DOCTYPE html>

<html>
	<head>
		<title>Login</title>
		<style type="text/css">
		.error {
			color: red;
		}
		
		td.label {
			text-align: right;
		}
		form.login {
			text-align: left;
			padding-top: 10px;
		}
		input.loginButton {
			text-align: left;
		}
		form.createAccount {
			text-align: left;
			padding-top: 10px;
		}
		input.createAccountButton {
			text-align: left;
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
		<form>
   			Username:<br>
  			<input type="text" name="username"><br>
  			Password:<br>
  			<input type="text" name="password">
		</form>
		<form class="login" action="../lab03/Account">
     		<input class="loginButton" type="submit" name="Login" value="Login">
 		</form> 
		<form class="createAccount" action="../lab03/newAccount">
     		<input class="createAccountButton" type="submit" name="Create Account" value="Create Account">
 		</form> 
	</body>
</html>
