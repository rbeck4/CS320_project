<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Results</title>
		<style type="text/css">
		.error {
			color: red;
		}
		
		td.label {
			text-align: right;
		}
		h2.titleSR {
			text-align: left;
			color: black;
		}
		ol.searchResults {
			padding-top: 10px;
			padding-bottom: 10px;
			border-style:solid; 
			border-color:black; 
			color:black; 
		    text-align: left;
		}
		form.makeReservation {
			text-align: left;
			color: black;
			padding-top: 10px;
			padding-bottom: 10px;
		}
		form.reserve {
			text-align: left;
			color: black;
			padding-top: 10px;
			padding-bottom: 10px;
		}
		input.reserveButton {
			text-align: left;
			color: black;
			font-size: 150%;
		}
		</style>
	</head>

	<body>
		<h1>
		Results
		</h1>
		<h2 class="titleSR">Search Results</h2>
			<ol class="searchResults" >
	  			<li>hotel room</li>
	   			<li>hotel room</li>
	  			<li>hotel room</li>
			</ol> 
		<form class="makeReservation">
		  	Make Reservation:
  			<input type="text" name="Make Reservation" value=>
  		</form>
		<form class="reserve" action="../lab03/Confirmation">
     		<input class="reserveButton" type="submit" name="reserve" value="Reserve">
 		</form> 
	</body>
</html>