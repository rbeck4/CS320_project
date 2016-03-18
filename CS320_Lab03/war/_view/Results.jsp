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
			text-align: left;
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
		<c:if test="${! empty errorMessage}">
			<div class="error">${errorMessage}</div>
		</c:if>
		<h1>
		Results
		</h1>
		<h2 class="titleSR">Search Results</h2>
			<ol class="searchResults" >
	  			<li>hotel room</li>
	   			<li>hotel room</li>
	  			<li>hotel room</li>
			</ol> 
		
			
		<form class="makeReservation" action="${pageContext.servletContext.contextPath}/Results" method="post">
		  	Make Reservation:
  			<input type="text" name="reservation" value="${reservation}" />
  			<input class="selectButton" type="Submit" name="select" value="Confirm Selection">
  			<table>
  			<tr>
  			<td class="label">Selected: ${result}</td>
			</tr>
			</table>
  		</form>
  		
		<form class="reserve" action="../HotelReservationSystem/Confirmation">
     		<input class="reserveButton" type="submit" name="reserve" value="Reserve">
 		</form> 
	</body>
</html>