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
		
		td.RoomSelection {
			text-align: left;
			padding-top: 20px;
			padding-bottom: 30px;
		}
		td.checkinDate {
			text-align: left;
		}
		td.coutDate {
			text-align: left;
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
		input.selectButton {
			
		}

		</style>
	</head>

	<body>
		<c:if test="${! empty errorMessage}">
			<div class="error">${errorMessage}</div>
		</c:if>
		<h1>
		Check Room Availability
		</h1>
		<h2 class="titleRT">Room Types</h2>
		<ol class="roomTypes" >
	  		<li>Suite</li>
	   		<li>King Bed</li>
	  		<li>Two Double Beds</li>
		</ol> 
		<h2 class="titleDates">Dates of Stay</h2>
		<form action="${pageContext.servletContext.contextPath}/checkRoomAvailability" method="post">
   			<table>
				<tr>
   				<td class="checkinDate">Check-In Date:</td>
   				<td class="coutDate">Check-Out Date:</td>
   				</tr>
  				<tr>
  				<td><input type="text" name="CheckInDate" value="${CheckInDate}" /></td>		  		
  				<td><input type="text" name="CheckOutDate" value="${CheckOutDate}" /></td>
  				</tr> 		
				<tr>
				<td class="RoomSelection">Room Selection:</td>
  				<td class="RoomSelection"><input type="number" name="roomType" value="${roomType}" /></td>
  				</tr>
  		</table>
  		<input class="selectButton" type="Submit" name="select" value="Confirm Selection">
  		</form>
  		
  		<form class="search" action="../HotelReservationSystem/Results">
     		<input class="searchButton" type="Submit" name="search" value="Search">
 		</form> 
		
		
	</body>
</html>