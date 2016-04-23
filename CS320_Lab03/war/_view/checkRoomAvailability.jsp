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
		td.checkinDay {
			text-align: left;
		}
		td.coutDay {
			text-align: left;
		}
		td.checkinMonth {
			text-align: left;
		}
		td.coutMonth {
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
			padding-top: 20px;
		}
		form.search {
			text-align: left;
			padding-top: 20px;
		}
		input.searchButton {
			
			font-size: 150%;
		}
		input.selectButton {
			
			font-size: 150%;
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
   				<td class="checkinDay">Check-In Day:</td>
   				<td class="checkinMonth">Check-In Month:</td>
   				<td class="coutDay">Check-Out Day:</td>
   				<td class="coutMonth">Check-Out Month:</td>
   				</tr>
  				<tr>
  				<td><input type="text" name="CheckInDay" value="${CheckInDay}" /></td>	
  				<td><input type="text" name="CheckInMonth" value="${CheckInMonth}" /></td>	  		
  				<td><input type="text" name="CheckOutDay" value="${CheckOutDay}" /></td>
  				<td><input type="text" name="CheckOutMonth" value="${CheckOutMonth}" /></td>
  				</tr> 		
				<tr>
				<td class="RoomSelection">Room Selection:</td>
  				<td class="RoomSelection"><input type="number" name="roomType" value="${roomType}" /></td>
  				</tr><tr>
  				<td class="City">City:</td>
  				<td class="City"><input type="text" name="City" value="${City}" /></td>
  				</tr>
  			</table>
  			<input class="selectButton" type="Submit" name="select" value="Search">
  			<h2 class="titleSR">Search Results</h2>
			<table>
				<tr>
	  			<td>HOTEL</td>
	  			<td></td>
	   			<td>ROOM</td>
	   			<td></td>
	  			<td>PRICE</td>
	  			</tr>
	  			<tr>
	  			<td>${hotels0}</td>
	  			<td> | </td>
	  			<td>${rooms0}</td>
	  			<td> | </td>
	   			<td>${prices0}</td>
	  			</tr>
				<tr>
	  			<td>${hotels1}</td>
	  			<td> | </td>
	  			<td>${rooms1}</td>
	  			<td> | </td>
	   			<td>${prices1}</td>
	  			</tr>
	  			<tr>
	  			<td>${hotels2}</td>
	  			<td> | </td>
	  			<td>${rooms2}</td>
	  			<td> | </td>
	   			<td>${prices2}</td>
	  			</tr>
	  			<tr>
	  			<td>${hotels3}</td>
	  			<td> | </td>
	  			<td>${rooms3}</td>
	  			<td> | </td>
	   			<td>${prices3}</td>
	  			</tr>
	  			<tr>
	  			<td>${hotels4}</td>
	  			<td> | </td>
	  			<td>${rooms4}</td>
	  			<td> | </td>
	   			<td>${prices4}</td>
	  			</tr>
	  			<tr>
	  			<td>${hotels5}</td>
	  			<td> | </td>
	  			<td>${rooms5}</td>
	  			<td> | </td>
	   			<td>${prices5}</td>
	  			</tr>
	  			<tr>
	  			<td>${hotels6}</td>
	  			<td> | </td>
	  			<td>${rooms6}</td>
	  			<td> | </td>
	   			<td>${prices6}</td>
	  			</tr>
				<tr>
	  			<td>${hotels7}</td>
	  			<td> | </td>
	  			<td>${rooms7}</td>
	  			<td> | </td>
	   			<td>${prices7}</td>
	  			</tr>
	  			<tr>
	  			<td>${hotels8}</td>
	  			<td> | </td>
	  			<td>${rooms8}</td>
	  			<td> | </td>
	   			<td>${prices8}</td>
	  			</tr>
	  			<tr>
	  			<td>${hotels9}</td>
	  			<td> | </td>
	  			<td>${rooms9}</td>
	  			<td> | </td>
	   			<td>${prices9}</td>
	  			</tr>
	  			<tr>
	  			<td>${hotels10}</td>
	  			<td> | </td>
	  			<td>${rooms10}</td>
	  			<td> | </td>
	   			<td>${prices10}</td>
	  			</tr>
	  			<tr>
	  			<td>${hotels11}</td>
	  			<td> | </td>
	  			<td>${rooms11}</td>
	  			<td> | </td>
	   			<td>${prices11}</td>
	  			</tr>
			</table> 
  		</form>
  		
  		<form class="search" action="../HotelReservationSystem/Results">
     		<input class="searchButton" type="Submit" name="search" value="Reserve">
 		</form> 
		
		
	</body>
</html>