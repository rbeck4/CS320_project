<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Check Room Availability</title>
		<style type="text/css">
		.error {
			color: red;
		}
		
		td.label {
			text-align: right;
		}
		form.checkinDate {
			text-align: left;
			float: left;
		}
		form.checkoutDate {
			text-align: left;
			float: left;
			padding-left: 20px;
		}
		h2.titleRT {
			padding-top: 10px;
			text-align: Left;
			color: black;
		}
		ol.roomTypes {
			padding-bottom: 10px;
			color:black; 
		    text-align: left;
		}
		form.search {
			text-align: left;
			margin-left: 500px;
		}
		input.searchButton {
			font-size: 150%;
		}

		</style>
	</head>

	<body>
		<h1>
		Check Room Availability
		</h1>
		<h2 class="titleDates">Dates of Stay</h2>
		<form class="checkinDate">
   			Check-In Date:<br>
  			<input type="text" name="Check-In Date" value=>
		</form> 
		<form class="checkoutDate">
		  	Check-Out Date:<br>
  			<input type="text" name="Check-Out Date" value=>
  		</form>
		<form class="search" action="../HotelReservationSystem/Results">
     		<input class="searchButton" type="submit" name="search" value="Search">
 		</form> 
		<h2 class="titleRT">Room Types</h2>
		<ol class="roomTypes" >
	  		<li>room 1</li>
	   		<li>room 2</li>
	  		<li>room 3</li>
		</ol> 
		<form class="RoomSelection">
		  	Room Selection:
  			<input type="text" name="Room Selection" value=>
  		</form>
		
	</body>
</html>