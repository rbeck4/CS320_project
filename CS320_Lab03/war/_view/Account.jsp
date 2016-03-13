<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Account</title>
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
		</style>
	</head>

	<body>
		<h1>
		Account
		</h1>
		<form action="../HotelReservationSystem/roomAvailability">
     		<input type="submit" name="checkRA" value="Check Room Availability">
 		</form> 
		<h2 class="titleCR">Current Reservations</h2>
			<ol class="currentReservations" >
	  			<li>reservation 1</li>
	   			<li>reservation 2</li>
	  			<li>reservation 3</li>
			</ol> 
		<form action="../HotelReservationSystem/cancelReservation">
     		<input type="submit" name="cancel" value="Cancel Reservation">
 		</form> 
 		<br><br>
		<form action="../HotelReservationSystem/index">
     		<input type="submit" name="logout" value="Log out">
 		</form> 
	</body>
</html>