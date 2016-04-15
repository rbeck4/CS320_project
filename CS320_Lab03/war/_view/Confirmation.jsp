<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<html>
<head>
<title>Confirmation</title>
<style type="text/css">
.error {
	color: red;
}

p.reservationNum {
	text-align: left;
}

form.return {
	text-align: center;
	color: black;
	margin-left: 250px;
}

form.returnButton {
	padding-top: 10px;
	padding-bottom: 10px;
	color: black;
	text-align: left;
	font-size: 120%;
}
</style>
</head>

<body>
	<h1>Confirmation</h1>
	<p>Name:</p>
	<p>Phone:</p>
	<p>Dates:</p>
	<p>Room Type:</p>
	<p>Room Number:</p>
	<p class="reservationNum">Reservation Number:</p>
	<form class="return" action="../HotelReservationSystem/Account">
		<input class="returnButton" type="submit" name="return"
			value="Return Home">
	</form>
</body>
</html>