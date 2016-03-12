<!DOCTYPE html>

<html>
	<head>
		<title>New Account</title>
		<style type="text/css">
		.error {
			color: red;
		}
		
		form.info {
			text-align: left;
			padding-top: 30px;
		}
		form.password {
			text-align: left;
			float: left;
		}
		form.confirmPassword {
			text-align: left;
			float: left;
			padding-left: 20px;
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
		New Account
		</h1>
		<h2>
		Information
		</h2>
		<form>
   			Username:<br>
  			<input type="text" name="username"><br>
  		</form>
		<form class="password">
	   		Password:<br>
  			<input type="text" name="password">
		</form> 
		<form class="confirmPassword">
		  	Confirm Password:<br>
  			<input type="text" name="passwordConfirm"><br>
	  	</form>
	  	<br>	
  		<form class="info">
  			Email:<br>
  			<input type="text" name="email"><br>
  			Phone:<br>
  			<input type="text" name="phone"><br>
  			Payment:<br>
  			<input type="text" name="payment"><br>
		</form>
		<form class="createAccount" action="../lab03/index">
     		<input class="createAccountButton" type="submit" name="Create Account" value="Create Account">
 		</form> 
	</body>
</html>
