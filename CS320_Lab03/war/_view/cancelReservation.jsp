<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Cancel Reservation</title>
		<style type="text/css">
		.error {
			color: red;
		}
		
		td.label {
			text-align: right;
		}
		h2.titleCR {
			text-align: center;
			color: black;
		}
		ol.currentReservations {
			padding-top: 10px;
			padding-bottom: 10px;
			border-style:solid; 
			border-color:black; 
			color:black; 
		    text-align: left;
		}
		form.cancelReservation {
			text-align: left;
			color: black;
			padding-top: 10px;
			padding-bottom: 10px;
		}
		form.cancel {
			text-align: left;
			color: black;
			padding-top: 10px;
			padding-bottom: 10px;
			margin-left: 220px;
			
		}	
		input.cancelButton{
			font-size: 120%;
		}	

		</style>
	</head>

	<body>
		<h1>
		Cancel Reservation
		</h1>
		<h2 class="titleCR">Current Reservations</h2>
			<ol class="currentReservations" >
	  			<li>reservation 1</li>
	   			<li>reservation 2</li>
	  			<li>reservation 3</li>
			</ol> 
		<form class="cancelReservation">
		  	Cancel Reservation:
  			<input type="text" name="Cancel Reservation" value=>
  		</form>
		<form class="cancel" action="../lab03/Account">
     		<input class="cancelButton" type="submit" name="cancel" value="Cancel">
 		</form> 
	</body>
</html>