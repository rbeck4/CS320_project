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
		</style>
	</head>

	<body>
		<h1>
		Cancel Reservation
		</h1>
		<c:if test="${! empty errorMessage}">
			<div class="error">${errorMessage}</div>
		</c:if>
	
		<form action="${pageContext.servletContext.contextPath}/Account" method="post">
			<table>
				<tr>
					<td class="label">First number:</td>
					<td><input type="text" name="first" size="12" value="${first}" /></td>
				</tr>
				<tr>
					<td class="label">Second number:</td>
					<td><input type="text" name="second" size="12" value="${second}" /></td>
				</tr>
				<tr>
					<td class="label">Result:</td>
					<td>${result}</td>
				</tr>
			</table>
			<input type="Submit" name="submit" value="Add Numbers!">
		</form>
		<h2 class="titleCR">Current Reservations</h2>
			<ol class="currentReservations" >
	  			<li>reservation 1</li>
	   			<li>reservation 2</li>
	  			<li>reservation 3</li>
			</ol> 
		<form action="../lab03/Account">
     		<input type="submit" name="cancel" value="Cancel Reservation">
 		</form> 
	</body>
</html>